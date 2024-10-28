package com.remodev.items.custom.swords;

import com.remodev.items.Moditems;
import com.remodev.sound.ModSounds;
import com.remodev.statuseffects.sword_effect.DimensionalAnomaly;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class CustomSwordSarite extends SwordItem {
    private final Random random = new Random();

    public CustomSwordSarite(Item.Settings settings) {
        super(new CustomToolMaterial(), 4, -2.2f, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip").formatted(Formatting.LIGHT_PURPLE));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.tooltip2").formatted(Formatting.LIGHT_PURPLE));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom.sarite").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.sarite_sword_dragonecho").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_sword.sarite_sword_dimensionalcontrol").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = target.getWorld();

        // 10% de probabilidad de aplicar el efecto DimensionalAnomaly por 4s
        if (!world.isClient && random.nextFloat() < 0.10f) {
            target.addStatusEffect(new StatusEffectInstance(DimensionalAnomaly.DIMENSIONAL_ANOMALY, 80, 0));
        }

        // 5% de probabilidad de generar el aliento de dragón en un área 3x3
        if (!world.isClient && random.nextFloat() < 0.05f && attacker instanceof PlayerEntity) {
            applyDragonBreathEffect(target.getBlockPos(), world);
        }
        world.playSound(null, target.getBlockPos(), ModSounds.DIMENSIONALSWOOSH, SoundCategory.PLAYERS, 0.3f, 1.0f);

        return super.postHit(stack, target, attacker);
    }

    private void applyDragonBreathEffect(BlockPos pos, World world) {
        AreaEffectCloudEntity cloud = new AreaEffectCloudEntity(world, pos.getX(), pos.getY(), pos.getZ());
        cloud.setRadius(3.0f); // Radio del área afectada
        cloud.setDuration(200); // Duración en ticks (120 ticks = 6 segundos)
        cloud.setParticleType(ParticleTypes.DRAGON_BREATH); // Partículas del aliento de dragón
        cloud.addEffect(new StatusEffectInstance(DimensionalAnomaly.DIMENSIONAL_ANOMALY, 60, 1)); // Pone el efecto por 3s

        world.spawnEntity(cloud); // Generar la nube de aliento de dragón
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
            return 4.5f;
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
