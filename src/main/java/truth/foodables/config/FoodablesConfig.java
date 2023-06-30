package truth.foodables.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import truth.foodables.Foodables;

@Config(name = Foodables.MOD_ID)
public class FoodablesConfig implements ConfigData {

    @ConfigEntry.Gui.CollapsibleObject
    public WorldGen worldGen = new WorldGen();

    public static class WorldGen {
        @ConfigEntry.Gui.Tooltip
        public boolean enableTreeGeneration = true;
        @ConfigEntry.Gui.Tooltip
        public boolean enableBerryBushGeneration = true;
        @ConfigEntry.Gui.Tooltip
        public boolean enableOreGeneration = true;
    }   
}
