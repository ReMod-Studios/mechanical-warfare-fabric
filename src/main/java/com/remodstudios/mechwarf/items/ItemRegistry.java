package com.remodstudios.mechwarf.items;

import com.remodstudios.mechwarf.MechanicalWarfare;
import com.remodstudios.mechwarf.blocks.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    // items go BRRRRRRRRR
    public static final Item CHARGED_REDSTONE_DUST = register(new ChargedItem(new Item.Settings().group(ItemGroup.MISC)), "charged_redstone_dust");



    // Bwockitems go hewe
    public static final Item CHARGED_REDSTONE_BLOCK = register(BlockRegistry.CHARGED_REDSTONE_BLOCK, "charged_redstone_block", new Item.Settings().group(ItemGroup.MISC));
    public static final Item PLUTONIUM_ORE = register(BlockRegistry.PLUTONIUM_ORE, "plutonium_ore", new Item.Settings().group(ItemGroup.MISC));
    public static final Item PLUTONIUM_BLOCK = register(BlockRegistry.PLUTONIUM_BLOCK, "plutonium_block", new Item.Settings().group(ItemGroup.MISC));

    ////////////////////////////////////

    // Methods for this
    public static void init(){
        // Loads Class?
    }
    private static Item register(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(MechanicalWarfare.MOD_ID, name), item);
    }

    private static Item register(Block block, String name, Item.Settings settings) {
        return register(new BlockItem(block, settings), name);
    }
}
