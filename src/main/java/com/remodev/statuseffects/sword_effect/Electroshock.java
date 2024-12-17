package com.remodev.statuseffects.sword_effect;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.sound.SoundCategory;

public class Electroshock extends StatusEffect {

    public static final StatusEffect ELECTROSHOCK = new Electroshock();
    private int tickCounter = 0;
    private boolean soundPlayed = false;

    public Electroshock() {
        super(StatusEffectCategory.HARMFUL, 0xC49000);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 1 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(entity.getDamageSources().magic(), 0.8f);

        if (!entity.getEntityWorld().isClient) {
            if (!soundPlayed) {
                entity.getEntityWorld().playSound(null, entity.getBlockPos(), ModSounds.ELECTROSHOCK,
                        SoundCategory.PLAYERS, 0.4f, 1.0f);
                soundPlayed = true;
            }

            tickCounter++;

            if (tickCounter >= 80) {
                tickCounter = 0;
                soundPlayed = false;
            }
        }
    }
}
