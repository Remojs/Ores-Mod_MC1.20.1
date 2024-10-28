package com.remodev.statuseffects.sword_effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundCategory;
import com.remodev.sound.ModSounds;

public class AbyssTouch extends StatusEffect {

    public AbyssTouch() {
        super(StatusEffectCategory.HARMFUL, 0x0000FF);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.getWorld().isClient()) {
            entity.getWorld().playSound(null, entity.getBlockPos(), ModSounds.ABYSSCRY,
                    SoundCategory.PLAYERS, 0.5f, 1.0f);

            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 140, 0, true, false)); // 140 ticks = 7 segundos
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 140, 1, true, false)); // Lentitud II
        }
    }
}
