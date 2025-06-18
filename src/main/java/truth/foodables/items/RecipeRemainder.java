package truth.foodables.items;

import net.minecraft.item.Item;
import truth.foodables.mixin.ItemAccessor;

public class RecipeRemainder extends Item {

    public RecipeRemainder(Settings settings) {
        super(settings);
        ((ItemAccessor) this).clothesline$setRecipeRemainder(this);
    }

    public RecipeRemainder(Settings settings, Item item) {
        super(settings);
        ((ItemAccessor) this).clothesline$setRecipeRemainder(item);
    }

	public boolean hasRecipeRemainder() {
        return true;
    }

}
