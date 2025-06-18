package truth.foodables.registry;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.ExplosionDecayLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.util.Identifier;

public class EditVanillaLoot {
    private static final Identifier SQUID_ID = Identifier.of("minecraft", "entities/squid");
    private static final Identifier GRASS_ID = Identifier.of("minecraft", "blocks/short_grass");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
            if (source.isBuiltin() && SQUID_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceWithEnchantedBonusLootCondition.builder(registry,1.0f, 0.0f))
                        .with(ItemEntry.builder(ModItems.SQUID));

                tableBuilder.pool(poolBuilder.build());
            }

            if (source.isBuiltin() && GRASS_ID.equals(key.getValue())) {
                // Tomato seeds
                LootPool.Builder tomatoPoolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.015625f))
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(ApplyBonusLootFunction.oreDrops(registry.getOrThrow(net.minecraft.registry.RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                        .apply(ExplosionDecayLootFunction.builder());

                // Lettuce seeds
                LootPool.Builder lettucePoolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.015625f))
                        .with(ItemEntry.builder(ModItems.LETTUCE_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(ApplyBonusLootFunction.oreDrops(registry.getOrThrow(net.minecraft.registry.RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                        .apply(ExplosionDecayLootFunction.builder());

                // Brown onion seeds
                LootPool.Builder brownOnionPoolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.015625f))
                        .with(ItemEntry.builder(ModItems.BROWN_ONION_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(ApplyBonusLootFunction.oreDrops(registry.getOrThrow(net.minecraft.registry.RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                        .apply(ExplosionDecayLootFunction.builder());

                // Red onion seeds
                LootPool.Builder redOnionPoolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.015625f))
                        .with(ItemEntry.builder(ModItems.RED_ONION_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(ApplyBonusLootFunction.oreDrops(registry.getOrThrow(net.minecraft.registry.RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                        .apply(ExplosionDecayLootFunction.builder());

                // Garlic seeds
                LootPool.Builder garlicPoolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.015625f))
                        .with(ItemEntry.builder(ModItems.GARLIC_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build())
                        .apply(ApplyBonusLootFunction.oreDrops(registry.getOrThrow(net.minecraft.registry.RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                        .apply(ExplosionDecayLootFunction.builder());

                tableBuilder.pool(tomatoPoolBuilder.build());
                tableBuilder.pool(lettucePoolBuilder.build());
                tableBuilder.pool(brownOnionPoolBuilder.build());
                tableBuilder.pool(redOnionPoolBuilder.build());
                tableBuilder.pool(garlicPoolBuilder.build());
            }
        });
    }
}
