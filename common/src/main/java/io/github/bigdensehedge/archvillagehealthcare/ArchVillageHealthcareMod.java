package io.github.bigdensehedge.archvillagehealthcare;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArchVillageHealthcareMod {
    public static final String MOD_ID = "archvillagehealthcare";
    public static Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {
        LOGGER.log(Level.DEBUG, "Village Healthcare (Architectury) initialized.");
    }
}
