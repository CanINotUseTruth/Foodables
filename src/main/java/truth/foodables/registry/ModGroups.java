package truth.foodables.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import truth.foodables.Foodables;

public class ModGroups {

    public static final ItemGroup FAB_FOODABLES_GROUP = FabricItemGroup.builder(new Identifier(Foodables.MOD_ID, "foodables")).icon(() -> new ItemStack(ModItems.MORTAR_AND_PESTLE)).build();

    public static void addToGroups() {
        ItemGroupEvents.modifyEntriesEvent(FAB_FOODABLES_GROUP).register(content -> {
            // Blocks
            // Drying Racks
            content.add(ModItems.OAK_DRYING_RACK);
            content.add(ModItems.SPRUCE_DRYING_RACK);
            content.add(ModItems.BIRCH_DRYING_RACK);
            content.add(ModItems.JUNGLE_DRYING_RACK);
            content.add(ModItems.DARK_OAK_DRYING_RACK);
            content.add(ModItems.ACACIA_DRYING_RACK);
            content.add(ModItems.CRIMSON_DRYING_RACK);
            content.add(ModItems.WARPED_DRYING_RACK);
            content.add(ModItems.MANGROVE_DRYING_RACK);
            // Ores
            content.add(ModItems.SALT_ORE);
            // Tree Things
            content.add(ModItems.PEPPERCORN_LEAVES);
            content.add(ModItems.PEPPERCORN_SAPLING);
            content.add(ModItems.LEMON_LEAVES);
            content.add(ModItems.LEMON_SAPLING);
            content.add(ModItems.LIME_LEAVES);
            content.add(ModItems.LIME_SAPLING);
            content.add(ModItems.ORANGE_LEAVES);
            content.add(ModItems.ORANGE_SAPLING);
            content.add(ModItems.APPLE_LEAVES);
            content.add(ModItems.APPLE_SAPLING);
            content.add(ModItems.MANGO_LEAVES);
            content.add(ModItems.MANGO_SAPLING);
            content.add(ModItems.BANANA_LEAVES);
            content.add(ModItems.BANANA_SAPLING);

            // Items
            // Tools
            content.add(ModItems.MORTAR_AND_PESTLE);
            content.add(ModItems.KNIFE);
            content.add(ModItems.CRUSHER);
            content.add(ModItems.WHISK);
            content.add(ModItems.JUICER);
            content.add(ModItems.WET_CARTON);
            content.add(ModItems.CARTON);
            content.add(ModItems.CAKE_TIN);

            // Veggies
            content.add(ModItems.LETTUCE);
            content.add(ModItems.TOMATO);
            content.add(ModItems.GARLIC);
            content.add(ModItems.BROWN_ONION);
            content.add(ModItems.RED_ONION);
            content.add(ModItems.SLICED_BROWN_ONION);
            content.add(ModItems.SLICED_RED_ONION);
            content.add(ModItems.PUMPKIN_SLICES);
            // Cooked Veggies
            content.add(ModItems.COOKED_ONION);
            content.add(ModItems.CARAMELIZED_ONION);
            content.add(ModItems.BATTERED_ONIONS);
            content.add(ModItems.ONION_RINGS);
            content.add(ModItems.UNCOOKED_FRIES);
            content.add(ModItems.FRIES);
            // Fruit
            content.add(ModItems.LEMON);
            content.add(ModItems.LIME);
            content.add(ModItems.ORANGE);
            content.add(ModItems.MANGO);
            content.add(ModItems.BANANA);
            content.add(ModItems.FRUIT_SALAD);
            // Berries
            content.add(ModItems.BLUEBERRIES);
            content.add(ModItems.BLACKBERRIES);
            // Baked Goods
            content.add(ModItems.BAKED_APPLE);
            content.add(ModItems.BAKED_PUMPKIN);
            content.add(ModItems.BAKED_CARROT);
            content.add(ModItems.BAKED_BEETROOT);
            //Meats
            content.add(ModItems.SQUID);
            content.add(ModItems.BATTERED_SQUID);
            content.add(ModItems.SALT_AND_PEPPER_SQUID);
            content.add(ModItems.RAW_NUGGETS);
            content.add(ModItems.BATTERED_NUGGETS);
            content.add(ModItems.COOKED_NUGGETS);
            content.add(ModItems.RAW_BACON);
            content.add(ModItems.COOKED_BACON);
            content.add(ModItems.SALTED_BACON_STRIPS);
            content.add(ModItems.BACON_JERKY);
            content.add(ModItems.CHICKEN_STRIPS);
            content.add(ModItems.SALTED_CHICKEN_STRIPS);
            content.add(ModItems.CHICKEN_JERKY);
            content.add(ModItems.BEEF_STRIPS);
            content.add(ModItems.COOKED_BEEF_STRIPS);
            content.add(ModItems.SALTED_BEEF_STRIPS);
            content.add(ModItems.BEEF_JERKY);
            content.add(ModItems.LAMB_STRIPS);
            content.add(ModItems.SALTED_LAMB_STRIPS);
            content.add(ModItems.LAMB_JERKY);
            content.add(ModItems.RABBIT_STRIPS);
            content.add(ModItems.SALTED_RABBIT_STRIPS);
            content.add(ModItems.RABBIT_JERKY);
            content.add(ModItems.SALTED_ZOMBIE_FLESH);
            content.add(ModItems.ZOMBIE_JERKY);
            // Meat Adjacent Stuff
            content.add(ModItems.FRIED_EGG);
            content.add(ModItems.BACON_AND_EGGS);
            // Juices
            content.add(ModItems.LEMON_JUICE);
            content.add(ModItems.LIME_JUICE);
            content.add(ModItems.ORANGE_JUICE);
            content.add(ModItems.APPLE_JUICE);
            content.add(ModItems.CARROT_JUICE);
            content.add(ModItems.PUMPKIN_JUICE);
            content.add(ModItems.TOMATO_JUICE);
            content.add(ModItems.MELON_JUICE);
            content.add(ModItems.SWEET_BERRY_JUICE);
            content.add(ModItems.BLUEBERRY_JUICE);
            content.add(ModItems.BLACKBERRY_JUICE);
            content.add(ModItems.MANGO_JUICE);
            // Other Drinks
            content.add(ModItems.LEMONADE);
            // Oils
            content.add(ModItems.SUNFLOWER_OIL);
            // Sauces
            content.add(ModItems.MAYONNAISE);
            content.add(ModItems.AIOLI);
            // Cake Stuff
            content.add(ModItems.PLAIN_CAKE_MIX);
            content.add(ModItems.HONEY_CAKE_MIX);
            content.add(ModItems.APPLE_CAKE_MIX);
            content.add(ModItems.BERRY_CAKE_MIX);
            content.add(ModItems.ORANGE_CAKE_MIX);
            content.add(ModItems.BANANA_CAKE_MIX);
            content.add(ModItems.CHOCOLATE_CAKE_MIX);
            content.add(ModItems.BAKED_PLAIN_CAKE);
            content.add(ModItems.BAKED_HONEY_CAKE);
            content.add(ModItems.BAKED_APPLE_CAKE);
            content.add(ModItems.BAKED_BERRY_CAKE);
            content.add(ModItems.BAKED_ORANGE_CAKE);
            content.add(ModItems.BAKED_BANANA_CAKE);
            content.add(ModItems.BAKED_CHOCOLATE_CAKE);
            content.add(ModItems.HONEY_CAKE);
            content.add(ModItems.APPLE_CAKE);
            content.add(ModItems.BERRY_CAKE);
            content.add(ModItems.ORANGE_CAKE);
            content.add(ModItems.BANANA_CAKE);
            content.add(ModItems.CHOCOLATE_CAKE);
            // Sandwich Stuff
            content.add(ModItems.DOUGH);
            content.add(ModItems.SLICED_BREAD);
            content.add(ModItems.TOAST);
            content.add(ModItems.BLT_SANDWICH);
            content.add(ModItems.STEAK_SANDWICH);
            // Miscellaneous
            content.add(ModItems.PEPPERCORN_ITEM);
            content.add(ModItems.DRIED_PEPPERCORN);
            content.add(ModItems.SALT);
            content.add(ModItems.GROUND_SALT);
            content.add(ModItems.GROUND_PEPPER);
            content.add(ModItems.WHEAT_FLOUR);
            content.add(ModItems.GROUND_COCOA);
            // Seed Items
            content.add(ModItems.LETTUCE_SEEDS);
            content.add(ModItems.TOMATO_SEEDS);
            content.add(ModItems.GARLIC_SEEDS);
            content.add(ModItems.BROWN_ONION_SEEDS);
            content.add(ModItems.RED_ONION_SEEDS);
        });
    }
    
}
