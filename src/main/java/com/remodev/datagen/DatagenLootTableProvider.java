package com.remodev.datagen;

import com.remodev.blocks.Ores;
import com.remodev.custom.TomatoCropBlock;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.AlternativeEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;


public class DatagenLootTableProvider extends FabricBlockLootTableProvider {

    public DatagenLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // Zambonium Ores
        addDrop(Ores.ZAMBONIUM_ORE_STONE.getLeft(), likeOreDrops(Ores.ZAMBONIUM_ORE_STONE.getLeft(), Moditems.ZAMBONIUM_SHARD));
        addDrop(Ores.ZAMBONIUM_ORE_DEEPSLATE.getLeft(), likeOreDrops(Ores.ZAMBONIUM_ORE_DEEPSLATE.getLeft(), Moditems.ZAMBONIUM_SHARD));
        addDrop(Ores.ZAMBONIUM_ORE_NETHERRACK.getLeft(), likeOreDrops(Ores.ZAMBONIUM_ORE_NETHERRACK.getLeft(), Moditems.ZAMBONIUM_SHARD));
        addDrop(Ores.ZAMBONIUM_ORE_ENDSTONE.getLeft(), likeOreDrops(Ores.ZAMBONIUM_ORE_ENDSTONE.getLeft(), Moditems.ZAMBONIUM_SHARD));

        // Robertium Ores
        addDrop(Ores.ROBERTIUM_ORE_STONE.getLeft(), likeOreDrops(Ores.ROBERTIUM_ORE_STONE.getLeft(), Moditems.ROBERTIUM_SHARD));
        addDrop(Ores.ROBERTIUM_ORE_DEEPSLATE.getLeft(), likeOreDrops(Ores.ROBERTIUM_ORE_DEEPSLATE.getLeft(), Moditems.ROBERTIUM_SHARD));
        addDrop(Ores.ROBERTIUM_ORE_NETHERRACK.getLeft(), likeOreDrops(Ores.ROBERTIUM_ORE_NETHERRACK.getLeft(), Moditems.ROBERTIUM_SHARD));
        addDrop(Ores.ROBERTIUM_ORE_ENDSTONE.getLeft(), likeOreDrops(Ores.ROBERTIUM_ORE_ENDSTONE.getLeft(), Moditems.ROBERTIUM_SHARD));

        // Kevinium Ores
        addDrop(Ores.KEVINIUM_ORE_STONE.getLeft(), likeOreDrops(Ores.KEVINIUM_ORE_STONE.getLeft(), Moditems.KEVINIUM_SHARD));
        addDrop(Ores.KEVINIUM_ORE_DEEPSLATE.getLeft(), likeOreDrops(Ores.KEVINIUM_ORE_DEEPSLATE.getLeft(), Moditems.KEVINIUM_SHARD));
        addDrop(Ores.KEVINIUM_ORE_NETHERRACK.getLeft(), likeOreDrops(Ores.KEVINIUM_ORE_NETHERRACK.getLeft(), Moditems.KEVINIUM_SHARD));
        addDrop(Ores.KEVINIUM_ORE_ENDSTONE.getLeft(), likeOreDrops(Ores.KEVINIUM_ORE_ENDSTONE.getLeft(), Moditems.KEVINIUM_SHARD));

        // Juanitium Ores
        addDrop(Ores.JUANITIUM_ORE_STONE.getLeft(), likeOreDrops(Ores.JUANITIUM_ORE_STONE.getLeft(), Moditems.JUANITIUM_SHARD));
        addDrop(Ores.JUANITIUM_ORE_DEEPSLATE.getLeft(), likeOreDrops(Ores.JUANITIUM_ORE_DEEPSLATE.getLeft(), Moditems.JUANITIUM_SHARD));
        addDrop(Ores.JUANITIUM_ORE_NETHERRACK.getLeft(), likeOreDrops(Ores.JUANITIUM_ORE_NETHERRACK.getLeft(), Moditems.JUANITIUM_SHARD));
        addDrop(Ores.JUANITIUM_ORE_ENDSTONE.getLeft(), likeOreDrops(Ores.JUANITIUM_ORE_ENDSTONE.getLeft(), Moditems.JUANITIUM_SHARD));

