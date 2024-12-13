package com.remodev.world.gen;

import com.remodev.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {

    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_ZAMBONIUM_ORE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_ROBERTIUM_ORE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_KEVINIUM_ORE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_JUANITIUM_ORE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_PANCHIUM_ORE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_SARITE_ORE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_LUKITE_ORE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_TOMINITE_ORE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_PENTACRAFTIUM_ORE_STONE_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_ZAMBONIUM_ORE_NETHERRACK_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_ROBERTIUM_ORE_NETHERRACK_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_KEVINIUM_ORE_NETHERRACK_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_JUANITIUM_ORE_NETHERRACK_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_PANCHIUM_ORE_NETHERRACK_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_SARITE_ORE_NETHERRACK_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_LUKITE_ORE_NETHERRACK_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_TOMINITE_ORE_NETHERRACK_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_PENTACRAFTIUM_ORE_NETHERRACK_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_ZAMBONIUM_ORE_ENDSTONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_ROBERTIUM_ORE_ENDSTONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_KEVINIUM_ORE_ENDSTONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_JUANITIUM_ORE_ENDSTONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_PANCHIUM_ORE_ENDSTONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_SARITE_ORE_ENDSTONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_LUKITE_ORE_ENDSTONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_TOMINITE_ORE_ENDSTONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_PENTACRAFTIUM_ORE_ENDSTONE_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_STELLAR_MARBLE_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_FULGURATION_STONE_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_CAVE_MUD_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PLACED_BEGINNING_STONE_KEY);


    }

}
