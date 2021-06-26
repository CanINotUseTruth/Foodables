package truth.foodables.registry;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
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
import net.minecraft.util.registry.Registry;
import truth.foodables.Foodables;
import truth.foodables.blocks.AcaciaDryingRack;
import truth.foodables.blocks.BirchDryingRack;
import truth.foodables.blocks.CrimsonDryingRack;
import truth.foodables.blocks.DarkOakDryingRack;
import truth.foodables.blocks.FabCropBlock;
import truth.foodables.blocks.JungleDryingRack;
import truth.foodables.blocks.OakDryingRack;
import truth.foodables.blocks.SpruceDryingRack;
import truth.foodables.blocks.WarpedDryingRack;
import truth.foodables.blocks.blockentities.AcaciaDryingRackEntity;
import truth.foodables.blocks.blockentities.BirchDryingRackEntity;
import truth.foodables.blocks.blockentities.CrimsonDryingRackEntity;
import truth.foodables.blocks.blockentities.DarkOakDryingRackEntity;
import truth.foodables.blocks.blockentities.JungleDryingRackEntity;
import truth.foodables.blocks.blockentities.OakDryingRackEntity;
import truth.foodables.blocks.blockentities.SpruceDryingRackEntity;
import truth.foodables.blocks.blockentities.WarpedDryingRackEntity;
import truth.foodables.blocks.blockentityrenderers.AcaciaDryingRackRenderer;
import truth.foodables.blocks.blockentityrenderers.BirchDryingRackRenderer;
import truth.foodables.blocks.blockentityrenderers.CrimsonDryingRackRenderer;
import truth.foodables.blocks.blockentityrenderers.DarkOakDryingRackRenderer;
import truth.foodables.blocks.blockentityrenderers.JungleDryingRackRenderer;
import truth.foodables.blocks.blockentityrenderers.OakDryingRackRenderer;
import truth.foodables.blocks.blockentityrenderers.SpruceDryingRackRenderer;
import truth.foodables.blocks.blockentityrenderers.WarpedDryingRackRenderer;
import truth.foodables.blocks.saplings.LemonSapling;
import truth.foodables.blocks.saplings.LimeSapling;
import truth.foodables.blocks.saplings.PeppercornSapling;

public class ModBlocks {
    
    // Functional Blocks
    public static final Block OAK_DRYING_RACK = new OakDryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static BlockEntityType<OakDryingRackEntity> OAK_DRYING_RACK_ENTITY;
    public static final Block SPRUCE_DRYING_RACK = new SpruceDryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static BlockEntityType<SpruceDryingRackEntity> SPRUCE_DRYING_RACK_ENTITY;
    public static final Block BIRCH_DRYING_RACK = new BirchDryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static BlockEntityType<BirchDryingRackEntity> BIRCH_DRYING_RACK_ENTITY;
    public static final Block JUNGLE_DRYING_RACK = new JungleDryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static BlockEntityType<JungleDryingRackEntity> JUNGLE_DRYING_RACK_ENTITY;
    public static final Block DARK_OAK_DRYING_RACK = new DarkOakDryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static BlockEntityType<DarkOakDryingRackEntity> DARK_OAK_DRYING_RACK_ENTITY;
    public static final Block ACACIA_DRYING_RACK = new AcaciaDryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static BlockEntityType<AcaciaDryingRackEntity> ACACIA_DRYING_RACK_ENTITY;
    public static final Block CRIMSON_DRYING_RACK = new CrimsonDryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static BlockEntityType<CrimsonDryingRackEntity> CRIMSON_DRYING_RACK_ENTITY;
    public static final Block WARPED_DRYING_RACK = new WarpedDryingRack(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 0).requiresTool().strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static BlockEntityType<WarpedDryingRackEntity> WARPED_DRYING_RACK_ENTITY;

