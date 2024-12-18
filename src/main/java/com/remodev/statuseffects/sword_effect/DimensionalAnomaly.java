package com.remodev.statuseffects.sword_effect;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.sound.SoundCategory;

public class DimensionalAnomaly extends StatusEffect {

    public static final StatusEffect DIMENSIONAL_ANOMALY = new DimensionalAnomaly();
    private boolean soundPlayed = false;
    private int tickCounter = 0;

    public DimensionalAnomaly() {
        super(StatusEffectCategory.BENEFICIAL, 0xBD93D8);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 30 >> amplifier;
        return i <= 0 || duration % i == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.addStatusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.NAUSEA, 30, 2, false, false));
        entity.damage(entity.getDamageSources().magic(), 2.0f);
        if (!entity.getEntityWorld().isClient) {
            if (!soundPlayed) {
                entity.getEntityWorld().playSound(null, entity.getBlockPos(), ModSounds.DIMENSIONALANOMALY,
                        SoundCategory.PLAYERS, 0.5f, 1.0f);
                soundPlayed = true;
            }

            tickCounter++;

            if (tickCounter >= 100) {
                tickCounter = 0;
                soundPlayed = false;
            }
        }
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        tickCounter = 0;
        soundPlayed = false;
    }
}
