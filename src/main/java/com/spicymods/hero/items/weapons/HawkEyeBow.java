package com.spicymods.hero.items.weapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;

import static com.spicymods.hero.ModMain.MODID;

public class HawkEyeBow extends ItemBow {

    public HawkEyeBow() {
        this.setRegistryName("hawkeye_bow");
        this.setUnlocalizedName(MODID+".hawkeye_bow");
        setCreativeTab(CreativeTabs.COMBAT);
        this.maxStackSize = 1;
        this.setMaxDamage(9999);
    }

}
