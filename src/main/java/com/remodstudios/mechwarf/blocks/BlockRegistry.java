package com.remodstudios.mechwarf.blocks;

import com.remodstudios.mechwarf.MechanicalWarfare;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    // Bwocks go hewe UwU
    public static final Block CHARGED_REDSTONE_BLOCK = register(new ChargedRedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)), "charged_redstone_blockR");
    public static final Block PLUTONIUM_ORE = register(new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)),"plutonium_ore");
    public static final Block PLUTONIUM_BLOCK = register(new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),"plutonium_block");

    // Methods to register and stuff
    public static void init(){
        // Just loads the class
    }
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(MechanicalWarfare.MOD_ID, name), block);
    }
}
