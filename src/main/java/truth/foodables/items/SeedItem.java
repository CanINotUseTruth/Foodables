package truth.foodables.items;

import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import truth.foodables.blocks.FoodablesCropBlock;


public class SeedItem extends AliasedBlockItem {

    public SeedItem(Block block, Settings settings) {
        super(block, settings);
        ((FoodablesCropBlock) block).setSeedsItem(this);
    }
    
}
