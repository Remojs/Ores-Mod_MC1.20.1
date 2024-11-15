package com.remodev;

import com.remodev.blocks.Ores;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class PentacraftOresClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.FRACTAL_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUANTUM_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUASAR_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.DARK_MATTER_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.FRACTAL_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.FRACTAL_TRAPDOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUASAR_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUASAR_TRAPDOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUANTUM_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUANTUM_TRAPDOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.DARK_MATTER_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.DARK_MATTER_TRAPDOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.PENTACRAFTIUM_GLASS.getLeft(), RenderLayer.getTranslucent());
	}
}
