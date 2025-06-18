package truth.foodables.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.function.Function;
import truth.foodables.Foodables;
import truth.foodables.items.Drink;
import truth.foodables.items.RecipeRemainder;
import truth.foodables.items.SeedItem;

public class ModItems {

    // Tool Items
    public static Item MORTAR_AND_PESTLE;
    public static Item KNIFE;
    public static Item CRUSHER;
    public static Item WHISK;
    public static Item JUICER;
    public static Item WET_CARTON;
    public static Item CARTON;
    public static Item CAKE_TIN;

    // Food Items
    // Veggies
    public static Item LETTUCE;
    public static Item TOMATO;
    public static Item GARLIC;
    public static Item BROWN_ONION;
    public static Item RED_ONION;
    public static Item SLICED_BROWN_ONION;
    public static Item SLICED_RED_ONION;
    public static Item PUMPKIN_SLICES;
    // Cooked Veggies
    public static Item COOKED_ONION;
    public static Item CARAMELIZED_ONION;
    public static Item BATTERED_ONIONS;
    public static Item ONION_RINGS;
    public static Item UNCOOKED_FRIES;
    public static Item FRIES;
    // Fruit
    public static Item LEMON;
    public static Item LIME;
    public static Item ORANGE;
    public static Item MANGO;
    public static Item BANANA;
    public static Item FRUIT_SALAD;
    // Berries
    public static Item BLUEBERRIES;
    public static Item BLACKBERRIES;
    // Baked Goods
    public static Item BAKED_APPLE;
    public static Item BAKED_PUMPKIN;
    public static Item BAKED_CARROT;
    public static Item BAKED_BEETROOT;
    // Meats
    public static Item SQUID;
    public static Item BATTERED_SQUID;
    public static Item SALT_AND_PEPPER_SQUID;
    public static Item RAW_NUGGETS;
    public static Item BATTERED_NUGGETS;
    public static Item COOKED_NUGGETS;
    public static Item RAW_BACON;
    public static Item SALTED_BACON_STRIPS;
    public static Item BACON_JERKY;
    public static Item COOKED_BACON;
    public static Item CHICKEN_STRIPS;
    public static Item SALTED_CHICKEN_STRIPS;
    public static Item CHICKEN_JERKY;
    public static Item BEEF_STRIPS;
    public static Item SALTED_BEEF_STRIPS;
    public static Item BEEF_JERKY;
    public static Item COOKED_BEEF_STRIPS;
    public static Item LAMB_STRIPS;
    public static Item SALTED_LAMB_STRIPS;
    public static Item LAMB_JERKY;
    public static Item RABBIT_STRIPS;
    public static Item SALTED_RABBIT_STRIPS;
    public static Item RABBIT_JERKY;
    public static Item SALTED_ZOMBIE_FLESH;
    public static Item ZOMBIE_JERKY;
    // Meat Adjacent Stuff
    public static Item FRIED_EGG;
    public static Item BACON_AND_EGGS;
    // Juices
    public static Item LEMON_JUICE;
    public static Item LIME_JUICE;
    public static Item ORANGE_JUICE;
    public static Item APPLE_JUICE;
    public static Item CARROT_JUICE;
    public static Item PUMPKIN_JUICE;
    public static Item TOMATO_JUICE;
    public static Item MELON_JUICE;
    public static Item SWEET_BERRY_JUICE;
    public static Item BLUEBERRY_JUICE;
    public static Item BLACKBERRY_JUICE;
    public static Item MANGO_JUICE;
    // Other Drinks
    public static Item LEMONADE;
    // Oils
    public static Item SUNFLOWER_OIL;
    // Sauces
    public static Item MAYONNAISE;
    public static Item AIOLI;
    // Cake Stuff
    public static Item PLAIN_CAKE_MIX;
    public static Item HONEY_CAKE_MIX;
    public static Item APPLE_CAKE_MIX;
    public static Item BERRY_CAKE_MIX;
    public static Item ORANGE_CAKE_MIX;
    public static Item BANANA_CAKE_MIX;
    public static Item CHOCOLATE_CAKE_MIX;
    public static Item BAKED_PLAIN_CAKE;
    public static Item BAKED_HONEY_CAKE;
    public static Item BAKED_APPLE_CAKE;
    public static Item BAKED_BERRY_CAKE;
    public static Item BAKED_ORANGE_CAKE;
    public static Item BAKED_BANANA_CAKE;
    public static Item BAKED_CHOCOLATE_CAKE;
    public static BlockItem HONEY_CAKE;
    public static BlockItem APPLE_CAKE;
    public static BlockItem BERRY_CAKE;
    public static BlockItem ORANGE_CAKE;
    public static BlockItem BANANA_CAKE;
    public static BlockItem CHOCOLATE_CAKE;

