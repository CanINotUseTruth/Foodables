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
        return new Identifier(Foodables.MOD_ID, "rack_recipes");
    }

    @Override
    public void reload(ResourceManager manager) {
        manager.findResources("rack_recipes", id -> id.getPath().endsWith(".json")).forEach((id, resourceRef) -> {
            try {
                InputStream stream = resourceRef.getInputStream();
                JsonObject data = JsonParser.parseReader(new InputStreamReader(stream)).getAsJsonObject();

                if (Registries.ITEM.get(new Identifier(data.get("item").getAsString())).toString().equals("air")) {
                    LOGGER.info("{} is not a valid item identifier at resouce {}", data.get("item").getAsString(), id.toString());
                    return;
                }
                if (Registries.ITEM.get(new Identifier(data.get("result").getAsString())).toString().equals("air")) {
                    LOGGER.info("{} is not a valid item identifier at resouce {}", data.get("result").getAsString(), id.toString());
                    return;
                }
                if (data.get("dryingtime").getAsInt() < 0) {
                    LOGGER.info("{} is not a valid time at resource {}", data.get("time").getAsInt(), id.toString());
                    return;
                }

                ModRecipes.RACK_ITEM_LIST.add((Item) Registries.ITEM.get(new Identifier(data.get("item").getAsString())));
                ModRecipes.RACK_RESULT_ITEM_LIST.add((Item) Registries.ITEM.get(new Identifier(data.get("result").getAsString())));
                ModRecipes.RACK_RESULT_TIME_LIST.add(data.get("dryingtime").getAsInt());

            } catch (Exception e) {
                LOGGER.error("Error occurred while loading resource {}. {}", id.toString(), e.toString());
            }
        });
    }
}
