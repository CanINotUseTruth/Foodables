package truth.foodables.world.feature.tree;

import com.mojang.serialization.Codec;

import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class PeppercornTreeFeature extends TreeFeature{

    public PeppercornTreeFeature(Codec<TreeFeatureConfig> codec) {
        super(codec);
    }
    
}
