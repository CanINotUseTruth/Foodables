package truth.foodables.blocks.saplings;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.sound.BlockSoundGroup;
import truth.foodables.world.feature.tree.MangoSaplingGenerator;

public class MangoSapling extends SaplingBlock {
    
    public MangoSapling() {
        super(new MangoSaplingGenerator(), FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.GRASS).noCollision().ticksRandomly().breakInstantly().nonOpaque());
    }
}
