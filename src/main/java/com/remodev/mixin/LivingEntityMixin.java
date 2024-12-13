package com.remodev.mixin;

import com.remodev.statuseffects.ModStatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import java.util.Random;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    private final Random random = new Random();

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void onDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity entity = (LivingEntity) (Object) this;
        Entity attacker = source.getAttacker();

        // =======================================================================================

        //dark resurrection - ZAMBONIUM
        if (entity.hasStatusEffect(ModStatusEffects.ZAMBONIUM_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.03) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DARK_RESURRECTION, 600, 0));
            }
        }
        //dark resurrection - ZAMBONIUM
        if (entity.hasStatusEffect(ModStatusEffects.ZAMBONIUM_BOOST)) {
            if (entity.getHealth() <= 6.0F) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.15) {
                    entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DARK_RESURRECTION, 600, 0));
                }
            }
        }
        //necro aura - ZAMBONIUM
        if (entity.hasStatusEffect(ModStatusEffects.ZAMBONIUM_BOOST)) {
            if (attacker instanceof LivingEntity livingAttacker) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.05) {
                    livingAttacker.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DEATH_TOUCH, 120, 0, false, false, true));
                }
            }
        }

        // =======================================================================================

        //fire boost - ROBERTIUM
        if (entity.hasStatusEffect(ModStatusEffects.ROBERTIUM_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.03) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.FIRE_BOOST, 300, 0, false, false, true));
            }
        }
        //fire boost core- ROBERTIUM
        if (entity.hasStatusEffect(ModStatusEffects.ROBERTIUM_BOOST)) {
            if (entity.getHealth() <= 6.0F) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.15) {
                    entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.FIRE_BOOST, 600, 0, false, false, true));

                }
            }
        }
        //lava mantle - ROBERTIUM
        if (entity.hasStatusEffect(ModStatusEffects.ROBERTIUM_BOOST)) {
            if (attacker instanceof LivingEntity livingAttacker) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.05) {
                    livingAttacker.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ETERNAL_FIRE, 120, 0, false, false, true));
                }
            }
        }

        // =======================================================================================

        //mystic awakening - KEVINIUM
        if (entity.hasStatusEffect(ModStatusEffects.KEVINIUM_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.03) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.MYSTIC_AWAKENING, 300, 0, false, false, true));
            }
        }
        //mystic awakening core - KEVINIUM
        if (entity.hasStatusEffect(ModStatusEffects.KEVINIUM_BOOST)) {
            if (entity.getHealth() <= 6.0F) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.15) {
                    entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.MYSTIC_AWAKENING, 600, 0, false, false, true));
                }
            }
        }
        //vital extension - KEVINIUM
        if (entity.hasStatusEffect(ModStatusEffects.KEVINIUM_BOOST)) {
            if (attacker instanceof LivingEntity livingAttacker) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.05) {
                    livingAttacker.addStatusEffect(new StatusEffectInstance(ModStatusEffects.CURSED_TOUCH, 120, 0, false, false, true));
                }
            }
        }

        // =======================================================================================

        // neptune blessing - JUANITIUM
        if (entity.hasStatusEffect(ModStatusEffects.JUANITIUM_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.03) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.WATER_BOOST, 300, 0, false, false, true));
            }
        }
        // neptune blessing core - JUANITIUM
        if (entity.hasStatusEffect(ModStatusEffects.JUANITIUM_BOOST)) {
            if (entity.getHealth() <= 6.0F) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.15) {
                    entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.WATER_BOOST, 600, 0, false, false, true));
                }
            }
        }
        // leviathan revenge - JUANITIUM
        if (entity.hasStatusEffect(ModStatusEffects.JUANITIUM_BOOST)) {
            if (attacker instanceof LivingEntity livingAttacker) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.05) {
                    livingAttacker.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ABYSS_TOUCH, 120, 0, false, false, true));
                }
            }
        }

        // =======================================================================================

        // electric ascent - PANCHIUM
        if (entity.hasStatusEffect(ModStatusEffects.PANCHIUM_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.03) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ELECTRIC_ASCENT, 300, 0, false, false, true));
            }
        }
        // electric ascent core - PANCHIUM
        if (entity.hasStatusEffect(ModStatusEffects.PANCHIUM_BOOST)) {
            if (entity.getHealth() <= 6.0F) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.15) {
                    entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.ELECTRIC_ASCENT, 600, 0, false, false, true));
                }
            }
        }
        // electrokinetic velocity - PANCHIUM
        if (entity.hasStatusEffect(ModStatusEffects.PANCHIUM_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.05) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 2, false, false, true));
            }
        }

        // =======================================================================================

        // dragon boost - SARITE
        if (entity.hasStatusEffect(ModStatusEffects.SARITE_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.03) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DRAGON_BOOST, 300, 0, false, false, true));
            }
        }
        // dragon boost core - SARITE
        if (entity.hasStatusEffect(ModStatusEffects.SARITE_BOOST)) {
            if (entity.getHealth() <= 6.0F) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.15) {
                    entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DRAGON_BOOST, 600, 0, false, false, true));
                }
            }
        }
        // dimensional protection - SARITE
        if (entity.hasStatusEffect(ModStatusEffects.SARITE_BOOST)) {
            if (attacker instanceof LivingEntity livingAttacker) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.05) {
                    livingAttacker.addStatusEffect(new StatusEffectInstance(ModStatusEffects.DIMENSIONAL_MISMATCH, 120, 0, false, false, true));
                }
            }
        }

        // =======================================================================================

        // land blessing - TOMINITE
        if (entity.hasStatusEffect(ModStatusEffects.TOMINITE_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.03) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.LAND_BLESSING, 300, 0, false, false, true));
            }
        }
        // iron skin core - TOMINITE
        if (entity.hasStatusEffect(ModStatusEffects.TOMINITE_BOOST)) {
            if (entity.getHealth() <= 6.0F) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.15) {
                    entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 2));
                }
            }
        }
        // iron skin - TOMINITE
        if (entity.hasStatusEffect(ModStatusEffects.TOMINITE_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.05) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 2, false, false, true));
            }
        }

        // =======================================================================================

        // last ascencion - LUKITE
        if (entity.hasStatusEffect(ModStatusEffects.LUKITE_BOOST)) {
            if (!entity.getWorld().isClient && random.nextFloat() < 0.03) {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.LAST_ASCENCION, 300, 0, false, false, true));
            }
        }
        // last ascencion core - LUKITE
        if (entity.hasStatusEffect(ModStatusEffects.LUKITE_BOOST)) {
            if (entity.getHealth() <= 6.0F) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.15) {
                    entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.LAST_ASCENCION, 600, 2));
                }
            }
        }
        // wind shield - LUKITE
        if (entity.hasStatusEffect(ModStatusEffects.LUKITE_BOOST)) {
            if (attacker instanceof LivingEntity livingAttacker) {
                if (!entity.getWorld().isClient && random.nextFloat() < 0.05) {
                    livingAttacker.addStatusEffect(new StatusEffectInstance(ModStatusEffects.WIND_TOUCH, 120, 0, false, false, true));
                }
            }
        }
    }
}
