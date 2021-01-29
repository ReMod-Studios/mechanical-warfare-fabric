package com.remodstudios.mechwarf;

import com.remodstudios.mechwarf.blocks.BlockRegistry;
import com.remodstudios.mechwarf.items.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MechanicalWarfare implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "mechwarf";
    public static final String MOD_NAME = "Mechanical Warfare";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        ItemRegistry.init();
        BlockRegistry.init();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}