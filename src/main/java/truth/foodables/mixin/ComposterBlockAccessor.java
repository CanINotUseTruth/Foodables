package truth.foodables.mixin;

import org.apache.commons.lang3.NotImplementedException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import truth.foodables.registry.ModItems;

@Mixin(ComposterBlock.class)
public class ComposterBlockAccessor extends Block {
    public ComposterBlockAccessor(Settings settings) {
        super(settings);
    }

    @Invoker
    private static void invokeRegisterCompostableItem(float levelIncreaseChance, ItemConvertible item) {
        throw new NotImplementedException("Invocation failed.");
    }

    @Inject(at = @At("HEAD"), method = "registerDefaultCompostableItems()V")
    private static void injectRegisterDefaultCompostableItem(CallbackInfo info) {
        // Only register items that are not null (items are now registered during mod initialization)
        if (ModItems.LETTUCE_SEEDS != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.LETTUCE_SEEDS);
        if (ModItems.TOMATO_SEEDS != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.TOMATO_SEEDS);
        if (ModItems.BROWN_ONION_SEEDS != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.BROWN_ONION_SEEDS);
        if (ModItems.RED_ONION_SEEDS != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.RED_ONION_SEEDS);
        if (ModItems.GARLIC_SEEDS != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.GARLIC_SEEDS);
        if (ModItems.PEPPERCORN_SAPLING != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.PEPPERCORN_SAPLING);
        if (ModItems.PEPPERCORN_ITEM != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.PEPPERCORN_ITEM);
        if (ModItems.BLUEBERRIES != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.BLUEBERRIES);
        if (ModItems.BLACKBERRIES != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.BLACKBERRIES);
        if (ModItems.LETTUCE != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.LETTUCE);
        if (ModItems.TOMATO != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.TOMATO);
        if (ModItems.GARLIC != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.GARLIC);
        if (ModItems.BROWN_ONION != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.BROWN_ONION);
        if (ModItems.RED_ONION != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.RED_ONION);
        if (ModItems.SLICED_BREAD != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.SLICED_BREAD);
        if (ModItems.TOAST != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.TOAST);
        if (ModItems.LEMON != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.LEMON);
        if (ModItems.LIME != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.LIME);
        if (ModItems.ORANGE != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.ORANGE);
        if (ModItems.MANGO != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.MANGO);
        if (ModItems.BANANA != null) ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.BANANA);
    }
}
