package com.remodev.statuseffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class ElectroparalysisEffect extends StatusEffect {

    public ElectroparalysisEffect() {
        super(StatusEffectCategory.HARMFUL, 0xFFFF00);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 30 >> amplifier;
        return i <= 0 || duration % i == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        // Aplica Slowness 8
        entity.addStatusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.SLOWNESS, 100, 8, false, false));
    }
}