    // Sandwich Stuff
    public static Item DOUGH;
    public static Item SLICED_BREAD;
    public static Item TOAST;
    public static Item BLT_SANDWICH;
    public static Item STEAK_SANDWICH;
    // Miscellaneous
    public static Item PEPPERCORN_ITEM;
    public static Item DRIED_PEPPERCORN;
    public static Item SALT;
    public static Item GROUND_PEPPER;
    public static Item GROUND_SALT;
    public static Item WHEAT_FLOUR;
    public static Item GROUND_COCOA;

    // Seed Items
    public static Item LETTUCE_SEEDS;
    public static Item TOMATO_SEEDS;
    public static Item GARLIC_SEEDS;
    public static Item BROWN_ONION_SEEDS;
    public static Item RED_ONION_SEEDS;

    // Functional Block Items
    public static BlockItem OAK_DRYING_RACK;
    public static BlockItem SPRUCE_DRYING_RACK;
    public static BlockItem BIRCH_DRYING_RACK;
    public static BlockItem JUNGLE_DRYING_RACK;
    public static BlockItem DARK_OAK_DRYING_RACK;
    public static BlockItem ACACIA_DRYING_RACK;
    public static BlockItem CRIMSON_DRYING_RACK;
    public static BlockItem WARPED_DRYING_RACK;
    public static BlockItem MANGROVE_DRYING_RACK;
    public static BlockItem CHERRY_DRYING_RACK;
    public static BlockItem PALE_OAK_DRYING_RACK;

    // Ore Block Items
    public static BlockItem SALT_ORE;

