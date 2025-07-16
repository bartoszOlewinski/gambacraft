package com.bartoszolewinski.gamba.blocks;

import com.bartoszolewinski.gamba.GambaCraft;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GambaCraft.MODID);

    //add profession block

    //add slots machine block

    //add blackjack block

    //add poker block



    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
