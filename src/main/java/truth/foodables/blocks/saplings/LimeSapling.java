package truth.foodables.blocks.saplings;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.sound.BlockSoundGroup;
import truth.foodables.world.feature.tree.LimeSaplingGenerator;

public class LimeSapling extends SaplingBlock {

    public LimeSapling() {
        super(new LimeSaplingGenerator(), FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.GRASS).noCollision().ticksRandomly().breakInstantly().nonOpaque());
    }
}
