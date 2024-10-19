package com.remodev.items.custom;

import com.remodev.items.Moditems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
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

public class CustomSwordRobertium extends SwordItem {
    private final Random random = new Random();

    public CustomSwordRobertium(Settings settings) {
        super(new CustomToolMaterial(), 4, -2.64f, settings); // 4 de daño base (+1 respecto a Zambonium) y 20% más lenta (-2.64 de velocidad).
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip").formatted(Formatting.DARK_RED));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip2").formatted(Formatting.DARK_RED));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom.robertium").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.robertium_sword_igneousfist").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.robertium_sword_volcanicshock").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (random.nextFloat() < 0.10) {
            target.getWorld().createExplosion(null, target.getX(), target.getY(), target.getZ(), 2.0f, false, World.ExplosionSourceType.NONE);
        }

        target.setOnFireFor(4);

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
