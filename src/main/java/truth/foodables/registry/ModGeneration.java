package truth.foodables.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModGeneration {

    //Ores
    private static ConfiguredFeature<?, ?> SALT_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.SALT_ORE.getDefaultState(), 8)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(16), YOffset.fixed(64))))).spreadHorizontally().repeat(8); // number of veins per chunk

    // Peppercorn Tree
    public static final TreeFeatureConfig PEPPERCORN_TREE_CONFIG = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,3,0),
            new SimpleBlockStateProvider(ModBlocks.PEPPERCORN_LEAVES.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.PEPPERCORN_SAPLING.getDefaultState()),
            new BlobFoliagePlacer(UniformIntProvider.create(2,2), UniformIntProvider.create(0,0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).build();

    public static final ConfiguredFeature<TreeFeatureConfig, ?> PEPPERCORN_TREE = Feature.TREE.configure(ModGeneration.PEPPERCORN_TREE_CONFIG);
    public static final ConfiguredFeature<?, ?> PEPPERCORN_TREES = PEPPERCORN_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(300))
    .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
    .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1))));

    // Lemon Tree
    public static final TreeFeatureConfig LEMON_TREE_CONFIG = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,3,0),
            new SimpleBlockStateProvider(ModBlocks.LEMON_LEAVES.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.LEMON_SAPLING.getDefaultState()),
            new BlobFoliagePlacer(UniformIntProvider.create(2,2), UniformIntProvider.create(0,0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).build();

    public static final ConfiguredFeature<TreeFeatureConfig, ?> LEMON_TREE = Feature.TREE.configure(ModGeneration.LEMON_TREE_CONFIG);
    public static final ConfiguredFeature<?, ?> LEMON_TREES = LEMON_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(300))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1))));

    // Lime Tree
    public static final TreeFeatureConfig LIME_TREE_CONFIG = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,3,0),
            new SimpleBlockStateProvider(ModBlocks.LIME_LEAVES.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.LIME_SAPLING.getDefaultState()),
            new BlobFoliagePlacer(UniformIntProvider.create(2,2), UniformIntProvider.create(0,0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).build();
    
    public static final ConfiguredFeature<TreeFeatureConfig, ?> LIME_TREE = Feature.TREE.configure(ModGeneration.LIME_TREE_CONFIG);
    public static final ConfiguredFeature<?, ?> LIME_TREES = LIME_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(300))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1))));

    // Orange Tree
    public static final TreeFeatureConfig ORANGE_TREE_CONFIG = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,3,0),
            new SimpleBlockStateProvider(ModBlocks.ORANGE_LEAVES.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.ORANGE_SAPLING.getDefaultState()),
            new BlobFoliagePlacer(UniformIntProvider.create(2,2), UniformIntProvider.create(0,0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).build();
    
    public static final ConfiguredFeature<TreeFeatureConfig, ?> ORANGE_TREE = Feature.TREE.configure(ModGeneration.ORANGE_TREE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORANGE_TREES = ORANGE_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(300))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1))));

    // Apple Tree
    public static final TreeFeatureConfig APPLE_TREE_CONFIG = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,3,0),
            new SimpleBlockStateProvider(ModBlocks.APPLE_LEAVES.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.APPLE_SAPLING.getDefaultState()),
            new BlobFoliagePlacer(UniformIntProvider.create(2,2), UniformIntProvider.create(0,0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).build();
    
    public static final ConfiguredFeature<TreeFeatureConfig, ?> APPLE_TREE = Feature.TREE.configure(ModGeneration.APPLE_TREE_CONFIG);
    public static final ConfiguredFeature<?, ?> APPLE_TREES = APPLE_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(300))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1))));

    // Mango Tree
    public static final TreeFeatureConfig MANGO_TREE_CONFIG = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,3,0),
            new SimpleBlockStateProvider(ModBlocks.MANGO_LEAVES.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.MANGO_SAPLING.getDefaultState()),
            new BlobFoliagePlacer(UniformIntProvider.create(2,2), UniformIntProvider.create(0,0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).build();
    
    public static final ConfiguredFeature<TreeFeatureConfig, ?> MANGO_TREE = Feature.TREE.configure(ModGeneration.MANGO_TREE_CONFIG);
    public static final ConfiguredFeature<?, ?> MANGO_TREES = MANGO_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(300))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1))));

    // Banana Tree
    public static final TreeFeatureConfig BANANA_TREE_CONFIG = new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,3,0),
            new SimpleBlockStateProvider(ModBlocks.BANANA_LEAVES.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.BANANA_SAPLING.getDefaultState()),
            new BlobFoliagePlacer(UniformIntProvider.create(2,2), UniformIntProvider.create(0,0), 3),
            new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(new SimpleBlockStateProvider(Blocks.GRASS_BLOCK.getDefaultState())).build();
    
    public static final ConfiguredFeature<TreeFeatureConfig, ?> BANANA_TREE = Feature.TREE.configure(ModGeneration.BANANA_TREE_CONFIG);
    public static final ConfiguredFeature<?, ?> BANANA_TREES = BANANA_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(300))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)))
        .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1))));


    public static void registerOreGen() {
        //Salt Ore
        RegistryKey<ConfiguredFeature<?, ?>> saltOre= RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "salt_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, saltOre.getValue(), SALT_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, saltOre);
    }

    public static void registerTrees() {
        // Peppercorn Tree
        RegistryKey<ConfiguredFeature<?, ?>> peppercornTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "peppercorn_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, peppercornTrees.getValue(), PEPPERCORN_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, peppercornTrees);

        // Lemon Tree
        RegistryKey<ConfiguredFeature<?, ?>> lemonTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "lemon_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, lemonTrees.getValue(), LEMON_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, lemonTrees);

        // Lime Tree
        RegistryKey<ConfiguredFeature<?, ?>> limeTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "lime_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, limeTrees.getValue(), LIME_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, limeTrees);

        // Orange Tree
        RegistryKey<ConfiguredFeature<?, ?>> orangeTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "orange_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orangeTrees.getValue(), ORANGE_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, orangeTrees);

        // Apple Tree
        RegistryKey<ConfiguredFeature<?, ?>> appleTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "apple_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, appleTrees.getValue(), APPLE_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, appleTrees);

        // Mango Tree
        RegistryKey<ConfiguredFeature<?, ?>> mangoTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "mango_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mangoTrees.getValue(), MANGO_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, mangoTrees);

        // Banana Tree
        RegistryKey<ConfiguredFeature<?, ?>> bananaTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "banana_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bananaTrees.getValue(), BANANA_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, bananaTrees);

    }

}
