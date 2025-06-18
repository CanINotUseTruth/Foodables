package truth.foodables.blocks;

import java.util.List;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import truth.foodables.registry.ModItems;

@SuppressWarnings("deprecation")
public class FoodablesCropBlock extends CropBlock {

    private Item seed;

    public FoodablesCropBlock(Settings settings) {
        super(settings);
    }

    public void setSeedsItem(Item seed) {
        this.seed = seed;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return seed;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hitResult) {
        if(!world.isClient && isMature(state)){
            List<ItemStack> dropList = getDroppedStacks(state, (ServerWorld)world, pos, null, player, player.getMainHandStack());
            DefaultedList<ItemStack> drops = DefaultedList.of();
            for(ItemStack stack : dropList){
                drops.add(stack);
            }

            for(ItemStack stack : drops){
                if(stack.getItem() == ModItems.LETTUCE_SEEDS){
                    ItemStack seedStack = stack.copy();
                    drops.remove(stack);
                    seedStack.decrement(1);
                    drops.add(seedStack);
                    break;
                }
            }

            world.setBlockState(pos, state.with(AGE, 0));
            ItemScatterer.spawn(world, pos, drops);
        }
        return super.onUse(state, world, pos, player, hitResult);
    }

}
