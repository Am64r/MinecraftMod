package net.amrelhady.amrmod.enchantment;

import net.amrelhady.amrmod.AmrMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.OxygenEnchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHATNMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AmrMod.MOD_ID);

    public static RegistryObject<Enchantment> ULTIMATE_BULAT =
            ENCHATNMENTS.register("ultimate_bulat",
                    () -> new OxygenEnchantment(Enchantment.Rarity.UNCOMMON,
                            EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHATNMENTS.register(eventBus);
    }
}
