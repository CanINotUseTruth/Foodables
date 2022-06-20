package truth.foodables.registry;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<?, ?>> SALT_ORE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> BLUEBERRY_BUSH;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> BLACKBERRY_BUSH;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> PEPPERCORN_TREE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> LEMON_TREE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> LIME_TREE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> ORANGE_TREE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> APPLE_TREE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> MANGO_TREE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> BANANA_TREE;

    static {
        SALT_ORE = FoodableConfiguredFeatures.register(
                "salt_ore",
                Feature.ORE,
                new OreFeatureConfig(
                        OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                        ModBlocks.SALT_ORE.getDefaultState(),
                        8 // # of blocks per cluster
                )
        );
        BLUEBERRY_BUSH = FoodableConfiguredFeatures.register(
                "blueberry_bush",
                Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(
                                BlockStateProvider.of(
                                        ModBlocks.BLUEBERRY_BUSH.getDefaultState().with(Properties.AGE_3, 3)
                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                )
        );
        BLACKBERRY_BUSH = FoodableConfiguredFeatures.register(
                "blackberry_bush",
                Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(
                                BlockStateProvider.of(
                                        ModBlocks.BLACKBERRY_BUSH.getDefaultState().with(Properties.AGE_3, 3)
                                )
                        ),
                        List.of(Blocks.GRASS_BLOCK)
                )
        );
        PEPPERCORN_TREE = FoodableConfiguredFeatures.register(
                "peppercorn_tree",
                Feature.TREE,
                makeTreeWith(Blocks.OAK_LOG.getDefaultState(), ModBlocks.PEPPERCORN_LEAVES.getDefaultState())
        );
        LEMON_TREE = FoodableConfiguredFeatures.register(
                "lemon_tree",
                Feature.TREE,
                makeTreeWith(Blocks.OAK_LOG.getDefaultState(), ModBlocks.LEMON_LEAVES.getDefaultState())
        );
        LIME_TREE = FoodableConfiguredFeatures.register(
                "lime_tree",
                Feature.TREE,
                makeTreeWith(Blocks.OAK_LOG.getDefaultState(), ModBlocks.LIME_LEAVES.getDefaultState())
        );
        ORANGE_TREE = FoodableConfiguredFeatures.register(
                "orange_tree",
                Feature.TREE,
                makeTreeWith(Blocks.OAK_LOG.getDefaultState(), ModBlocks.ORANGE_LEAVES.getDefaultState())
        );
        APPLE_TREE = FoodableConfiguredFeatures.register(
                "apple_tree",
                Feature.TREE,
                makeTreeWith(Blocks.OAK_LOG.getDefaultState(), ModBlocks.APPLE_LEAVES.getDefaultState())
        );
        MANGO_TREE = FoodableConfiguredFeatures.register(
                "mango_tree",
                Feature.TREE,
                makeTreeWith(Blocks.JUNGLE_LOG.getDefaultState(), ModBlocks.MANGO_LEAVES.getDefaultState())
        );
        BANANA_TREE = FoodableConfiguredFeatures.register(
                "banana_tree",
                Feature.TREE,
                makeTreeWith(Blocks.JUNGLE_LOG.getDefaultState(), ModBlocks.BANANA_LEAVES.getDefaultState())
        );

    }

    private static TreeFeatureConfig makeTreeWith(BlockState logState, BlockState leavesState) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(logState),
                        new StraightTrunkPlacer(4, 3, 0),
                        BlockStateProvider.of(leavesState),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                .ignoreVines()
                .build();
    }

    public static void init() {}
}
