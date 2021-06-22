package truth.foodables.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import truth.foodables.Foodables;
import truth.foodables.items.RecipeRemainder;
import truth.foodables.items.SeedItem;

public class ModItems {

    // Food Items
    public static final Item PEPPERCORN_ITEM = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item DRIED_PEPPERCORN = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item GROUND_PEPPER = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALT = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item GROUND_SALT = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item WHEAT_FLOUR = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SQUID = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item BATTERED_SQUID = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item SALT_AND_PEPPER_SQUID = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(14f).build()));
    public static final Item RAW_BACON = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final Item COOKED_BACON = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(12f).build()));
    public static final Item SLICED_BREAD = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item TOAST = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).build()));
    public static final Item BLT_SANDWICH = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(14f).build()));

    // Crop Drops
    public static final Item LETTUCE = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));
    public static final Item TOMATO = new Item(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()));

    // Tool Items
    public static Item MORTAR_AND_PESTLE = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item KNIFE = new RecipeRemainder(new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));

    // Seed Items
    public static Item LETTUCE_SEEDS = new SeedItem(ModBlocks.LETTUCE_CROP, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static Item TOMATO_SEEDS = new SeedItem(ModBlocks.TOMATO_CROP, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));


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
    public static final BlockItem PEPPERCORN_LEAVES = new BlockItem(ModBlocks.PEPPERCORN_LEAVES, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    public static final BlockItem PEPPERCORN_SAPLING = new BlockItem(ModBlocks.PEPPERCORN_SAPLING, new Item.Settings().group(ModGroups.FAB_FOODABLES_GROUP));
    
    
    public static void registerItems() {
        // Food Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_item"), PEPPERCORN_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "dried_peppercorn"), DRIED_PEPPERCORN);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "ground_pepper"), GROUND_PEPPER);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "ground_salt"), GROUND_SALT);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "wheat_flour"), WHEAT_FLOUR);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "squid"), SQUID);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "battered_squid"), BATTERED_SQUID);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "salt_and_pepper_squid"), SALT_AND_PEPPER_SQUID);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "cooked_bacon"), COOKED_BACON);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "sliced_bread"), SLICED_BREAD);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "toast"), TOAST);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "blt_sandwich"), BLT_SANDWICH);

        // Crop Drops
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lettuce"), LETTUCE);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "tomato"), TOMATO);

        // Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "mortar_and_pestle"), MORTAR_AND_PESTLE);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "knife"), KNIFE);

        // Seed Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "lettuce_seeds"), LETTUCE_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "tomato_seeds"), TOMATO_SEEDS);

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

        // Other Block Items
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_leaves"), PEPPERCORN_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(Foodables.MOD_ID, "peppercorn_sapling"), PEPPERCORN_SAPLING);
    }

    // public static void registerCompostableItems() {
    //     ComposterBlockAccessor.registerCompostableItem(0.35F, LETTUCE_SEEDS);
    // }

}
