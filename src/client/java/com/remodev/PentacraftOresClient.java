package com.remodev;

import com.remodev.blocks.Ores;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class PentacraftOresClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.FRACTAL_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.FRACTAL_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUANTUM_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUANTUM_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUASAR_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUASAR_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.DARK_MATTER_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.DARK_MATTER_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.FRACTAL_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.FRACTAL_TRAPDOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUASAR_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUASAR_TRAPDOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUANTUM_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUANTUM_TRAPDOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.DARK_MATTER_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.DARK_MATTER_TRAPDOOR.getLeft(), RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(Ores.AURORA_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.AURORA_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.AURORA_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.AURORA_TRAPDOOR.getLeft(), RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(Ores.GAMMA_LEAVES.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.GAMMA_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.GAMMA_DOOR.getLeft(), RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.GAMMA_TRAPDOOR.getLeft(), RenderLayer.getCutout());



		BlockRenderLayerMap.INSTANCE.putBlock(Ores.ABYSS_CRY, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.ASTRAL_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.BLOOD_FUNGUS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.COSMIC_SHADOW, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.NEBULIGHT_BLOSSOM, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.QUASAR_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.SUNFIRE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.TEAR_OF_THE_NIGHT, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.UMBRAROSE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.VOID_CROWN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.CRYSTAL_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.LEECH_FLOWER, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_ABYSS_CRY, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_ASTRAL_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_BLOOD_FUNGUS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_COSMIC_SHADOW, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_NEBULIGHT_BLOSSOM, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_QUASAR_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_SUNFIRE_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_TEAR_OF_THE_NIGHT, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_UMBRAROSE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_VOID_CROWN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_CRYSTAL_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.POTTED_LEECH_FLOWER, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(Ores.ROBERT_LETUCCE_CROP, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Ores.LUKI_TOMATO_CROP, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(Ores.PENTACRAFTIUM_GLASS.getLeft(), RenderLayer.getTranslucent());
	}
}
