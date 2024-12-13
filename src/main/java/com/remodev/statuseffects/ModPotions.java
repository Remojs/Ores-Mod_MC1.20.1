package com.remodev.statuseffects;

import com.remodev.PentacraftOres;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {


    public static final RegistryEntry<Potion> ABYSS_TOUCH_POTION = registerPotion("abysstouchpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.ABYSS_TOUCH,630,0)));
    public static final RegistryEntry<Potion> WATER_BOOST_POTION = registerPotion("waterboostpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.WATER_BOOST,630,0)));
    public static final RegistryEntry<Potion> DEEP_SHACKLES_POTION = registerPotion("deepshacklespotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.DEEP_SHACKLES,630,0)));

    public static final RegistryEntry<Potion> WIND_TOUCH_POTION = registerPotion("windtouchpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.WIND_TOUCH,630,0)));
    public static final RegistryEntry<Potion> LAST_ASCENCION_POTION = registerPotion("lastascencionpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.LAST_ASCENCION,630,0)));
    public static final RegistryEntry<Potion> CELESTIAL_DOMAIN_POTION = registerPotion("celestialdomainpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.CELESTIAL_DOMAIN,630,0)));

    public static final RegistryEntry<Potion> DIMENSIONAL_MISMATCH_POTION = registerPotion("dimensionalmismatchpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.DIMENSIONAL_MISMATCH,630,0)));
    public static final RegistryEntry<Potion> DIMENSIONAL_ANOMALY_POTION = registerPotion("dimensionalanomalypotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.DIMENSIONAL_ANOMALY,630,0)));
    public static final RegistryEntry<Potion> DRAGON_BOOST_POTION = registerPotion("dragonboostpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.DRAGON_BOOST,630,0)));

    public static final RegistryEntry<Potion> MYSTIC_AWAKENING_POTION = registerPotion("mysticawakeningpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.MYSTIC_AWAKENING,630,0)));
    public static final RegistryEntry<Potion> CURSED_TOUCH_POTION = registerPotion("cursedtouchpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.CURSED_TOUCH,630,0)));

    public static final RegistryEntry<Potion> ELECTROPARALYSIS_POTION = registerPotion("electroparalysispotion",
      new Potion(new StatusEffectInstance(ModStatusEffects.ELECTROPARALYSIS,630,0)));
    public static final RegistryEntry<Potion> ELECTRIC_ASCENT_POTION = registerPotion("electricascentpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.ELECTRIC_ASCENT,630,0)));
    public static final RegistryEntry<Potion> ELECTROSHOCK_POTION = registerPotion("electroshockpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.ELECTROSHOCK,630,0)));

    public static final RegistryEntry<Potion> FIRE_BOOST_POTION = registerPotion("fireboostpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.FIRE_BOOST,630,0)));
    public static final RegistryEntry<Potion> ETERNAL_FIRE_POTION = registerPotion("eternalfirepotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.ETERNAL_FIRE,630,0)));

    public static final RegistryEntry<Potion> LAND_BLESSING_POTION = registerPotion("landblessingpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.LAND_BLESSING,630,0)));
    public static final RegistryEntry<Potion> WORLD_ESSENCE_POTION = registerPotion("worldessencepotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.WORLD_ESSENCE,630,0)));

    public static final RegistryEntry<Potion> DARK_RESURRECTION_POTION = registerPotion("darkresurrectionpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.DARK_RESURRECTION,630,0)));
    public static final RegistryEntry<Potion> DEATH_TOUCH_POTION = registerPotion("deathtouchpotion",
            new Potion(new StatusEffectInstance(ModStatusEffects.DEATH_TOUCH,630,0)));


    private static RegistryEntry<Potion> registerPotion(String potionId, Potion potion) {
        RegistryEntry<Potion> potionRegistryEntry = Registry.registerReference(
                Registries.POTION,
                new Identifier(PentacraftOres.MOD_ID, potionId),
                potion
        );
        return potionRegistryEntry;
    }



    public static void registerPotions() {
        PentacraftOres.LOGGER.info("Registrando Pociones");
    }
}
