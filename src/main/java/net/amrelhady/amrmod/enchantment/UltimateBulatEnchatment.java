package net.amrelhady.amrmod.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class UltimateBulatEnchatment extends Enchantment {

    public UltimateBulatEnchatment(Rarity p_44676_, EnchantmentCategory p_44677_, EquipmentSlot... p_44678_) {
        super(p_44676_, p_44677_, p_44678_);
    }



    @Override
    public int getMaxLevel(){
        return 1;
    }
}
