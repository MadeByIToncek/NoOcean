package cf.itoncek.noocean;

import com.pieterdebot.biomemapping.Biome;
import com.pieterdebot.biomemapping.BiomeMappingAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoOcean extends JavaPlugin {

    @Override
    public void onEnable() {
        BiomeMappingAPI api = new BiomeMappingAPI();
        try {
            api.replaceBiomes(Biome.OCEAN, Biome.FOREST);
            api.replaceBiomes(Biome.WARM_OCEAN, Biome.MODIFIED_JUNGLE_EDGE);
            api.replaceBiomes(Biome.LUKEWARM_OCEAN, Biome.FLOWER_FOREST);
            api.replaceBiomes(Biome.FROZEN_OCEAN, Biome.DESERT_LAKES);
            api.replaceBiomes(Biome.COLD_OCEAN, Biome.DESERT);
            api.replaceBiomes(Biome.DEEP_OCEAN, Biome.TALL_BIRCH_FOREST);
            api.replaceBiomes(Biome.DEEP_WARM_OCEAN, Biome.MODIFIED_JUNGLE);
            api.replaceBiomes(Biome.DEEP_LUKEWARM_OCEAN, Biome.SUNFLOWER_PLAINS);
            api.replaceBiomes(Biome.DEEP_COLD_OCEAN, Biome.DESERT_LAKES);
            api.replaceBiomes(Biome.DEEP_FROZEN_OCEAN, Biome.DESERT_HILLS);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
