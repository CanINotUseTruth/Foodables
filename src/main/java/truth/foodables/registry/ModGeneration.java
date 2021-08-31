package truth.foodables.registry;

import java.util.Arrays;
import java.util.Collection;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
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
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import truth.foodables.Foodables;

public class ModGeneration {

    // Biome Collections
    public static Collection<RegistryKey<Biome>> forestCollection = Arrays.asList(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST, BiomeKeys.WOODED_HILLS);
    public static Collection<RegistryKey<Biome>> jungleCollection = Arrays.asList(BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_EDGE, BiomeKeys.JUNGLE_HILLS, BiomeKeys.MODIFIED_JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE);
    public static Collection<RegistryKey<Biome>> plainsCollection = Arrays.asList(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS);

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
    public static final ConfiguredFeature<?, ?> PEPPERCORN_TREES = PEPPERCORN_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(250))
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
    public static final ConfiguredFeature<?, ?> LEMON_TREES = LEMON_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(250))
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
    public static final ConfiguredFeature<?, ?> LIME_TREES = LIME_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(250))
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
    public static final ConfiguredFeature<?, ?> ORANGE_TREES = ORANGE_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(50))
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
    public static final ConfiguredFeature<?, ?> APPLE_TREES = APPLE_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(50))
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
    public static final ConfiguredFeature<?, ?> MANGO_TREES = MANGO_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(15))
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
    public static final ConfiguredFeature<?, ?> BANANA_TREES = BANANA_TREE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(15))
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
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(plainsCollection), GenerationStep.Feature.VEGETAL_DECORATION, peppercornTrees);

        // Lemon Tree
        RegistryKey<ConfiguredFeature<?, ?>> lemonTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "lemon_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, lemonTrees.getValue(), LEMON_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(plainsCollection), GenerationStep.Feature.VEGETAL_DECORATION, lemonTrees);

        // Lime Tree
        RegistryKey<ConfiguredFeature<?, ?>> limeTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "lime_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, limeTrees.getValue(), LIME_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(plainsCollection), GenerationStep.Feature.VEGETAL_DECORATION, limeTrees);

        // Orange Tree
        RegistryKey<ConfiguredFeature<?, ?>> orangeTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "orange_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orangeTrees.getValue(), ORANGE_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(forestCollection), GenerationStep.Feature.VEGETAL_DECORATION, orangeTrees);

        // Apple Tree
        RegistryKey<ConfiguredFeature<?, ?>> appleTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "apple_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, appleTrees.getValue(), APPLE_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(forestCollection), GenerationStep.Feature.VEGETAL_DECORATION, appleTrees);

        // Mango Tree
        RegistryKey<ConfiguredFeature<?, ?>> mangoTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "mango_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mangoTrees.getValue(), MANGO_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(jungleCollection), GenerationStep.Feature.VEGETAL_DECORATION, mangoTrees);

        // Banana Tree
        RegistryKey<ConfiguredFeature<?, ?>> bananaTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("fab", "banana_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bananaTrees.getValue(), BANANA_TREES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(jungleCollection), GenerationStep.Feature.VEGETAL_DECORATION, bananaTrees);

    }

    public static void registerBushes () {
		BlockState blueberryBlockState = ModBlocks.BLUEBERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3);
		RandomPatchFeatureConfig blueberryFeatureConfig = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(blueberryBlockState), SimpleBlockPlacer.INSTANCE)).tries(32).spreadX(2).spreadY(3).spreadZ(2).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).build();
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Foodables.MOD_ID, "blueberry_generation"), Feature.RANDOM_PATCH.configure(blueberryFeatureConfig).applyChance(24));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(forestCollection), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Foodables.MOD_ID, "blueberry_generation")));

        BlockState blackberryBlockState = ModBlocks.BLACKBERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3);
		RandomPatchFeatureConfig blackberryFeatureConfig = (new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(blackberryBlockState), SimpleBlockPlacer.INSTANCE)).tries(32).spreadX(2).spreadY(3).spreadZ(2).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK)).build();
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Foodables.MOD_ID, "blackberry_generation"), Feature.RANDOM_PATCH.configure(blackberryFeatureConfig).applyChance(24));
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Foodables.MOD_ID, "blackberry_generation")));
		
	}

}
