package truth.foodables.blocks.saplings;

import net.minecraft.block.AbstractBlock;
import java.util.Optional;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;
import truth.foodables.registry.ModConfiguredFeatures;

public class BananaSapling extends SaplingBlock {

    public BananaSapling(Settings settings) {
        super(new SaplingGenerator("banana", Optional.empty(), Optional.of(ModConfiguredFeatures.BANANA_TREE_CF),
                Optional.empty()),
                settings);
    }
}
