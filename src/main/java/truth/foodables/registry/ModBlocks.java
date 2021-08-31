package truth.foodables.registry;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import truth.foodables.Foodables;
import truth.foodables.blocks.DryingRack;
import truth.foodables.blocks.FabCakeBlock;
import truth.foodables.blocks.FabCropBlock;
import truth.foodables.blocks.berrybushes.BlackberryBush;
import truth.foodables.blocks.berrybushes.BlueberryBush;
import truth.foodables.blocks.blockentities.DryingRackEntity;
import truth.foodables.blocks.blockentityrenderers.DryingRackRenderer;
import truth.foodables.blocks.cakeblocks.HoneyCakeBlock;
import truth.foodables.blocks.saplings.AppleSapling;
import truth.foodables.blocks.saplings.BananaSapling;
import truth.foodables.blocks.saplings.LemonSapling;
import truth.foodables.blocks.saplings.LimeSapling;
import truth.foodables.blocks.saplings.MangoSapling;
import truth.foodables.blocks.saplings.OrangeSapling;
import truth.foodables.blocks.saplings.PeppercornSapling;

public class ModBlocks {
    
    // Functional Blocks
    public static BlockEntityType<DryingRackEntity> DRYING_RACK_ENTITY;
    public static final Block OAK_DRYING_RACK = new DryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DRYING_RACK = new DryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_DRYING_RACK = new DryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DRYING_RACK = new DryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_DRYING_RACK = new DryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_DRYING_RACK = new DryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DRYING_RACK = new DryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_DRYING_RACK = new DryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));

    // Food Blocks
    public static final Block HONEY_CAKE = new HoneyCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));
    public static final Block APPLE_CAKE = new FabCakeBlock(FabricBlockSettings.of(Material.WOOL).strength(0.5f).sounds(BlockSoundGroup.WOOL));
    public static final Block BERRY_CAKE = new FabCakeBlock(FabricBlockSettings.of(Material.WOOL).strength(0.5f).sounds(BlockSoundGroup.WOOL));
    public static final Block ORANGE_CAKE = new FabCakeBlock(FabricBlockSettings.of(Material.WOOL).strength(0.5f).sounds(BlockSoundGroup.WOOL));
    public static final Block BANANA_CAKE = new FabCakeBlock(FabricBlockSettings.of(Material.WOOL).strength(0.5f).sounds(BlockSoundGroup.WOOL));
    public static final Block CHOCOLATE_CAKE = new FabCakeBlock(FabricBlockSettings.of(Material.WOOL).strength(0.5f).sounds(BlockSoundGroup.WOOL));

    // Generated Blocks
    public static final Block SALT_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5));

    // Tree Blocks
    public static final Block PEPPERCORN_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).breakByTool(FabricToolTags.HOES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block PEPPERCORN_SAPLING = new PeppercornSapling();
    public static final Block POTTED_PEPPERCORN_SAPLING = new FlowerPotBlock(PEPPERCORN_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block LEMON_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).breakByTool(FabricToolTags.HOES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block LEMON_SAPLING = new LemonSapling();
    public static final Block POTTED_LEMON_SAPLING = new FlowerPotBlock(LEMON_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block LIME_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).breakByTool(FabricToolTags.HOES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block LIME_SAPLING = new LimeSapling();
    public static final Block POTTED_LIME_SAPLING = new FlowerPotBlock(LIME_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block ORANGE_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).breakByTool(FabricToolTags.HOES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block ORANGE_SAPLING = new OrangeSapling();
    public static final Block POTTED_ORANGE_SAPLING = new FlowerPotBlock(ORANGE_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block APPLE_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).breakByTool(FabricToolTags.HOES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block APPLE_SAPLING = new AppleSapling();
    public static final Block POTTED_APPLE_SAPLING = new FlowerPotBlock(APPLE_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block MANGO_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).breakByTool(FabricToolTags.HOES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block MANGO_SAPLING = new MangoSapling();
    public static final Block POTTED_MANGO_SAPLING = new FlowerPotBlock(MANGO_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block BANANA_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).breakByTool(FabricToolTags.HOES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block BANANA_SAPLING = new BananaSapling();
    public static final Block POTTED_BANANA_SAPLING = new FlowerPotBlock(BANANA_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_SPRUCE_SAPLING));

    // Berry Blocks
    public static final Block BLUEBERRY_BUSH = new BlueberryBush(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));
    public static final Block BLACKBERRY_BUSH = new BlackberryBush(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

    // Crop Blocks
    public static final Block LETTUCE_CROP = new FabCropBlock();
    public static final Block TOMATO_CROP = new FabCropBlock();
    public static final Block BROWN_ONION_CROP = new FabCropBlock();
    public static final Block RED_ONION_CROP = new FabCropBlock();
    public static final Block GARLIC_CROP = new FabCropBlock();

    public static void registerBlocks() {
        // Functional Blocks
        DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:drying_rack", FabricBlockEntityTypeBuilder.create(DryingRackEntity::new, OAK_DRYING_RACK, SPRUCE_DRYING_RACK, BIRCH_DRYING_RACK, JUNGLE_DRYING_RACK, DARK_OAK_DRYING_RACK, ACACIA_DRYING_RACK, CRIMSON_DRYING_RACK, WARPED_DRYING_RACK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "oak_drying_rack"), OAK_DRYING_RACK);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "spruce_drying_rack"), SPRUCE_DRYING_RACK);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "birch_drying_rack"), BIRCH_DRYING_RACK);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "jungle_drying_rack"), JUNGLE_DRYING_RACK);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "dark_oak_drying_rack"), DARK_OAK_DRYING_RACK);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "acacia_drying_rack"), ACACIA_DRYING_RACK);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "crimson_drying_rack"), CRIMSON_DRYING_RACK);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "warped_drying_rack"), WARPED_DRYING_RACK);

        // Food Blocks
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "honey_cake"), HONEY_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "apple_cake"), APPLE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "berry_cake"), BERRY_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "orange_cake"), ORANGE_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "banana_cake"), BANANA_CAKE);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);

        // Generated Blocks
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "salt_ore"), SALT_ORE);

        // Tree Blocks
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "peppercorn_leaves"), PEPPERCORN_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "peppercorn_sapling"), PEPPERCORN_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "potted_peppercorn_sapling"), POTTED_PEPPERCORN_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "lemon_leaves"), LEMON_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "lemon_sapling"), LEMON_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "potted_lemon_sapling"), POTTED_LEMON_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "lime_leaves"), LIME_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "lime_sapling"), LIME_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "potted_lime_sapling"), POTTED_LIME_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "orange_leaves"), ORANGE_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "orange_sapling"), ORANGE_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "potted_orange_sapling"), POTTED_ORANGE_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "apple_leaves"), APPLE_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "apple_sapling"), APPLE_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "potted_apple_sapling"), POTTED_APPLE_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "mango_leaves"), MANGO_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "mango_sapling"), MANGO_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "potted_mango_sapling"), POTTED_MANGO_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "banana_leaves"), BANANA_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "banana_sapling"), BANANA_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "potted_banana_sapling"), POTTED_BANANA_SAPLING);

        // Berry Blocks
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "blueberry_bush"), BLUEBERRY_BUSH);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "blackberry_bush"), BLACKBERRY_BUSH);

        // Crop Blocks
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "lettuce_crop"), LETTUCE_CROP);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "tomato_crop"), TOMATO_CROP);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "brown_onion_crop"), BROWN_ONION_CROP);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "red_onion_crop"), RED_ONION_CROP);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "garlic_crop"), GARLIC_CROP);
    }

    public static void registerRenderers() {
        // Racks
        BlockEntityRendererRegistry.INSTANCE.register(DRYING_RACK_ENTITY, DryingRackRenderer::new);
        //Crops
        BlockRenderLayerMap.INSTANCE.putBlock(LETTUCE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TOMATO_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BROWN_ONION_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RED_ONION_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GARLIC_CROP, RenderLayer.getCutout());
        // Trees
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PEPPERCORN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PEPPERCORN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LEMON_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEMON_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LIME_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ORANGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MANGO_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGO_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BANANA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BANANA_SAPLING, RenderLayer.getCutout());
        // Berries
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUEBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACKBERRY_BUSH, RenderLayer.getCutout());

    }
}
