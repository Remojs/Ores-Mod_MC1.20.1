package com.remodev.statuseffects.armor_boost;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class LukiteBoost extends StatusEffect {

    public LukiteBoost() {
        super(StatusEffectCategory.BENEFICIAL, 0x0053c8);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 460, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 460, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 460, 0, false, false, false));
    }
}