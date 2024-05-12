package net.treveranrold.dagonmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.treveranrold.dagonmod.DagonMod;
import net.treveranrold.dagonmod.block.Modblocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DagonMod.MODID);

    public static final RegistryObject<CreativeModeTab> DAGON_TAB = CREATIVE_MODE_TABS.register("dagon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.DAGONEGG.get()))
                    .title(Component.translatable("creativetab.dagon_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.DAGONEGG.get());
                        pOutput.accept(Moditems.ENDERDAGONEGG.get());
                        pOutput.accept(Moditems.DAGONORE.get());
                        pOutput.accept(Moditems.ENDERDAGONORE.get());
                        pOutput.accept(Moditems.ULTIMATEDAGONORE.get());
                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> MATERIAL_TAB = CREATIVE_MODE_TABS.register("material_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Modblocks.TITANIUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.material_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.TITANIUM.get());
                        pOutput.accept(Modblocks.TITANIUM_BLOCK.get());
                        pOutput.accept(Modblocks.TITANIUM_ORE.get());
                    })
                    .build());



    public static void register(IEventBus EventBus) {
        CREATIVE_MODE_TABS.register(EventBus);
    }
}
