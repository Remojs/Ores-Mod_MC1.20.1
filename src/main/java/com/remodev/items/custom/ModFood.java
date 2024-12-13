package com.remodev.items.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ModFood {

    public static final FoodComponent LUKI_TOMATO = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();
    public static final FoodComponent ROBERT_LETUCCE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();

    public static final FoodComponent CHORIPAN_FOOD = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5 * 20, 0), 1.0f) // Regeneración 1 por 5 segundos
            .alwaysEdible()
            .build();

    public static final FoodComponent MONSTER_FOOD = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 20, 0), 1.0f) // Velocidad 1 por 10 segundos
            .alwaysEdible()
            .build();

    public static final FoodComponent MATE_FOOD = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 10 * 20, 0), 1.0f) // Fuerza 1 por 10 segundos
            .alwaysEdible()
            .build();

    public static final FoodComponent PATY_FOOD = new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build();

    public static final FoodComponent BURGER_FOOD = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5 * 20, 0), 1.0f) // Regeneración 1 por 5 segundos
            .alwaysEdible()
            .build();

    public static final FoodComponent SPEED_FOOD = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 20, 0), 1.0f) // Velocidad 1 por 10 segundos
            .alwaysEdible()
            .build();
}
