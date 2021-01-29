package com.remodstudios.mechwarf.blocks;

import com.remodstudios.mechwarf.MechanicalWarfare;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    // Bwocks go hewe UwU
    public static final Block CHARGED_REDSTONE_BLOCK = register(new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)), "charged_redstone_block");

    // Methods to register and stuff
    public static void init(){
        // Just loads the class
    }
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(MechanicalWarfare.MOD_ID, name), block);
    }
}
