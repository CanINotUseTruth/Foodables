package truth.foodables.recipe;

import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import truth.foodables.Foodables;
import truth.foodables.registry.ModRecipes;

public class DryingRackRecipeLoader implements SimpleSynchronousResourceReloadListener {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public Identifier getFabricId() {
        return Identifier.of(Foodables.MOD_ID, "rack_recipes");
    }

    @Override
    public void reload(ResourceManager manager) {
        manager.findResources("rack_recipes", id -> id.getPath().endsWith(".json")).forEach((id, resourceRef) -> {
            try {
                InputStream stream = resourceRef.getInputStream();
                JsonObject data = JsonParser.parseReader(new InputStreamReader(stream)).getAsJsonObject();

                String itemIdString = data.get("item").getAsString();
                Identifier itemId = itemIdString.contains(":") ? 
                    Identifier.of(itemIdString.split(":")[0], itemIdString.split(":")[1]) : 
                    Identifier.of("minecraft", itemIdString);
                if (Registries.ITEM.get(itemId).toString().equals("air")) {
                    LOGGER.info("{} is not a valid item identifier at resouce {}", data.get("item").getAsString(), id.toString());
                    return;
                }
                String resultIdString = data.get("result").getAsString();
                Identifier resultId = resultIdString.contains(":") ? 
                    Identifier.of(resultIdString.split(":")[0], resultIdString.split(":")[1]) : 
                    Identifier.of("minecraft", resultIdString);
                if (Registries.ITEM.get(resultId).toString().equals("air")) {
                    LOGGER.info("{} is not a valid item identifier at resouce {}", data.get("result").getAsString(), id.toString());
                    return;
                }
                if (data.get("dryingtime").getAsInt() < 0) {
                    LOGGER.info("{} is not a valid time at resource {}", data.get("time").getAsInt(), id.toString());
                    return;
                }

                ModRecipes.RACK_ITEM_LIST.add((Item) Registries.ITEM.get(itemId));
                ModRecipes.RACK_RESULT_ITEM_LIST.add((Item) Registries.ITEM.get(resultId));
                ModRecipes.RACK_RESULT_TIME_LIST.add(data.get("dryingtime").getAsInt());

            } catch (Exception e) {
                LOGGER.error("Error occurred while loading resource {}. {}", id.toString(), e.toString());
            }
        });
    }
}
