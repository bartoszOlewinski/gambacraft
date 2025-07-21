package com.bartoszolewinski.gamba.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import static com.bartoszolewinski.gamba.blocks.entity.ModBlockEntities.SLOTS_MACHINE_BLOCK_ENTITY;

public class SlotsMachineBlockEntity extends BlockEntity {


    private int inputValue;
    private int winnings;


    public SlotsMachineBlockEntity(BlockPos pos, BlockState blockState) {
        super(SLOTS_MACHINE_BLOCK_ENTITY.get(), pos, blockState);
    }
}
