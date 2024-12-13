package com.remodev.statuseffects.armor_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class DarkResurrection extends StatusEffect {

    public DarkResurrection() {
        super(StatusEffectCategory.BENEFICIAL, 0x000000);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            player.getHungerManager().setFoodLevel(20);
            player.getHungerManager().setSaturationLevel(20.0f);
        }
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 8, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 2, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0, false, false, false));
    }
}
