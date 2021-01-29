package com.remodstudios.mechwarf.items;

import com.remodstudios.mechwarf.MechanicalWarfare;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    // items go BRRRRRRRRR




    // Bwockitems go hewe




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
