package com.bartoszolewinski.gamba.blocks;

import com.bartoszolewinski.gamba.GambaCraft;
import com.bartoszolewinski.gamba.blocks.custom.CasinoTillBlock;
import com.bartoszolewinski.gamba.blocks.custom.SlotsMachineBlock;
import com.bartoszolewinski.gamba.item.ModItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GambaCraft.MODID);


    //add profession block
    public static final DeferredBlock<Block> CASINO_TILL = customRegisterBlock(
            "casino_till",
            (properties) -> new CasinoTillBlock(properties
                    .noOcclusion()
                    .sound(SoundType.STONE))
    );


    //add slots machine block
    public static final DeferredBlock<Block> SLOTS_MACHINE = customRegisterBlock(
            "slots_machine",
            (properties -> new SlotsMachineBlock(properties
                    .noOcclusion()
                    .sound(SoundType.AMETHYST)))
    );

    //add blackjack block

    //add poker block



    //utility register from GitHub
    private static <T extends Block> DeferredBlock<T> customRegisterBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }



    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
