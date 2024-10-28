
package com.remodev.statuseffects.armor_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class DragonBoost extends StatusEffect {

    public DragonBoost() {
        super(StatusEffectCategory.BENEFICIAL, 0x6A0DAD);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 1, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1, false, false, false));
    }
}
