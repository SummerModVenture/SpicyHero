package com.spicymods.hero;

import com.spicymods.hero.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

//start with Hawkeye's bow, maybe work on Infinity Gems too, Then Thor's hammer, then Infinity Gauntlet, then whatever else more

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
public class ModMain
{
    public static final String MODID = "spicyhero";
    public static final String NAME = "SpicyHero Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
    }
}
