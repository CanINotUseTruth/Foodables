package truth.foodables.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.Arrays;
import java.util.Collection;

public class ModPlacedFeatures {

    // Biome Collections
    private static final Collection<RegistryKey<Biome>> forestCollection = Arrays.asList(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST);
    private static final Collection<RegistryKey<Biome>> jungleCollection = Arrays.asList(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE);
    private static final Collection<RegistryKey<Biome>> plainsCollection = Arrays.asList(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS);

    public static final RegistryEntry<PlacedFeature> SALT_ORE;
    public static final RegistryEntry<PlacedFeature> BLUEBERRY_BUSH;
    public static final RegistryEntry<PlacedFeature> BLACKBERRY_BUSH;
    public static final RegistryEntry<PlacedFeature> PEPPERCORN_TREE;
    public static final RegistryEntry<PlacedFeature> LEMON_TREE;
    public static final RegistryEntry<PlacedFeature> LIME_TREE;
    public static final RegistryEntry<PlacedFeature> ORANGE_TREE;
    public static final RegistryEntry<PlacedFeature> APPLE_TREE;
    public static final RegistryEntry<PlacedFeature> MANGO_TREE;
    public static final RegistryEntry<PlacedFeature> BANANA_TREE;

    static {
        SALT_ORE = FoodablePlacedFeatures.registerInBiomes(
                "salt_ore",
                ModConfiguredFeatures.SALT_ORE,
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                CountPlacementModifier.of(8), // # of veins per chunk.
                HeightRangePlacementModifier.uniform(
                        YOffset.fixed(16),
                        YOffset.fixed(64)
                ),
                BiomePlacementModifier.of()
        );
        BLUEBERRY_BUSH = FoodablePlacedFeatures.registerInBiomes(
                "blueberry_bush",
                ModConfiguredFeatures.BLUEBERRY_BUSH,
                BiomeSelectors.includeByKey(forestCollection),
                GenerationStep.Feature.VEGETAL_DECORATION,
                RarityFilterPlacementModifier.of(24),
                SquarePlacementModifier.of(),
                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP,
                BiomePlacementModifier.of()
        );
        BLACKBERRY_BUSH = FoodablePlacedFeatures.registerInBiomes(
                "blackberry_bush",
                ModConfiguredFeatures.BLUEBERRY_BUSH,
                BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                RarityFilterPlacementModifier.of(24),
                SquarePlacementModifier.of(),
                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP,
                BiomePlacementModifier.of()
        );
        PEPPERCORN_TREE = FoodablePlacedFeatures.registerInBiomes(
                "peppercorn_tree",
                ModConfiguredFeatures.PEPPERCORN_TREE,
                BiomeSelectors.includeByKey(plainsCollection),
                GenerationStep.Feature.VEGETAL_DECORATION,
                VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.PEPPERCORN_SAPLING)
        );
        LEMON_TREE = FoodablePlacedFeatures.registerInBiomes(
                "lemon_tree",
                ModConfiguredFeatures.LEMON_TREE,
                BiomeSelectors.includeByKey(plainsCollection),
                GenerationStep.Feature.VEGETAL_DECORATION,
                VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.LEMON_SAPLING)
        );
        LIME_TREE = FoodablePlacedFeatures.registerInBiomes(
                "lime_tree",
                ModConfiguredFeatures.LIME_TREE,
                BiomeSelectors.includeByKey(plainsCollection),
                GenerationStep.Feature.VEGETAL_DECORATION,
                VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.LIME_SAPLING)
        );
        ORANGE_TREE = FoodablePlacedFeatures.registerInBiomes(
                "orange_tree",
                ModConfiguredFeatures.ORANGE_TREE,
                BiomeSelectors.includeByKey(forestCollection),
                GenerationStep.Feature.VEGETAL_DECORATION,
                VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.ORANGE_SAPLING)
        );
        APPLE_TREE = FoodablePlacedFeatures.registerInBiomes(
                "apple_tree",
                ModConfiguredFeatures.APPLE_TREE,
                BiomeSelectors.includeByKey(forestCollection),
                GenerationStep.Feature.VEGETAL_DECORATION,
                VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.APPLE_SAPLING)
        );
        MANGO_TREE = FoodablePlacedFeatures.registerInBiomes(
                "mango_tree",
                ModConfiguredFeatures.MANGO_TREE,
                BiomeSelectors.includeByKey(jungleCollection),
                GenerationStep.Feature.VEGETAL_DECORATION,
                VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.MANGO_SAPLING)
        );
        BANANA_TREE = FoodablePlacedFeatures.registerInBiomes(
                "banana_tree",
                ModConfiguredFeatures.BANANA_TREE,
                BiomeSelectors.includeByKey(jungleCollection),
                GenerationStep.Feature.VEGETAL_DECORATION,
                VegetationPlacedFeatures.modifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.BANANA_SAPLING)
        );
    }

    public static void init() {}
}
