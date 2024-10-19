package com.remodev.items.custom;

import com.remodev.items.Moditems;
import com.remodev.statuseffects.ModStatusEffects;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class CustomSwordPanchium extends SwordItem {
    private final Random random = new Random();
    private static final double LIGHTNING_PROBABILITY = 0.10;
    private static final double PARALYSIS_PROBABILITY = 0.05;

    public CustomSwordPanchium(Settings settings) {
        super(new CustomToolMaterial(), 3, -1.87f, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = target.getWorld();
        if (!world.isClient()) {
            if (random.nextDouble() < PARALYSIS_PROBABILITY) {
                target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ELECTROPARALYSIS, 100, 0)); // Duración: 100 ticks, Amplificador: 0
            }
        }

        return super.postHit(stack, target, attacker);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip2").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom.panchium").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.panchium_sword_stormfury").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.panchium_sword_electroparalysis").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
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
