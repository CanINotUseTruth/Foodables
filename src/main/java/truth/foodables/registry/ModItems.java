package truth.foodables.registry;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import truth.foodables.Foodables;
import truth.foodables.items.Drink;
import truth.foodables.items.RecipeRemainder;
import truth.foodables.items.SeedItem;

public class ModItems {

    // Tool Items
    public static Item MORTAR_AND_PESTLE = new RecipeRemainder(new Item.Settings().maxCount(1));
    public static Item KNIFE = new RecipeRemainder(new Item.Settings().maxCount(1));
    public static Item CRUSHER = new RecipeRemainder(new Item.Settings().maxCount(1));
    public static Item WHISK = new RecipeRemainder(new Item.Settings().maxCount(1));
    public static Item JUICER = new RecipeRemainder(new Item.Settings().maxCount(1));
    public static Item WET_CARTON = new Item(new Item.Settings().maxCount(16));
    public static Item CARTON = new Item(new Item.Settings().maxCount(16));
    public static Item CAKE_TIN = new Item(new Item.Settings().maxCount(16));

    // Food Items
    // Veggies
    public static final Item LETTUCE = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6F).build()));
    public static final Item TOMATO = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6F).build()));
    public static final Item GARLIC = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build()));
    public static final Item BROWN_ONION = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build()));
    public static final Item RED_ONION = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6F).build()));
    public static final Item SLICED_BROWN_ONION = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build()));
    public static final Item SLICED_RED_ONION = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6F).build()));
    public static final Item PUMPKIN_SLICES = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build()));
    // Cooked Veggies
    public static final Item COOKED_ONION = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build()));
    public static final Item CARAMELIZED_ONION = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build()));
    public static final Item BATTERED_ONIONS = new Item(new Item.Settings());
    public static final Item ONION_RINGS = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8F).build()));
    public static final Item UNCOOKED_FRIES = new Item(new Item.Settings());
    public static final Item FRIES = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8F).build()));
    // Fruit
    public static final Item LEMON = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6F).build()));
    public static final Item LIME = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6F).build()));
    public static final Item ORANGE = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build()));
    public static final Item MANGO = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build()));
    public static final Item BANANA = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build()));
    public static final Item FRUIT_SALAD = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build()));
    // Berries
    public static final Item BLUEBERRIES = new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build()));
    public static final Item BLACKBERRIES = new AliasedBlockItem(ModBlocks.BLACKBERRY_BUSH, new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build()));
    // Baked Goods
    public static final Item BAKED_APPLE = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build()));
    public static final Item BAKED_PUMPKIN = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6F).build()));
    public static final Item BAKED_CARROT = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6F).build()));
    public static final Item BAKED_BEETROOT = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6F).build()));
    // Meats
    public static final Item SQUID = new Item(new Item.Settings());
    public static final Item BATTERED_SQUID = new Item(new Item.Settings());
    public static final Item SALT_AND_PEPPER_SQUID = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()));
    public static final Item RAW_NUGGETS = new Item(new Item.Settings());
    public static final Item BATTERED_NUGGETS = new Item(new Item.Settings());
    public static final Item COOKED_NUGGETS = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build()));
    public static final Item RAW_BACON = new Item(new Item.Settings());
    public static final Item SALTED_BACON_STRIPS = new Item(new Item.Settings());
    public static final Item BACON_JERKY = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.75f).build()));
    public static final Item COOKED_BACON = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build()));
    public static final Item CHICKEN_STRIPS = new Item(new Item.Settings());
    public static final Item SALTED_CHICKEN_STRIPS = new Item(new Item.Settings());
    public static final Item CHICKEN_JERKY = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.75f).build()));
    public static final Item BEEF_STRIPS = new Item(new Item.Settings());
    public static final Item SALTED_BEEF_STRIPS = new Item(new Item.Settings());
    public static final Item BEEF_JERKY = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.75f).build()));
    public static final Item COOKED_BEEF_STRIPS = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build()));
    public static final Item LAMB_STRIPS = new Item(new Item.Settings());
    public static final Item SALTED_LAMB_STRIPS = new Item(new Item.Settings());
    public static final Item LAMB_JERKY = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.75f).build()));
    public static final Item RABBIT_STRIPS = new Item(new Item.Settings());
    public static final Item SALTED_RABBIT_STRIPS = new Item(new Item.Settings());
    public static final Item RABBIT_JERKY = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.75f).build()));
    public static final Item SALTED_ZOMBIE_FLESH = new Item(new Item.Settings());
    public static final Item ZOMBIE_JERKY = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()));
    // Meat Adjacent Stuff
    public static final Item FRIED_EGG = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build()));
    public static final Item BACON_AND_EGGS = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build()));
    // Juices
    public static Item LEMON_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).alwaysEdible().build()));
    public static Item LIME_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).alwaysEdible().build()));
    public static Item ORANGE_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).alwaysEdible().build()));
    public static Item APPLE_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).alwaysEdible().build()));
    public static Item CARROT_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).alwaysEdible().build()));
    public static Item PUMPKIN_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).alwaysEdible().build()));
    public static Item TOMATO_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).alwaysEdible().build()));
    public static Item MELON_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).alwaysEdible().build()));
    public static Item SWEET_BERRY_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).alwaysEdible().build()));
    public static Item BLUEBERRY_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).alwaysEdible().build()));
    public static Item BLACKBERRY_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).alwaysEdible().build()));
    public static Item MANGO_JUICE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).alwaysEdible().build()));
    // Other Drinks
    public static Item LEMONADE = new Drink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).alwaysEdible().build()));
    // Oils
    public static Item SUNFLOWER_OIL = new RecipeRemainder(new Item.Settings(), Items.GLASS_BOTTLE);
    // Sauces
    public static Item MAYONNAISE = new RecipeRemainder(new Item.Settings(), Items.GLASS_BOTTLE);
    public static Item AIOLI = new RecipeRemainder(new Item.Settings(), Items.GLASS_BOTTLE);
    // Cake Stuff
    public static final Item PLAIN_CAKE_MIX = new Item(new Item.Settings().maxCount(16));
    public static final Item HONEY_CAKE_MIX = new Item(new Item.Settings().maxCount(16));
    public static final Item APPLE_CAKE_MIX = new Item(new Item.Settings().maxCount(16));
    public static final Item BERRY_CAKE_MIX = new Item(new Item.Settings().maxCount(16));
    public static final Item ORANGE_CAKE_MIX = new Item(new Item.Settings().maxCount(16));
    public static final Item BANANA_CAKE_MIX = new Item(new Item.Settings().maxCount(16));
    public static final Item CHOCOLATE_CAKE_MIX = new Item(new Item.Settings().maxCount(16));
    public static final Item BAKED_PLAIN_CAKE = new Item(new Item.Settings().recipeRemainder(CAKE_TIN).maxCount(16));
    public static final Item BAKED_HONEY_CAKE = new Item(new Item.Settings().recipeRemainder(CAKE_TIN).maxCount(16));
    public static final Item BAKED_APPLE_CAKE = new Item(new Item.Settings().recipeRemainder(CAKE_TIN).maxCount(16));
    public static final Item BAKED_BERRY_CAKE = new Item(new Item.Settings().recipeRemainder(CAKE_TIN).maxCount(16));
    public static final Item BAKED_ORANGE_CAKE = new Item(new Item.Settings().recipeRemainder(CAKE_TIN).maxCount(16));
    public static final Item BAKED_BANANA_CAKE = new Item(new Item.Settings().recipeRemainder(CAKE_TIN).maxCount(16));
    public static final Item BAKED_CHOCOLATE_CAKE = new Item(new Item.Settings().recipeRemainder(CAKE_TIN).maxCount(16));
    public static final BlockItem HONEY_CAKE = new BlockItem(ModBlocks.HONEY_CAKE, new Item.Settings().maxCount(16));
    public static final BlockItem APPLE_CAKE = new BlockItem(ModBlocks.APPLE_CAKE, new Item.Settings().maxCount(16));
    public static final BlockItem BERRY_CAKE = new BlockItem(ModBlocks.BERRY_CAKE, new Item.Settings().maxCount(16));
    public static final BlockItem ORANGE_CAKE = new BlockItem(ModBlocks.ORANGE_CAKE, new Item.Settings().maxCount(16));
    public static final BlockItem BANANA_CAKE = new BlockItem(ModBlocks.BANANA_CAKE, new Item.Settings().maxCount(16));
    public static final BlockItem CHOCOLATE_CAKE = new BlockItem(ModBlocks.CHOCOLATE_CAKE, new Item.Settings().maxCount(16));

    // Sandwich Stuff
    public static final Item DOUGH = new Item(new Item.Settings());
    public static final Item SLICED_BREAD = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item TOAST = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build()));
    public static final Item BLT_SANDWICH = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.6f).build()));
    public static final Item STEAK_SANDWICH = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(14).saturationModifier(0.6f).build()));
    // Miscellaneous
    public static final Item PEPPERCORN_ITEM = new Item(new Item.Settings());
    public static final Item DRIED_PEPPERCORN = new Item(new Item.Settings());
    public static final Item SALT = new Item(new Item.Settings());
    public static final Item GROUND_PEPPER = new Item(new Item.Settings());
    public static final Item GROUND_SALT = new Item(new Item.Settings());
    public static final Item WHEAT_FLOUR = new Item(new Item.Settings());
    public static final Item GROUND_COCOA = new Item(new Item.Settings());

    // Seed Items
    public static Item LETTUCE_SEEDS = new SeedItem(ModBlocks.LETTUCE_CROP, new Item.Settings());
    public static Item TOMATO_SEEDS = new SeedItem(ModBlocks.TOMATO_CROP, new Item.Settings());
    public static Item GARLIC_SEEDS = new SeedItem(ModBlocks.GARLIC_CROP, new Item.Settings());
    public static Item BROWN_ONION_SEEDS = new SeedItem(ModBlocks.BROWN_ONION_CROP, new Item.Settings());
    public static Item RED_ONION_SEEDS = new SeedItem(ModBlocks.RED_ONION_CROP, new Item.Settings());

    // Functional Block Items
    public static final BlockItem OAK_DRYING_RACK = new BlockItem(ModBlocks.OAK_DRYING_RACK, new Item.Settings());
    public static final BlockItem SPRUCE_DRYING_RACK = new BlockItem(ModBlocks.SPRUCE_DRYING_RACK, new Item.Settings());
    public static final BlockItem BIRCH_DRYING_RACK = new BlockItem(ModBlocks.BIRCH_DRYING_RACK, new Item.Settings());
    public static final BlockItem JUNGLE_DRYING_RACK = new BlockItem(ModBlocks.JUNGLE_DRYING_RACK, new Item.Settings());
    public static final BlockItem DARK_OAK_DRYING_RACK = new BlockItem(ModBlocks.DARK_OAK_DRYING_RACK, new Item.Settings());
    public static final BlockItem ACACIA_DRYING_RACK = new BlockItem(ModBlocks.ACACIA_DRYING_RACK, new Item.Settings());
    public static final BlockItem CRIMSON_DRYING_RACK = new BlockItem(ModBlocks.CRIMSON_DRYING_RACK, new Item.Settings());
    public static final BlockItem WARPED_DRYING_RACK = new BlockItem(ModBlocks.WARPED_DRYING_RACK, new Item.Settings());
    public static final BlockItem MANGROVE_DRYING_RACK = new BlockItem(ModBlocks.MANGROVE_DRYING_RACK, new Item.Settings());

    // Ore Block Items
    public static final BlockItem SALT_ORE = new BlockItem(ModBlocks.SALT_ORE, new Item.Settings());

    // Other Block Items
    public static final BlockItem PEPPERCORN_SAPLING = new BlockItem(ModBlocks.PEPPERCORN_SAPLING, new Item.Settings());
    public static final BlockItem LEMON_SAPLING = new BlockItem(ModBlocks.LEMON_SAPLING, new  Item.Settings());
    public static final BlockItem LIME_SAPLING = new BlockItem(ModBlocks.LIME_SAPLING, new Item.Settings());
    public static final BlockItem ORANGE_SAPLING = new BlockItem(ModBlocks.ORANGE_SAPLING, new Item.Settings());
    public static final BlockItem APPLE_SAPLING = new BlockItem(ModBlocks.APPLE_SAPLING, new Item.Settings());
    public static final BlockItem MANGO_SAPLING = new BlockItem(ModBlocks.MANGO_SAPLING, new Item.Settings());
    public static final BlockItem BANANA_SAPLING = new BlockItem(ModBlocks.BANANA_SAPLING, new Item.Settings());
    public static final BlockItem PEPPERCORN_LEAVES = new BlockItem(ModBlocks.PEPPERCORN_LEAVES, new Item.Settings());
    public static final BlockItem LEMON_LEAVES = new BlockItem(ModBlocks.LEMON_LEAVES, new Item.Settings());
    public static final BlockItem LIME_LEAVES = new BlockItem(ModBlocks.LIME_LEAVES, new Item.Settings());
    public static final BlockItem ORANGE_LEAVES = new BlockItem(ModBlocks.ORANGE_LEAVES, new Item.Settings());
    public static final BlockItem APPLE_LEAVES = new BlockItem(ModBlocks.APPLE_LEAVES, new Item.Settings());
    public static final BlockItem MANGO_LEAVES = new BlockItem(ModBlocks.MANGO_LEAVES, new Item.Settings());
    public static final BlockItem BANANA_LEAVES = new BlockItem(ModBlocks.BANANA_LEAVES, new Item.Settings());

    
    public static void registerItems() {
        // Food Items
        // Veggies
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lettuce"), LETTUCE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "tomato"), TOMATO);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "garlic"), GARLIC);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "brown_onion"), BROWN_ONION);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "red_onion"), RED_ONION);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "sliced_brown_onion"), SLICED_BROWN_ONION);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "sliced_red_onion"), SLICED_RED_ONION);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "pumpkin_slices"), PUMPKIN_SLICES);
        // Cooked Veggies
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "cooked_onion"), COOKED_ONION);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "caramelized_onion"), CARAMELIZED_ONION);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "battered_onions"), BATTERED_ONIONS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "onion_rings"), ONION_RINGS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "uncooked_fries"), UNCOOKED_FRIES);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "fries"), FRIES);
        // Fruit
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lemon"), LEMON);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lime"), LIME);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "orange"), ORANGE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "mango"), MANGO);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "banana"), BANANA);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "fruit_salad"), FRUIT_SALAD);
        // Berries
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "blueberries"), BLUEBERRIES);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "blackberries"), BLACKBERRIES);
        // Baked Goods
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_apple"), BAKED_APPLE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_pumpkin"), BAKED_PUMPKIN);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_carrot"), BAKED_CARROT);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_beetroot"), BAKED_BEETROOT);
        // Meats
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "squid"), SQUID);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "battered_squid"), BATTERED_SQUID);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salt_and_pepper_squid"), SALT_AND_PEPPER_SQUID);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "raw_nuggets"), RAW_NUGGETS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "battered_nuggets"), BATTERED_NUGGETS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "cooked_nuggets"), COOKED_NUGGETS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "raw_bacon"), RAW_BACON);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "chicken_strips"), CHICKEN_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "beef_strips"), BEEF_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lamb_strips"), LAMB_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "rabbit_strips"), RABBIT_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salted_bacon_strips"), SALTED_BACON_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salted_chicken_strips"), SALTED_CHICKEN_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salted_beef_strips"), SALTED_BEEF_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salted_lamb_strips"), SALTED_LAMB_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salted_rabbit_strips"), SALTED_RABBIT_STRIPS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salted_zombie_flesh"), SALTED_ZOMBIE_FLESH);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "bacon_jerky"), BACON_JERKY);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "chicken_jerky"), CHICKEN_JERKY);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "beef_jerky"), BEEF_JERKY);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lamb_jerky"), LAMB_JERKY);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "rabbit_jerky"), RABBIT_JERKY);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "zombie_jerky"), ZOMBIE_JERKY);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "cooked_bacon"), COOKED_BACON);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "cooked_beef_strips"), COOKED_BEEF_STRIPS);
        // Meat Adjacent Stuff
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "fried_egg"), FRIED_EGG);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "bacon_and_eggs"), BACON_AND_EGGS);
        // Juices
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lemon_juice"), LEMON_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lime_juice"), LIME_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "orange_juice"), ORANGE_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "apple_juice"), APPLE_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "carrot_juice"), CARROT_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "pumpkin_juice"), PUMPKIN_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "tomato_juice"), TOMATO_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "melon_juice"), MELON_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "sweet_berry_juice"), SWEET_BERRY_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "blueberry_juice"), BLUEBERRY_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "blackberry_juice"), BLACKBERRY_JUICE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "mango_juice"), MANGO_JUICE);
        // Other Drinks
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lemonade"), LEMONADE);
        // Oil
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "sunflower_oil"), SUNFLOWER_OIL);
        // Sauces
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "mayonnaise"), MAYONNAISE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "aioli"), AIOLI);

        // Cake Stuff
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "plain_cake_mix"), PLAIN_CAKE_MIX);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "honey_cake_mix"), HONEY_CAKE_MIX);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "apple_cake_mix"), APPLE_CAKE_MIX);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "berry_cake_mix"), BERRY_CAKE_MIX);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "orange_cake_mix"), ORANGE_CAKE_MIX);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "banana_cake_mix"), BANANA_CAKE_MIX);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "chocolate_cake_mix"), CHOCOLATE_CAKE_MIX);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_plain_cake"), BAKED_PLAIN_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_honey_cake"), BAKED_HONEY_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_apple_cake"), BAKED_APPLE_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_berry_cake"), BAKED_BERRY_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_orange_cake"), BAKED_ORANGE_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_banana_cake"), BAKED_BANANA_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "baked_chocolate_cake"), BAKED_CHOCOLATE_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "honey_cake"), HONEY_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "apple_cake"), APPLE_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "berry_cake"), BERRY_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "orange_cake"), ORANGE_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "banana_cake"), BANANA_CAKE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);
        // Sandwich Stuff
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "dough"), DOUGH);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "sliced_bread"), SLICED_BREAD);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "toast"), TOAST);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "blt_sandwich"), BLT_SANDWICH);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "steak_sandwich"), STEAK_SANDWICH);
        // Miscellaneous
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_item"), PEPPERCORN_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "dried_peppercorn"), DRIED_PEPPERCORN);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salt"), SALT);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "ground_pepper"), GROUND_PEPPER);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "ground_salt"), GROUND_SALT);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "wheat_flour"), WHEAT_FLOUR);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "ground_cocoa"), GROUND_COCOA);

        // Items
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "mortar_and_pestle"), MORTAR_AND_PESTLE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "knife"), KNIFE);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "crusher"), CRUSHER);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "whisk"), WHISK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "juicer"), JUICER);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "wet_carton"), WET_CARTON);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "carton"), CARTON);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "cake_tin"), CAKE_TIN);

        // Seed Items
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lettuce_seeds"), LETTUCE_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "tomato_seeds"), TOMATO_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "garlic_seeds"), GARLIC_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "brown_onion_seeds"), BROWN_ONION_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "red_onion_seeds"), RED_ONION_SEEDS);

        // Functional Block Items
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "oak_drying_rack"), OAK_DRYING_RACK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "spruce_drying_rack"), SPRUCE_DRYING_RACK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "birch_drying_rack"), BIRCH_DRYING_RACK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "jungle_drying_rack"), JUNGLE_DRYING_RACK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "dark_oak_drying_rack"), DARK_OAK_DRYING_RACK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "acacia_drying_rack"), ACACIA_DRYING_RACK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "crimson_drying_rack"), CRIMSON_DRYING_RACK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "warped_drying_rack"), WARPED_DRYING_RACK);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "mangrove_drying_rack"), MANGROVE_DRYING_RACK);

        // Ore Block Items
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "salt_ore"), SALT_ORE);

        // Tree Block Items
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_sapling"), PEPPERCORN_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lemon_sapling"), LEMON_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lime_sapling"), LIME_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "orange_sapling"), ORANGE_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "apple_sapling"), APPLE_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "mango_sapling"), MANGO_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "banana_sapling"), BANANA_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_leaves"), PEPPERCORN_LEAVES);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lemon_leaves"), LEMON_LEAVES);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "lime_leaves"), LIME_LEAVES);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "orange_leaves"), ORANGE_LEAVES);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "apple_leaves"), APPLE_LEAVES);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "mango_leaves"), MANGO_LEAVES);
        Registry.register(Registries.ITEM, new Identifier(Foodables.MOD_ID, "banana_leaves"), BANANA_LEAVES);
    }
}