package com.spicymods.hero.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ThorHammer extends ItemAxe{

    public ThorHammer() {
        super(ToolMaterial.DIAMOND);
        this.setRegistryName("thor_hammer");
        this.setUnlocalizedName("thor_hammer");
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
