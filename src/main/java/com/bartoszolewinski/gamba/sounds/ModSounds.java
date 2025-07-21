package com.bartoszolewinski.gamba.sounds;

import com.bartoszolewinski.gamba.GambaCraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, GambaCraft.MODID);


    public static final Supplier<SoundEvent> CASINO_TILL_SOUND = SOUND_EVENTS.register(
      "casino_till_sound",
      SoundEvent::createVariableRangeEvent
    );



    public static void register(IEventBus modEventBus) {
        SOUND_EVENTS.register(modEventBus);
    }
}
