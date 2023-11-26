package net.michael.villaged.item;

import net.michael.villaged.Villaged;
import net.michael.villaged.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Villaged.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VILLAGED_TAB = CREATIVE_MODE_TABS.register("villaged_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EMERALD_PICKAXE.get()))
                    .title(Component.translatable("creativetab.villaged_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PILLAGER_DEEPSLATE.get());

                        pOutput.accept(ModItems.EMERALD_PICKAXE.get());
                        pOutput.accept(ModItems.NETHER_AMULET.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
