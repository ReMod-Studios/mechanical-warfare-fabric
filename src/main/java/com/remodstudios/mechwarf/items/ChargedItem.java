package com.remodstudios.mechwarf.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ChargedItem extends Item {
    public ChargedItem(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
