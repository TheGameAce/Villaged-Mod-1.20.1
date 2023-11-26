package net.michael.villaged.item;

import net.michael.villaged.Villaged;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Villaged.MOD_ID);

    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_AMULET = ITEMS.register("nether_amulet",
            () -> new Item (new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
