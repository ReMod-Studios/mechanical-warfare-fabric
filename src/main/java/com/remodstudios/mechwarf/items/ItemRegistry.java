package com.remodstudios.mechwarf.items;

import com.remodstudios.mechwarf.MechanicalWarfare;
import com.remodstudios.mechwarf.blocks.BlockRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    private static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(MechanicalWarfare.MOD_ID,"group"), () -> new ItemStack(ItemRegistry.PLUTONIUM_BLOCK));

    // items go BRRRRRRRRR
    public static final Item CHARGED_REDSTONE_DUST = register(new ChargedItem(new Item.Settings().group(GROUP)), "charged_redstone_dust");
    public static final Item PLUTONIUM_SHARD = register(new Item(new Item.Settings().group(GROUP)), "plutonium_shard");

    // Bwockitems go hewe
    public static final Item CHARGED_REDSTONE_BLOCK = register(BlockRegistry.CHARGED_REDSTONE_BLOCK, "charged_redstone_block", new Item.Settings().group(GROUP));
    public static final Item PLUTONIUM_ORE = register(BlockRegistry.PLUTONIUM_ORE, "plutonium_ore", new Item.Settings().group(GROUP));
    public static final Item PLUTONIUM_BLOCK = register(BlockRegistry.PLUTONIUM_BLOCK, "plutonium_block", new Item.Settings().group(GROUP));

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
