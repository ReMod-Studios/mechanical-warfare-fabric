package com.remodstudios.mechwarf.blocks;

import com.remodstudios.mechwarf.MechanicalWarfare;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    // Bwocks go hewe UwU


    // Methods to register and stuff
    public static void init(){
        // Just loads the class
    }
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(MechanicalWarfare.MOD_ID, name), block);
    }
}
