package truth.foodables.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import truth.foodables.Foodables;
import truth.foodables.items.Drink;
import truth.foodables.items.RecipeRemainder;
import truth.foodables.items.SeedItem;

public class ModItems {

    // Food Items
    // Veggies
    public static final Item LETTUCE = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item TOMATO = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item GARLIC = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item BROWN_ONION = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item RED_ONION = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item SLICED_BROWN_ONION = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item SLICED_RED_ONION = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item COOKED_ONION = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).build()));
    public static final Item CARAMELIZED_ONION = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(8f).build()));
    public static final Item BATTERED_ONIONS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item ONION_RINGS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(9f).build()));
    public static final Item UNCOOKED_FRIES = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item FRIES = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(8f).build()));
    //Fruit
    public static final Item LEMON = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build()));
    public static final Item LIME = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build()));
    // Meats
    public static final Item SQUID = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item BATTERED_SQUID = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALT_AND_PEPPER_SQUID = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(14f).build()));
    public static final Item RAW_NUGGETS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item BATTERED_NUGGETS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item COOKED_NUGGETS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(14f).build()));
    public static final Item RAW_BACON = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALTED_BACON_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item BACON_JERKY = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(14f).build()));
    public static final Item COOKED_BACON = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(12f).build()));
    public static final Item CHICKEN_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALTED_CHICKEN_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item CHICKEN_JERKY = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(7).saturationModifier(10f).build()));
    public static final Item BEEF_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALTED_BEEF_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item BEEF_JERKY = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(14f).build()));
    public static final Item LAMB_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALTED_LAMB_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item LAMB_JERKY = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(7).saturationModifier(10f).build()));
    public static final Item RABBIT_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALTED_RABBIT_STRIPS = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item RABBIT_JERKY = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(7).saturationModifier(10f).build()));
    public static final Item SALTED_ZOMBIE_FLESH = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item ZOMBIE_JERKY = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).build()));
    // Juices
    public static Item LEMON_JUICE = new Drink(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.4f).alwaysEdible().build()).recipeRemainder(Items.GLASS_BOTTLE));
    public static Item LIME_JUICE = new Drink(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.4f).alwaysEdible().build()).recipeRemainder(Items.GLASS_BOTTLE));
    // Oils
    public static Item SUNFLOWER_OIL = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP), Items.GLASS_BOTTLE);
    // Sauces
    public static Item MAYONNAISE = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP), Items.GLASS_BOTTLE);
    public static Item AIOLI = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP), Items.GLASS_BOTTLE);
    // Sandwich Stuff
    public static final Item SLICED_BREAD = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item TOAST = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).build()));
    public static final Item BLT_SANDWICH = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(14f).build()));
    public static final Item STEAK_SANDWICH = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(14).saturationModifier(20.6f).build()));
    // Miscellaneous
    public static final Item PEPPERCORN_ITEM = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item DRIED_PEPPERCORN = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item GROUND_PEPPER = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALT = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item GROUND_SALT = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item WHEAT_FLOUR = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));

    // Tool Items
    public static Item MORTAR_AND_PESTLE = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item KNIFE = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item CRUSHER = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item WHISK = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item JUICER = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item WET_CARTON = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item CARTON = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));

    // Seed Items
    public static Item LETTUCE_SEEDS = new SeedItem(ModBlocks.LETTUCE_CROP, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item TOMATO_SEEDS = new SeedItem(ModBlocks.TOMATO_CROP, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item GARLIC_SEEDS = new SeedItem(ModBlocks.GARLIC_CROP, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item BROWN_ONION_SEEDS = new SeedItem(ModBlocks.BROWN_ONION_CROP, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item RED_ONION_SEEDS = new SeedItem(ModBlocks.RED_ONION_CROP, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));

    // Functional Block Items
    public static final BlockItem OAK_DRYING_RACK = new BlockItem(ModBlocks.OAK_DRYING_RACK, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem SPRUCE_DRYING_RACK = new BlockItem(ModBlocks.SPRUCE_DRYING_RACK, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem BIRCH_DRYING_RACK = new BlockItem(ModBlocks.BIRCH_DRYING_RACK, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem JUNGLE_DRYING_RACK = new BlockItem(ModBlocks.JUNGLE_DRYING_RACK, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem DARK_OAK_DRYING_RACK = new BlockItem(ModBlocks.DARK_OAK_DRYING_RACK, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem ACACIA_DRYING_RACK = new BlockItem(ModBlocks.ACACIA_DRYING_RACK, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem CRIMSON_DRYING_RACK = new BlockItem(ModBlocks.CRIMSON_DRYING_RACK, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem WARPED_DRYING_RACK = new BlockItem(ModBlocks.WARPED_DRYING_RACK, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));

    // Ore Block Items
    public static final BlockItem SALT_ORE = new BlockItem(ModBlocks.SALT_ORE, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));

    // Other Block Items
    public static final BlockItem PEPPERCORN_SAPLING = new BlockItem(ModBlocks.PEPPERCORN_SAPLING, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem LEMON_SAPLING = new BlockItem(ModBlocks.LEMON_SAPLING, new  Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem LIME_SAPLING = new BlockItem(ModBlocks.LIME_SAPLING, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem PEPPERCORN_LEAVES = new BlockItem(ModBlocks.PEPPERCORN_LEAVES, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem LEMON_LEAVES = new BlockItem(ModBlocks.LEMON_LEAVES, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem LIME_LEAVES = new BlockItem(ModBlocks.LIME_LEAVES, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    
    public static void registerItems() {
        // Food Items
        // Veggies
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lettuce"), LETTUCE);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "tomato"), TOMATO);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "garlic"), GARLIC);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "brown_onion"), BROWN_ONION);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "red_onion"), RED_ONION);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "sliced_brown_onion"), SLICED_BROWN_ONION);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "sliced_red_onion"), SLICED_RED_ONION);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "cooked_onion"), COOKED_ONION);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "caramelized_onion"), CARAMELIZED_ONION);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "battered_onions"), BATTERED_ONIONS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "onion_rings"), ONION_RINGS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "uncooked_fries"), UNCOOKED_FRIES);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "fries"), FRIES);
        // Fruit
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lemon"), LEMON);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lime"), LIME);
        // Meats
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "squid"), SQUID);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "battered_squid"), BATTERED_SQUID);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salt_and_pepper_squid"), SALT_AND_PEPPER_SQUID);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "raw_nuggets"), RAW_NUGGETS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "battered_nuggets"), BATTERED_NUGGETS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "cooked_nuggets"), COOKED_NUGGETS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salted_bacon_strips"), SALTED_BACON_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "bacon_jerky"), BACON_JERKY);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "cooked_bacon"), COOKED_BACON);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "chicken_strips"), CHICKEN_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salted_chicken_strips"), SALTED_CHICKEN_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "chicken_jerky"), CHICKEN_JERKY);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "beef_strips"), BEEF_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salted_beef_strips"), SALTED_BEEF_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "beef_jerky"), BEEF_JERKY);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lamb_strips"), LAMB_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salted_lamb_strips"), SALTED_LAMB_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lamb_jerky"), LAMB_JERKY);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "rabbit_strips"), RABBIT_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salted_rabbit_strips"), SALTED_RABBIT_STRIPS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "rabbit_jerky"), RABBIT_JERKY);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salted_zombie_flesh"), SALTED_ZOMBIE_FLESH);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "zombie_jerky"), ZOMBIE_JERKY);
        // Juices
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lemon_juice"), LEMON_JUICE);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lime_juice"), LIME_JUICE);
        // Oil
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "sunflower_oil"), SUNFLOWER_OIL);
        // Sauces
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "mayonnaise"), MAYONNAISE);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "aioli"), AIOLI);
        // Sandwich Stuff
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "sliced_bread"), SLICED_BREAD);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "toast"), TOAST);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "blt_sandwich"), BLT_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "steak_sandwich"), STEAK_SANDWICH);
        // Miscellaneous
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_item"), PEPPERCORN_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "dried_peppercorn"), DRIED_PEPPERCORN);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "ground_pepper"), GROUND_PEPPER);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "ground_salt"), GROUND_SALT);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "wheat_flour"), WHEAT_FLOUR);

        // Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "mortar_and_pestle"), MORTAR_AND_PESTLE);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "knife"), KNIFE);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "crusher"), CRUSHER);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "whisk"), WHISK);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "juicer"), JUICER);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "wet_carton"), WET_CARTON);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "carton"), CARTON);

        // Seed Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lettuce_seeds"), LETTUCE_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "tomato_seeds"), TOMATO_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "garlic_seeds"), GARLIC_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "brown_onion_seeds"), BROWN_ONION_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "red_onion_seeds"), RED_ONION_SEEDS);

        // Functional Block Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "oak_drying_rack"), OAK_DRYING_RACK);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "spruce_drying_rack"), SPRUCE_DRYING_RACK);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "birch_drying_rack"), BIRCH_DRYING_RACK);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "jungle_drying_rack"), JUNGLE_DRYING_RACK);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "dark_oak_drying_rack"), DARK_OAK_DRYING_RACK);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "acacia_drying_rack"), ACACIA_DRYING_RACK);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "crimson_drying_rack"), CRIMSON_DRYING_RACK);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "warped_drying_rack"), WARPED_DRYING_RACK);

        // Ore Block Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salt_ore"), SALT_ORE);

        // Tree Block Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_sapling"), PEPPERCORN_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lemon_sapling"), LEMON_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lime_sapling"), LIME_SAPLING); 
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_leaves"), PEPPERCORN_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lemon_leaves"), LEMON_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lime_leaves"), LIME_LEAVES);
    }

}
