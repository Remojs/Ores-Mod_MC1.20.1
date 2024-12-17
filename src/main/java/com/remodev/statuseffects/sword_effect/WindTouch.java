package com.remodev.statuseffects.sword_effect;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundCategory;
import net.minecraft.world.World;
import net.minecraft.entity.attribute.AttributeContainer;

public class WindTouch extends StatusEffect {

    private boolean soundPlayed = false;

    public WindTouch() {
        super(StatusEffectCategory.HARMFUL, 0xAECCCC);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 10 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getWorld();

        if (!world.isClient) {
            if (!soundPlayed) {
                entity.getWorld().playSound(null, entity.getBlockPos(), ModSounds.WINDEFFECT,
                        SoundCategory.PLAYERS, 0.5f, 1.0f);
                soundPlayed = true;
            }

            StatusEffectInstance levitation = new StatusEffectInstance(
                    StatusEffects.LEVITATION,
                    100,
                    1,
                    false,
                    false
            );
            entity.addStatusEffect(levitation);
        }
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        soundPlayed = false;
    }
}
