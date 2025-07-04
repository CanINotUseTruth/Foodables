package truth.foodables.blocks.cakeblocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
import truth.foodables.blocks.FoodablesCakeBlock;

public class HoneyCakeBlock extends FoodablesCakeBlock {

    public HoneyCakeBlock(Settings settings) {
        super(settings);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ItemStack itemStack = player.getMainHandStack();
  
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
           player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 1, false, false, true));
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
