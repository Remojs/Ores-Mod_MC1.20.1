package com.remodev;

import com.remodev.blocks.Ores;
import com.remodev.custom.ModCustomTrades;
import com.remodev.datagen.ModWorldGenerator;
import com.remodev.items.ModItemGroup;
import com.remodev.items.Moditems;
import com.remodev.items.custom.ModFuel;
import com.remodev.items.custom.tools.HammerUsageEvent;
import com.remodev.sound.ModSounds;
import com.remodev.statuseffects.ModPotions;
import com.remodev.util.ModLootTableModifiers;
import com.remodev.villager.ModVillager;
import com.remodev.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import com.remodev.statuseffects.ModStatusEffects;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PentacraftOres implements ModInitializer {
	public static final String MOD_ID = "pentacraft-ores";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static MinecraftServer SERVER = null;

	@Override
	public void onInitialize() {
		ModStatusEffects.registerEffects();
		Moditems.registerItems();
		ModItemGroup.registerItemGroup();
		Ores.registerBlocks();
		ModSounds.registerSounds();
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
		ModFuel.registerFuel();
		ModVillager.registerVillager();
		ModPotions.registerPotions();
		ModCustomTrades.registerCustomTrades();
		ModLootTableModifiers.modifyLootTables();
		ServerLifecycleEvents.SERVER_STARTING.register(server -> SERVER = server);

		ModWorldGeneration.generateModWorldGen();

		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.FRAGMENTED_TRIDENT), ModPotions.ABYSS_TOUCH_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.WATER_CORE), ModPotions.WATER_BOOST_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.DEEP_SHACKLES), ModPotions.DEEP_SHACKLES_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.WIND_CHARGE), ModPotions.WIND_TOUCH_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.ELEMENTAL_FEATHER), ModPotions.LAST_ASCENCION_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.SKY_TRINKET), ModPotions.CELESTIAL_DOMAIN_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.END_RELIC), ModPotions.DIMENSIONAL_MISMATCH_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.CORRUPTED_EYE), ModPotions.DIMENSIONAL_ANOMALY_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.END_ESSENCE), ModPotions.DRAGON_BOOST_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.PENTANOMICON), ModPotions.MYSTIC_AWAKENING_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.MAGIC_BOOK), ModPotions.CURSED_TOUCH_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.THUNDER_FRAGMENT), ModPotions.ELECTROPARALYSIS_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.THUNDER_DUST), ModPotions.ELECTRIC_ASCENT_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.SPARK_BOTTLE), ModPotions.ELECTROSHOCK_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.FIRE_FUNGUS), ModPotions.FIRE_BOOST_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.PRIMAL_FLAME), ModPotions.ETERNAL_FIRE_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.EARTH_CLOVER), ModPotions.LAND_BLESSING_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.MOB_ESSENCE), ModPotions.WORLD_ESSENCE_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.DEATH_SCYTHE), ModPotions.DARK_RESURRECTION_POTION.value());
		FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, Ingredient.ofItems(Moditems.DEATH_CATALYST), ModPotions.DEATH_TOUCH_POTION.value());

	}
}