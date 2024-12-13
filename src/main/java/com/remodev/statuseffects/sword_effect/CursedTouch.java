package com.remodev.statuseffects.sword_effect;

import com.remodev.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundCategory;
import net.minecraft.world.World;

import java.util.Random;

public class CursedTouch extends StatusEffect {
    private final Random random = new Random();

    public static final StatusEffect CURSED_TOUCH = new CursedTouch();

    public CursedTouch() {
        super(StatusEffectCategory.HARMFUL, 0x730071); // Color violeta
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getWorld();
        if (!world.isClient()) {
            applyRandomNegativeEffect(entity);
            playMagicSound(world, entity);
        }
        super.applyUpdateEffect(entity, amplifier);
    }

    private void applyRandomNegativeEffect(LivingEntity entity) {
        int effectIndex = random.nextInt(7);
        StatusEffectInstance effect = null;

        switch (effectIndex) {
            case 0:
                effect = new StatusEffectInstance(StatusEffects.SLOWNESS, 120, 1); // Lentitud (5 segundos)
                break;
            case 1:
                effect = new StatusEffectInstance(StatusEffects.WEAKNESS, 120, 1); // Debilidad (5 segundos)
                break;
            case 2:
                effect = new StatusEffectInstance(StatusEffects.POISON, 120, 0); // Veneno (5 segundos)
                break;
            case 3:
                effect = new StatusEffectInstance(StatusEffects.BLINDNESS, 120, 0); // Ceguera (5 segundos)
                break;
            case 4:
                entity.damage(entity.getDamageSources().magic(), 6.0f); // Daño instantáneo (2 corazones)
                break;
            case 5:
                effect = new StatusEffectInstance(StatusEffects.NAUSEA, 120, 0); // Náuseas (5 segundos)
                break;
            case 6:
                effect = new StatusEffectInstance(StatusEffects.HUNGER, 120, 1); // Hambre (5 segundos)
                break;
        }

        if (effect != null) {
            entity.addStatusEffect(effect);
        }
    }

    private void playMagicSound(World world, LivingEntity entity) {
        world.playSound(
                null,
                entity.getBlockPos(),
                ModSounds.MAGICTHINGS,
                SoundCategory.PLAYERS,
                0.3f,
                1.0f
        );
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 20 == 0;
    }
}
