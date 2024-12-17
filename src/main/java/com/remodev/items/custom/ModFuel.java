package com.remodev.items.custom;

import com.remodev.blocks.Ores;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuel {
    public static void registerFuel() {
        FuelRegistry.INSTANCE.add(Moditems.PENTACRAFTIUM_DUST, 2800);
        FuelRegistry.INSTANCE.add(Ores.PENTACRAFTIUM_BLOCK.getRight(), 25500);

        FuelRegistry.INSTANCE.add(Ores.QUASAR_PLANKS.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.QUASAR_LOG.getRight(), 1200);
        FuelRegistry.INSTANCE.add(Ores.QUASAR_FENCE.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.QUASAR_DOOR.getRight(), 600);
        FuelRegistry.INSTANCE.add(Ores.QUASAR_STRIPPED_LOG.getRight(), 1200);
        FuelRegistry.INSTANCE.add(Ores.QUASAR_SLAB.getRight(), 150);
        FuelRegistry.INSTANCE.add(Ores.QUASAR_FENCE_GATE.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.QUASAR_STAIRS.getRight(), 450);

        FuelRegistry.INSTANCE.add(Ores.QUANTUM_PLANKS.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.QUANTUM_LOG.getRight(), 1200);
        FuelRegistry.INSTANCE.add(Ores.QUANTUM_FENCE.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.QUANTUM_DOOR.getRight(), 600);
        FuelRegistry.INSTANCE.add(Ores.QUANTUM_STRIPPED_LOG.getRight(), 1200);
        FuelRegistry.INSTANCE.add(Ores.QUANTUM_SLAB.getRight(), 150);
        FuelRegistry.INSTANCE.add(Ores.QUANTUM_FENCE_GATE.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.QUANTUM_STAIRS.getRight(), 450);

        FuelRegistry.INSTANCE.add(Ores.DARK_MATTER_PLANKS.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.DARK_MATTER_LOG.getRight(), 1200);
        FuelRegistry.INSTANCE.add(Ores.DARK_MATTER_FENCE.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.DARK_MATTER_DOOR.getRight(), 600);
        FuelRegistry.INSTANCE.add(Ores.DARK_MATTER_STRIPPED_LOG.getRight(), 1200);
        FuelRegistry.INSTANCE.add(Ores.DARK_MATTER_SLAB.getRight(), 150);
        FuelRegistry.INSTANCE.add(Ores.DARK_MATTER_FENCE_GATE.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.DARK_MATTER_STAIRS.getRight(), 450);

        FuelRegistry.INSTANCE.add(Ores.FRACTAL_PLANKS.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.FRACTAL_LOG.getRight(), 1200);
        FuelRegistry.INSTANCE.add(Ores.FRACTAL_FENCE.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.FRACTAL_DOOR.getRight(), 600);
        FuelRegistry.INSTANCE.add(Ores.FRACTAL_STRIPPED_LOG.getRight(), 1200);
        FuelRegistry.INSTANCE.add(Ores.FRACTAL_SLAB.getRight(), 150);
        FuelRegistry.INSTANCE.add(Ores.FRACTAL_FENCE_GATE.getRight(), 300);
        FuelRegistry.INSTANCE.add(Ores.FRACTAL_STAIRS.getRight(), 450);
    }
}
