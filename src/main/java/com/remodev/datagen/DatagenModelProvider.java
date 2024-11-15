package com.remodev.datagen;

import com.remodev.blocks.Ores;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

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

        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_GLASS.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_INFINITY_LANTERN.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ORIGIN_LANTERN.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_CUANTIC_LANTERN.getLeft());
        blockStateModelGenerator.registerSimpleCubeAll(Ores.PENTACRAFTIUM_ETERNAL_LANTERN.getLeft());

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
        itemModelGenerator.register(Moditems.LETUCCE_SEED , Models.GENERATED);
        itemModelGenerator.register(Moditems.TOMATO_SEED , Models.GENERATED);
        itemModelGenerator.register(Moditems.QUASAR_SAPLING , Models.GENERATED);
        itemModelGenerator.register(Moditems.DARK_MATTER_SAPLING , Models.GENERATED);
        itemModelGenerator.register(Moditems.QUANTUM_SAPLING , Models.GENERATED);
        itemModelGenerator.register(Moditems.FRACTAL_SAPLING , Models.GENERATED);

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

    }
}
