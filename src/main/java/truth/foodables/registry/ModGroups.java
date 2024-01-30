package truth.foodables.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import truth.foodables.Foodables;

public class ModGroups {

    public static final ItemGroup FOODABLES_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Foodables.MOD_ID, "foodables"),
    
    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.foodables")).icon(() -> new ItemStack(ModItems.MORTAR_AND_PESTLE)).entries((displayContexy, entries) -> {
        // Blocks
        // Drying Racks    
        entries.add(ModItems.OAK_DRYING_RACK);
        entries.add(ModItems.SPRUCE_DRYING_RACK);
        entries.add(ModItems.BIRCH_DRYING_RACK);
        entries.add(ModItems.JUNGLE_DRYING_RACK);
        entries.add(ModItems.DARK_OAK_DRYING_RACK);
        entries.add(ModItems.ACACIA_DRYING_RACK);
        entries.add(ModItems.CRIMSON_DRYING_RACK);
        entries.add(ModItems.WARPED_DRYING_RACK);
        entries.add(ModItems.MANGROVE_DRYING_RACK);
        entries.add(ModItems.CHERRY_DRYING_RACK);
        // Ores
        entries.add(ModItems.SALT_ORE);
        // Tree Things
        entries.add(ModItems.PEPPERCORN_LEAVES);
        entries.add(ModItems.PEPPERCORN_SAPLING);
        entries.add(ModItems.LEMON_LEAVES);
        entries.add(ModItems.LEMON_SAPLING);
        entries.add(ModItems.LIME_LEAVES);
        entries.add(ModItems.LIME_SAPLING);
        entries.add(ModItems.ORANGE_LEAVES);
        entries.add(ModItems.ORANGE_SAPLING);
        entries.add(ModItems.APPLE_LEAVES);
        entries.add(ModItems.APPLE_SAPLING);
        entries.add(ModItems.MANGO_LEAVES);
        entries.add(ModItems.MANGO_SAPLING);
        entries.add(ModItems.BANANA_LEAVES);
        entries.add(ModItems.BANANA_SAPLING);

        // Items
        // Tools
        entries.add(ModItems.MORTAR_AND_PESTLE);
        entries.add(ModItems.KNIFE);
        entries.add(ModItems.CRUSHER);
        entries.add(ModItems.WHISK);
        entries.add(ModItems.JUICER);
        entries.add(ModItems.WET_CARTON);
        entries.add(ModItems.CARTON);
        entries.add(ModItems.CAKE_TIN);

        // Veggies
        entries.add(ModItems.LETTUCE);
        entries.add(ModItems.TOMATO);
        entries.add(ModItems.GARLIC);
        entries.add(ModItems.BROWN_ONION);
        entries.add(ModItems.RED_ONION);
        entries.add(ModItems.SLICED_BROWN_ONION);
        entries.add(ModItems.SLICED_RED_ONION);
        entries.add(ModItems.PUMPKIN_SLICES);
        // Cooked Veggies
        entries.add(ModItems.COOKED_ONION);
        entries.add(ModItems.CARAMELIZED_ONION);
        entries.add(ModItems.BATTERED_ONIONS);
        entries.add(ModItems.ONION_RINGS);
        entries.add(ModItems.UNCOOKED_FRIES);
        entries.add(ModItems.FRIES);
        // Fruit
        entries.add(ModItems.LEMON);
        entries.add(ModItems.LIME);
        entries.add(ModItems.ORANGE);
        entries.add(ModItems.MANGO);
        entries.add(ModItems.BANANA);
        entries.add(ModItems.FRUIT_SALAD);
        // Berries
        entries.add(ModItems.BLUEBERRIES);
        entries.add(ModItems.BLACKBERRIES);
        // Baked Goods
        entries.add(ModItems.BAKED_APPLE);
        entries.add(ModItems.BAKED_PUMPKIN);
        entries.add(ModItems.BAKED_CARROT);
        entries.add(ModItems.BAKED_BEETROOT);
        //Meats
        entries.add(ModItems.SQUID);
        entries.add(ModItems.BATTERED_SQUID);
        entries.add(ModItems.SALT_AND_PEPPER_SQUID);
        entries.add(ModItems.RAW_NUGGETS);
        entries.add(ModItems.BATTERED_NUGGETS);
        entries.add(ModItems.COOKED_NUGGETS);
        entries.add(ModItems.RAW_BACON);
        entries.add(ModItems.COOKED_BACON);
        entries.add(ModItems.SALTED_BACON_STRIPS);
        entries.add(ModItems.BACON_JERKY);
        entries.add(ModItems.CHICKEN_STRIPS);
        entries.add(ModItems.SALTED_CHICKEN_STRIPS);
        entries.add(ModItems.CHICKEN_JERKY);
        entries.add(ModItems.BEEF_STRIPS);
        entries.add(ModItems.COOKED_BEEF_STRIPS);
        entries.add(ModItems.SALTED_BEEF_STRIPS);
        entries.add(ModItems.BEEF_JERKY);
        entries.add(ModItems.LAMB_STRIPS);
        entries.add(ModItems.SALTED_LAMB_STRIPS);
        entries.add(ModItems.LAMB_JERKY);
        entries.add(ModItems.RABBIT_STRIPS);
        entries.add(ModItems.SALTED_RABBIT_STRIPS);
        entries.add(ModItems.RABBIT_JERKY);
        entries.add(ModItems.SALTED_ZOMBIE_FLESH);
        entries.add(ModItems.ZOMBIE_JERKY);
        // Meat Adjacent Stuff
        entries.add(ModItems.FRIED_EGG);
        entries.add(ModItems.BACON_AND_EGGS);
        // Juices
        entries.add(ModItems.LEMON_JUICE);
        entries.add(ModItems.LIME_JUICE);
        entries.add(ModItems.ORANGE_JUICE);
        entries.add(ModItems.APPLE_JUICE);
        entries.add(ModItems.CARROT_JUICE);
        entries.add(ModItems.PUMPKIN_JUICE);
        entries.add(ModItems.TOMATO_JUICE);
        entries.add(ModItems.MELON_JUICE);
        entries.add(ModItems.SWEET_BERRY_JUICE);
        entries.add(ModItems.BLUEBERRY_JUICE);
        entries.add(ModItems.BLACKBERRY_JUICE);
        entries.add(ModItems.MANGO_JUICE);
        // Other Drinks
        entries.add(ModItems.LEMONADE);
        // Oils
        entries.add(ModItems.SUNFLOWER_OIL);
        // Sauces
        entries.add(ModItems.MAYONNAISE);
        entries.add(ModItems.AIOLI);
        // Cake Stuff
        entries.add(ModItems.PLAIN_CAKE_MIX);
        entries.add(ModItems.HONEY_CAKE_MIX);
        entries.add(ModItems.APPLE_CAKE_MIX);
        entries.add(ModItems.BERRY_CAKE_MIX);
        entries.add(ModItems.ORANGE_CAKE_MIX);
        entries.add(ModItems.BANANA_CAKE_MIX);
        entries.add(ModItems.CHOCOLATE_CAKE_MIX);
        entries.add(ModItems.BAKED_PLAIN_CAKE);
        entries.add(ModItems.BAKED_HONEY_CAKE);
        entries.add(ModItems.BAKED_APPLE_CAKE);
        entries.add(ModItems.BAKED_BERRY_CAKE);
        entries.add(ModItems.BAKED_ORANGE_CAKE);
        entries.add(ModItems.BAKED_BANANA_CAKE);
        entries.add(ModItems.BAKED_CHOCOLATE_CAKE);
        entries.add(ModItems.HONEY_CAKE);
        entries.add(ModItems.APPLE_CAKE);
        entries.add(ModItems.BERRY_CAKE);
        entries.add(ModItems.ORANGE_CAKE);
        entries.add(ModItems.BANANA_CAKE);
        entries.add(ModItems.CHOCOLATE_CAKE);
        // Sandwich Stuff
        entries.add(ModItems.DOUGH);
        entries.add(ModItems.SLICED_BREAD);
        entries.add(ModItems.TOAST);
        entries.add(ModItems.BLT_SANDWICH);
        entries.add(ModItems.STEAK_SANDWICH);
        // Miscellaneous
        entries.add(ModItems.PEPPERCORN_ITEM);
        entries.add(ModItems.DRIED_PEPPERCORN);
        entries.add(ModItems.SALT);
        entries.add(ModItems.GROUND_SALT);
        entries.add(ModItems.GROUND_PEPPER);
        entries.add(ModItems.WHEAT_FLOUR);
        entries.add(ModItems.GROUND_COCOA);
        // Seed Items
        entries.add(ModItems.LETTUCE_SEEDS);
        entries.add(ModItems.TOMATO_SEEDS);
        entries.add(ModItems.GARLIC_SEEDS);
        entries.add(ModItems.BROWN_ONION_SEEDS);
        entries.add(ModItems.RED_ONION_SEEDS);
    }).build());


    public static void registerItemGroups() {
    }
}