        // Panchium Ores
        addDrop(Ores.PANCHIUM_ORE_STONE.getLeft(), likeOreDrops(Ores.PANCHIUM_ORE_STONE.getLeft(), Moditems.PANCHIUM_SHARD));
        addDrop(Ores.PANCHIUM_ORE_DEEPSLATE.getLeft(), likeOreDrops(Ores.PANCHIUM_ORE_DEEPSLATE.getLeft(), Moditems.PANCHIUM_SHARD));
        addDrop(Ores.PANCHIUM_ORE_NETHERRACK.getLeft(), likeOreDrops(Ores.PANCHIUM_ORE_NETHERRACK.getLeft(), Moditems.PANCHIUM_SHARD));
        addDrop(Ores.PANCHIUM_ORE_ENDSTONE.getLeft(), likeOreDrops(Ores.PANCHIUM_ORE_ENDSTONE.getLeft(), Moditems.PANCHIUM_SHARD));

        // Sarite Ores
        addDrop(Ores.SARITE_ORE_STONE.getLeft(), likeOreDrops(Ores.SARITE_ORE_STONE.getLeft(), Moditems.SARITE_SHARD));
        addDrop(Ores.SARITE_ORE_DEEPSLATE.getLeft(), likeOreDrops(Ores.SARITE_ORE_DEEPSLATE.getLeft(), Moditems.SARITE_SHARD));
        addDrop(Ores.SARITE_ORE_NETHERRACK.getLeft(), likeOreDrops(Ores.SARITE_ORE_NETHERRACK.getLeft(), Moditems.SARITE_SHARD));
        addDrop(Ores.SARITE_ORE_ENDSTONE.getLeft(), likeOreDrops(Ores.SARITE_ORE_ENDSTONE.getLeft(), Moditems.SARITE_SHARD));

        // Lukite Ores
        addDrop(Ores.LUKITE_ORE_STONE.getLeft(), likeOreDrops(Ores.LUKITE_ORE_STONE.getLeft(), Moditems.LUKITE_SHARD));
        addDrop(Ores.LUKITE_ORE_DEEPSLATE.getLeft(), likeOreDrops(Ores.LUKITE_ORE_DEEPSLATE.getLeft(), Moditems.LUKITE_SHARD));
        addDrop(Ores.LUKITE_ORE_NETHERRACK.getLeft(), likeOreDrops(Ores.LUKITE_ORE_NETHERRACK.getLeft(), Moditems.LUKITE_SHARD));
        addDrop(Ores.LUKITE_ORE_ENDSTONE.getLeft(), likeOreDrops(Ores.LUKITE_ORE_ENDSTONE.getLeft(), Moditems.LUKITE_SHARD));

        // Tominite Ores
        addDrop(Ores.TOMINITE_ORE_STONE.getLeft(), likeOreDrops(Ores.TOMINITE_ORE_STONE.getLeft(), Moditems.TOMINITE_SHARD));
        addDrop(Ores.TOMINITE_ORE_DEEPSLATE.getLeft(), likeOreDrops(Ores.TOMINITE_ORE_DEEPSLATE.getLeft(), Moditems.TOMINITE_SHARD));
        addDrop(Ores.TOMINITE_ORE_NETHERRACK.getLeft(), likeOreDrops(Ores.TOMINITE_ORE_NETHERRACK.getLeft(), Moditems.TOMINITE_SHARD));
        addDrop(Ores.TOMINITE_ORE_ENDSTONE.getLeft(), likeOreDrops(Ores.TOMINITE_ORE_ENDSTONE.getLeft(), Moditems.TOMINITE_SHARD));

        addDrop(Ores.PENTACRAFTIUM_ORE_STONE.getLeft(), likePentacraftiumDrops(Ores.PENTACRAFTIUM_ORE_STONE.getLeft(), Moditems.PENTACRAFTIUM_DUST));
        addDrop(Ores.PENTACRAFTIUM_ORE_DEEPSLATE.getLeft(), likePentacraftiumDrops(Ores.PENTACRAFTIUM_ORE_DEEPSLATE.getLeft(), Moditems.PENTACRAFTIUM_DUST));
        addDrop(Ores.PENTACRAFTIUM_ORE_ENDSTONE.getLeft(), likePentacraftiumDrops(Ores.PENTACRAFTIUM_ORE_ENDSTONE.getLeft(), Moditems.PENTACRAFTIUM_DUST));
        addDrop(Ores.PENTACRAFTIUM_ORE_NETHERRACK.getLeft(), likePentacraftiumDrops(Ores.PENTACRAFTIUM_ORE_NETHERRACK.getLeft(), Moditems.PENTACRAFTIUM_DUST));

