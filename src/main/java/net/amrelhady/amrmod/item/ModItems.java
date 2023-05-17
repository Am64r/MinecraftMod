package net.amrelhady.amrmod.item;

import net.amrelhady.amrmod.AmrMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AmrMod.MOD_ID);

    public static final RegistryObject<Item> BULAT_APPLE = ITEMS.register("bulat_apple",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(4)
                            .saturationMod(1.2f)
                            .effect( () -> new MobEffectInstance(MobEffects.JUMP, 6000, 30), 1.0f)
                            .alwaysEat()
                            .build()
                    )

            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