    // Other Block Items
    public static BlockItem PEPPERCORN_SAPLING;
    public static BlockItem LEMON_SAPLING;
    public static BlockItem LIME_SAPLING;
    public static BlockItem ORANGE_SAPLING;
    public static BlockItem APPLE_SAPLING;
    public static BlockItem MANGO_SAPLING;
    public static BlockItem BANANA_SAPLING;
    public static BlockItem PEPPERCORN_LEAVES;
    public static BlockItem LEMON_LEAVES;
    public static BlockItem LIME_LEAVES;
    public static BlockItem ORANGE_LEAVES;
    public static BlockItem APPLE_LEAVES;
    public static BlockItem MANGO_LEAVES;
    public static BlockItem BANANA_LEAVES;

    
    public static void registerItems() {
        // Items - Updated to MC 1.21.5 compatible registration
        MORTAR_AND_PESTLE = registerRecipeRemainder("mortar_and_pestle", new Item.Settings().maxCount(1));
        KNIFE = registerRecipeRemainder("knife", new Item.Settings().maxCount(1));
        CRUSHER = registerRecipeRemainder("crusher", new Item.Settings().maxCount(1));
        WHISK = registerRecipeRemainder("whisk", new Item.Settings().maxCount(1));
        JUICER = registerRecipeRemainder("juicer", new Item.Settings().maxCount(1));
        WET_CARTON = registerItem("wet_carton", Item::new, new Item.Settings().maxCount(16));
        CARTON = registerItem("carton", Item::new, new Item.Settings().maxCount(16));
        CAKE_TIN = registerItem("cake_tin", Item::new, new Item.Settings().maxCount(16));

        // Food Items - Updated to MC 1.21.5 compatible registration
        // Veggies
        LETTUCE = registerItem("lettuce", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.6F).build()));
        TOMATO = registerItem("tomato", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.6F).build()));
        GARLIC = registerItem("garlic", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build()));
        BROWN_ONION = registerItem("brown_onion", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build()));
        RED_ONION = registerItem("red_onion", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.6F).build()));
        SLICED_BROWN_ONION = registerItem("sliced_brown_onion", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build()));
        SLICED_RED_ONION = registerItem("sliced_red_onion", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.6F).build()));
        PUMPKIN_SLICES = registerItem("pumpkin_slices", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build()));
        // Cooked Veggies
        COOKED_ONION = registerItem("cooked_onion", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5F).build()));
        CARAMELIZED_ONION = registerItem("caramelized_onion", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.8F).build()));
        BATTERED_ONIONS = registerItem("battered_onions", Item::new, new Item.Settings());
        ONION_RINGS = registerItem("onion_rings", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.6F).build()));
        UNCOOKED_FRIES = registerItem("uncooked_fries", Item::new, new Item.Settings());
        FRIES = registerItem("fries", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.8F).build()).useRemainder(CARTON));
        // Fruit
        LEMON = registerItem("lemon", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.6F).build()));
        LIME = registerItem("lime", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.6F).build()));
        ORANGE = registerItem("orange", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build()));
        MANGO = registerItem("mango", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build()));
        BANANA = registerItem("banana", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build()));
        FRUIT_SALAD = registerItem("fruit_salad", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build()));
        // Berries - Updated to MC 1.21.5 compatible registration
        BLUEBERRIES = registerBlockItem("blueberries", new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.4f).build()), ModBlocks.BLUEBERRY_BUSH);
        BLACKBERRIES = registerBlockItem("blackberries", new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.4f).build()), ModBlocks.BLACKBERRY_BUSH);
        // Baked Goods
        BAKED_APPLE = registerItem("baked_apple", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.8f).build()));
        BAKED_PUMPKIN = registerItem("baked_pumpkin", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.6F).build()));
        BAKED_CARROT = registerItem("baked_carrot", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.6F).build()));
        BAKED_BEETROOT = registerItem("baked_beetroot", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6F).build()));
        // Meats
        SQUID = registerItem("squid", Item::new, new Item.Settings());
        BATTERED_SQUID = registerItem("battered_squid", Item::new, new Item.Settings());
        SALT_AND_PEPPER_SQUID = registerItem("salt_and_pepper_squid", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f).build()));
        RAW_NUGGETS = registerItem("raw_nuggets", Item::new, new Item.Settings());
        BATTERED_NUGGETS = registerItem("battered_nuggets", Item::new, new Item.Settings());
        COOKED_NUGGETS = registerItem("cooked_nuggets", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build()).useRemainder(CARTON));
        RAW_BACON = registerItem("raw_bacon", Item::new, new Item.Settings());
        SALTED_BACON_STRIPS = registerItem("salted_bacon_strips", Item::new, new Item.Settings());
        BACON_JERKY = registerItem("bacon_jerky", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(9).saturationModifier(0.75f).build()));
        COOKED_BACON = registerItem("cooked_bacon", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.8f).build()));
        CHICKEN_STRIPS = registerItem("chicken_strips", Item::new, new Item.Settings());
        SALTED_CHICKEN_STRIPS = registerItem("salted_chicken_strips", Item::new, new Item.Settings());
        CHICKEN_JERKY = registerItem("chicken_jerky", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(7).saturationModifier(0.75f).build()));
        BEEF_STRIPS = registerItem("beef_strips", Item::new, new Item.Settings());
        SALTED_BEEF_STRIPS = registerItem("salted_beef_strips", Item::new, new Item.Settings());
        BEEF_JERKY = registerItem("beef_jerky", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(9).saturationModifier(0.75f).build()));
        COOKED_BEEF_STRIPS = registerItem("cooked_beef_strips", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.8f).build()));
        LAMB_STRIPS = registerItem("lamb_strips", Item::new, new Item.Settings());
        SALTED_LAMB_STRIPS = registerItem("salted_lamb_strips", Item::new, new Item.Settings());
        LAMB_JERKY = registerItem("lamb_jerky", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(7).saturationModifier(0.75f).build()));
        RABBIT_STRIPS = registerItem("rabbit_strips", Item::new, new Item.Settings());
        SALTED_RABBIT_STRIPS = registerItem("salted_rabbit_strips", Item::new, new Item.Settings());
        RABBIT_JERKY = registerItem("rabbit_jerky", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(7).saturationModifier(0.75f).build()));
        SALTED_ZOMBIE_FLESH = registerItem("salted_zombie_flesh", Item::new, new Item.Settings());
        ZOMBIE_JERKY = registerItem("zombie_jerky", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.5f).build()));
        // Meat Adjacent Stuff
        FRIED_EGG = registerItem("fried_egg", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.8f).build()));
        BACON_AND_EGGS = registerItem("bacon_and_eggs", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build()));
        // Juices - Updated to MC 1.21.5 compatible registration
        LEMON_JUICE = registerDrink("lemon_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        LIME_JUICE = registerDrink("lime_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        ORANGE_JUICE = registerDrink("orange_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        APPLE_JUICE = registerDrink("apple_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        CARROT_JUICE = registerDrink("carrot_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        PUMPKIN_JUICE = registerDrink("pumpkin_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        TOMATO_JUICE = registerDrink("tomato_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        MELON_JUICE = registerDrink("melon_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        SWEET_BERRY_JUICE = registerDrink("sweet_berry_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        BLUEBERRY_JUICE = registerDrink("blueberry_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        BLACKBERRY_JUICE = registerDrink("blackberry_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        MANGO_JUICE = registerDrink("mango_juice", new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        // Other Drinks
        LEMONADE = registerDrink("lemonade", new Item.Settings().food(new FoodComponent.Builder().nutrition(5).saturationModifier(0.7f).alwaysEdible().build()).useRemainder(Items.GLASS_BOTTLE));
        // Oil - Updated to MC 1.21.5 compatible registration
        SUNFLOWER_OIL = registerRecipeRemainder("sunflower_oil", new Item.Settings(), Items.GLASS_BOTTLE);
        // Sauces - Updated to MC 1.21.5 compatible registration
        MAYONNAISE = registerRecipeRemainder("mayonnaise", new Item.Settings(), Items.GLASS_BOTTLE);
        AIOLI = registerRecipeRemainder("aioli", new Item.Settings(), Items.GLASS_BOTTLE);

        // Cake Stuff
        PLAIN_CAKE_MIX = registerItem("plain_cake_mix", Item::new, new Item.Settings().maxCount(16));
        HONEY_CAKE_MIX = registerItem("honey_cake_mix", Item::new, new Item.Settings().maxCount(16));
        APPLE_CAKE_MIX = registerItem("apple_cake_mix", Item::new, new Item.Settings().maxCount(16));
        BERRY_CAKE_MIX = registerItem("berry_cake_mix", Item::new, new Item.Settings().maxCount(16));
        ORANGE_CAKE_MIX = registerItem("orange_cake_mix", Item::new, new Item.Settings().maxCount(16));
        BANANA_CAKE_MIX = registerItem("banana_cake_mix", Item::new, new Item.Settings().maxCount(16));
        CHOCOLATE_CAKE_MIX = registerItem("chocolate_cake_mix", Item::new, new Item.Settings().maxCount(16));
        BAKED_PLAIN_CAKE = registerRecipeRemainder("baked_plain_cake", new Item.Settings().maxCount(16), CAKE_TIN);
        BAKED_HONEY_CAKE = registerRecipeRemainder("baked_honey_cake", new Item.Settings().maxCount(16), CAKE_TIN);
        BAKED_APPLE_CAKE = registerRecipeRemainder("baked_apple_cake", new Item.Settings().maxCount(16), CAKE_TIN);
        BAKED_BERRY_CAKE = registerRecipeRemainder("baked_berry_cake", new Item.Settings().maxCount(16), CAKE_TIN);
        BAKED_ORANGE_CAKE = registerRecipeRemainder("baked_orange_cake", new Item.Settings().maxCount(16), CAKE_TIN);
        BAKED_BANANA_CAKE = registerRecipeRemainder("baked_banana_cake", new Item.Settings().maxCount(16), CAKE_TIN);
        BAKED_CHOCOLATE_CAKE = registerRecipeRemainder("baked_chocolate_cake", new Item.Settings().maxCount(16), CAKE_TIN);
        HONEY_CAKE = registerBlockItem("honey_cake", new Item.Settings().maxCount(16), ModBlocks.HONEY_CAKE);
        APPLE_CAKE = registerBlockItem("apple_cake", new Item.Settings().maxCount(16), ModBlocks.APPLE_CAKE);
        BERRY_CAKE = registerBlockItem("berry_cake", new Item.Settings().maxCount(16), ModBlocks.BERRY_CAKE);
        ORANGE_CAKE = registerBlockItem("orange_cake", new Item.Settings().maxCount(16), ModBlocks.ORANGE_CAKE);
        BANANA_CAKE = registerBlockItem("banana_cake", new Item.Settings().maxCount(16), ModBlocks.BANANA_CAKE);
        CHOCOLATE_CAKE = registerBlockItem("chocolate_cake", new Item.Settings().maxCount(16), ModBlocks.CHOCOLATE_CAKE);
        // Sandwich Stuff
        DOUGH = registerItem("dough", Item::new, new Item.Settings());
        SLICED_BREAD = registerItem("sliced_bread", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.4f).build()));
        TOAST = registerItem("toast", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(4).saturationModifier(0.8f).build()));
        BLT_SANDWICH = registerItem("blt_sandwich", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(10).saturationModifier(1.4f).build()));
        STEAK_SANDWICH = registerItem("steak_sandwich", Item::new, new Item.Settings().food(new FoodComponent.Builder().nutrition(12).saturationModifier(1.6f).build()));
        // Miscellaneous
        PEPPERCORN_ITEM = registerItem("peppercorn_item", Item::new, new Item.Settings());
        DRIED_PEPPERCORN = registerItem("dried_peppercorn", Item::new, new Item.Settings());
        SALT = registerItem("salt", Item::new, new Item.Settings());
        GROUND_PEPPER = registerItem("ground_pepper", Item::new, new Item.Settings());
        GROUND_SALT = registerItem("ground_salt", Item::new, new Item.Settings());
        WHEAT_FLOUR = registerItem("wheat_flour", Item::new, new Item.Settings());
        GROUND_COCOA = registerItem("ground_cocoa", Item::new, new Item.Settings());

        // Seed Items - Updated to MC 1.21.5 compatible registration
        LETTUCE_SEEDS = registerSeedItem("lettuce_seeds", new Item.Settings(), ModBlocks.LETTUCE_CROP);
        TOMATO_SEEDS = registerSeedItem("tomato_seeds", new Item.Settings(), ModBlocks.TOMATO_CROP);
        GARLIC_SEEDS = registerSeedItem("garlic_seeds", new Item.Settings(), ModBlocks.GARLIC_CROP);
        BROWN_ONION_SEEDS = registerSeedItem("brown_onion_seeds", new Item.Settings(), ModBlocks.BROWN_ONION_CROP);
        RED_ONION_SEEDS = registerSeedItem("red_onion_seeds", new Item.Settings(), ModBlocks.RED_ONION_CROP);

        // Functional Block Items - Updated to MC 1.21.5 compatible registration
        OAK_DRYING_RACK = registerBlockItem("oak_drying_rack", new Item.Settings(), ModBlocks.OAK_DRYING_RACK);
        SPRUCE_DRYING_RACK = registerBlockItem("spruce_drying_rack", new Item.Settings(), ModBlocks.SPRUCE_DRYING_RACK);
        BIRCH_DRYING_RACK = registerBlockItem("birch_drying_rack", new Item.Settings(), ModBlocks.BIRCH_DRYING_RACK);
        JUNGLE_DRYING_RACK = registerBlockItem("jungle_drying_rack", new Item.Settings(), ModBlocks.JUNGLE_DRYING_RACK);
        DARK_OAK_DRYING_RACK = registerBlockItem("dark_oak_drying_rack", new Item.Settings(), ModBlocks.DARK_OAK_DRYING_RACK);
        ACACIA_DRYING_RACK = registerBlockItem("acacia_drying_rack", new Item.Settings(), ModBlocks.ACACIA_DRYING_RACK);
        CRIMSON_DRYING_RACK = registerBlockItem("crimson_drying_rack", new Item.Settings(), ModBlocks.CRIMSON_DRYING_RACK);
        WARPED_DRYING_RACK = registerBlockItem("warped_drying_rack", new Item.Settings(), ModBlocks.WARPED_DRYING_RACK);
        MANGROVE_DRYING_RACK = registerBlockItem("mangrove_drying_rack", new Item.Settings(), ModBlocks.MANGROVE_DRYING_RACK);
        CHERRY_DRYING_RACK = registerBlockItem("cherry_drying_rack", new Item.Settings(), ModBlocks.CHERRY_DRYING_RACK);
        PALE_OAK_DRYING_RACK = registerBlockItem("pale_oak_drying_rack", new Item.Settings(), ModBlocks.PALE_OAK_DRYING_RACK);

        // Ore Block Items - Updated to MC 1.21.5 compatible registration
        SALT_ORE = registerBlockItem("salt_ore", new Item.Settings(), ModBlocks.SALT_ORE);

        // Tree Block Items - Updated to MC 1.21.5 compatible registration
        PEPPERCORN_SAPLING = registerBlockItem("peppercorn_sapling", new Item.Settings(), ModBlocks.PEPPERCORN_SAPLING);
        LEMON_SAPLING = registerBlockItem("lemon_sapling", new Item.Settings(), ModBlocks.LEMON_SAPLING);
        LIME_SAPLING = registerBlockItem("lime_sapling", new Item.Settings(), ModBlocks.LIME_SAPLING);
        ORANGE_SAPLING = registerBlockItem("orange_sapling", new Item.Settings(), ModBlocks.ORANGE_SAPLING);
        APPLE_SAPLING = registerBlockItem("apple_sapling", new Item.Settings(), ModBlocks.APPLE_SAPLING);
        MANGO_SAPLING = registerBlockItem("mango_sapling", new Item.Settings(), ModBlocks.MANGO_SAPLING);
        BANANA_SAPLING = registerBlockItem("banana_sapling", new Item.Settings(), ModBlocks.BANANA_SAPLING);
        PEPPERCORN_LEAVES = registerBlockItem("peppercorn_leaves", new Item.Settings(), ModBlocks.PEPPERCORN_LEAVES);
        LEMON_LEAVES = registerBlockItem("lemon_leaves", new Item.Settings(), ModBlocks.LEMON_LEAVES);
        LIME_LEAVES = registerBlockItem("lime_leaves", new Item.Settings(), ModBlocks.LIME_LEAVES);
        ORANGE_LEAVES = registerBlockItem("orange_leaves", new Item.Settings(), ModBlocks.ORANGE_LEAVES);
        APPLE_LEAVES = registerBlockItem("apple_leaves", new Item.Settings(), ModBlocks.APPLE_LEAVES);
        MANGO_LEAVES = registerBlockItem("mango_leaves", new Item.Settings(), ModBlocks.MANGO_LEAVES);
        BANANA_LEAVES = registerBlockItem("banana_leaves", new Item.Settings(), ModBlocks.BANANA_LEAVES);
    }
    
    // MC 1.21.5 compatible item registration using Items.register
    private static Item registerItem(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
        final Item item = Items.register(registryKey, factory, settings);
        return item;
    }
    
    // Helper for Drink items (custom class with container parameter)
    private static Drink registerDrink(String id, Item.Settings settings, Item container) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
        final Drink drink = (Drink) Items.register(registryKey, s -> new Drink(s, container), settings);
        return drink;
    }
    
    // Helper for Drink items (custom class without container)
    private static Drink registerDrink(String id, Item.Settings settings) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
        final Drink drink = (Drink) Items.register(registryKey, s -> new Drink(s), settings);
        return drink;
    }
    
    // Helper for RecipeRemainder items (custom class with container parameter)
    private static RecipeRemainder registerRecipeRemainder(String id, Item.Settings settings, Item container) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
        final RecipeRemainder item = (RecipeRemainder) Items.register(registryKey, s -> new RecipeRemainder(s, container), settings);
        return item;
    }
    
    // Helper for RecipeRemainder items (custom class without container)
    private static RecipeRemainder registerRecipeRemainder(String id, Item.Settings settings) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
        final RecipeRemainder item = (RecipeRemainder) Items.register(registryKey, s -> new RecipeRemainder(s), settings);
        return item;
    }
    
    // Helper for SeedItem items (custom class with block parameter)
    private static SeedItem registerSeedItem(String id, Item.Settings settings, Block cropBlock) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
        final SeedItem item = (SeedItem) Items.register(registryKey, s -> new SeedItem(cropBlock, s), settings);
        return item;
    }
    
    // Helper for BlockItem items (with block parameter)
    private static BlockItem registerBlockItem(String id, Item.Settings settings, Block block) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
        final BlockItem item = (BlockItem) Items.register(registryKey, s -> new BlockItem(block, s), settings);
        return item;
    }
}