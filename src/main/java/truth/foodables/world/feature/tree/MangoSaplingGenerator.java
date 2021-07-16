package truth.foodables.world.feature.tree;

import java.util.Random;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import truth.foodables.registry.ModGeneration;

public class MangoSaplingGenerator extends SaplingGenerator {

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return ModGeneration.MANGO_TREE;
    }

}
