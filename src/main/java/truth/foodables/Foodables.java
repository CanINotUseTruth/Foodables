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

    // TODO - Cherry Drying Racks
    // TODO - Waterlog from bucket Drying Racks
    // TODO - Disable drying if waterlogged
    // TODO - Villager Trading
    // TODO - REI Support for Drying Rack
    // TODO - Pizzas & Pizza Oven
    // TODO - Cheese & Cheescakes
    // TODO - Pies
    // TODO - Garlic Bread
    // TODO - Milk Bottle for cake recipes
    // TODO - Biome Tags for generation

    public static final String MOD_ID = "fab";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModPlacedFeatures.init();
        ModRecipes.registerRecipes();
        ModGroups.registerItemGroups();
        EditVanillaLoot.modifyLootTables();
    }

}