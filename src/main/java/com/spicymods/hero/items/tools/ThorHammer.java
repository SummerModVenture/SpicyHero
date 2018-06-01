package com.spicymods.hero.items.tools;

import com.google.common.collect.Multimap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static com.spicymods.hero.ModMain.MODID;

public class ThorHammer extends ItemAxe {

    public ThorHammer() {
        super(ToolMaterial.DIAMOND);
        this.setRegistryName("thor_hammer");
        this.setUnlocalizedName(MODID+".thor_hammer");
        this.attackDamage = 6;
        this.attackSpeed = 2;
        setCreativeTab(CreativeTabs.COMBAT);
        this.setMaxDamage(9999);
    }

    //code used from a forum
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

        EntityPlayer entityplayer = (EntityPlayer) attacker;
        World world = attacker.getEntityWorld();

        int x = target.getPosition().getX();
        int y = target.getPosition().getY();
        int z = target.getPosition().getZ();

        double chance = Math.random() * 10;

        if (chance > 7.5) {
            world.addWeatherEffect(new EntityLightningBolt(world, x, y, z, true));
        }

        return super.hitEntity(stack, target, attacker);
    }

    /*@Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", (double)this.attackDamage, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", (double)this.attackSpeed, 0));
        }

        return multimap;

    }
    */
}
