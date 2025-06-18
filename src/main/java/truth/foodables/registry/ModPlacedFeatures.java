package truth.foodables.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import truth.foodables.Foodables;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;


public class ModPlacedFeatures {

	// Biome Collections
	public static Collection<RegistryKey<Biome>> forestCollection = Arrays.asList(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST, BiomeKeys.DARK_FOREST);
	public static Collection<RegistryKey<Biome>> jungleCollection = Arrays.asList(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE);
	public static Collection<RegistryKey<Biome>> plainsCollection = Arrays.asList(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS);
	public static Collection<RegistryKey<Biome>> coldCollection = Arrays.asList(BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA, BiomeKeys.TAIGA);

	public static Collection<RegistryKey<Biome>> blueBerryCollection = Arrays.asList(BiomeKeys.DARK_FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST);
	public static Collection<RegistryKey<Biome>> blackBerryCollection = Arrays.asList(BiomeKeys.DARK_FOREST, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA);

	public static void registerPlacedFeatures() {
		if(Foodables.CONFIG.worldGen.enableTreeGeneration) registerTrees();
		if(Foodables.CONFIG.worldGen.enableBerryBushGeneration) registerBerryBushes();
		if(Foodables.CONFIG.worldGen.enableOreGeneration) registerOres();
	}

	private static void registerTrees() {
		registerVegetalGeneration(coldCollection, "apple_tree_patch");
		registerVegetalGeneration(jungleCollection, "banana_tree_patch");
		registerVegetalGeneration(forestCollection, "lemon_tree_patch");
		registerVegetalGeneration(forestCollection, "lime_tree_patch");
		registerVegetalGeneration(jungleCollection, "mango_tree_patch");
		registerVegetalGeneration(forestCollection, "orange_tree_patch");
		registerVegetalGeneration(plainsCollection, "peppercorn_tree_patch");
	}

	private static void registerBerryBushes() {
		registerVegetalGeneration(blueBerryCollection, "blueberry_patch");
		registerVegetalGeneration(blackBerryCollection, "blackberry_patch");
	}

	private static void registerOres() {
		registerUndergroundGeneration("salt_ore");
	}

	private static void registerVegetalGeneration(Collection<RegistryKey<Biome>> biomeKeys, String name) {
		Predicate<BiomeSelectionContext> biomeSelector = BiomeSelectors.includeByKey(biomeKeys);
		BiomeModifications.addFeature(biomeSelector, GenerationStep.Feature.VEGETAL_DECORATION, RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Foodables.MOD_ID, name)));
	}

	private static void registerUndergroundGeneration(String name) {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Foodables.MOD_ID, name)));
	}
}
