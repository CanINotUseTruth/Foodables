package truth.foodables.items;

import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import truth.foodables.blocks.FabCropBlock;


public class SeedItem extends AliasedBlockItem {

    public SeedItem(Block block, Settings settings) {
        super(block, settings);
        ((FabCropBlock) block).setSeedsItem(this);
    }
    
}
