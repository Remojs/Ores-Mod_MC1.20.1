package com.remodev.statuseffects.armor_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class WaterBoost extends StatusEffect {

    public WaterBoost() {
        super(StatusEffectCategory.BENEFICIAL, 0x0000FF);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0, false, false, false));
    }
}