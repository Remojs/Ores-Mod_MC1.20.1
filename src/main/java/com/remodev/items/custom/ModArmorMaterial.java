package com.remodev.items.custom;

import com.remodev.PentacraftOres;
import com.remodev.items.Moditems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    ZAMBONIUM("zambonium", 50, new int[] { 5, 11, 8, 5 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.2f, () -> Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE)),

    ROBERTIUM("robertium", 50, new int[] { 5, 11, 8, 5 }, 10,
    SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.2f, () -> Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE)),

    KEVINIUM("kevinium", 50, new int[] { 5, 11, 8, 5 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.2f, () -> Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE)),

    JUANITIUM("juanitium", 50, new int[] { 5, 11, 8, 5 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.2f, () -> Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE)),

    PANCHIUM("panchium", 50, new int[] { 5, 11, 8, 5 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.2f, () -> Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE)),

    SARITE("sarite", 50, new int[] { 5, 11, 8, 5 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.2f, () -> Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE)),

    LUKITE("lukite", 50, new int[] { 5, 11, 8, 5 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.2f, () -> Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE)),

    TOMINITE("tominite", 50, new int[] { 5, 11, 8, 5 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.2f, () -> Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE)),

    ;

    private final String name;
    private final int durabilityMultiplayer;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterial(String name, int durabilityMultiplayer, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplayer = durabilityMultiplayer;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplayer;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return PentacraftOres.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
