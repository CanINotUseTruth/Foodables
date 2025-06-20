package truth.foodables.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;


public record DryingRackRecipeInput(ItemStack input) implements RecipeInput {

    @Override
    public ItemStack getStackInSlot(int i) {
        return input;
    }

    @Override
    public int size() {
        return 1;
    }
}