package truth.foodables.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class EditVanillaLoot {
    private static final Identifier SQUID_LOOT_TABLE_ID = new Identifier("minecraft", "entities/squid");
    private static final Identifier MOD_SQUID_LOOT_TABLE_ID = new Identifier("fab", "entities/squid");

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, id, table, setter) -> {
            if (SQUID_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(MOD_SQUID_LOOT_TABLE_ID));
                table.withPool(poolBuilder.build());
            }
        }));
    }
}
