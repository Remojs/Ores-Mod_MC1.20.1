package com.remodev.datagen;

import com.remodev.PentacraftOres;
import com.remodev.blocks.Ores;
import com.remodev.custom.LetucceCropBlock;
import com.remodev.custom.TomatoCropBlock;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.data.client.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import org.intellij.lang.annotations.Identifier;

import javax.xml.crypto.Data;

public class DatagenModelProvider extends FabricModelProvider {

    public DatagenModelProvider(FabricDataOutput output){
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ZAMBONIUM_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ZAMBONIUM_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ZAMBONIUM_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ZAMBONIUM_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ZAMBONIUM_SHARD_BLOCK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ZAMBONIUM_BLOCK.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.JUANITIUM_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.JUANITIUM_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.JUANITIUM_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.JUANITIUM_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.JUANITIUM_SHARD_BLOCK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.JUANITIUM_BLOCK.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.TOMINITE_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.TOMINITE_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.TOMINITE_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.TOMINITE_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.TOMINITE_SHARD_BLOCK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.TOMINITE_BLOCK.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.LUKITE_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.LUKITE_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.LUKITE_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.LUKITE_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.LUKITE_SHARD_BLOCK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.LUKITE_BLOCK.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.SARITE_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.SARITE_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.SARITE_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.SARITE_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.SARITE_SHARD_BLOCK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.SARITE_BLOCK.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.KEVINIUM_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.KEVINIUM_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.KEVINIUM_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.KEVINIUM_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.KEVINIUM_SHARD_BLOCK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.KEVINIUM_BLOCK.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.PANCHIUM_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PANCHIUM_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PANCHIUM_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PANCHIUM_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PANCHIUM_SHARD_BLOCK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PANCHIUM_BLOCK.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.ROBERTIUM_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ROBERTIUM_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ROBERTIUM_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ROBERTIUM_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ROBERTIUM_SHARD_BLOCK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ROBERTIUM_BLOCK.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ORE_STONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ORE_DEEPSLATE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ORE_ENDSTONE.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ORE_NETHERRACK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_BLOCK.getLeft());

