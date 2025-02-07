package truth.foodables.registry;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import truth.foodables.Foodables;

public class EditVanillaLoot {
    private static final Identifier SQUID_LOOT_TABLE_ID = new Identifier("minecraft", "entities/squid");
    private static final Identifier MOD_SQUID_LOOT_TABLE_ID = new Identifier(Foodables.MOD_ID, "entities/squid");
    private static final Identifier GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/short_grass");
    private static final Identifier MOD_GRASS_LOOT_TABLE_ID = new Identifier(Foodables.MOD_ID, "blocks/short_grass");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && SQUID_LOOT_TABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(MOD_SQUID_LOOT_TABLE_ID));
                tableBuilder.pool(poolBuilder);
            }
            if (source.isBuiltin() && GRASS_LOOT_TABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(LootTableEntry.builder(MOD_GRASS_LOOT_TABLE_ID));
                tableBuilder.pool(poolBuilder);
            }
        }));
    }
}
