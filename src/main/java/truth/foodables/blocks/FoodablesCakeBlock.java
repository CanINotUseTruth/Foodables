package truth.foodables.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;

public class FoodablesCakeBlock extends CakeBlock {

    public FoodablesCakeBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ItemStack itemStack = player.getMainHandStack();;
  
        if (world.isClient) {
           if (tryEat(world, pos, state, player).isAccepted()) {
              return ActionResult.SUCCESS;
           }
  
           if (itemStack.isEmpty()) {
              return ActionResult.CONSUME;
           }
        }
  
        return tryEat(world, pos, state, player);
     }

    public static ActionResult tryEat(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canConsume(false)) {
           return ActionResult.PASS;
        } else {
           player.incrementStat(Stats.EAT_CAKE_SLICE);
           player.getHungerManager().add(1, 0.5F);
           int i = (Integer)state.get(BITES);
           world.emitGameEvent(player, GameEvent.EAT, (BlockPos)pos);
           if (i < 6) {
              world.setBlockState(pos, (BlockState)state.with(BITES, i + 1), Block.NOTIFY_ALL);
           } else {
              world.removeBlock(pos, false);
              world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, (BlockPos)pos);
           }
  
           return ActionResult.SUCCESS;
        }
    }
}
