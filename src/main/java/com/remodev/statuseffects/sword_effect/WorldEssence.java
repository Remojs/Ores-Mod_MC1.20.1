package com.remodev.statuseffects.sword_effect;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundCategory;

public class WorldEssence extends StatusEffect {

    public WorldEssence() {
        super(StatusEffectCategory.BENEFICIAL, 0x00FF00);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return false;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        // No reproducir sonido aquí para evitar duplicaciones
        if (entity instanceof PlayerEntity player) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, this.getDurationForAmplifier(amplifier), 2, false, false, false));
        }
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (!entity.getWorld().isClient) {
            entity.getWorld().playSound(null, entity.getBlockPos(), ModSounds.WORLDHARMONY,
                    SoundCategory.PLAYERS, 0.5f, 1.0f);
        }

        if (entity instanceof PlayerEntity player) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, this.getDurationForAmplifier(amplifier), 2, false, false, false));
        }
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        // No es necesario restablecer el sonido, a menos que lo necesites
    }

    private int getDurationForAmplifier(int amplifier) {
        return 600 * (amplifier + 1);
    }
}
