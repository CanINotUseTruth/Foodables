package truth.foodables.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;
import truth.foodables.registry.ModConfiguredFeatures;

public class LimeSaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(net.minecraft.util.math.random.Random var1, boolean var2) {
        return ModConfiguredFeatures.LIME_TREE_CF;
    }

}