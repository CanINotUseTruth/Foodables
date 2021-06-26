package truth.foodables.blocks.saplings;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.sound.BlockSoundGroup;
import truth.foodables.world.feature.tree.PeppercornSaplingGenerator;

public class PeppercornSapling extends SaplingBlock {

    public PeppercornSapling() {
        super(new PeppercornSaplingGenerator(), FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.GRASS).noCollision().ticksRandomly().breakInstantly().nonOpaque());
    }
}
