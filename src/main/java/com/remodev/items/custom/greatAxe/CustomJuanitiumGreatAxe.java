package com.remodev.items.custom.greatAxe;

import com.remodev.items.Moditems;
import com.remodev.sound.ModSounds;
import com.remodev.statuseffects.ModStatusEffects;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
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

public class CustomJuanitiumGreatAxe extends SwordItem {
    private final Random random = new Random();

    public CustomJuanitiumGreatAxe(Settings settings) {
        super(new CustomToolMaterial(), 6, -2.9f, settings); // Valores de ataque y velocidad
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_greataxe.tooltip").formatted(Formatting.GOLD));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_greataxe.tooltip2").formatted(Formatting.GOLD));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom.juanitium").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.juanitium_sword_deepshackles").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.juanitium_sword_abysstouch").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = target.getWorld();
        if (!world.isClient) {
            world.playSound(null, target.getBlockPos(), ModSounds.WATERHIT,
                    SoundCategory.PLAYERS, 0.4f, 1.3f);
        }

        if (random.nextFloat() < 0.15f) {
            target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DEEP_SHACKLES, 100, 0));
        }

        if (random.nextFloat() < 0.15f) {
            target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ABYSS_TOUCH, 140, 0));
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
            return 5.5f;
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