        addDrop(Ores.STELLAR_MARBLE_STONE.getLeft(), Ores.STELLAR_MARBLE_COBBLESTONE.getRight());
        addDrop(Ores.STELLAR_MARBLE_COBBLESTONE.getLeft());
        addDrop(Ores.STELLAR_MARBLE_COBBLESTONE_STAIRS.getLeft());
        addDrop(Ores.STELLAR_MARBLE_COBBLESTONE_SLAB.getLeft(), slabDrops(Ores.STELLAR_MARBLE_COBBLESTONE_SLAB.getLeft()));
        addDrop(Ores.STELLAR_MARBLE_SMOOTH.getLeft());
        addDrop(Ores.STELLAR_MARBLE_SMOOTH_STAIRS.getLeft());
        addDrop(Ores.STELLAR_MARBLE_SMOOTH_SLAB.getLeft(), slabDrops(Ores.STELLAR_MARBLE_SMOOTH_SLAB.getLeft()));
        addDrop(Ores.STELLAR_MARBLE_BRICKS.getLeft());
        addDrop(Ores.STELLAR_MARBLE_BRICKS_STAIRS.getLeft());
        addDrop(Ores.STELLAR_MARBLE_BRICKS_SLAB.getLeft(), slabDrops(Ores.STELLAR_MARBLE_BRICKS_SLAB.getLeft()));

        addDrop(Ores.FULGURATION_STONE.getLeft(), Ores.FULGURATION_COBBLESTONE.getRight());
        addDrop(Ores.FULGURATION_COBBLESTONE.getLeft());
        addDrop(Ores.FULGURATION_COBBLESTONE_STAIRS.getLeft());
        addDrop(Ores.FULGURATION_COBBLESTONE_SLAB.getLeft(), slabDrops(Ores.FULGURATION_COBBLESTONE_SLAB.getLeft()));
        addDrop(Ores.FULGURATION_SMOOTH.getLeft());
        addDrop(Ores.FULGURATION_SMOOTH_STAIRS.getLeft());
        addDrop(Ores.FULGURATION_SMOOTH_SLAB.getLeft(), slabDrops(Ores.FULGURATION_SMOOTH_SLAB.getLeft()));
        addDrop(Ores.FULGURATION_BRICKS.getLeft());
        addDrop(Ores.FULGURATION_BRICKS_STAIRS.getLeft());
        addDrop(Ores.FULGURATION_BRICKS_SLAB.getLeft(), slabDrops(Ores.FULGURATION_BRICKS_SLAB.getLeft()));

        addDrop(Ores.CAVE_MUD_BLOCK.getLeft());
        addDrop(Ores.CAVE_MUD_SMOOTH.getLeft());
        addDrop(Ores.CAVE_MUD_SMOOTH_STAIRS.getLeft());
        addDrop(Ores.CAVE_MUD_SMOOTH_SLAB.getLeft(), slabDrops(Ores.CAVE_MUD_SMOOTH_SLAB.getLeft()));
        addDrop(Ores.CAVE_MUD_BRICK.getLeft());
        addDrop(Ores.CAVE_MUD_BRICK_STAIRS.getLeft());
        addDrop(Ores.CAVE_MUD_BRICK_SLAB.getLeft(), slabDrops(Ores.CAVE_MUD_BRICK_SLAB.getLeft()));

        addDrop(Ores.BEGINNING_STONE.getLeft());
        addDrop(Ores.BEGINNING_STONE_BRICK.getLeft());
        addDrop(Ores.BEGINNING_STONE_BRICK_STAIRS.getLeft());
        addDrop(Ores.BEGINNING_STONE_BRICK_SLAB.getLeft(), slabDrops(Ores.BEGINNING_STONE_BRICK_SLAB.getLeft()));

        addDrop(Ores.PENTACRAFTIUM_GLASS.getLeft(), Moditems.PENTACRAFTIUM_DUST);

        addDrop(Ores.PENTACRAFTIUM_ORIGIN_LANTERN.getLeft());
        addDrop(Ores.PENTACRAFTIUM_ETERNAL_LANTERN.getLeft());
        addDrop(Ores.PENTACRAFTIUM_INFINITY_LANTERN.getLeft());
        addDrop(Ores.PENTACRAFTIUM_CUANTIC_LANTERN.getLeft());
        addDrop(Ores.PENTACRAFTIUM_BIG_BANG_LANTERN.getLeft());
        addDrop(Ores.PENTACRAFTIUM_ANTIMATTER_LANTERN.getLeft());


