package com.remodev.items.custom;

import com.remodev.items.Moditems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class CustomSwordZambonium extends SwordItem {
    private final Random random = new Random();
    private long lastExtraHeartTime = 0; // Para manejar el cooldown de los corazones extra
    private static final long COOLDOWN_DURATION = 360000; // 30 segundos en milisegundos

    public CustomSwordZambonium(Settings settings) {
        super(new CustomToolMaterial(), 3, -2.2f, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip").formatted(Formatting.AQUA));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip2").formatted(Formatting.AQUA));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom.zambonium").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.zambonium_sword_soulabsorption").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.zambonium_sword_deathtouch").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (random.nextFloat() < 0.15) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 160, 1)); // Efecto de wither por 8 segundos (160 ticks).
        }

        if (attacker.getHealth() < attacker.getMaxHealth()) {
            attacker.heal(1.0f);
        } else {

            long currentTime = System.currentTimeMillis();
            if (currentTime - lastExtraHeartTime >= COOLDOWN_DURATION) {

                StatusEffectInstance currentAbsorption = attacker.getStatusEffect(StatusEffects.ABSORPTION);
                int currentAmplifier = currentAbsorption != null ? currentAbsorption.getAmplifier() : -1;

                int newAmplifier = currentAmplifier + 1;

                int absorptionDuration = currentAbsorption != null ? currentAbsorption.getDuration() : 3600;
                attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, absorptionDuration, newAmplifier));

                // Actualiza el tiempo del último uso del buff.
                lastExtraHeartTime = currentTime;
            }
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
