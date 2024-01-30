package truth.foodables.blocks.saplings;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import java.util.Optional;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;
import truth.foodables.registry.ModConfiguredFeatures;

public class AppleSapling extends SaplingBlock {

    public AppleSapling() {
        super(new SaplingGenerator("apple", Optional.empty(), Optional.of(ModConfiguredFeatures.APPLE_TREE_CF),
                Optional.empty()),
                FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).sounds(BlockSoundGroup.GRASS)
                        .noCollision().ticksRandomly().breakInstantly().nonOpaque());
    }
}
