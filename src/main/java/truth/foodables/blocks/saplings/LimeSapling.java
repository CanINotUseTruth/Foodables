package truth.foodables.blocks.saplings;

import net.minecraft.block.AbstractBlock;
import java.util.Optional;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;
import truth.foodables.registry.ModConfiguredFeatures;

public class LimeSapling extends SaplingBlock {

    public LimeSapling(Settings settings) {
        super(new SaplingGenerator("lime", Optional.empty(), Optional.of(ModConfiguredFeatures.LIME_TREE_CF),
                Optional.empty()),
                settings);
    }
}
