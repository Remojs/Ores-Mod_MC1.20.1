package com.remodev;

import com.remodev.datagen.DatagenLootTableProvider;
import com.remodev.datagen.DatagenModelProvider;
import com.remodev.datagen.DatagenRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PentacraftOresDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(DatagenModelProvider::new);
		pack.addProvider(DatagenLootTableProvider::new);
		pack.addProvider(DatagenRecipeProvider::new);
	}
}
