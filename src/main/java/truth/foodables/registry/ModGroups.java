package truth.foodables.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import truth.foodables.Foodables;

public class ModGroups {

    public static final ItemGroup FAB_FOODABLES_GROUP = FabricItemGroupBuilder.build(new Identifier(Foodables.MOD_ID, "foodables"), () -> new ItemStack(ModItems.MORTAR_AND_PESTLE));
    
}
