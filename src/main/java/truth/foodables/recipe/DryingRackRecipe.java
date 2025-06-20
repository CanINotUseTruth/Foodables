package truth.foodables.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeBookCategories;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import truth.foodables.registry.ModRecipes;

public record DryingRackRecipe(Ingredient inputItem, ItemStack output) implements Recipe<DryingRackRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    @Override
    public boolean matches(DryingRackRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));    }

    @Override
    public ItemStack craft(DryingRackRecipeInput recipeInput, RegistryWrapper.WrapperLookup wrapperLookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<DryingRackRecipeInput>> getSerializer() {
        return ModRecipes.DRYING_RACK_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<DryingRackRecipeInput>> getType() {
        return ModRecipes.DRYING_RACK_RECIPE_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<DryingRackRecipe> {
        public static final MapCodec<DryingRackRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(DryingRackRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(DryingRackRecipe::output)
        ).apply(inst, DryingRackRecipe::new));

        public static final PacketCodec<RegistryByteBuf, DryingRackRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, DryingRackRecipe::inputItem,
                        ItemStack.PACKET_CODEC, DryingRackRecipe::output,
                        DryingRackRecipe::new);

        @Override
        public MapCodec<DryingRackRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, DryingRackRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}