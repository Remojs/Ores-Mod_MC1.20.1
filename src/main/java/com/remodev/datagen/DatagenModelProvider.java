package com.remodev.datagen;

import com.remodev.blocks.Ores;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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
        itemModelGenerator.register(Moditems.PENTACRAFTIUM_DUST , Models.GENERATED);
    }
}
