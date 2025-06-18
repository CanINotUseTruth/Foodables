package truth.foodables.blocks.saplings;

import net.minecraft.block.AbstractBlock;
import java.util.Optional;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;
import truth.foodables.registry.ModConfiguredFeatures;

public class MangoSapling extends SaplingBlock {

    public MangoSapling(Settings settings) {
        super(new SaplingGenerator("mango", Optional.empty(), Optional.of(ModConfiguredFeatures.MANGO_TREE_CF),
                Optional.empty()),
                settings);
    }
}
