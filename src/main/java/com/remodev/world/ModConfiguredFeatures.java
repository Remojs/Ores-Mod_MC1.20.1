package com.remodev.world;

import com.remodev.PentacraftOres;
import com.remodev.blocks.Ores;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> ZAMBONIUM_ORE_STONE_KEY = registerKey("zambonium_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZAMBONIUM_ORE_NETHERRACK_KEY = registerKey("zambonium_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZAMBONIUM_ORE_ENDSTONE_KEY = registerKey("zambonium_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> ROBERTIUM_ORE_STONE_KEY = registerKey("robertium_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROBERTIUM_ORE_NETHERRACK_KEY = registerKey("robertium_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROBERTIUM_ORE_ENDSTONE_KEY = registerKey("robertium_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> KEVINIUM_ORE_STONE_KEY = registerKey("kevinium_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KEVINIUM_ORE_NETHERRACK_KEY = registerKey("kevinium_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KEVINIUM_ORE_ENDSTONE_KEY = registerKey("kevinium_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> JUANITIUM_ORE_STONE_KEY = registerKey("juanitium_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUANITIUM_ORE_NETHERRACK_KEY = registerKey("juanitium_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUANITIUM_ORE_ENDSTONE_KEY = registerKey("juanitium_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PANCHIUM_ORE_STONE_KEY = registerKey("panchium_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PANCHIUM_ORE_NETHERRACK_KEY = registerKey("panchium_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PANCHIUM_ORE_ENDSTONE_KEY = registerKey("panchium_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> SARITE_ORE_STONE_KEY = registerKey("sarite_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SARITE_ORE_NETHERRACK_KEY = registerKey("sarite_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SARITE_ORE_ENDSTONE_KEY = registerKey("sarite_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> LUKITE_ORE_STONE_KEY = registerKey("lukite_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUKITE_ORE_NETHERRACK_KEY = registerKey("lukite_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUKITE_ORE_ENDSTONE_KEY = registerKey("lukite_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TOMINITE_ORE_STONE_KEY = registerKey("tominite_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOMINITE_ORE_NETHERRACK_KEY = registerKey("tominite_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOMINITE_ORE_ENDSTONE_KEY = registerKey("tominite_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PENTACRAFTIUM_ORE_STONE_KEY = registerKey("pentacraftium_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PENTACRAFTIUM_ORE_NETHERRACK_KEY = registerKey("pentacraftium_netherrack_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PENTACRAFTIUM_ORE_ENDSTONE_KEY = registerKey("pentacraftium_endstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> STELLAR_MARBLE_STONE_KEY = registerKey("stellar_marble_stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FULGURATION_STONE_KEY = registerKey("fulguration_stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CAVE_MUD_KEY = registerKey("cave_mud_block");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEGINNING_STONE_KEY = registerKey("beginning_stone");

    public static final RegistryKey<ConfiguredFeature<?, ?>> QUASAR_KEY = registerKey("quasar_stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUANTUM_KEY = registerKey("quantum_stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_MATTER_KEY = registerKey("dark_matter_stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FRACTAL_KEY = registerKey("fractal_stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AURORA_KEY = registerKey("aurora_stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GAMMA_KEY = registerKey("gamma_stone");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldZamboniumPentacraftiumOres =  List.of(OreFeatureConfig.createTarget(stoneReplacables, Ores.ZAMBONIUM_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.ZAMBONIUM_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldRobertiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.ROBERTIUM_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.ROBERTIUM_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldKeviniumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.KEVINIUM_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.KEVINIUM_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldJuanitiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.JUANITIUM_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.JUANITIUM_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldPanchiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.PANCHIUM_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.PANCHIUM_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldSaritePentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.SARITE_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.SARITE_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldLukitePentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.LUKITE_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.LUKITE_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldTominitePentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.TOMINITE_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.TOMINITE_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldStellarMarblePentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.STELLAR_MARBLE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.STELLAR_MARBLE_STONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldFulgurationPentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.FULGURATION_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.FULGURATION_STONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> overworldCaveMudPentacraftiumOres = List.of( OreFeatureConfig.createTarget(stoneReplacables, Ores.CAVE_MUD_BLOCK.getLeft().getDefaultState()),  OreFeatureConfig.createTarget(deepslateReplacables, Ores.CAVE_MUD_BLOCK.getLeft().getDefaultState()) );


        List<OreFeatureConfig.Target> netherZamboniumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.ZAMBONIUM_ORE_NETHERRACK.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> netherRobertiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.ROBERTIUM_ORE_NETHERRACK.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> netherKeviniumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.KEVINIUM_ORE_NETHERRACK.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> netherJuanitiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.JUANITIUM_ORE_NETHERRACK.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> netherPanchiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.PANCHIUM_ORE_NETHERRACK.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> netherSaritePentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.SARITE_ORE_NETHERRACK.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> netherLukitePentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.LUKITE_ORE_NETHERRACK.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> netherTominitePentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.TOMINITE_ORE_NETHERRACK.getLeft().getDefaultState()));


        List<OreFeatureConfig.Target> endZamboniumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.ZAMBONIUM_ORE_ENDSTONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endRobertiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.ROBERTIUM_ORE_ENDSTONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endKeviniumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.KEVINIUM_ORE_ENDSTONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endJuanitiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.JUANITIUM_ORE_ENDSTONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endPanchiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.PANCHIUM_ORE_ENDSTONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endSaritePentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.SARITE_ORE_ENDSTONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endLukitePentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.LUKITE_ORE_ENDSTONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endTominitePentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.TOMINITE_ORE_ENDSTONE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endBeginningPentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.BEGINNING_STONE.getLeft().getDefaultState()));

        List<OreFeatureConfig.Target> overworldPentacraftiumPentacraftiumOres =  List.of(OreFeatureConfig.createTarget(stoneReplacables, Ores.PENTACRAFTIUM_ORE_STONE.getLeft().getDefaultState()), OreFeatureConfig.createTarget(deepslateReplacables, Ores.PENTACRAFTIUM_ORE_DEEPSLATE.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> netherPentacraftiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(netherReplacables, Ores.PENTACRAFTIUM_ORE_NETHERRACK.getLeft().getDefaultState()));
        List<OreFeatureConfig.Target> endPentacraftiumPentacraftiumOres = List.of( OreFeatureConfig.createTarget(endReplacables, Ores.PENTACRAFTIUM_ORE_ENDSTONE.getLeft().getDefaultState()));



        register(context, ZAMBONIUM_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldZamboniumPentacraftiumOres, 4));
        register(context, ZAMBONIUM_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherZamboniumPentacraftiumOres, 4));
        register(context, ZAMBONIUM_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endZamboniumPentacraftiumOres, 4));

        register(context, ROBERTIUM_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldRobertiumPentacraftiumOres, 4));
        register(context, ROBERTIUM_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherRobertiumPentacraftiumOres, 4));
        register(context, ROBERTIUM_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endRobertiumPentacraftiumOres, 4));

        register(context, KEVINIUM_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldKeviniumPentacraftiumOres, 4));
        register(context, KEVINIUM_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherKeviniumPentacraftiumOres, 4));
        register(context, KEVINIUM_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endKeviniumPentacraftiumOres, 4));

        register(context, JUANITIUM_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldJuanitiumPentacraftiumOres, 4));
        register(context, JUANITIUM_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherJuanitiumPentacraftiumOres, 4));
        register(context, JUANITIUM_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endJuanitiumPentacraftiumOres, 4));

        register(context, PANCHIUM_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldPanchiumPentacraftiumOres, 4));
        register(context, PANCHIUM_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherPanchiumPentacraftiumOres, 4));
        register(context, PANCHIUM_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endPanchiumPentacraftiumOres, 4));

        register(context, SARITE_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldSaritePentacraftiumOres, 4));
        register(context, SARITE_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherSaritePentacraftiumOres, 4));
        register(context, SARITE_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endSaritePentacraftiumOres, 4));

        register(context, LUKITE_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldLukitePentacraftiumOres, 4));
        register(context, LUKITE_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherLukitePentacraftiumOres, 4));
        register(context, LUKITE_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endLukitePentacraftiumOres, 4));

        register(context, TOMINITE_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldTominitePentacraftiumOres, 4));
        register(context, TOMINITE_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherTominitePentacraftiumOres, 4));
        register(context, TOMINITE_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endTominitePentacraftiumOres, 4));

        register(context, PENTACRAFTIUM_ORE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldPentacraftiumPentacraftiumOres, 6));
        register(context, PENTACRAFTIUM_ORE_NETHERRACK_KEY, Feature.ORE, new OreFeatureConfig(netherPentacraftiumPentacraftiumOres, 6));
        register(context, PENTACRAFTIUM_ORE_ENDSTONE_KEY, Feature.ORE, new OreFeatureConfig(endPentacraftiumPentacraftiumOres, 6));

        register(context, STELLAR_MARBLE_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldStellarMarblePentacraftiumOres, 32));
        register(context, FULGURATION_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldFulgurationPentacraftiumOres, 32));
        register(context, CAVE_MUD_KEY, Feature.ORE, new OreFeatureConfig(overworldCaveMudPentacraftiumOres, 32));
        register(context, BEGINNING_STONE_KEY, Feature.ORE, new OreFeatureConfig(endBeginningPentacraftiumOres, 24));

        register(context, QUANTUM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Ores.QUANTUM_LOG.getLeft()),
                new StraightTrunkPlacer(7, 4 , 2),
                BlockStateProvider.of(Ores.QUANTUM_LEAVES.getLeft()),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());


        register(context, QUASAR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Ores.QUASAR_LOG.getLeft()),
                new StraightTrunkPlacer(3, 1 , 0),
                BlockStateProvider.of(Ores.QUASAR_LEAVES.getLeft()),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(2), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, DARK_MATTER_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Ores.DARK_MATTER_LOG.getLeft()),
                new StraightTrunkPlacer(4, 1 , 3),
                BlockStateProvider.of(Ores.DARK_MATTER_LEAVES.getLeft()),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());


        register(context, FRACTAL_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Ores.FRACTAL_LOG.getLeft()),
                new StraightTrunkPlacer(4, 2 , 3),
                BlockStateProvider.of(Ores.FRACTAL_LEAVES.getLeft()),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GAMMA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Ores.GAMMA_LOG.getLeft()),
                new StraightTrunkPlacer(4, 2 , 3),
                BlockStateProvider.of(Ores.GAMMA_LEAVES.getLeft()),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, AURORA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Ores.AURORA_LOG.getLeft()),
                new StraightTrunkPlacer(4, 2 , 3),
                BlockStateProvider.of(Ores.AURORA_LEAVES.getLeft()),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());


    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(PentacraftOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
