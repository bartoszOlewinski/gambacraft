package com.bartoszolewinski.gamba.blocks;

import com.bartoszolewinski.gamba.GambaCraft;
import com.bartoszolewinski.gamba.blocks.custom.CasinoTillBlock;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GambaCraft.MODID);


    //add profession block

    public static final DeferredBlock<Block> CASINO_TILL = registerBlock(
            "casino_till",
            (properties) -> new CasinoTillBlock(properties.noOcclusion()));


    //add slots machine block

    //add blackjack block

    //add poker block



    //utility register from github
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        return toReturn;
    }



    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
