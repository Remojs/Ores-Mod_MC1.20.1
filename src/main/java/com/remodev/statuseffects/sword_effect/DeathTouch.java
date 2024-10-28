package com.remodev.statuseffects.sword_effect;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundCategory;

public class DeathTouch extends StatusEffect {

    public static final StatusEffect DEATH_TOUCH = new DeathTouch();
    private int tickCounter = 0;

    public DeathTouch() {
        super(StatusEffectCategory.HARMFUL, 0x000000);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 10 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 40, 0, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 30, 0, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 30, 0, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 30, 0, false, false));

        if (!entity.getEntityWorld().isClient) {
            tickCounter++;

            if (tickCounter >= 5) {
                entity.getEntityWorld().playSound(null, entity.getBlockPos(), ModSounds.DEATH_TOUCH_SOUND,
                        SoundCategory.PLAYERS, 1.0f, 1.0f);
                tickCounter = 0;
            }
        }
    }
}
