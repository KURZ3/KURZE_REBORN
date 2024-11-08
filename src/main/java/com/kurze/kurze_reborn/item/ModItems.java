package com.kurze.kurze_reborn.item;

import com.kurze.kurze_reborn.KurzeReborn;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KurzeReborn.MOD_ID);

public static final RegistryObject<Item> KURZARITE_CLUSTER = ITEMS.register("kurzarite_cluster",
        ()-> new Item(new Item.Properties()));



//Event Bus
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
