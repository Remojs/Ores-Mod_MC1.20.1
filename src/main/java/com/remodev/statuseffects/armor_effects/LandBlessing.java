package com.remodev.statuseffects.armor_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class LandBlessing extends StatusEffect {

    public LandBlessing() {
        super(StatusEffectCategory.BENEFICIAL, 0x00BA66);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 120 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 140, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 140, 0, false, false, false));
    }
}
