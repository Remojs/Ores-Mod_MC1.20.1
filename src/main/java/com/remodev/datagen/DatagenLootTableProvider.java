package com.remodev.datagen;

import com.remodev.blocks.Ores;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class DatagenLootTableProvider extends FabricBlockLootTableProvider {

    public DatagenLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Ores.ZAMBONIUM_ORE_STONE.getLeft(), drops(Moditems.ZAMBONIUM_SHARD));
    }
}
