package com.remodev.statuseffects.armor_boost;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class TominiteBoost extends StatusEffect {

    public TominiteBoost() {
        super(StatusEffectCategory.BENEFICIAL, 0x058d00);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 460, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 460, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 460, 0, false, false, false));
    }
}