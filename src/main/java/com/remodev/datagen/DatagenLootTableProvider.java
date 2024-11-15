package com.remodev.datagen;

import com.remodev.blocks.Ores;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;


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

        addDrop(Ores.PENTACRAFTIUM_GLASS.getLeft(), Moditems.PENTACRAFTIUM_DUST);

        addDrop(Ores.PENTACRAFTIUM_ORIGIN_LANTERN.getLeft());
        addDrop(Ores.PENTACRAFTIUM_ETERNAL_LANTERN.getLeft());
        addDrop(Ores.PENTACRAFTIUM_INFINITY_LANTERN.getLeft());
        addDrop(Ores.PENTACRAFTIUM_CUANTIC_LANTERN.getLeft());

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


        addDrop(Ores.ZAMBONIUM_BLOCK.getLeft());
        addDrop(Ores.ZAMBONIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.ZAMBONIUM_BRICK.getLeft());
        addDrop(Ores.ZAMBONIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.ZAMBONIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.ZAMBONIUM_BRICK_SLAB.getLeft()));

        addDrop(Ores.ROBERTIUM_BLOCK.getLeft());
        addDrop(Ores.ROBERTIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.ROBERTIUM_BRICK.getLeft());
        addDrop(Ores.ROBERTIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.ROBERTIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.ROBERTIUM_BRICK_SLAB.getLeft()));

        addDrop(Ores.KEVINIUM_BLOCK.getLeft());
        addDrop(Ores.KEVINIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.KEVINIUM_BRICK.getLeft());
        addDrop(Ores.KEVINIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.KEVINIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.KEVINIUM_BRICK_SLAB.getLeft()));

        addDrop(Ores.JUANITIUM_BLOCK.getLeft());
        addDrop(Ores.JUANITIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.JUANITIUM_BRICK.getLeft());
        addDrop(Ores.JUANITIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.JUANITIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.JUANITIUM_BRICK_SLAB.getLeft()));

        addDrop(Ores.PANCHIUM_BLOCK.getLeft());
        addDrop(Ores.PANCHIUM_SHARD_BLOCK.getLeft());
        addDrop(Ores.PANCHIUM_BRICK.getLeft());
        addDrop(Ores.PANCHIUM_BRICK_STAIRS.getLeft());
        addDrop(Ores.PANCHIUM_BRICK_SLAB.getLeft(), slabDrops(Ores.PANCHIUM_BRICK_SLAB.getLeft()));

        addDrop(Ores.SARITE_BLOCK.getLeft());
        addDrop(Ores.SARITE_SHARD_BLOCK.getLeft());
        addDrop(Ores.SARITE_BRICK.getLeft());
        addDrop(Ores.SARITE_BRICK_STAIRS.getLeft());
        addDrop(Ores.SARITE_BRICK_SLAB.getLeft(), slabDrops(Ores.SARITE_BRICK_SLAB.getLeft()));

        addDrop(Ores.LUKITE_BLOCK.getLeft());
        addDrop(Ores.LUKITE_SHARD_BLOCK.getLeft());
        addDrop(Ores.LUKITE_BRICK.getLeft());
        addDrop(Ores.LUKITE_BRICK_STAIRS.getLeft());
        addDrop(Ores.LUKITE_BRICK_SLAB.getLeft(), slabDrops(Ores.LUKITE_BRICK_SLAB.getLeft()));

        addDrop(Ores.TOMINITE_BLOCK.getLeft());
        addDrop(Ores.TOMINITE_SHARD_BLOCK.getLeft());
        addDrop(Ores.TOMINITE_BRICK.getLeft());
        addDrop(Ores.TOMINITE_BRICK_STAIRS.getLeft());
        addDrop(Ores.TOMINITE_BRICK_SLAB.getLeft(), slabDrops(Ores.TOMINITE_BRICK_SLAB.getLeft()));

        addDrop(Ores.PENTACRAFTIUM_BLOCK.getLeft());
    }


    public LootTable.Builder likePentacraftiumDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                this.applyExplosionDecay(drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)))
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

}
