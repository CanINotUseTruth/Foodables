package truth.foodables.items;

import net.minecraft.item.Item;
import truth.foodables.mixin.ItemAccessor;

public class RecipeRemainder extends Item {

    public RecipeRemainder(Settings settings) {
        super(settings);
        ((ItemAccessor) this).clothesline$setRecipeRemainder(this);
    }

    @Override
	public boolean hasRecipeRemainder() {
        return true;
    }

}
