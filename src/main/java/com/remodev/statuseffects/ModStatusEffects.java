package com.remodev.statuseffects;

import com.remodev.PentacraftOres;
import com.remodev.statuseffects.armor_effects.*;
import com.remodev.statuseffects.armor_boost.*;
import com.remodev.statuseffects.sword_effect.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {

    //SWORD EFFECTS
    public static StatusEffect ELECTROPARALYSIS;
    public static StatusEffect ELECTROSHOCK;
    public static StatusEffect DEEP_SHACKLES;
    public static StatusEffect WIND_TOUCH;
    public static StatusEffect ETERNAL_FIRE;
    public static StatusEffect DEATH_TOUCH;
    public static StatusEffect DIMENSIONAL_ANOMALY;
    public static StatusEffect WORLD_ESSENCE;
    public static StatusEffect CURSED_TOUCH;
    public static StatusEffect ABYSS_TOUCH;

    //ARMOR EFFECTS
    public static StatusEffect DIMENSIONAL_MISMATCH;
    public static StatusEffect MYSTIC_AWAKENING;
    public static StatusEffect CELESTIAL_DOMAIN;
    public static StatusEffect DARK_RESURRECTION;
    public static StatusEffect ELECTRIC_ASCENT;
    public static StatusEffect LAST_ASCENCION;
    public static StatusEffect WATER_BOOST;
    public static StatusEffect FIRE_BOOST;
    public static StatusEffect LAND_BLESSING;
    public static StatusEffect DRAGON_BOOST;

    public static StatusEffect ZAMBONIUM_BOOST;
    public static StatusEffect ROBERTIUM_BOOST;
    public static StatusEffect KEVINIUM_BOOST;
    public static StatusEffect JUANITIUM_BOOST;
    public static StatusEffect PANCHIUM_BOOST;
    public static StatusEffect SARITE_BOOST;
    public static StatusEffect LUKITE_BOOST;
    public static StatusEffect TOMINITE_BOOST;


    public static void registerEffects() {
        //Sword Effects
        ABYSS_TOUCH= registerEffect("abyss_touch", new AbyssTouch());
        DEEP_SHACKLES = registerEffect("deep_shackles", new DeepShackles());
        WIND_TOUCH = registerEffect("wind_touch", new WindTouch());
        DIMENSIONAL_ANOMALY = registerEffect("dimensional_anomaly", new DimensionalAnomaly());
        CURSED_TOUCH= registerEffect("cursed_touch", new CursedTouch());
        ELECTROPARALYSIS = registerEffect("electroparalysis", new ElectroparalysisEffect());
        ELECTROSHOCK = registerEffect("electroshock", new Electroshock());
        ETERNAL_FIRE = registerEffect("eternal_fire", new EternalFire());
        WORLD_ESSENCE = registerEffect("world_essence", new WorldEssence());
        DEATH_TOUCH = registerEffect("death_touch", new DeathTouch());

        //Armor Effects
        CELESTIAL_DOMAIN = registerEffect("celestial_domain", new CelestialDomain());
        DIMENSIONAL_MISMATCH = registerEffect("dimensional_mismatch", new DimensionalMismatch());
        MYSTIC_AWAKENING = registerEffect("mystic_awakening", new MysticAwakening());
        DARK_RESURRECTION = registerEffect("dark_resurrection", new DarkResurrection());
        ELECTRIC_ASCENT = registerEffect("electric_ascent", new ElectricAscent());
        LAST_ASCENCION = registerEffect("last_ascencion", new LastAscencion());
        WATER_BOOST = registerEffect("water_boost", new WaterBoost());
        FIRE_BOOST = registerEffect("fire_boost", new FireBoost());
        LAND_BLESSING = registerEffect("land_blessing", new LandBlessing());
        DRAGON_BOOST = registerEffect("dragon_boost", new DragonBoost());

        //Armor Boost
        ZAMBONIUM_BOOST = registerEffect("zambonium_boost", new ZamboniumBoost());
        ROBERTIUM_BOOST = registerEffect("robertium_boost", new RobertiumBoost());
        KEVINIUM_BOOST = registerEffect("kevinium_boost", new KeviniumBoost());
        JUANITIUM_BOOST = registerEffect("juanitium_boost", new JuanitiumBoost());
        PANCHIUM_BOOST = registerEffect("panchium_boost", new PanchiumBoost());
        SARITE_BOOST = registerEffect("sarite_boost", new SariteBoost());
        LUKITE_BOOST = registerEffect("lukite_boost", new LukiteBoost());
        TOMINITE_BOOST = registerEffect("tominite_boost", new TominiteBoost());


    }

    private static StatusEffect registerEffect(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(PentacraftOres.MOD_ID, name), effect);
    }
}
