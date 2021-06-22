package truth.foodables.registry;

import java.util.ArrayList;
import java.util.List;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.item.Item;
import net.minecraft.resource.ResourceType;
import truth.foodables.recipe.DryingRackRecipeLoader;

public class ModRecipes {
    public static final List<Item> RACK_ITEM_LIST = new ArrayList<>();
    public static final List<Item> RACK_RESULT_ITEM_LIST = new ArrayList<>();
    public static final List<Integer> RACK_RESULT_TIME_LIST = new ArrayList<>();

    public static void registerRecipes() {
        ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new DryingRackRecipeLoader());
    }
}
