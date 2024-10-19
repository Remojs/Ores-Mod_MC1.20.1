package com.remodev.statuseffects;

import com.remodev.PentacraftOres;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {

    // Definimos la variable para el efecto
    public static StatusEffect ELECTROPARALYSIS;

    public static void registerEffects() {
        // Aquí registramos el efecto y lo asignamos a la variable
        ELECTROPARALYSIS = registerEffect("electroparalysis", new ElectroparalysisEffect());
    }

    private static StatusEffect registerEffect(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(PentacraftOres.MOD_ID, name), effect);
    }
}
