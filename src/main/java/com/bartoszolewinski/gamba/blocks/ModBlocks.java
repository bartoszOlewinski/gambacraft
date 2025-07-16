package com.bartoszolewinski.gamba.blocks;

import com.bartoszolewinski.gamba.GambaCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GambaCraft.MODID);


    //add profession block
    public static final DeferredBlock<Block> CASINO_TILL = BLOCKS.register(
            "casino_till",
            registryName -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(1.0F)
                    .sound(SoundType.STONE)
    ));

    //add slots machine block

    //add blackjack block

    //add poker block



    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
