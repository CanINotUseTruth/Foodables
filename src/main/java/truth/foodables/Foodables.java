package truth.foodables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import truth.foodables.registry.EditVanillaLoot;
import truth.foodables.registry.ModBlocks;
import truth.foodables.registry.ModGroups;
import truth.foodables.registry.ModItems;
import truth.foodables.registry.ModPlacedFeatures;
import truth.foodables.registry.ModRecipes;

public class Foodables implements ModInitializer {

    // TODO - Villager Trading
    // TODO - REI Support for Drying Rack

    public static final String MOD_ID = "fab";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModPlacedFeatures.init();
        ModRecipes.registerRecipes();
        ModGroups.addToGroups();
        EditVanillaLoot.modifyLootTables();
    }

}