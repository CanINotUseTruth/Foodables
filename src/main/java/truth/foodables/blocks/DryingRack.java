package truth.foodables.blocks;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.Identifier;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import truth.foodables.Foodables;
import truth.foodables.blocks.blockentities.DryingRackEntity;
import truth.foodables.registry.ModBlocks;
import truth.foodables.registry.ModRecipes;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import java.util.Optional;

@SuppressWarnings("deprecation")
public class DryingRack extends BlockWithEntity implements Waterloggable {

    public static final VoxelShape NORTH_SHAPE, SOUTH_SHAPE, EAST_SHAPE, WEST_SHAPE;
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public static final MapCodec<DryingRack> CODEC = createCodec(DryingRack::new);
    
    public DryingRack(Settings settings) {
        super(settings);
    }
    
    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }
    
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DryingRackEntity(pos, state);
    }
    
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlocks.DRYING_RACK_ENTITY, world.isClient ? null : DryingRackEntity::serverTick);
    }
    
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        DryingRackEntity woodRackEntity = (DryingRackEntity) world.getBlockEntity(pos);
        ItemStack stack = woodRackEntity.getStack(0);
        if (stack.isEmpty()) {
            // Hang item on rack
            ItemStack heldItem = player.getMainHandStack();
            if (!heldItem.isEmpty() && ModRecipes.RACK_ITEM_LIST.contains(heldItem.getItem()) && !state.get(WATERLOGGED)) {
                if (!world.isClient) {
                    int index = ModRecipes.RACK_ITEM_LIST.indexOf(heldItem.getItem());
                    woodRackEntity.dryingTime = Optional.of(ModRecipes.RACK_RESULT_TIME_LIST.get(index));
                    woodRackEntity.result = ModRecipes.RACK_RESULT_ITEM_LIST.get(index);
                    woodRackEntity.index = Optional.of(index);
                    if (player.isCreative()) {
                        woodRackEntity.setStack(0, heldItem.copy());
                    } else
                        woodRackEntity.setStack(0, heldItem.split(1));
                }
                if (world.isClient) {
                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.CONSUME;
        } else {
            // Remove hanging item
            if (!world.isClient && !player.giveItemStack(stack.split(1))) {
                player.dropItem(stack.split(1), false);
            }
            woodRackEntity.clear();
            if (world.isClient) {
                return ActionResult.SUCCESS;
            }
            return ActionResult.SUCCESS;
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> NORTH_SHAPE;
        };
    }

    private boolean canPlaceOn(BlockView world, BlockPos pos, Direction side) {
        BlockState blockState = world.getBlockState(pos);
        return !blockState.emitsRedstonePower();
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = (Direction) state.get(FACING);
        return this.canPlaceOn(world, pos.offset(direction.getOpposite()), direction);
    }
    
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos neighborBlockPos) {
        if (direction.getOpposite() == state.get(FACING) && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        } else {
            if ((Boolean) state.get(WATERLOGGED)) {
                world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            }

            return Blocks.AIR.getDefaultState();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState;
        if (!ctx.canReplaceExisting()) {
            blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().offset(ctx.getSide().getOpposite()));
            if (blockState.getBlock() == this && blockState.get(FACING) == ctx.getSide()) {
                return null;
            }
        }

        blockState = this.getDefaultState();
        WorldView worldView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        Direction[] directions = ctx.getPlacementDirections();
        int j = directions.length;

        for (int k = 0; k < j; ++k) {
            Direction direction = directions[k];
            if (direction.getAxis().isHorizontal()) {
                blockState = (BlockState) blockState.with(FACING, direction.getOpposite());
                if (blockState.canPlaceAt(worldView, blockPos)) {
                    return (BlockState) blockState.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
                }
            }
        }

        return null;
    }
    
    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState) state.with(FACING, rotation.rotate((Direction) state.get(FACING)));
    }
    
    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation((Direction) state.get(FACING)));
    }
    
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
    
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof Inventory) {
                ItemScatterer.spawn(world, pos, (Inventory) blockEntity);
                world.updateComparators(pos, this);
            }
        }
    }

    @SuppressWarnings("unchecked")
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> checkType(BlockEntityType<A> givenType, BlockEntityType<E> expectedType, BlockEntityTicker<? super E> ticker) {
        return expectedType == givenType ? (BlockEntityTicker<A>) ticker : null;
    }

    static {
        NORTH_SHAPE = Block.createCuboidShape(0.0D, 12.0D, 12.0D, 16.0D, 16.0D, 16.0D);
        SOUTH_SHAPE = Block.createCuboidShape(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 4.0D);
        EAST_SHAPE = Block.createCuboidShape(0.0D, 12.0D, 0.0D, 4.0D, 16.0D, 16.0D);
        WEST_SHAPE = Block.createCuboidShape(12.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    }
}