package com.remodev.items.custom.greatAxe;

import com.remodev.items.Moditems;
import com.remodev.sound.ModSounds;
import com.remodev.statuseffects.sword_effect.DimensionalAnomaly;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class CustomSariteGreatAxe extends SwordItem {
    private final Random random = new Random();

    public CustomSariteGreatAxe(Settings settings) {
        super(new CustomToolMaterial(), 7, -3.0f, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_greataxe.tooltip").formatted(Formatting.LIGHT_PURPLE));
        tooltip.add(Text.translatable("item.pentacraft-ores.custom_greataxe.tooltip2").formatted(Formatting.LIGHT_PURPLE));
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

        if (!world.isClient && random.nextFloat() < 0.15f) {
            target.addStatusEffect(new StatusEffectInstance(DimensionalAnomaly.DIMENSIONAL_ANOMALY, 80, 0));
        }

        if (!world.isClient && random.nextFloat() < 0.15f && attacker instanceof PlayerEntity) {
            applyDragonBreathEffect(target.getBlockPos(), world);
        }
        world.playSound(null, target.getBlockPos(), ModSounds.DIMENSIONALSWOOSH, SoundCategory.PLAYERS, 0.3f, 1.3f);

        return super.postHit(stack, target, attacker);
    }

    private void applyDragonBreathEffect(BlockPos pos, World world) {
        AreaEffectCloudEntity cloud = new AreaEffectCloudEntity(world, pos.getX(), pos.getY(), pos.getZ());
        cloud.setRadius(3.0f);
        cloud.setDuration(200);
        cloud.setParticleType(ParticleTypes.DRAGON_BREATH);
        cloud.addEffect(new StatusEffectInstance(DimensionalAnomaly.DIMENSIONAL_ANOMALY, 60, 1));

        world.spawnEntity(cloud);
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
