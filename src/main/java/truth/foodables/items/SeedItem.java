package truth.foodables.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import truth.foodables.blocks.FoodablesCropBlock;


public class SeedItem extends BlockItem {

    public SeedItem(Block block, Settings settings) {
        super(block, settings);
        ((FoodablesCropBlock) block).setSeedsItem(this);
    }
    
}
