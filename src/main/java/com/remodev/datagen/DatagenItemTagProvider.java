package com.remodev.datagen;

import com.remodev.blocks.Ores;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class DatagenItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DatagenItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(Ores.DARK_MATTER_PLANKS.getRight().asItem())
                .add(Ores.QUANTUM_PLANKS.getRight().asItem())
                .add(Ores.FRACTAL_PLANKS.getRight().asItem())
                .add(Ores.QUASAR_PLANKS.getRight().asItem())
                .add(Ores.AURORA_PLANKS.getRight().asItem())
                .add(Ores.GAMMA_PLANKS.getRight().asItem())
                .add(Ores.DARK_MATTER_PACKED_PLANKS.getRight().asItem())
                .add(Ores.QUANTUM_PACKED_PLANKS.getRight().asItem())
                .add(Ores.FRACTAL_PACKED_PLANKS.getRight().asItem())
                .add(Ores.QUASAR_PACKED_PLANKS.getRight().asItem())
                .add(Ores.AURORA_PACKED_PLANKS.getRight().asItem())
                .add(Ores.GAMMA_PACKED_PLANKS.getRight().asItem());

    }
}