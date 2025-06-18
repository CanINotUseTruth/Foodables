package truth.foodables.registry;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.particle.EntityEffectParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import java.util.function.Function;
import truth.foodables.Foodables;
import truth.foodables.blocks.DryingRack;
import truth.foodables.blocks.FoodablesCakeBlock;
import truth.foodables.blocks.FoodablesCropBlock;
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
    
    // Functional Blocks - Using MC 1.21.5 compatible registration with full DryingRack functionality  
    public static final Block OAK_DRYING_RACK = registerBlock("oak_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DRYING_RACK = registerBlock("spruce_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_DRYING_RACK = registerBlock("birch_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DRYING_RACK = registerBlock("jungle_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_DRYING_RACK = registerBlock("dark_oak_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_DRYING_RACK = registerBlock("acacia_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DRYING_RACK = registerBlock("crimson_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_DRYING_RACK = registerBlock("warped_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DRYING_RACK = registerBlock("mangrove_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_DRYING_RACK = registerBlock("cherry_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block PALE_OAK_DRYING_RACK = registerBlock("pale_oak_drying_rack", DryingRack::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    
    public static BlockEntityType<DryingRackEntity> DRYING_RACK_ENTITY;

    // Food Blocks
    public static Block HONEY_CAKE;
    public static Block APPLE_CAKE;
    public static Block BERRY_CAKE;
    public static Block ORANGE_CAKE;
    public static Block BANANA_CAKE;
    public static Block CHOCOLATE_CAKE;

    // Generated Blocks
    public static Block SALT_ORE;

    // Tree Blocks
    public static final Block PEPPERCORN_LEAVES = registerBlock("peppercorn_leaves",
            properties -> new UntintedParticleLeavesBlock(0.02f, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, 0.282f, 0.710f, 0.094f), properties
                    .mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly()
                    .sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
                    .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static Block PEPPERCORN_SAPLING;
    public static Block POTTED_PEPPERCORN_SAPLING;
    public static final Block LEMON_LEAVES = registerBlock("lemon_leaves",
            properties -> new UntintedParticleLeavesBlock(0.02f, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, 0.282f, 0.710f, 0.094f), properties
                    .mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly()
                    .sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
                    .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static Block LEMON_SAPLING;
    public static Block POTTED_LEMON_SAPLING;
    public static final Block LIME_LEAVES = registerBlock("lime_leaves",
            properties -> new UntintedParticleLeavesBlock(0.02f, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, 0.282f, 0.710f, 0.094f), properties
                    .mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly()
                    .sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
                    .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static Block LIME_SAPLING;
    public static Block POTTED_LIME_SAPLING;
    public static final Block ORANGE_LEAVES = registerBlock("orange_leaves",
            properties -> new UntintedParticleLeavesBlock(0.02f, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, 0.282f, 0.710f, 0.094f), properties
                    .mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly()
                    .sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
                    .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static Block ORANGE_SAPLING;
    public static Block POTTED_ORANGE_SAPLING;
    public static final Block APPLE_LEAVES = registerBlock("apple_leaves",
            properties -> new UntintedParticleLeavesBlock(0.02f, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, 0.282f, 0.710f, 0.094f), properties
                    .mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly()
                    .sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
                    .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static Block APPLE_SAPLING;
    public static Block POTTED_APPLE_SAPLING;
    public static final Block MANGO_LEAVES = registerBlock("mango_leaves",
            properties -> new UntintedParticleLeavesBlock(0.02f, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, 0.282f, 0.710f, 0.094f), properties
                    .mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly()
                    .sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
                    .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static Block MANGO_SAPLING;
    public static Block POTTED_MANGO_SAPLING;
    public static final Block BANANA_LEAVES = registerBlock("banana_leaves",
            properties -> new UntintedParticleLeavesBlock(0.02f, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, 0.282f, 0.710f, 0.094f), properties
                    .mapColor(MapColor.DARK_GREEN).strength(0.2F).ticksRandomly()
                    .sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never)
                    .blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static Block BANANA_SAPLING;
    public static Block POTTED_BANANA_SAPLING;

    // Berry Blocks
    public static Block BLUEBERRY_BUSH;
    public static Block BLACKBERRY_BUSH;

    // Crop Blocks
    public static Block LETTUCE_CROP;
    public static Block TOMATO_CROP;
    public static Block BROWN_ONION_CROP;
    public static Block RED_ONION_CROP;
    public static Block GARLIC_CROP;

    public static void registerBlocks() {
        // Note: DryingRack blocks are now registered as static final fields above

        // Food Blocks - Updated to MC 1.21.5 compatible registration
        HONEY_CAKE = registerBlock("honey_cake", HoneyCakeBlock::new, AbstractBlock.Settings.copy(Blocks.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));
        APPLE_CAKE = registerBlock("apple_cake", FoodablesCakeBlock::new, AbstractBlock.Settings.copy(Blocks.CAKE).strength(0.5f).sounds(BlockSoundGroup.WOOL));
        BERRY_CAKE = registerBlock("berry_cake", FoodablesCakeBlock::new, AbstractBlock.Settings.copy(Blocks.CAKE).strength(0.5f).sounds(BlockSoundGroup.WOOL));
        ORANGE_CAKE = registerBlock("orange_cake", FoodablesCakeBlock::new, AbstractBlock.Settings.copy(Blocks.CAKE).strength(0.5f).sounds(BlockSoundGroup.WOOL));
        BANANA_CAKE = registerBlock("banana_cake", FoodablesCakeBlock::new, AbstractBlock.Settings.copy(Blocks.CAKE).strength(0.5f).sounds(BlockSoundGroup.WOOL));
        CHOCOLATE_CAKE = registerBlock("chocolate_cake", FoodablesCakeBlock::new, AbstractBlock.Settings.copy(Blocks.CAKE).strength(0.5f).sounds(BlockSoundGroup.WOOL));

        // Generated Blocks
        SALT_ORE = registerBlock("salt_ore", Block::new, AbstractBlock.Settings.copy(Blocks.STONE).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));

        // Tree Blocks - Updated to MC 1.21.5 compatible registration
        // Note: We don't register the leaves blocks as they reference vanilla blocks
        PEPPERCORN_SAPLING = registerBlock("peppercorn_sapling", PeppercornSapling::new, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
        POTTED_PEPPERCORN_SAPLING = registerPottedBlock("potted_peppercorn_sapling", PEPPERCORN_SAPLING);
        LEMON_SAPLING = registerBlock("lemon_sapling", LemonSapling::new, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
        POTTED_LEMON_SAPLING = registerPottedBlock("potted_lemon_sapling", LEMON_SAPLING);
        LIME_SAPLING = registerBlock("lime_sapling", LimeSapling::new, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
        POTTED_LIME_SAPLING = registerPottedBlock("potted_lime_sapling", LIME_SAPLING);
        ORANGE_SAPLING = registerBlock("orange_sapling", OrangeSapling::new, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
        POTTED_ORANGE_SAPLING = registerPottedBlock("potted_orange_sapling", ORANGE_SAPLING);
        APPLE_SAPLING = registerBlock("apple_sapling", AppleSapling::new, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
        POTTED_APPLE_SAPLING = registerPottedBlock("potted_apple_sapling", APPLE_SAPLING);
        MANGO_SAPLING = registerBlock("mango_sapling", MangoSapling::new, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
        POTTED_MANGO_SAPLING = registerPottedBlock("potted_mango_sapling", MANGO_SAPLING);
        BANANA_SAPLING = registerBlock("banana_sapling", BananaSapling::new, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
        POTTED_BANANA_SAPLING = registerPottedBlock("potted_banana_sapling", BANANA_SAPLING);

        // Berry Blocks
        BLUEBERRY_BUSH = registerBlock("blueberry_bush", BlueberryBush::new, AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));
        BLACKBERRY_BUSH = registerBlock("blackberry_bush", BlackberryBush::new, AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH));

        // Crop Blocks
        LETTUCE_CROP = registerBlock("lettuce_crop", FoodablesCropBlock::new, AbstractBlock.Settings.copy(Blocks.WHEAT).sounds(BlockSoundGroup.CROP).noCollision().ticksRandomly().breakInstantly().nonOpaque());
        TOMATO_CROP = registerBlock("tomato_crop", FoodablesCropBlock::new, AbstractBlock.Settings.copy(Blocks.WHEAT).sounds(BlockSoundGroup.CROP).noCollision().ticksRandomly().breakInstantly().nonOpaque());
        BROWN_ONION_CROP = registerBlock("brown_onion_crop", FoodablesCropBlock::new, AbstractBlock.Settings.copy(Blocks.WHEAT).sounds(BlockSoundGroup.CROP).noCollision().ticksRandomly().breakInstantly().nonOpaque());
        RED_ONION_CROP = registerBlock("red_onion_crop", FoodablesCropBlock::new, AbstractBlock.Settings.copy(Blocks.WHEAT).sounds(BlockSoundGroup.CROP).noCollision().ticksRandomly().breakInstantly().nonOpaque());
        GARLIC_CROP = registerBlock("garlic_crop", FoodablesCropBlock::new, AbstractBlock.Settings.copy(Blocks.WHEAT).sounds(BlockSoundGroup.CROP).noCollision().ticksRandomly().breakInstantly().nonOpaque());
    }

    public static void registerRenderers() {
        // Racks
        BlockEntityRendererFactories.register(DRYING_RACK_ENTITY, DryingRackRenderer::new);
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
    
    // MC 1.21.5 compatible block registration using Blocks.register
    private static Block registerBlock(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);
        final Block block = Blocks.register(registryKey, factory, settings);
        return block;
    }

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Foodables.MOD_ID, name))));
        return Registry.register(Registries.BLOCK, Identifier.of(Foodables.MOD_ID, name), toRegister);
    }
    
    // Helper for potted plants that require the plant as a parameter
    private static Block registerPottedBlock(String id, Block plant) {
        final Identifier identifier = Identifier.of(Foodables.MOD_ID, id);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);
        final Block block = Blocks.register(registryKey, settings -> new FlowerPotBlock(plant, settings), AbstractBlock.Settings.copy(Blocks.POTTED_SPRUCE_SAPLING));
        return block;
    }
    
    private static Block register(String id, Block block) {
        return register(Identifier.of(Foodables.MOD_ID, id), block);
    }

    private static Block register(Identifier id, Block block) {
        return Registry.register(Registries.BLOCK, id, block);
    }
    
    public static void init() {
        // Register block entity type for drying racks
        DRYING_RACK_ENTITY = FabricBlockEntityTypeBuilder.create(DryingRackEntity::new, 
            OAK_DRYING_RACK, SPRUCE_DRYING_RACK, BIRCH_DRYING_RACK, JUNGLE_DRYING_RACK, 
            DARK_OAK_DRYING_RACK, ACACIA_DRYING_RACK, CRIMSON_DRYING_RACK, WARPED_DRYING_RACK, 
            MANGROVE_DRYING_RACK, CHERRY_DRYING_RACK, PALE_OAK_DRYING_RACK).build();
        Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Foodables.MOD_ID, "drying_rack_entity"), DRYING_RACK_ENTITY);
    }
}
