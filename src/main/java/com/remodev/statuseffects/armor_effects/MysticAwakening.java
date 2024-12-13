package com.remodev.statuseffects.armor_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class MysticAwakening extends StatusEffect {

    public MysticAwakening() {
        super(StatusEffectCategory.BENEFICIAL, 0xBF00BC);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 10 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 30, 1, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 30, 1, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 30, 1, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 30, 0, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 30, 1, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 30, 1, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 30, 0, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 30, 0, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 30, 0, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 30, 0, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 30, 0, false, false));
    }
}
