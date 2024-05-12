package net.treveranrold.dagonmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.treveranrold.dagonmod.DagonMod;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DagonMod.MODID);

    public static final RegistryObject<Item> DAGONEGG = ITEMS.register("dagonegg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERDAGONEGG = ITEMS.register("enderdagonegg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERDAGONORE = ITEMS.register("enderdagonore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DAGONORE = ITEMS.register("dagonore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ULTIMATEDAGONORE = ITEMS.register("ultimatedagonore",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
