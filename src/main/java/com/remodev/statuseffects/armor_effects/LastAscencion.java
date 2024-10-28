package com.remodev.statuseffects.armor_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class LastAscencion extends StatusEffect {

    public LastAscencion() {
        super(StatusEffectCategory.BENEFICIAL, 0x0000FF);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 1, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1, false, false, false));
    }
}
