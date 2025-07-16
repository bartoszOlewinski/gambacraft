package com.bartoszolewinski.gamba.villagers;

import com.bartoszolewinski.gamba.GambaCraft;
import com.google.common.collect.ImmutableSet;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModVillagers {


    //create registries for stuff
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, GambaCraft.MODID);

    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, GambaCraft.MODID);


    //create poi COPIED NOT FINAL
    public static final Holder<PoiType> CASINO_POI = POI_TYPES.register("casino_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.CHAIR.get().getStateDefinition().getPossibleStates()), 1, 1));


    //create profession COPIED NOT FINAL
    public static final Holder<VillagerProfession> CASINO_TELLER = VILLAGER_PROFESSIONS.register("casino_teller",
            () -> new VillagerProfession(Component.literal("casino_teller"), holder -> holder.value() == CASINO_POI.value(),
                    poiTypeHolder -> poiTypeHolder.value() == CASINO_POI.value(), ImmutableSet.of(), ImmutableSet.of(),
                    ModSounds.MAGIC_BLOCK_HIT.get()));



    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