        addDrop(Ores.FRACTAL_LOG.getLeft());
        addDrop(Ores.FRACTAL_STRIPPED_LOG.getLeft());
        addDrop(Ores.FRACTAL_PLANKS.getLeft());
        addDrop(Ores.FRACTAL_PACKED_PLANKS.getLeft());
        addDrop(Ores.FRACTAL_STAIRS.getLeft());
        addDrop(Ores.FRACTAL_FENCE.getLeft());
        addDrop(Ores.FRACTAL_FENCE_GATE.getLeft());
        addDrop(Ores.FRACTAL_DOOR.getLeft(), doorDrops(Ores.FRACTAL_DOOR.getLeft()));
        addDrop(Ores.FRACTAL_SLAB.getLeft(), slabDrops(Ores.FRACTAL_SLAB.getLeft()));

        addDrop(Ores.QUASAR_LOG.getLeft());
        addDrop(Ores.QUASAR_STRIPPED_LOG.getLeft());
        addDrop(Ores.QUASAR_PLANKS.getLeft());
        addDrop(Ores.QUASAR_PACKED_PLANKS.getLeft());
        addDrop(Ores.QUASAR_STAIRS.getLeft());
        addDrop(Ores.QUASAR_FENCE.getLeft());
        addDrop(Ores.QUASAR_FENCE_GATE.getLeft());
        addDrop(Ores.QUASAR_DOOR.getLeft(), doorDrops(Ores.QUASAR_DOOR.getLeft()));
        addDrop(Ores.QUASAR_SLAB.getLeft(), slabDrops(Ores.QUASAR_SLAB.getLeft()));

        addDrop(Ores.QUANTUM_LOG.getLeft());
        addDrop(Ores.QUANTUM_STRIPPED_LOG.getLeft());
        addDrop(Ores.QUANTUM_PLANKS.getLeft());
        addDrop(Ores.QUANTUM_PACKED_PLANKS.getLeft());
        addDrop(Ores.QUANTUM_STAIRS.getLeft());
        addDrop(Ores.QUANTUM_FENCE.getLeft());
        addDrop(Ores.QUANTUM_FENCE_GATE.getLeft());
        addDrop(Ores.QUANTUM_DOOR.getLeft(), doorDrops(Ores.QUANTUM_DOOR.getLeft()));
        addDrop(Ores.QUANTUM_SLAB.getLeft(), slabDrops(Ores.QUANTUM_SLAB.getLeft()));

        addDrop(Ores.DARK_MATTER_LOG.getLeft());
        addDrop(Ores.DARK_MATTER_STRIPPED_LOG.getLeft());
        addDrop(Ores.DARK_MATTER_PLANKS.getLeft());
        addDrop(Ores.DARK_MATTER_PACKED_PLANKS.getLeft());
        addDrop(Ores.DARK_MATTER_STAIRS.getLeft());
        addDrop(Ores.DARK_MATTER_FENCE.getLeft());
        addDrop(Ores.DARK_MATTER_FENCE_GATE.getLeft());
        addDrop(Ores.DARK_MATTER_DOOR.getLeft(), doorDrops(Ores.DARK_MATTER_DOOR.getLeft()));
        addDrop(Ores.DARK_MATTER_SLAB.getLeft(), slabDrops(Ores.DARK_MATTER_SLAB.getLeft()));

        addDrop(Ores.GAMMA_LOG.getLeft());
        addDrop(Ores.GAMMA_STRIPPED_LOG.getLeft());
        addDrop(Ores.GAMMA_PLANKS.getLeft());
        addDrop(Ores.GAMMA_PACKED_PLANKS.getLeft());
        addDrop(Ores.GAMMA_STAIRS.getLeft());
        addDrop(Ores.GAMMA_FENCE.getLeft());
        addDrop(Ores.GAMMA_FENCE_GATE.getLeft());
        addDrop(Ores.GAMMA_DOOR.getLeft(), doorDrops(Ores.GAMMA_DOOR.getLeft()));
        addDrop(Ores.GAMMA_SLAB.getLeft(), slabDrops(Ores.GAMMA_SLAB.getLeft()));

