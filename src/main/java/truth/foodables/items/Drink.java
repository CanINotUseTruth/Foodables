package truth.foodables.items;

import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import truth.foodables.mixin.ItemAccessor;

public class Drink extends Item{

    public Drink(Settings settings) {
        super(settings);
    }

    public Drink(Settings settings, Item item) {
        super(settings);
        ((ItemAccessor) this).clothesline$setRecipeRemainder(item);
    }

    public SoundEvent getDrinkSound() {
        return net.minecraft.registry.Registries.SOUND_EVENT.get(net.minecraft.util.Identifier.of("minecraft", "entity.generic.drink"));
    }
    
    public SoundEvent getEatSound() {
        return net.minecraft.registry.Registries.SOUND_EVENT.get(net.minecraft.util.Identifier.of("minecraft", "entity.generic.eat"));
    }
    
}
