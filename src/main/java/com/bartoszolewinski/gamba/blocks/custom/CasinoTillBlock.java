package com.bartoszolewinski.gamba.blocks.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class CasinoTillBlock extends HorizontalDirectionalBlock {

    public static final MapCodec<CasinoTillBlock> CODEC = simpleCodec(CasinoTillBlock::new);


    public CasinoTillBlock(Properties properties) {
        super(properties);
    }

    @Override
    public  MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }



    //=================== states for facings
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


}
