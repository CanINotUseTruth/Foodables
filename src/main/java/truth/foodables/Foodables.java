package truth.foodables;

import net.fabricmc.api.ModInitializer;
import truth.foodables.registry.*;

public class Foodables implements ModInitializer {

    public static final String MOD_ID = "fab";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModConfiguredFeatures.init();
        ModPlacedFeatures.init();
        ModRecipes.registerRecipes();
        EditVanillaLoot.modifyLootTables();
    }

}