package com.remodev;

import com.remodev.blocks.Ores;
import com.remodev.items.ModItemGroup;
import com.remodev.items.Moditems;
import com.remodev.items.custom.tools.HammerUsageEvent;
import com.remodev.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import com.remodev.statuseffects.ModStatusEffects;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PentacraftOres implements ModInitializer {
	public static final String MOD_ID = "pentacraft-ores";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static MinecraftServer SERVER = null;

	@Override
	public void onInitialize() {
		Moditems.registerItems();
		ModItemGroup.registerItemGroup();
		Ores.registerBlocks();
		ModStatusEffects.registerEffects();
		ModSounds.registerSounds();
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		ServerLifecycleEvents.SERVER_STARTING.register(server -> SERVER = server);
	}
}