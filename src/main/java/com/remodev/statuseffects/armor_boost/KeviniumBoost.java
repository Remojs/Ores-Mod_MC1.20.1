package com.remodev.statuseffects.armor_boost;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class KeviniumBoost extends StatusEffect {

    public KeviniumBoost() {
        super(StatusEffectCategory.BENEFICIAL, 0x8200d4);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 460, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 460, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 460, 0, false, false, false));
    }
}