        addDrop(Ores.AURORA_LOG.getLeft());
        addDrop(Ores.AURORA_STRIPPED_LOG.getLeft());
        addDrop(Ores.AURORA_PLANKS.getLeft());
        addDrop(Ores.AURORA_PACKED_PLANKS.getLeft());
        addDrop(Ores.AURORA_STAIRS.getLeft());
        addDrop(Ores.AURORA_FENCE.getLeft());
        addDrop(Ores.AURORA_FENCE_GATE.getLeft());
        addDrop(Ores.AURORA_DOOR.getLeft(), doorDrops(Ores.AURORA_DOOR.getLeft()));
        addDrop(Ores.AURORA_SLAB.getLeft(), slabDrops(Ores.AURORA_SLAB.getLeft()));


        addDrop(Ores.ZAMBONIUM_BLOCK.getLeft());
        addDrop(Ores.ZAMBONIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.ZAMBONIUM_BRICK.getLeft());
        addDrop(Ores.ZAMBONIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.ZAMBONIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.ZAMBONIUM_BRICK_SLAB.getLeft()));
        addDrop(Ores.ZAMBONIUM_CHISELED_BRICK.getLeft());


        addDrop(Ores.ROBERTIUM_BLOCK.getLeft());
        addDrop(Ores.ROBERTIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.ROBERTIUM_BRICK.getLeft());
        addDrop(Ores.ROBERTIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.ROBERTIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.ROBERTIUM_BRICK_SLAB.getLeft()));
        addDrop(Ores.ROBERTIUM_CHISELED_BRICK.getLeft());


        addDrop(Ores.KEVINIUM_BLOCK.getLeft());
        addDrop(Ores.KEVINIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.KEVINIUM_BRICK.getLeft());
        addDrop(Ores.KEVINIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.KEVINIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.KEVINIUM_BRICK_SLAB.getLeft()));
        addDrop(Ores.KEVINIUM_CHISELED_BRICK.getLeft());


        addDrop(Ores.JUANITIUM_BLOCK.getLeft());
        addDrop(Ores.JUANITIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.JUANITIUM_BRICK.getLeft());
        addDrop(Ores.JUANITIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.JUANITIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.JUANITIUM_BRICK_SLAB.getLeft()));
        addDrop(Ores.JUANITIUM_CHISELED_BRICK.getLeft());


        addDrop(Ores.PANCHIUM_BLOCK.getLeft());
        addDrop(Ores.PANCHIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.PANCHIUM_BRICK.getLeft());
        addDrop(Ores.PANCHIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.PANCHIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.PANCHIUM_BRICK_SLAB.getLeft()));
        addDrop(Ores.PANCHIUM_CHISELED_BRICK.getLeft());


        addDrop(Ores.SARITE_BLOCK.getLeft());
        addDrop(Ores.SARITE_SHARD_BLOCK.getLeft());
        addDrop(Ores.SARITE_BRICK.getLeft());
        addDrop(Ores.SARITE_BRICK_STAIRS.getLeft());
        addDrop(Ores.SARITE_BRICK_SLAB.getLeft(), slabDrops(Ores.SARITE_BRICK_SLAB.getLeft()));
        addDrop(Ores.SARITE_CHISELED_BRICK.getLeft());


        addDrop(Ores.LUKITE_BLOCK.getLeft());
        addDrop(Ores.LUKITE_SHARD_BLOCK.getLeft());
        addDrop(Ores.LUKITE_BRICK.getLeft());
        addDrop(Ores.LUKITE_BRICK_STAIRS.getLeft());
        addDrop(Ores.LUKITE_BRICK_SLAB.getLeft(), slabDrops(Ores.LUKITE_BRICK_SLAB.getLeft()));
        addDrop(Ores.LUKITE_CHISELED_BRICK.getLeft());


        addDrop(Ores.TOMINITE_BLOCK.getLeft());
        addDrop(Ores.TOMINITE_SHARD_BLOCK.getLeft());
        addDrop(Ores.TOMINITE_BRICK.getLeft());
        addDrop(Ores.TOMINITE_BRICK_STAIRS.getLeft());
        addDrop(Ores.TOMINITE_BRICK_SLAB.getLeft(), slabDrops(Ores.TOMINITE_BRICK_SLAB.getLeft()));
        addDrop(Ores.TOMINITE_CHISELED_BRICK.getLeft());


        addDrop(Ores.PENTACRAFTIUM_BLOCK.getLeft());

        addDrop(Ores.DARK_MATTER_LEAVES.getLeft(), leavesDrops(Ores.DARK_MATTER_LEAVES.getLeft(), Ores.DARK_MATTER_SAPLING, 0.0025f));
        addDrop(Ores.DARK_MATTER_SAPLING);

        addDrop(Ores.FRACTAL_LEAVES.getLeft(), leavesDrops(Ores.FRACTAL_LEAVES.getLeft(), Ores.FRACTAL_SAPLING, 0.0025f));
        addDrop(Ores.FRACTAL_SAPLING);

        addDrop(Ores.QUANTUM_LEAVES.getLeft(), leavesDrops(Ores.QUANTUM_LEAVES.getLeft(), Ores.QUANTUM_SAPLING, 0.0025f));
        addDrop(Ores.QUANTUM_SAPLING);

        addDrop(Ores.QUASAR_LEAVES.getLeft(), leavesDrops(Ores.QUASAR_LEAVES.getLeft(), Ores.QUASAR_SAPLING, 0.0025f));
        addDrop(Ores.QUASAR_SAPLING);

        addDrop(Ores.GAMMA_LEAVES.getLeft(), leavesDrops(Ores.GAMMA_LEAVES.getLeft(), Ores.GAMMA_SAPLING, 0.0025f));
        addDrop(Ores.GAMMA_SAPLING);

        addDrop(Ores.AURORA_LEAVES.getLeft(), leavesDrops(Ores.AURORA_LEAVES.getLeft(), Ores.AURORA_SAPLING, 0.0025f));
        addDrop(Ores.AURORA_SAPLING);

        addDrop(Ores.ASTRAL_BUSH);
        addDrop(Ores.BLOOD_FUNGUS);
        addDrop(Ores.COSMIC_SHADOW);
        addDrop(Ores.NEBULIGHT_BLOSSOM);
        addDrop(Ores.QUASAR_BUSH);
        addDrop(Ores.SUNFIRE_BUSH);
        addDrop(Ores.TEAR_OF_THE_NIGHT);
        addDrop(Ores.UMBRAROSE);
        addDrop(Ores.VOID_CROWN);
        addDrop(Ores.CRYSTAL_FLOWER);
        addDrop(Ores.LEECH_FLOWER);;

        addSilkTouchOrDefaultDrop(Ores.RED_VALLEY_GRASS, Ores.RED_VALLEY_GRASS, Blocks.DIRT);
        addSilkTouchOrDefaultDrop(Ores.VOID_GRASS, Ores.VOID_GRASS, Blocks.DIRT);
        addSilkTouchOrDefaultDrop(Ores.COSMIC_SHADOW_GRASS, Ores.COSMIC_SHADOW_GRASS, Blocks.DIRT);
        addSilkTouchOrDefaultDrop(Ores.QUASAR_FOREST_GRASS, Ores.QUASAR_FOREST_GRASS, Blocks.DIRT);

        BlockStatePropertyLootCondition.Builder tomatoBuilder = BlockStatePropertyLootCondition.builder(Ores.LUKI_TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(Ores.LUKI_TOMATO_CROP, cropDrops(Ores.LUKI_TOMATO_CROP, Moditems.LUKI_TOMATO, Moditems.TOMATO_SEED, tomatoBuilder));

        BlockStatePropertyLootCondition.Builder lettuceBuilder = BlockStatePropertyLootCondition.builder(Ores.ROBERT_LETUCCE_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(Ores.ROBERT_LETUCCE_CROP, cropDrops(Ores.ROBERT_LETUCCE_CROP, Moditems.ROBERT_LETUCCE, Moditems.LETUCCE_SEED, lettuceBuilder));

    }


    public LootTable.Builder likePentacraftiumDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                this.applyExplosionDecay(drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }

    public LootTable.Builder likeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                this.applyExplosionDecay(drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }

    private void addSilkTouchOrDefaultDrop(Block block, ItemConvertible silkTouchDrop, ItemConvertible normalDrop) {
        addDrop(block, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(
                                AlternativeEntry.builder(
                                        ItemEntry.builder(silkTouchDrop)
                                                .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create()
                                                        .enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1))))),
                                        ItemEntry.builder(normalDrop)
                                )
                        )
                )
        );
    }

}
