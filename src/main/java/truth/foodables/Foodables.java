package truth.foodables;

import net.fabricmc.api.ModInitializer;
import truth.foodables.registry.EditVanillaLoot;
import truth.foodables.registry.ModBlocks;
import truth.foodables.registry.ModGeneration;
import truth.foodables.registry.ModItems;
import truth.foodables.registry.ModRecipes;

public class Foodables implements ModInitializer {

    public static final String MOD_ID = "fab";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModGeneration.registerOreGen();
        ModGeneration.registerTrees();
        ModRecipes.registerRecipes();
        EditVanillaLoot.modifyLootTables();
    }

}