        BlockStateModelGenerator.BlockTexturePool stellarMarbleBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.STELLAR_MARBLE_BRICKS.getLeft());
        stellarMarbleBricksTexturePool.stairs(Ores.STELLAR_MARBLE_BRICKS_STAIRS.getLeft());
        stellarMarbleBricksTexturePool.slab(Ores.STELLAR_MARBLE_BRICKS_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool stellarMarbleSmoothTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.STELLAR_MARBLE_SMOOTH.getLeft());
        stellarMarbleSmoothTexturePool.stairs(Ores.STELLAR_MARBLE_SMOOTH_STAIRS.getLeft());
        stellarMarbleSmoothTexturePool.slab(Ores.STELLAR_MARBLE_SMOOTH_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool stellarMarbleCobblestoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.STELLAR_MARBLE_COBBLESTONE.getLeft());
        stellarMarbleCobblestoneTexturePool.stairs(Ores.STELLAR_MARBLE_COBBLESTONE_STAIRS.getLeft());
        stellarMarbleCobblestoneTexturePool.slab(Ores.STELLAR_MARBLE_COBBLESTONE_SLAB.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.STELLAR_MARBLE_STONE.getLeft());

        BlockStateModelGenerator.BlockTexturePool fulgurationBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.FULGURATION_BRICKS.getLeft());
        fulgurationBricksTexturePool.stairs(Ores.FULGURATION_BRICKS_STAIRS.getLeft());
        fulgurationBricksTexturePool.slab(Ores.FULGURATION_BRICKS_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool fulgurationSmoothTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.FULGURATION_SMOOTH.getLeft());
        fulgurationSmoothTexturePool.stairs(Ores.FULGURATION_SMOOTH_STAIRS.getLeft());
        fulgurationSmoothTexturePool.slab(Ores.FULGURATION_SMOOTH_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool fulgurationCobblestoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.FULGURATION_COBBLESTONE.getLeft());
        fulgurationCobblestoneTexturePool.stairs(Ores.FULGURATION_COBBLESTONE_STAIRS.getLeft());
        fulgurationCobblestoneTexturePool.slab(Ores.FULGURATION_COBBLESTONE_SLAB.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.FULGURATION_STONE.getLeft());

        BlockStateModelGenerator.BlockTexturePool caveMudSmoothTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.CAVE_MUD_SMOOTH.getLeft());
        caveMudSmoothTexturePool.stairs(Ores.CAVE_MUD_SMOOTH_STAIRS.getLeft());
        caveMudSmoothTexturePool.slab(Ores.CAVE_MUD_SMOOTH_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool caveMudBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.CAVE_MUD_BRICK.getLeft());
        caveMudBricksTexturePool.stairs(Ores.CAVE_MUD_BRICK_STAIRS.getLeft());
        caveMudBricksTexturePool.slab(Ores.CAVE_MUD_BRICK_SLAB.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.CAVE_MUD_BLOCK.getLeft());

        BlockStateModelGenerator.BlockTexturePool beginningStoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.BEGINNING_STONE_BRICK.getLeft());
        beginningStoneBricksTexturePool.stairs(Ores.BEGINNING_STONE_BRICK_STAIRS.getLeft());
        beginningStoneBricksTexturePool.slab(Ores.BEGINNING_STONE_BRICK_SLAB.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.BEGINNING_STONE.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.CAVE_MUD_CHISELED.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.FULGURATION_CHISELED.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.STELLAR_MARBLE_CHISELED.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.COSMIC_SHADOW_GRASS);
        blockStateModelGenerator.registerSimpleCubeAll(Ores.VOID_GRASS);
        blockStateModelGenerator.registerSimpleCubeAll(Ores.QUASAR_FOREST_GRASS);
        blockStateModelGenerator.registerSimpleCubeAll(Ores.RED_VALLEY_GRASS);


        BlockStateModelGenerator.BlockTexturePool zamboniumTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.ZAMBONIUM_BRICK.getLeft());
        zamboniumTexturePool.stairs(Ores.ZAMBONIUM_BRICK_STAIRS.getLeft());
        zamboniumTexturePool.slab(Ores.ZAMBONIUM_BRICK_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool robertiumTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.ROBERTIUM_BRICK.getLeft());
        robertiumTexturePool.stairs(Ores.ROBERTIUM_BRICK_STAIRS.getLeft());
        robertiumTexturePool.slab(Ores.ROBERTIUM_BRICK_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool keviniumTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.KEVINIUM_BRICK.getLeft());
        keviniumTexturePool.stairs(Ores.KEVINIUM_BRICK_STAIRS.getLeft());
        keviniumTexturePool.slab(Ores.KEVINIUM_BRICK_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool juanitiumTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.JUANITIUM_BRICK.getLeft());
        juanitiumTexturePool.stairs(Ores.JUANITIUM_BRICK_STAIRS.getLeft());
        juanitiumTexturePool.slab(Ores.JUANITIUM_BRICK_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool panchiumTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.PANCHIUM_BRICK.getLeft());
        panchiumTexturePool.stairs(Ores.PANCHIUM_BRICK_STAIRS.getLeft());
        panchiumTexturePool.slab(Ores.PANCHIUM_BRICK_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool sariteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.SARITE_BRICK.getLeft());
        sariteTexturePool.stairs(Ores.SARITE_BRICK_STAIRS.getLeft());
        sariteTexturePool.slab(Ores.SARITE_BRICK_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool lukiteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.LUKITE_BRICK.getLeft());
        lukiteTexturePool.stairs(Ores.LUKITE_BRICK_STAIRS.getLeft());
        lukiteTexturePool.slab(Ores.LUKITE_BRICK_SLAB.getLeft());
        BlockStateModelGenerator.BlockTexturePool tominiteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.TOMINITE_BRICK.getLeft());
        tominiteTexturePool.stairs(Ores.TOMINITE_BRICK_STAIRS.getLeft());
        tominiteTexturePool.slab(Ores.TOMINITE_BRICK_SLAB.getLeft());

        blockStateModelGenerator.registerSimpleCubeAll(Ores.ZAMBONIUM_CHISELED_BRICK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.ROBERTIUM_CHISELED_BRICK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.KEVINIUM_CHISELED_BRICK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.JUANITIUM_CHISELED_BRICK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PANCHIUM_CHISELED_BRICK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.SARITE_CHISELED_BRICK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.LUKITE_CHISELED_BRICK.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.TOMINITE_CHISELED_BRICK.getLeft());


        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_GLASS.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_INFINITY_LANTERN.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ORIGIN_LANTERN.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_CUANTIC_LANTERN.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ETERNAL_LANTERN.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_BIG_BANG_LANTERN.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ANTIMATTER_LANTERN.getLeft());

        blockStateModelGenerator.registerLog(Ores.FRACTAL_LOG.getLeft()) .log(Ores.FRACTAL_LOG.getLeft());
        blockStateModelGenerator.registerLog(Ores.FRACTAL_STRIPPED_LOG.getLeft()) .log(Ores.FRACTAL_STRIPPED_LOG.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.FRACTAL_PACKED_PLANKS.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.FRACTAL_LEAVES.getLeft());
        BlockStateModelGenerator.BlockTexturePool fractalTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.FRACTAL_PLANKS.getLeft());
        fractalTexturePool.stairs(Ores.FRACTAL_STAIRS.getLeft());
        fractalTexturePool.slab(Ores.FRACTAL_SLAB.getLeft());
        fractalTexturePool.fence(Ores.FRACTAL_FENCE.getLeft());
        fractalTexturePool.fenceGate(Ores.FRACTAL_FENCE_GATE.getLeft());
        blockStateModelGenerator.registerDoor(Ores.FRACTAL_DOOR.getLeft());
        blockStateModelGenerator.registerTrapdoor(Ores.FRACTAL_TRAPDOOR.getLeft());
        blockStateModelGenerator.registerTintableCross(Ores.FRACTAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(Ores.QUANTUM_LOG.getLeft()) .log(Ores.QUANTUM_LOG.getLeft());
        blockStateModelGenerator.registerLog(Ores.QUANTUM_STRIPPED_LOG.getLeft()) .log(Ores.QUANTUM_STRIPPED_LOG.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.QUANTUM_PACKED_PLANKS.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.QUANTUM_LEAVES.getLeft());
        BlockStateModelGenerator.BlockTexturePool quantumTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.QUANTUM_PLANKS.getLeft());
        quantumTexturePool.stairs(Ores.QUANTUM_STAIRS.getLeft());
        quantumTexturePool.slab(Ores.QUANTUM_SLAB.getLeft());
        quantumTexturePool.fence(Ores.QUANTUM_FENCE.getLeft());
        quantumTexturePool.fenceGate(Ores.QUANTUM_FENCE_GATE.getLeft());
        blockStateModelGenerator.registerDoor(Ores.QUANTUM_DOOR.getLeft());
        blockStateModelGenerator.registerTrapdoor(Ores.QUANTUM_TRAPDOOR.getLeft());
        blockStateModelGenerator.registerTintableCross(Ores.QUANTUM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(Ores.QUASAR_LOG.getLeft()) .log(Ores.QUASAR_LOG.getLeft());
        blockStateModelGenerator.registerLog(Ores.QUASAR_STRIPPED_LOG.getLeft()) .log(Ores.QUASAR_STRIPPED_LOG.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.QUASAR_PACKED_PLANKS.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.QUASAR_LEAVES.getLeft());
        BlockStateModelGenerator.BlockTexturePool quasarTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.QUASAR_PLANKS.getLeft());
        quasarTexturePool.stairs(Ores.QUASAR_STAIRS.getLeft());
        quasarTexturePool.slab(Ores.QUASAR_SLAB.getLeft());
        quasarTexturePool.fence(Ores.QUASAR_FENCE.getLeft());
        quasarTexturePool.fenceGate(Ores.QUASAR_FENCE_GATE.getLeft());
        blockStateModelGenerator.registerDoor(Ores.QUASAR_DOOR.getLeft());
        blockStateModelGenerator.registerTrapdoor(Ores.QUASAR_TRAPDOOR.getLeft());
        blockStateModelGenerator.registerTintableCross(Ores.QUASAR_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(Ores.DARK_MATTER_LOG.getLeft()) .log(Ores.DARK_MATTER_LOG.getLeft());
        blockStateModelGenerator.registerLog(Ores.DARK_MATTER_STRIPPED_LOG.getLeft()) .log(Ores.DARK_MATTER_STRIPPED_LOG.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.DARK_MATTER_PACKED_PLANKS.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.DARK_MATTER_LEAVES.getLeft());
        BlockStateModelGenerator.BlockTexturePool darkMatterTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.DARK_MATTER_PLANKS.getLeft());
        darkMatterTexturePool.stairs(Ores.DARK_MATTER_STAIRS.getLeft());
        darkMatterTexturePool.slab(Ores.DARK_MATTER_SLAB.getLeft());
        darkMatterTexturePool.fence(Ores.DARK_MATTER_FENCE.getLeft());
        darkMatterTexturePool.fenceGate(Ores.DARK_MATTER_FENCE_GATE.getLeft());
        blockStateModelGenerator.registerDoor(Ores.DARK_MATTER_DOOR.getLeft());
        blockStateModelGenerator.registerTrapdoor(Ores.DARK_MATTER_TRAPDOOR.getLeft());
        blockStateModelGenerator.registerTintableCross(Ores.DARK_MATTER_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(Ores.AURORA_LOG.getLeft()) .log(Ores.AURORA_LOG.getLeft());
        blockStateModelGenerator.registerLog(Ores.AURORA_STRIPPED_LOG.getLeft()) .log(Ores.AURORA_STRIPPED_LOG.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.AURORA_PACKED_PLANKS.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.AURORA_LEAVES.getLeft());
        BlockStateModelGenerator.BlockTexturePool auroraTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.AURORA_PLANKS.getLeft());
        auroraTexturePool.stairs(Ores.AURORA_STAIRS.getLeft());
        auroraTexturePool.slab(Ores.AURORA_SLAB.getLeft());
        auroraTexturePool.fence(Ores.AURORA_FENCE.getLeft());
        auroraTexturePool.fenceGate(Ores.AURORA_FENCE_GATE.getLeft());
        blockStateModelGenerator.registerDoor(Ores.AURORA_DOOR.getLeft());
        blockStateModelGenerator.registerTrapdoor(Ores.AURORA_TRAPDOOR.getLeft());
        blockStateModelGenerator.registerTintableCross(Ores.AURORA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(Ores.GAMMA_LOG.getLeft()) .log(Ores.GAMMA_LOG.getLeft());
        blockStateModelGenerator.registerLog(Ores.GAMMA_STRIPPED_LOG.getLeft()) .log(Ores.GAMMA_STRIPPED_LOG.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.GAMMA_PACKED_PLANKS.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.GAMMA_LEAVES.getLeft());
        BlockStateModelGenerator.BlockTexturePool gammaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Ores.GAMMA_PLANKS.getLeft());
        gammaTexturePool.stairs(Ores.GAMMA_STAIRS.getLeft());
        gammaTexturePool.slab(Ores.GAMMA_SLAB.getLeft());
        gammaTexturePool.fence(Ores.GAMMA_FENCE.getLeft());
        gammaTexturePool.fenceGate(Ores.GAMMA_FENCE_GATE.getLeft());
        blockStateModelGenerator.registerDoor(Ores.GAMMA_DOOR.getLeft());
        blockStateModelGenerator.registerTrapdoor(Ores.GAMMA_TRAPDOOR.getLeft());
        blockStateModelGenerator.registerTintableCross(Ores.GAMMA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCrop(Ores.LUKI_TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(Ores.ROBERT_LETUCCE_CROP,  LetucceCropBlock.AGE, 0, 1, 2, 3, 4, 5);

        blockStateModelGenerator.registerFlowerPotPlant(Ores.ABYSS_CRY, Ores.POTTED_ABYSS_CRY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Ores.UMBRAROSE, Ores.POTTED_UMBRAROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Ores.VOID_CROWN, Ores.POTTED_VOID_CROWN, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(Ores.COSMIC_SHADOW, Ores.POTTED_COSMIC_SHADOW,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Ores.NEBULIGHT_BLOSSOM, Ores.POTTED_NEBULIGHT_BLOSSOM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Ores.TEAR_OF_THE_NIGHT, Ores.POTTED_TEAR_OF_THE_NIGHT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(Ores.CRYSTAL_FLOWER, Ores.POTTED_CRYSTAL_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Ores.QUASAR_BUSH, Ores.POTTED_QUASAR_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Ores.ASTRAL_BUSH, Ores.POTTED_ASTRAL_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(Ores.BLOOD_FUNGUS, Ores.POTTED_BLOOD_FUNGUS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Ores.LEECH_FLOWER, Ores.POTTED_LEECH_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Ores.SUNFIRE_BUSH, Ores.POTTED_SUNFIRE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator){

        itemModelGenerator.register(Moditems.ZAMBONIUM_INGOT , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_SHARD , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_HELMET , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_CHESTPLATE , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_LEGGINGS , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_BOOTS , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_PICKAXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_AXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_SHOVEL , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_SWORD , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_HOE , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_HAMMER , Models.GENERATED);
        itemModelGenerator.register(Moditems.ZAMBONIUM_GREAT_AXE , Models.GENERATED);

        itemModelGenerator.register(Moditems.ROBERTIUM_INGOT , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_SHARD , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_HELMET , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_CHESTPLATE , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_LEGGINGS , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_BOOTS , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_PICKAXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_AXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_SHOVEL , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_SWORD , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_HOE , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_HAMMER , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERTIUM_GREAT_AXE , Models.GENERATED);

        itemModelGenerator.register(Moditems.KEVINIUM_INGOT , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_SHARD , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_HELMET , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_CHESTPLATE , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_LEGGINGS , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_BOOTS , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_PICKAXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_AXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_SHOVEL , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_SWORD , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_HOE , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_HAMMER , Models.GENERATED);
        itemModelGenerator.register(Moditems.KEVINIUM_GREAT_AXE , Models.GENERATED);

        itemModelGenerator.register(Moditems.PANCHIUM_INGOT , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_SHARD , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_HELMET , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_CHESTPLATE , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_LEGGINGS , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_BOOTS , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_PICKAXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_AXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_SHOVEL , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_SWORD , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_HOE , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_HAMMER , Models.GENERATED);
        itemModelGenerator.register(Moditems.PANCHIUM_GREAT_AXE , Models.GENERATED);

        itemModelGenerator.register(Moditems.JUANITIUM_INGOT , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_SHARD , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_HELMET , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_CHESTPLATE , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_LEGGINGS , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_BOOTS , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_PICKAXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_AXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_SHOVEL , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_SWORD , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_HOE , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_HAMMER , Models.GENERATED);
        itemModelGenerator.register(Moditems.JUANITIUM_GREAT_AXE , Models.GENERATED);

        itemModelGenerator.register(Moditems.LUKITE_INGOT , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_SHARD , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_HELMET , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_CHESTPLATE , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_LEGGINGS , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_BOOTS , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_PICKAXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_AXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_SHOVEL , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_SWORD , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_HOE , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_HAMMER , Models.GENERATED);
        itemModelGenerator.register(Moditems.LUKITE_GREAT_AXE , Models.GENERATED);

        itemModelGenerator.register(Moditems.TOMINITE_INGOT , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_SHARD , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_HELMET , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_CHESTPLATE , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_LEGGINGS , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_BOOTS , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_PICKAXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_AXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_SHOVEL , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_SWORD , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_HOE , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_HAMMER , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMINITE_GREAT_AXE , Models.GENERATED);

        itemModelGenerator.register(Moditems.SARITE_INGOT , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_SHARD , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_HELMET , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_CHESTPLATE , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_LEGGINGS , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_BOOTS , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_PICKAXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_AXE , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_SHOVEL , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_SWORD , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_HOE , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_HAMMER , Models.GENERATED);
        itemModelGenerator.register(Moditems.SARITE_GREAT_AXE , Models.GENERATED);

        itemModelGenerator.register(Moditems.DRAGON_UPGRADE , Models.GENERATED);
        itemModelGenerator.register(Moditems.END_UPGRADE , Models.GENERATED);
        itemModelGenerator.register(Moditems.GUARDIAN_UPGRADE , Models.GENERATED);
        itemModelGenerator.register(Moditems.NETHER_UPGRADE , Models.GENERATED);
        itemModelGenerator.register(Moditems.WARDEN_UPGRADE , Models.GENERATED);
        itemModelGenerator.register(Moditems.WITHER_UPGRADE , Models.GENERATED);
        itemModelGenerator.register(Moditems.PENTACRAFT_BOOK , Models.GENERATED);
        itemModelGenerator.register(Moditems.PENTACRAFTIUM_CORE , Models.GENERATED);
        itemModelGenerator.register(Moditems.PENTACRAFTIUM_HEART , Models.GENERATED);
        itemModelGenerator.register(Moditems.PENTACRAFTIUM_DUST , Models.GENERATED);

        itemModelGenerator.register(Moditems.LUKI_TOMATO , Models.GENERATED);
        itemModelGenerator.register(Moditems.ROBERT_LETUCCE , Models.GENERATED);
        itemModelGenerator.register(Moditems.CHORIPAN_FOOD , Models.GENERATED);
        itemModelGenerator.register(Moditems.MATE_FOOD , Models.GENERATED);
        itemModelGenerator.register(Moditems.PATY_FOOD , Models.GENERATED);
        itemModelGenerator.register(Moditems.MONSTER_FOOD , Models.GENERATED);
        itemModelGenerator.register(Moditems.SPEED_FOOD , Models.GENERATED);
        itemModelGenerator.register(Moditems.BURGER_FOOD , Models.GENERATED);

        itemModelGenerator.register(Moditems.DISTORSION_EMERALD , Models.GENERATED);
        itemModelGenerator.register(Moditems.CORRUPTED_EMERALD , Models.GENERATED);
        itemModelGenerator.register(Moditems.CHAOTIC_EMERALD , Models.GENERATED);

        itemModelGenerator.register(Moditems.DEATH_CATALYST, Models.GENERATED);
        itemModelGenerator.register(Moditems.DEATH_SCYTHE, Models.GENERATED);
        itemModelGenerator.register(Moditems.DEEP_SHACKLES, Models.GENERATED);
        itemModelGenerator.register(Moditems.WATER_CORE, Models.GENERATED);
        itemModelGenerator.register(Moditems.FRAGMENTED_TRIDENT, Models.GENERATED);
        itemModelGenerator.register(Moditems.WIND_CHARGE, Models.GENERATED);
        itemModelGenerator.register(Moditems.ELEMENTAL_FEATHER, Models.GENERATED);
        itemModelGenerator.register(Moditems.SKY_TRINKET, Models.GENERATED);
        itemModelGenerator.register(Moditems.END_RELIC, Models.GENERATED);
        itemModelGenerator.register(Moditems.CORRUPTED_EYE, Models.GENERATED);
        itemModelGenerator.register(Moditems.END_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(Moditems.PENTANOMICON, Models.GENERATED);
        itemModelGenerator.register(Moditems.MAGIC_BOOK, Models.GENERATED);
        itemModelGenerator.register(Moditems.THUNDER_DUST, Models.GENERATED);
        itemModelGenerator.register(Moditems.THUNDER_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(Moditems.SPARK_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(Moditems.EARTH_CLOVER, Models.GENERATED);
        itemModelGenerator.register(Moditems.MOB_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(Moditems.PRIMAL_FLAME, Models.GENERATED);
        itemModelGenerator.register(Moditems.FIRE_FUNGUS, Models.GENERATED);

        itemModelGenerator.register(Moditems.CLEAN_SLOT, Models.GENERATED);


    }
}
