package truth.foodables.recipe;

import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.item.Item;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import truth.foodables.registry.ModRecipes;

public class DryingRackRecipeLoader implements SimpleSynchronousResourceReloadListener {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public Identifier getFabricId() {
        return new Identifier("rotten", "rack_items");
    }

    @Override
    public void reload(ResourceManager manager) {
        for (Identifier id : manager.findResources("dryingrackrecipes", path -> path.endsWith(".json"))) {
            try {
                InputStream stream = manager.getResource(id).getInputStream();
                JsonObject data = new JsonParser().parse(new InputStreamReader(stream)).getAsJsonObject();
                ModRecipes.RACK_ITEM_LIST.add((Item) Registry.ITEM.get(new Identifier(data.get("item").getAsString())));
                ModRecipes.RACK_RESULT_ITEM_LIST.add((Item) Registry.ITEM.get(new Identifier(data.get("result").getAsString())));
                ModRecipes.RACK_RESULT_TIME_LIST.add(data.get("dryingtime").getAsInt());
                stream.close();
            } catch (Exception e) {
                LOGGER.error("Error occurred while loading resource {}. {}", id.toString(), e.toString());
            }
        }
    }

}
