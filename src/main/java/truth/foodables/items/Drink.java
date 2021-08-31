package truth.foodables.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class Drink extends HoneyBottleItem {

    public Drink(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        
        if (stack.isEmpty()) {
           return new ItemStack(Items.GLASS_BOTTLE);
        } else {
           if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {
              ItemStack itemStack = new ItemStack(Items.GLASS_BOTTLE);
              PlayerEntity playerEntity = (PlayerEntity)user;
              if (!playerEntity.getInventory().insertStack(itemStack)) {
                 playerEntity.dropItem(itemStack, false);
              }
           }
  
           return stack;
        }
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
