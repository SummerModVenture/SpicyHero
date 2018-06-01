package com.spicymods.hero.items;

import com.spicymods.hero.ModMain;
import com.spicymods.hero.items.armor.CapShield;
import com.spicymods.hero.items.tools.ThorHammer;
import com.spicymods.hero.items.weapons.HawkEyeBow;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.rmi.registry.Registry;

@Mod.EventBusSubscriber(modid = ModMain.MODID)
public class ModItems {

    public static Item hawkeyeBow;
    public static Item thorHammer;
    public static Item capShield;

    public static void init() {
        hawkeyeBow = new HawkEyeBow();
        thorHammer = new ThorHammer();
        capShield = new CapShield();
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(hawkeyeBow);
        event.getRegistry().register(thorHammer);
        event.getRegistry().register(capShield);
    }

    @SubscribeEvent
    public static void registerRender(ModelRegistryEvent event) {
        registerRender(hawkeyeBow);
        registerRender(thorHammer);
        registerRender(capShield);
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
