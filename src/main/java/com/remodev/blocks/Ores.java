package com.remodev.blocks;

import com.remodev.PentacraftOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.text.Text;

public class Ores {

    public static final Pair<Block, Item> ZAMBONIUM_ORE_STONE = registerBlock("zambonium_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> ZAMBONIUM_ORE_DEEPSLATE = registerBlock("zambonium_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> ZAMBONIUM_ORE_ENDSTONE = registerBlock("zambonium_ore_endstone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> ZAMBONIUM_ORE_NETHERRACK = registerBlock("zambonium_ore_netherrack", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> ZAMBONIUM_BLOCK = registerBlock("zambonium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> ZAMBONIUM_SHARD_BLOCK = registerBlock("zambonium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> ROBERTIUM_ORE_STONE = registerBlock("robertium_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> ROBERTIUM_ORE_DEEPSLATE = registerBlock("robertium_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> ROBERTIUM_ORE_ENDSTONE = registerBlock("robertium_ore_endstone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> ROBERTIUM_ORE_NETHERRACK = registerBlock("robertium_ore_netherrack", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> ROBERTIUM_BLOCK = registerBlock("robertium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> ROBERTIUM_SHARD_BLOCK = registerBlock("robertium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> PANCHIUM_ORE_STONE = registerBlock("panchium_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> PANCHIUM_ORE_DEEPSLATE = registerBlock("panchium_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> PANCHIUM_ORE_ENDSTONE = registerBlock("panchium_ore_endstone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> PANCHIUM_ORE_NETHERRACK = registerBlock("panchium_ore_netherrack", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> PANCHIUM_BLOCK = registerBlock("panchium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> PANCHIUM_SHARD_BLOCK = registerBlock("panchium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> KEVINIUM_ORE_STONE = registerBlock("kevinium_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> KEVINIUM_ORE_DEEPSLATE = registerBlock("kevinium_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> KEVINIUM_ORE_ENDSTONE = registerBlock("kevinium_ore_endstone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> KEVINIUM_ORE_NETHERRACK = registerBlock("kevinium_ore_netherrack", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> KEVINIUM_BLOCK = registerBlock("kevinium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> KEVINIUM_SHARD_BLOCK = registerBlock("kevinium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> SARITE_ORE_STONE = registerBlock("sarite_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> SARITE_ORE_DEEPSLATE = registerBlock("sarite_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> SARITE_ORE_ENDSTONE = registerBlock("sarite_ore_endstone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> SARITE_ORE_NETHERRACK = registerBlock("sarite_ore_netherrack", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> SARITE_BLOCK = registerBlock("sarite_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> SARITE_SHARD_BLOCK = registerBlock("sarite_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> TOMINITE_ORE_STONE = registerBlock("tominite_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> TOMINITE_ORE_DEEPSLATE = registerBlock("tominite_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> TOMINITE_ORE_ENDSTONE = registerBlock("tominite_ore_endstone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> TOMINITE_ORE_NETHERRACK = registerBlock("tominite_ore_netherrack", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> TOMINITE_BLOCK = registerBlock("tominite_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> TOMINITE_SHARD_BLOCK = registerBlock("tominite_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> LUKITE_ORE_STONE = registerBlock("lukite_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> LUKITE_ORE_DEEPSLATE = registerBlock("lukite_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> LUKITE_ORE_ENDSTONE = registerBlock("lukite_ore_endstone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> LUKITE_ORE_NETHERRACK = registerBlock("lukite_ore_netherrack", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> LUKITE_BLOCK = registerBlock("lukite_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> LUKITE_SHARD_BLOCK = registerBlock("lukite_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> JUANITIUM_ORE_STONE = registerBlock("juanitium_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> JUANITIUM_ORE_DEEPSLATE = registerBlock("juanitium_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> JUANITIUM_ORE_ENDSTONE = registerBlock("juanitium_ore_endstone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> JUANITIUM_ORE_NETHERRACK = registerBlock("juanitium_ore_netherrack", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> JUANITIUM_BLOCK = registerBlock("juanitium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<Block, Item> JUANITIUM_SHARD_BLOCK = registerBlock("juanitium_shard_block", new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static final Pair<Block, Item> PENTACRAFTIUM_ORE_STONE = registerBlock("pentacraftium_ore_stone", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    public static final Pair<Block, Item> PENTACRAFTIUM_ORE_DEEPSLATE = registerBlock("pentacraftium_ore_deepslate", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));


    private static Pair<Block, Item> registerBlock(String name, Block block){
        return new Pair<>(
                Registry.register(Registries.BLOCK, new Identifier(PentacraftOres.MOD_ID, name), block),
                Registry.register(Registries.ITEM, new Identifier(PentacraftOres.MOD_ID, name), new BlockItem(block, new FabricItemSettings()))
        );
    }
    public static void registerBlocks(){PentacraftOres.LOGGER.info("registrando bloques...");}
}
