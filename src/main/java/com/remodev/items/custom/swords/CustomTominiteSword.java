package com.remodev.items.custom.swords;

import com.remodev.items.Moditems;
import com.remodev.sound.ModSounds;
import com.remodev.statuseffects.ModStatusEffects;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class CustomTominiteSword extends SwordItem {
    private final Random random = new Random();

    public CustomTominiteSword(Settings settings) {
        super(new CustomToolMaterial(), 4, -2.6f, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip").formatted(Formatting.GREEN));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip2").formatted(Formatting.GREEN));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom.tominite").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tominite_sword_essenceharvesting").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tominite_sword_worldboost").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = attacker.getWorld();

        if (!world.isClient) {
            world.playSound(null, target.getBlockPos(), ModSounds.WORLDRAGE,
                    SoundCategory.PLAYERS, 0.4f, 1.0f);
        }

        if (random.nextFloat() <= 0.07f) {
            attacker.addStatusEffect(new StatusEffectInstance(ModStatusEffects.WORLD_ESSENCE, 800, 0));
        }

        // Aumento de daño de 1.5x contra Creepers, Zombies y Arañas
        if (target.getType() == EntityType.CREEPER || target.getType() == EntityType.ZOMBIE || target.getType() == EntityType.SPIDER) {
            target.damage(attacker.getDamageSources().generic(), 1.5f);
        }

        return super.postHit(stack, target, attacker);
    }

    public static class CustomToolMaterial implements ToolMaterial {
        @Override
        public int getDurability() {
            return 3000;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 8.0f;
        }

        @Override
        public float getAttackDamage() {
            return 5.0f;
        }

        @Override
        public int getMiningLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 22;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Moditems.PENTACRAFTIUM_CORE);
        }
    }
}
