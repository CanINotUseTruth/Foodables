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
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, Items.ROTTEN_FLESH);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.LETTUCE_SEEDS);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.TOMATO_SEEDS);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.BROWN_ONION_SEEDS);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.RED_ONION_SEEDS);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.GARLIC_SEEDS);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.PEPPERCORN_SAPLING);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.3F, ModItems.PEPPERCORN_ITEM);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.LETTUCE);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.TOMATO);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.GARLIC);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.BROWN_ONION);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.RED_ONION);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.SLICED_BREAD);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.TOAST);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.LEMON);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.LIME);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.ORANGE);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.MANGO);
        ComposterBlockAccessor.invokeRegisterCompostableItem(0.65F, ModItems.BANANA);
    }
}
