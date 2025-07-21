package com.bartoszolewinski.gamba.blocks.custom;

import com.bartoszolewinski.gamba.blocks.entity.SlotsMachineBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class SlotsMachineBlock extends HorizontalDirectionalBlock implements EntityBlock {

    public static final MapCodec<SlotsMachineBlock> CODEC = simpleCodec(SlotsMachineBlock::new);

    private static final VoxelShape SHAPE = Block.box(3, 0, 1, 14 ,27, 14);



    public SlotsMachineBlock(Properties properties) {
        super(properties);
    }


    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public  MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }


    /*
    ENTITY STUFF HERE
     */
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new SlotsMachineBlockEntity(blockPos, blockState);
    }





    //=================== states for facings, for HorizontalDirectionalBlock

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
