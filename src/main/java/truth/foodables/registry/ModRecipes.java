package truth.foodables.registry;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import truth.foodables.Foodables;
import truth.foodables.recipe.DryingRackRecipe;


public class ModRecipes {
    // Legacy lists for backward compatibility during transition
    public static final List<Item> RACK_ITEM_LIST = new ArrayList<>();
    public static final List<Item> RACK_RESULT_ITEM_LIST = new ArrayList<>();
    public static final List<Integer> RACK_RESULT_TIME_LIST = new ArrayList<>();

    public static final RecipeSerializer<DryingRackRecipe> DRYING_RACK_RECIPE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Foodables.MOD_ID, "drying_rack"),
            new DryingRackRecipe.Serializer());
    public static final RecipeType<DryingRackRecipe> DRYING_RACK_RECIPE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Foodables.MOD_ID, "drying_rack"), new RecipeType<DryingRackRecipe>() {
                @Override
                public String toString() {
                    return "drying_rack";
                }
            });

    public static void registerRecipes() {
        Foodables.LOGGER.info("Registering Custom Recipes for " + Foodables.MOD_ID);
    }
}
