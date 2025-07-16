package com.bartoszolewinski.gamba.item;

import com.bartoszolewinski.gamba.GambaCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.bartoszolewinski.gamba.GambaCraft.MODID;
import static com.bartoszolewinski.gamba.item.ModItems.*;

public class ModCreativeTabs {


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);





    // Creates a creative tab with the id "gambacraft:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GAMBACRAFT_TAB = CREATIVE_MODE_TABS.register("gambacraft_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.gambacraft.casino_items")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> CASINO_CHIP_1s.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(CASINO_CHIP_1s);
                output.accept(CASINO_CHIP_10s);
                output.accept(CASINO_CHIP_25s);
                output.accept(CASINO_CHIP_50s);

                output.accept(CASINO_TILL_BLOCK_ITEM);

            }).build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
