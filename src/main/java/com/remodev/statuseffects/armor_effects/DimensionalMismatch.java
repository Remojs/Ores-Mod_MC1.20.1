package com.remodev.statuseffects.armor_effects;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.sound.SoundCategory;

public class DimensionalMismatch extends StatusEffect {

    public static final StatusEffect DIMENSIONAL_MISMATCH = new DimensionalMismatch();
    private boolean soundPlayed = false;

    public DimensionalMismatch() {
        super(StatusEffectCategory.BENEFICIAL, 0x6A0DAD);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.fallDistance = 0.0F;

        if (!entity.getWorld().isClient) {
            if (!soundPlayed) {
                entity.getWorld().playSound(null, entity.getBlockPos(), ModSounds.DIMENSIONALMISMATCH,
                        SoundCategory.PLAYERS, 0.2f, 1.0f);
                soundPlayed = true;
            }
        }

        if (!entity.hasStatusEffect(StatusEffects.LEVITATION)) {
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.LEVITATION,
                    40,
                    2,
                    false,
                    false
            ));
        }

        if (!entity.hasStatusEffect(StatusEffects.RESISTANCE)) {
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.RESISTANCE,
                    40,
                    3,
                    false,
                    false
            ));
        }

        if (!entity.hasStatusEffect(StatusEffects.REGENERATION)) {
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.REGENERATION,
                    40,
                    3,
                    false,
                    false
            ));
        }

        if (!entity.hasStatusEffect(StatusEffects.SLOW_FALLING)) {
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.SLOW_FALLING,
                    400,
                    3,
                    false,
                    false
            ));
        }
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        soundPlayed = false;
    }
}
