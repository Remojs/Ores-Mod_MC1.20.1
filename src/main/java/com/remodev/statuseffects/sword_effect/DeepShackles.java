package com.remodev.statuseffects.sword_effect;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class DeepShackles extends StatusEffect {

    public DeepShackles() {
        super(StatusEffectCategory.HARMFUL, 0x0077B6);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 20 == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getWorld();

        if (!world.isClient) {
            entity.damage(entity.getDamageSources().drown(), 2.0f);
            entity.getWorld().playSound(null, entity.getBlockPos(), ModSounds.DEEPSHACKLES,
                    SoundCategory.PLAYERS, 0.5f, 1.0f);
            world.playSound(null, entity.getBlockPos(), SoundEvents.ENTITY_PLAYER_HURT_DROWN,
                    entity.getSoundCategory(), 1.0f, 1.0f);
        }
    }
}
