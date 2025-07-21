package com.bartoszolewinski.gamba.blocks.entity;

import com.bartoszolewinski.gamba.GambaCraft;
import com.bartoszolewinski.gamba.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, GambaCraft.MODID);

    public static final Supplier<BlockEntityType<SlotsMachineBlockEntity>> SLOTS_MACHINE_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "slots_machine_block_entity",
            // The block entity type.
            () -> new BlockEntityType<>(
                    SlotsMachineBlockEntity::new,
                    false,
                    ModBlocks.SLOTS_MACHINE.get()
            )
    );
}
