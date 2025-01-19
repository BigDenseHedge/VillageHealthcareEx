package io.github.bigdensehedge.archvillagehealthcare.fabric;

import io.github.bigdensehedge.archvillagehealthcare.ArchVillageHealthcareMod;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ArchVillageHealthcareMod.init();
    }
}
