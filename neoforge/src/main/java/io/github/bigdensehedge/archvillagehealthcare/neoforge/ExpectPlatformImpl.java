package io.github.bigdensehedge.archvillagehealthcare.neoforge;

import io.github.bigdensehedge.archvillagehealthcare.ExpectPlatform;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ExpectPlatformImpl {
    /**
     * This is our actual method to {@link ExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
