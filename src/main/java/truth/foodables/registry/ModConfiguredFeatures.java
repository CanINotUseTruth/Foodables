package truth.foodables.registry;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import truth.foodables.Foodables;

public class ModConfiguredFeatures {

        public static final RegistryKey<ConfiguredFeature<?,?>> APPLE_TREE_CF = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodables.MOD_ID, "apple_tree"));
        public static final RegistryKey<ConfiguredFeature<?,?>> BANANA_TREE_CF = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodables.MOD_ID, "banana_tree"));
        public static final RegistryKey<ConfiguredFeature<?,?>> LEMON_TREE_CF = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodables.MOD_ID, "lemon_tree"));
        public static final RegistryKey<ConfiguredFeature<?,?>> LIME_TREE_CF = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodables.MOD_ID, "lime_tree"));
        public static final RegistryKey<ConfiguredFeature<?,?>> MANGO_TREE_CF = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodables.MOD_ID, "mango_tree"));
        public static final RegistryKey<ConfiguredFeature<?,?>> ORANGE_TREE_CF = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodables.MOD_ID, "orange_tree"));
        public static final RegistryKey<ConfiguredFeature<?,?>> PEPPERCORN_TREE_CF = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Foodables.MOD_ID, "peppercorn_tree"));
}
