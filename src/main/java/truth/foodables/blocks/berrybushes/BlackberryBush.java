package truth.foodables.blocks.berrybushes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import truth.foodables.registry.ModItems;

public class BlackberryBush extends SweetBerryBushBlock {

    public BlackberryBush(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(AGE, 0));
    }

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.BLACKBERRIES);
    }

    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        int i = (Integer)state.get(AGE);
        boolean bl = i == 3;
        if (!bl && player.getMainHandStack().isOf(Items.BONE_MEAL)) {
           return ActionResult.PASS;
        } else if (i > 1) {
           int j = 1 + world.random.nextInt(2);
           dropStack(world, pos, new ItemStack(ModItems.BLACKBERRIES, j + (bl ? 1 : 0)));
           world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
           world.setBlockState(pos, (BlockState)state.with(AGE, 1), Block.NOTIFY_LISTENERS);
           return ActionResult.SUCCESS;
        } else {
           return super.onUse(state, world, pos, player, hit);
        }
     }
    
}
