package com.remodev.statuseffects.sword_effect;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class EternalFire extends StatusEffect {

    public EternalFire() {
        super(StatusEffectCategory.HARMFUL, 0xAB0900);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 16 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getWorld();

        if (!world.isClient) {
            entity.damage(entity.getDamageSources().inFire(), 2.0f);

            world.playSound(null, entity.getBlockPos(), ModSounds.ETERNALFIRE, entity.getSoundCategory(), 0.6f, 1.0f);
        }

        world.addParticle(ParticleTypes.SOUL_FIRE_FLAME,
                entity.getX(), entity.getY() + 1, entity.getZ(),
                1, 0.50, 0.5);
    }
}
