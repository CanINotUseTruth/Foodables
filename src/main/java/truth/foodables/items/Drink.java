package truth.foodables.items;

import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import truth.foodables.mixin.ItemAccessor;

public class Drink extends HoneyBottleItem {

    public Drink(Settings settings) {
        super(settings);
    }

    public Drink(Settings settings, Item item) {
        super(settings);
        ((ItemAccessor) this).clothesline$setRecipeRemainder(item);
    }

    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }
    
    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_EAT;
    }
    
}
