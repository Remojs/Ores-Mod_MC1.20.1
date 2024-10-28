package com.remodev.items.custom.greatAxe;

import com.remodev.items.Moditems;
import com.remodev.sound.ModSounds;
import com.remodev.statuseffects.ModStatusEffects;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class CustomLukiteGreatAxe extends SwordItem {
    private final Random random = new Random();

    public CustomLukiteGreatAxe(Settings settings) {
        super(new CustomToolMaterial(), 6, -3.4f, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_greataxe.tooltip").formatted(Formatting.BLUE));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_greataxe.tooltip2").formatted(Formatting.BLUE));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom.lukite").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.lukite_sword_skyking").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.lukite_sword_gravitytouch").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = attacker.getWorld();

        if (!world.isClient) {
            world.playSound(null, target.getBlockPos(), ModSounds.WINDHIT,
                    SoundCategory.PLAYERS, 0.9f, 1.3f);
        }

        if (random.nextFloat() <= 0.15f && attacker instanceof PlayerEntity) {
            ((PlayerEntity) attacker).addStatusEffect(new StatusEffectInstance(ModStatusEffects.WIND_TOUCH, 100, 0));
        }

        if (target.getType() == EntityType.GHAST || target.getType() == EntityType.PHANTOM || target.getType() == EntityType.VEX || target.getType() == EntityType.ALLAY) {
            target.damage(attacker.getDamageSources().generic(), 2.0f);
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
            return 6.5f;
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
