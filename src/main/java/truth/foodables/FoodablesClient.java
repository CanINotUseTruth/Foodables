package truth.foodables;

import net.fabricmc.api.ClientModInitializer;
import truth.foodables.registry.ModBlocks;

public class FoodablesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModBlocks.registerRenderers();
    }
    
}
