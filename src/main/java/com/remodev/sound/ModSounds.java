package com.remodev.sound;

import com.remodev.PentacraftOres;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class ModSounds {

    public static final SoundEvent DEATH_TOUCH_SOUND = registerSoundEvent("deathtouch");
    public static final SoundEvent ELECTROPARALYSIS = registerSoundEvent("electroparalysis");
    public static final SoundEvent ELECTROSHOCK = registerSoundEvent("electroshock");
    public static final SoundEvent ETERNALFIRE = registerSoundEvent("eternalfire");
    public static final SoundEvent ABYSSCRY = registerSoundEvent("abysscry");
    public static final SoundEvent DEEPSHACKLES = registerSoundEvent("deepshackles");
    public static final SoundEvent WINDEFFECT = registerSoundEvent("windeffect");
    public static final SoundEvent WORLDHARMONY = registerSoundEvent("worldharmony");
    public static final SoundEvent DIMENSIONALANOMALY = registerSoundEvent("dimensionalanomaly");
    public static final SoundEvent DIMENSIONALMISMATCH = registerSoundEvent("dimensionalmismatch");
    public static final SoundEvent MAGICTHINGS = registerSoundEvent("magicthings");
    public static final SoundEvent MAGICATTACK = registerSoundEvent("magicattack");
    public static final SoundEvent FIREHIT = registerSoundEvent("firehit");
    public static final SoundEvent WATERHIT = registerSoundEvent("waterhit");
    public static final SoundEvent WINDHIT = registerSoundEvent("windhit");
    public static final SoundEvent WORLDRAGE = registerSoundEvent("worldrage");
    public static final SoundEvent DIMENSIONALSWOOSH = registerSoundEvent("dimensionalswoosh");
    public static final SoundEvent ELECTRICEDGE = registerSoundEvent("electricedge");
    public static final SoundEvent BONK = registerSoundEvent("bonk");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(PentacraftOres.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        PentacraftOres.LOGGER.info("Registering Sounds");
    }
}
