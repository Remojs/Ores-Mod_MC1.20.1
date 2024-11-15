package com.remodev.blocks;

import com.remodev.PentacraftOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.block.*;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class Ores {

    public static final Pair<Block, Item> ZAMBONIUM_ORE_STONE = registerBlock("zambonium_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> ZAMBONIUM_ORE_DEEPSLATE = registerBlock("zambonium_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> ZAMBONIUM_ORE_ENDSTONE = registerBlock("zambonium_ore_endstone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> ZAMBONIUM_ORE_NETHERRACK = registerBlock("zambonium_ore_netherrack", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> ZAMBONIUM_BLOCK = registerBlock("zambonium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> ZAMBONIUM_SHARD_BLOCK = registerBlock("zambonium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> ROBERTIUM_ORE_STONE = registerBlock("robertium_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> ROBERTIUM_ORE_DEEPSLATE = registerBlock("robertium_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> ROBERTIUM_ORE_ENDSTONE = registerBlock("robertium_ore_endstone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> ROBERTIUM_ORE_NETHERRACK = registerBlock("robertium_ore_netherrack", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> ROBERTIUM_BLOCK = registerBlock("robertium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> ROBERTIUM_SHARD_BLOCK = registerBlock("robertium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> PANCHIUM_ORE_STONE = registerBlock("panchium_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> PANCHIUM_ORE_DEEPSLATE = registerBlock("panchium_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> PANCHIUM_ORE_ENDSTONE = registerBlock("panchium_ore_endstone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> PANCHIUM_ORE_NETHERRACK = registerBlock("panchium_ore_netherrack", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> PANCHIUM_BLOCK = registerBlock("panchium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> PANCHIUM_SHARD_BLOCK = registerBlock("panchium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> KEVINIUM_ORE_STONE = registerBlock("kevinium_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> KEVINIUM_ORE_DEEPSLATE = registerBlock("kevinium_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> KEVINIUM_ORE_ENDSTONE = registerBlock("kevinium_ore_endstone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> KEVINIUM_ORE_NETHERRACK = registerBlock("kevinium_ore_netherrack", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> KEVINIUM_BLOCK = registerBlock("kevinium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> KEVINIUM_SHARD_BLOCK = registerBlock("kevinium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> SARITE_ORE_STONE = registerBlock("sarite_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> SARITE_ORE_DEEPSLATE = registerBlock("sarite_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> SARITE_ORE_ENDSTONE = registerBlock("sarite_ore_endstone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> SARITE_ORE_NETHERRACK = registerBlock("sarite_ore_netherrack", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> SARITE_BLOCK = registerBlock("sarite_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> SARITE_SHARD_BLOCK = registerBlock("sarite_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> TOMINITE_ORE_STONE = registerBlock("tominite_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> TOMINITE_ORE_DEEPSLATE = registerBlock("tominite_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> TOMINITE_ORE_ENDSTONE = registerBlock("tominite_ore_endstone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> TOMINITE_ORE_NETHERRACK = registerBlock("tominite_ore_netherrack", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> TOMINITE_BLOCK = registerBlock("tominite_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> TOMINITE_SHARD_BLOCK = registerBlock("tominite_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> LUKITE_ORE_STONE = registerBlock("lukite_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> LUKITE_ORE_DEEPSLATE = registerBlock("lukite_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> LUKITE_ORE_ENDSTONE = registerBlock("lukite_ore_endstone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> LUKITE_ORE_NETHERRACK = registerBlock("lukite_ore_netherrack", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> LUKITE_BLOCK = registerBlock("lukite_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> LUKITE_SHARD_BLOCK = registerBlock("lukite_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> JUANITIUM_ORE_STONE = registerBlock("juanitium_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> JUANITIUM_ORE_DEEPSLATE = registerBlock("juanitium_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> JUANITIUM_ORE_ENDSTONE = registerBlock("juanitium_ore_endstone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> JUANITIUM_ORE_NETHERRACK = registerBlock("juanitium_ore_netherrack", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 6)));
    public static final Pair<Block, Item> JUANITIUM_BLOCK = registerBlock("juanitium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> JUANITIUM_SHARD_BLOCK = registerBlock("juanitium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> PENTACRAFTIUM_ORE_STONE = registerBlock("pentacraftium_ore_stone", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 4)));
    public static final Pair<Block, Item> PENTACRAFTIUM_ORE_DEEPSLATE = registerBlock("pentacraftium_ore_deepslate", new ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(2, 4)));
    public static final Pair<Block, Item> PENTACRAFTIUM_BLOCK = registerBlock("pentacraftium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));

    public static final Pair<Block, Item> FULGURATION_STONE = registerBlock("fulguration_stone", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> FULGURATION_COBBLESTONE = registerBlock("fulguration_cobblestone", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> FULGURATION_COBBLESTONE_STAIRS = registerBlock("fulguration_cobblestone_stairs", new StairsBlock(FULGURATION_COBBLESTONE.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> FULGURATION_COBBLESTONE_SLAB = registerBlock("fulguration_cobblestone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));
    public static final Pair<Block, Item> FULGURATION_BRICKS = registerBlock("fulguration_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> FULGURATION_BRICKS_STAIRS = registerBlock("fulguration_bricks_stairs", new StairsBlock(FULGURATION_BRICKS.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> FULGURATION_BRICKS_SLAB = registerBlock("fulguration_bricks_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));
    public static final Pair<Block, Item> FULGURATION_SMOOTH = registerBlock("fulguration_smooth", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> FULGURATION_SMOOTH_STAIRS = registerBlock("fulguration_smooth_stairs", new StairsBlock(FULGURATION_SMOOTH.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> FULGURATION_SMOOTH_SLAB = registerBlock("fulguration_smooth_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> STELLAR_MARBLE_STONE = registerBlock("stellar_marble_stone", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> STELLAR_MARBLE_COBBLESTONE = registerBlock("stellar_marble_cobblestone", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> STELLAR_MARBLE_COBBLESTONE_STAIRS = registerBlock("stellar_marble_cobblestone_stairs", new StairsBlock(STELLAR_MARBLE_COBBLESTONE.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> STELLAR_MARBLE_COBBLESTONE_SLAB = registerBlock("stellar_marble_cobblestone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));
    public static final Pair<Block, Item> STELLAR_MARBLE_BRICKS = registerBlock("stellar_marble_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> STELLAR_MARBLE_BRICKS_STAIRS = registerBlock("stellar_marble_bricks_stairs", new StairsBlock(STELLAR_MARBLE_BRICKS.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> STELLAR_MARBLE_BRICKS_SLAB = registerBlock("stellar_marble_bricks_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));
    public static final Pair<Block, Item> STELLAR_MARBLE_SMOOTH = registerBlock("stellar_marble_smooth", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> STELLAR_MARBLE_SMOOTH_STAIRS = registerBlock("stellar_marble_smooth_stairs", new StairsBlock(STELLAR_MARBLE_SMOOTH.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> STELLAR_MARBLE_SMOOTH_SLAB = registerBlock("stellar_marble_smooth_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> CAVE_MUD_BLOCK = registerBlock("cave_mud_block", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> CAVE_MUD_BRICK = registerBlock("cave_mud_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> CAVE_MUD_BRICK_STAIRS = registerBlock("cave_mud_bricks_stairs", new StairsBlock(CAVE_MUD_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> CAVE_MUD_BRICK_SLAB = registerBlock("cave_mud_bricks_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));
    public static final Pair<Block, Item> CAVE_MUD_SMOOTH = registerBlock("cave_mud_smooth", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<Block, Item> CAVE_MUD_SMOOTH_STAIRS = registerBlock("cave_mud_smooth_stairs", new StairsBlock(CAVE_MUD_SMOOTH.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> CAVE_MUD_SMOOTH_SLAB = registerBlock("cave_mud_smooth_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> PENTACRAFTIUM_GLASS = registerBlock("pentacraftium_glass", new Block(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Pair<Block, Item> PENTACRAFTIUM_INFINITY_LANTERN = registerBlock("pentacraftium_infinity_lantern", new Block(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Pair<Block, Item> PENTACRAFTIUM_ORIGIN_LANTERN = registerBlock("pentacraftium_origin_lantern", new Block(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Pair<Block, Item> PENTACRAFTIUM_ETERNAL_LANTERN = registerBlock("pentacraftium_eternal_lantern", new Block(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
    public static final Pair<Block, Item> PENTACRAFTIUM_CUANTIC_LANTERN = registerBlock("pentacraftium_cuantic_lantern", new Block(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));



    public static final Pair<Block, Item> ZAMBONIUM_BRICK = registerBlock("zambonium_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Pair<Block, Item> ZAMBONIUM_BRICK_STAIRS = registerBlock("zambonium_brick_stairs", new StairsBlock(ZAMBONIUM_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> ZAMBONIUM_BRICK_SLAB = registerBlock("zambonium_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> ROBERTIUM_BRICK = registerBlock("robertium_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Pair<Block, Item> ROBERTIUM_BRICK_STAIRS = registerBlock("robertium_brick_stairs", new StairsBlock(ROBERTIUM_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> ROBERTIUM_BRICK_SLAB = registerBlock("robertium_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> KEVINIUM_BRICK = registerBlock("kevinium_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Pair<Block, Item> KEVINIUM_BRICK_STAIRS = registerBlock("kevinium_brick_stairs", new StairsBlock(KEVINIUM_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> KEVINIUM_BRICK_SLAB = registerBlock("kevinium_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> JUANITIUM_BRICK = registerBlock("juanitium_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Pair<Block, Item> JUANITIUM_BRICK_STAIRS = registerBlock("juanitium_brick_stairs", new StairsBlock(JUANITIUM_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> JUANITIUM_BRICK_SLAB = registerBlock("juanitium_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> PANCHIUM_BRICK = registerBlock("panchium_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Pair<Block, Item> PANCHIUM_BRICK_STAIRS = registerBlock("panchium_brick_stairs", new StairsBlock(PANCHIUM_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> PANCHIUM_BRICK_SLAB = registerBlock("panchium_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> SARITE_BRICK = registerBlock("sarite_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Pair<Block, Item> SARITE_BRICK_STAIRS = registerBlock("sarite_brick_stairs", new StairsBlock(SARITE_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> SARITE_BRICK_SLAB = registerBlock("sarite_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> LUKITE_BRICK = registerBlock("lukite_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Pair<Block, Item> LUKITE_BRICK_STAIRS = registerBlock("lukite_brick_stairs", new StairsBlock(LUKITE_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> LUKITE_BRICK_SLAB = registerBlock("lukite_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));

    public static final Pair<Block, Item> TOMINITE_BRICK = registerBlock("tominite_brick", new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Pair<Block, Item> TOMINITE_BRICK_STAIRS = registerBlock("tominite_brick_stairs", new StairsBlock(TOMINITE_BRICK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRICK_STAIRS)));
    public static final Pair<Block, Item> TOMINITE_BRICK_SLAB = registerBlock("tominite_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)));




    public static final Pair<Block, Item> FRACTAL_LOG = registerBlock("fractal_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Pair<Block, Item> FRACTAL_STRIPPED_LOG = registerBlock("fractal_stripped_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Pair<Block, Item> FRACTAL_PLANKS = registerBlock("fractal_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Pair<Block, Item> FRACTAL_PACKED_PLANKS = registerBlock("fractal_packed_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Pair<Block, Item> FRACTAL_LEAVES = registerBlock("fractal_leaves", new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Pair<Block, Item> FRACTAL_DOOR = registerBlock("fractal_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Pair<Block, Item> FRACTAL_TRAPDOOR = registerBlock("fractal_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR).nonOpaque(), BlockSetType.OAK));
    public static final Pair<Block, Item> FRACTAL_STAIRS = registerBlock("fractal_stairs", new StairsBlock(FRACTAL_PLANKS.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Pair<Block, Item> FRACTAL_SLAB = registerBlock("fractal_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Pair<Block, Item> FRACTAL_FENCE = registerBlock("fractal_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Pair<Block, Item> FRACTAL_FENCE_GATE = registerBlock("fractal_fence_gate",new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Pair<Block, Item> QUANTUM_LOG = registerBlock("quantum_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Pair<Block, Item> QUANTUM_STRIPPED_LOG = registerBlock("quantum_stripped_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Pair<Block, Item> QUANTUM_PLANKS = registerBlock("quantum_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Pair<Block, Item> QUANTUM_PACKED_PLANKS = registerBlock("quantum_packed_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Pair<Block, Item> QUANTUM_LEAVES = registerBlock("quantum_leaves", new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Pair<Block, Item> QUANTUM_DOOR = registerBlock("quantum_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Pair<Block, Item> QUANTUM_TRAPDOOR = registerBlock("quantum_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR).nonOpaque(), BlockSetType.OAK));
    public static final Pair<Block, Item> QUANTUM_STAIRS = registerBlock("quantum_stairs", new StairsBlock(QUANTUM_PLANKS.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Pair<Block, Item> QUANTUM_SLAB = registerBlock("quantum_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Pair<Block, Item> QUANTUM_FENCE = registerBlock("quantum_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Pair<Block, Item> QUANTUM_FENCE_GATE = registerBlock("quantum_fence_gate",new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Pair<Block, Item> QUASAR_LOG = registerBlock("quasar_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Pair<Block, Item> QUASAR_STRIPPED_LOG = registerBlock("quasar_stripped_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Pair<Block, Item> QUASAR_PLANKS = registerBlock("quasar_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Pair<Block, Item> QUASAR_PACKED_PLANKS = registerBlock("quasar_packed_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Pair<Block, Item> QUASAR_LEAVES = registerBlock("quasar_leaves", new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Pair<Block, Item> QUASAR_DOOR = registerBlock("quasar_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Pair<Block, Item> QUASAR_TRAPDOOR = registerBlock("quasar_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR).nonOpaque(), BlockSetType.OAK));
    public static final Pair<Block, Item> QUASAR_STAIRS = registerBlock("quasar_stairs", new StairsBlock(QUASAR_PLANKS.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Pair<Block, Item> QUASAR_SLAB = registerBlock("quasar_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Pair<Block, Item> QUASAR_FENCE = registerBlock("quasar_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Pair<Block, Item> QUASAR_FENCE_GATE = registerBlock("quasar_fence_gate",new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Pair<Block, Item> DARK_MATTER_LOG = registerBlock("dark_matter_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Pair<Block, Item> DARK_MATTER_STRIPPED_LOG = registerBlock("dark_matter_stripped_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Pair<Block, Item> DARK_MATTER_PLANKS = registerBlock("dark_matter_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Pair<Block, Item> DARK_MATTER_PACKED_PLANKS = registerBlock("dark_matter_packed_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Pair<Block, Item> DARK_MATTER_LEAVES = registerBlock("dark_matter_leaves", new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Pair<Block, Item> DARK_MATTER_DOOR = registerBlock("dark_matter_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR).nonOpaque(), BlockSetType.OAK));
    public static final Pair<Block, Item> DARK_MATTER_TRAPDOOR = registerBlock("dark_matter_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR).nonOpaque(), BlockSetType.OAK));
    public static final Pair<Block, Item> DARK_MATTER_STAIRS = registerBlock("dark_matter_stairs", new StairsBlock(DARK_MATTER_PLANKS.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Pair<Block, Item> DARK_MATTER_SLAB = registerBlock("dark_matter_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Pair<Block, Item> DARK_MATTER_FENCE = registerBlock("dark_matter_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Pair<Block, Item> DARK_MATTER_FENCE_GATE = registerBlock("dark_matter_fence_gate",new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));


    private static Pair<Block, Item> registerBlock(String name, Block block){
        return new Pair<>(
                Registry.register(Registries.BLOCK, new Identifier(PentacraftOres.MOD_ID, name), block),
                Registry.register(Registries.ITEM, new Identifier(PentacraftOres.MOD_ID, name), new BlockItem(block, new FabricItemSettings()))
        );
    }


    public static void registerBlocks(){PentacraftOres.LOGGER.info("registrando bloques...");}
}
