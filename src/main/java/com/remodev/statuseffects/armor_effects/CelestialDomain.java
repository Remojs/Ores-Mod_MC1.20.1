package com.remodev.statuseffects.armor_effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class CelestialDomain extends StatusEffect {

    public CelestialDomain() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFD700); // Color dorado
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 100 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, amplifier, false, true, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, amplifier, false, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, amplifier, false, false, false));
        }
    }
}
