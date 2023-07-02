package truth.foodables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import truth.foodables.config.FoodablesConfig;
import truth.foodables.registry.EditVanillaLoot;
import truth.foodables.registry.ModBlocks;
import truth.foodables.registry.ModGroups;
import truth.foodables.registry.ModItems;
import truth.foodables.registry.ModPlacedFeatures;
import truth.foodables.registry.ModRecipes;

public class Foodables implements ModInitializer {

    // TODO - Update Drying rack with custom recipe type and serializer
    // TODO - REI & EMI Support for Drying Rack
    // TODO - Villager Trading
    // TODO - Update Wiki
    // TODO - Update Gradle and Loom - Before next minecraft version update

    // TODO - Tomato Sauce, Cheese, Pizzas/Pizza Oven, Garlic Bread, Butter, Garlic Butter, Churn, Milk Bottle for cake recipes
    // TODO - Placeable Pies - MAYBE

    public static final String MOD_ID = "foodables";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final FoodablesConfig CONFIG = AutoConfig.register(FoodablesConfig.class, GsonConfigSerializer::new).getConfig();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModPlacedFeatures.registerPlacedFeatures();
        ModRecipes.registerRecipes();
        ModGroups.registerItemGroups();
        EditVanillaLoot.modifyLootTables();
    }

}