package com.remodev.world;

import com.remodev.PentacraftOres;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> PLACED_ZAMBONIUM_ORE_STONE_KEY = registerKey("zambonium_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_ZAMBONIUM_ORE_NETHERRACK_KEY = registerKey("zambonium_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_ZAMBONIUM_ORE_ENDSTONE_KEY = registerKey("zambonium_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_ROBERTIUM_ORE_STONE_KEY = registerKey("robertium_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_ROBERTIUM_ORE_NETHERRACK_KEY = registerKey("robertium_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_ROBERTIUM_ORE_ENDSTONE_KEY = registerKey("robertium_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_KEVINIUM_ORE_STONE_KEY = registerKey("kevinium_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_KEVINIUM_ORE_NETHERRACK_KEY = registerKey("kevinium_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_KEVINIUM_ORE_ENDSTONE_KEY = registerKey("kevinium_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_JUANITIUM_ORE_STONE_KEY = registerKey("juanitium_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_JUANITIUM_ORE_NETHERRACK_KEY = registerKey("juanitium_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_JUANITIUM_ORE_ENDSTONE_KEY = registerKey("juanitium_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_PANCHIUM_ORE_STONE_KEY = registerKey("panchium_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_PANCHIUM_ORE_NETHERRACK_KEY = registerKey("panchium_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_PANCHIUM_ORE_ENDSTONE_KEY = registerKey("panchium_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_SARITE_ORE_STONE_KEY = registerKey("sarite_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_SARITE_ORE_NETHERRACK_KEY = registerKey("sarite_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_SARITE_ORE_ENDSTONE_KEY = registerKey("sarite_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_LUKITE_ORE_STONE_KEY = registerKey("lukite_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_LUKITE_ORE_NETHERRACK_KEY = registerKey("lukite_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_LUKITE_ORE_ENDSTONE_KEY = registerKey("lukite_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_TOMINITE_ORE_STONE_KEY = registerKey("tominite_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_TOMINITE_ORE_NETHERRACK_KEY = registerKey("tominite_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_TOMINITE_ORE_ENDSTONE_KEY = registerKey("tominite_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_PENTACRAFTIUM_ORE_STONE_KEY = registerKey("pentacraftium_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_PENTACRAFTIUM_ORE_NETHERRACK_KEY = registerKey("pentacraftium_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> PLACED_PENTACRAFTIUM_ORE_ENDSTONE_KEY = registerKey("pentacraftium_endstone_ore_placed");

    public static final RegistryKey<PlacedFeature> PLACED_STELLAR_MARBLE_STONE_KEY = registerKey("stellar_marble_stone_placed");
    public static final RegistryKey<PlacedFeature> PLACED_FULGURATION_STONE_KEY = registerKey("fulguration_stone_placed");
    public static final RegistryKey<PlacedFeature> PLACED_CAVE_MUD_KEY = registerKey("cave_mud_block_placed");
    public static final RegistryKey<PlacedFeature> PLACED_BEGINNING_STONE_KEY = registerKey("beginning_stone_placed");


    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PLACED_ZAMBONIUM_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ZAMBONIUM_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_ZAMBONIUM_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ZAMBONIUM_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_ZAMBONIUM_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ZAMBONIUM_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_ROBERTIUM_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ROBERTIUM_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_ROBERTIUM_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ROBERTIUM_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_ROBERTIUM_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ROBERTIUM_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_KEVINIUM_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.KEVINIUM_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_KEVINIUM_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.KEVINIUM_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_KEVINIUM_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.KEVINIUM_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_JUANITIUM_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JUANITIUM_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_JUANITIUM_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JUANITIUM_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_JUANITIUM_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JUANITIUM_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_PANCHIUM_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PANCHIUM_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_PANCHIUM_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PANCHIUM_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_PANCHIUM_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PANCHIUM_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_SARITE_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SARITE_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_SARITE_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SARITE_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_SARITE_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SARITE_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_LUKITE_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LUKITE_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_LUKITE_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LUKITE_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_LUKITE_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LUKITE_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_TOMINITE_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOMINITE_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_TOMINITE_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOMINITE_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_TOMINITE_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOMINITE_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(1, 2), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_PENTACRAFTIUM_ORE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PENTACRAFTIUM_ORE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(3, 4), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_PENTACRAFTIUM_ORE_NETHERRACK_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PENTACRAFTIUM_ORE_NETHERRACK_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(3, 4), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(70))));
        register(context, PLACED_PENTACRAFTIUM_ORE_ENDSTONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PENTACRAFTIUM_ORE_ENDSTONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(2, 3), HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(80))));

        register(context, PLACED_STELLAR_MARBLE_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STELLAR_MARBLE_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(5, 15), HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, PLACED_FULGURATION_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FULGURATION_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(5, 15), HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, PLACED_CAVE_MUD_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CAVE_MUD_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(10, 25), HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, PLACED_BEGINNING_STONE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BEGINNING_STONE_KEY),
                ModOrePlacement.modifiersWithCount(UniformIntProvider.create(20, 30), HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(PentacraftOres.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