    // Generated Blocks
    public static final Block SALT_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));

    // Tree Blocks
    public static final Block PEPPERCORN_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block PEPPERCORN_SAPLING = new PeppercornSapling();
    public static final Block POTTED_PEPPERCORN_SAPLING = new FlowerPotBlock(PEPPERCORN_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block LEMON_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block LEMON_SAPLING = new LemonSapling();
    public static final Block POTTED_LEMON_SAPLING = new FlowerPotBlock(LEMON_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_SPRUCE_SAPLING));
    public static final Block LIME_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).ticksRandomly().sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f));
    public static final Block LIME_SAPLING = new LimeSapling();
    public static final Block POTTED_LIME_SAPLING = new FlowerPotBlock(LIME_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_SPRUCE_SAPLING));

    // Crop Blocks
    public static final Block LETTUCE_CROP = new FabCropBlock();
    public static final Block TOMATO_CROP = new FabCropBlock();
    public static final Block BROWN_ONION_CROP = new FabCropBlock();
    public static final Block RED_ONION_CROP = new FabCropBlock();
    public static final Block GARLIC_CROP = new FabCropBlock();

    public static void registerBlocks() {
        // Functional Blocks
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "oak_drying_rack"), OAK_DRYING_RACK);
        OAK_DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:oak_drying_rack", FabricBlockEntityTypeBuilder.create(OakDryingRackEntity::new, OAK_DRYING_RACK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "spruce_drying_rack"), SPRUCE_DRYING_RACK);
        SPRUCE_DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:spruce_drying_rack", FabricBlockEntityTypeBuilder.create(SpruceDryingRackEntity::new, SPRUCE_DRYING_RACK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "birch_drying_rack"), BIRCH_DRYING_RACK);
        BIRCH_DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:birch_drying_rack", FabricBlockEntityTypeBuilder.create(BirchDryingRackEntity::new, BIRCH_DRYING_RACK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "jungle_drying_rack"), JUNGLE_DRYING_RACK);
        JUNGLE_DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:jungle_drying_rack", FabricBlockEntityTypeBuilder.create(JungleDryingRackEntity::new, JUNGLE_DRYING_RACK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "dark_oak_drying_rack"), DARK_OAK_DRYING_RACK);
        DARK_OAK_DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:dark_oak_drying_rack", FabricBlockEntityTypeBuilder.create(DarkOakDryingRackEntity::new, DARK_OAK_DRYING_RACK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "acacia_drying_rack"), ACACIA_DRYING_RACK);
        ACACIA_DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:acacia_drying_rack", FabricBlockEntityTypeBuilder.create(AcaciaDryingRackEntity::new, ACACIA_DRYING_RACK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "crimson_drying_rack"), CRIMSON_DRYING_RACK);
        CRIMSON_DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:crimson_drying_rack", FabricBlockEntityTypeBuilder.create(CrimsonDryingRackEntity::new, CRIMSON_DRYING_RACK).build(null));
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "warped_drying_rack"), WARPED_DRYING_RACK);
        WARPED_DRYING_RACK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "fab:warped_drying_rack", FabricBlockEntityTypeBuilder.create(WarpedDryingRackEntity::new, WARPED_DRYING_RACK).build(null));

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

        // Crop Blocks
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "lettuce_crop"), LETTUCE_CROP);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "tomato_crop"), TOMATO_CROP);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "brown_onion_crop"), BROWN_ONION_CROP);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "red_onion_crop"), RED_ONION_CROP);
        Registry.register(Registry.BLOCK, new Identifier(Foodables.MOD_ID, "garlic_crop"), GARLIC_CROP);
    }

    public static void registerRenderers() {
        BlockEntityRendererRegistry.INSTANCE.register(OAK_DRYING_RACK_ENTITY, OakDryingRackRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(SPRUCE_DRYING_RACK_ENTITY, SpruceDryingRackRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(BIRCH_DRYING_RACK_ENTITY, BirchDryingRackRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(JUNGLE_DRYING_RACK_ENTITY, JungleDryingRackRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(DARK_OAK_DRYING_RACK_ENTITY, DarkOakDryingRackRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(ACACIA_DRYING_RACK_ENTITY, AcaciaDryingRackRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(CRIMSON_DRYING_RACK_ENTITY, CrimsonDryingRackRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(WARPED_DRYING_RACK_ENTITY, WarpedDryingRackRenderer::new);
        BlockRenderLayerMap.INSTANCE.putBlock(LETTUCE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TOMATO_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BROWN_ONION_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RED_ONION_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GARLIC_CROP, RenderLayer.getCutout());
    }
}
