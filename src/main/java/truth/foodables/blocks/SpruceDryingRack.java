package truth.foodables.blocks;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
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
import truth.foodables.blocks.blockentities.SpruceDryingRackEntity;
import truth.foodables.registry.ModBlocks;
import truth.foodables.registry.ModRecipes;
import net.minecraft.block.ShapeContext;

public class SpruceDryingRack extends HorizontalFacingBlock implements BlockEntityProvider {

    public static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0D, 12.0D, 12.0D, 16.0D, 16.0D, 16.0D);
    public static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 4.0D);
    public static final VoxelShape EAST_SHAPE = Block.createCuboidShape(0.0D, 12.0D, 0.0D, 4.0D, 16.0D, 16.0D);
    public static final VoxelShape WEST_SHAPE = Block.createCuboidShape(12.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);


    public SpruceDryingRack(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.SOUTH));
    }
    
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SpruceDryingRackEntity(pos, state);
    }
    
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlocks.SPRUCE_DRYING_RACK_ENTITY, world.isClient ? SpruceDryingRackEntity::clientTick : SpruceDryingRackEntity::serverTick);
    }
    
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
        BlockHitResult hit) {
        SpruceDryingRackEntity dryingRackEntity = (SpruceDryingRackEntity) world.getBlockEntity(pos);
        ItemStack stack = dryingRackEntity.getStack(0);
        if (!stack.isEmpty()) {
        // Remove hanging item
        if (!world.isClient && !player.giveItemStack(stack.split(1))) {
            player.dropItem(stack.split(1), false);
        }
        dryingRackEntity.clear();
        return ActionResult.SUCCESS;
        } else {
        // Hang item on rack
        ItemStack heldItem = player.getMainHandStack();
        if (!heldItem.isEmpty() && ModRecipes.RACK_ITEM_LIST.contains(heldItem.getItem())) {
            if (!world.isClient) {
                int index = ModRecipes.RACK_ITEM_LIST.indexOf(heldItem.getItem());
                dryingRackEntity.dryingTime = ModRecipes.RACK_RESULT_TIME_LIST.get(index);
                dryingRackEntity.result = ModRecipes.RACK_RESULT_ITEM_LIST.get(index);
                dryingRackEntity.index = index;
                if (player.isCreative()) dryingRackEntity.setStack(0, heldItem.copy());
                else dryingRackEntity.setStack(0, heldItem.split(1));
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return NORTH_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case EAST:
                return EAST_SHAPE;
            case WEST:
                return WEST_SHAPE;
            default:
                return NORTH_SHAPE;
        }
    }
    
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState,
        WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (direction.getOpposite() == state.get(FACING) && !state.canPlaceAt(world, pos)) {
        return Blocks.AIR.getDefaultState();
        } else {    
        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
        }
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
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
        builder.add(FACING);
    }
    
    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof Inventory) {
            ItemScatterer.spawn(world, pos, (Inventory) blockEntity);
            world.updateComparators(pos, this);
        }
    
        super.onStateReplaced(state, world, pos, newState, moved);
        }
    }
    
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> checkType(BlockEntityType<A> givenType, BlockEntityType<E> expectedType, BlockEntityTicker<? super E> ticker) {
        return expectedType == givenType ? (BlockEntityTicker<A>) ticker : null;
    }
}
