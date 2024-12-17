package com.remodev.statuseffects.armor_boost;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import java.util.Random;

public class ZamboniumBoost extends StatusEffect {

    private final Random random = new Random();

    public ZamboniumBoost() {
        super(StatusEffectCategory.BENEFICIAL, 0x0086a4);
    }


    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 480, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 480, 0, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 480, 1, false, false, false));
    }
}