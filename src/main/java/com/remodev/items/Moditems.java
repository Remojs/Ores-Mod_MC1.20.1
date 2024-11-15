package com.remodev.items;

import com.remodev.PentacraftOres;
import com.remodev.items.custom.greatAxe.*;
import com.remodev.items.custom.items.CustomRelic;
import com.remodev.items.custom.swords.*;
import com.remodev.items.custom.tools.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Moditems {

    private static final CustomToolMaterial PENTA = new CustomToolMaterial(
            3000, 12.5F, 5.0F, 4, 15);

    public static final Item DRAGON_UPGRADE = registerItem("dragon_upgrade", new Item(new FabricItemSettings()));
    public static final Item GUARDIAN_UPGRADE = registerItem("guardian_upgrade", new Item(new FabricItemSettings()));
    public static final Item WITHER_UPGRADE = registerItem("wither_upgrade", new Item(new FabricItemSettings()));
    public static final Item WARDEN_UPGRADE = registerItem("warden_upgrade", new Item(new FabricItemSettings()));
    public static final Item NETHER_UPGRADE = registerItem("nether_upgrade", new Item(new FabricItemSettings()));
    public static final Item END_UPGRADE = registerItem("end_upgrade", new Item(new FabricItemSettings()));

    public static final Item PENTACRAFT_BOOK = registerItem("pentacraft_book", new Item(new FabricItemSettings()));
    public static final Item PENTACRAFTIUM_HEART = registerItem("pentacraftium_heart", new Item(new FabricItemSettings()));
    public static final Item PENTACRAFTIUM_CORE = registerItem("pentacraftium_core", new Item(new FabricItemSettings()));

    public static final Item ZAMBONIUM_INGOT = registerItem("zambonium_ingot", new Item(new FabricItemSettings()));
    public static final Item ZAMBONIUM_SHARD = registerItem("zambonium_shard", new Item(new FabricItemSettings()));
    public static final Item ZAMBONIUM_CHESTPLATE = registerItem("zambonium_chestplate", new Item(new FabricItemSettings()));
    public static final Item ZAMBONIUM_HELMET = registerItem("zambonium_helmet", new Item(new FabricItemSettings()));
    public static final Item ZAMBONIUM_LEGGINGS = registerItem("zambonium_leggings", new Item(new FabricItemSettings()));
    public static final Item ZAMBONIUM_BOOTS = registerItem("zambonium_boots", new Item(new FabricItemSettings()));
    public static final Item ZAMBONIUM_PICKAXE = registerItem("zambonium_pickaxe", new CustomPickaxe(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item ZAMBONIUM_AXE = registerItem("zambonium_axe", new CustomAxe(PENTA, 2, -3.0F, new FabricItemSettings()));
    public static final Item ZAMBONIUM_SHOVEL = registerItem("zambonium_shovel", new CustomShovel(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item ZAMBONIUM_SWORD = registerItem("zambonium_sword", new CustomSwordZambonium(new FabricItemSettings()));
    public static final Item ZAMBONIUM_HOE = registerItem("zambonium_hoe", new CustomHoe(PENTA, 0, -3.0F, new FabricItemSettings()));
    public static final Item ZAMBONIUM_HAMMER = registerItem("zambonium_hammer", new CustomHammer(PENTA,0, -3.5F, new FabricItemSettings()));
    public static final Item ZAMBONIUM_GREAT_AXE = registerItem("zambonium_great_axe", new CustomZamboniumGreatAxe(new FabricItemSettings()));

    public static final Item ROBERTIUM_INGOT = registerItem("robertium_ingot", new Item(new FabricItemSettings()));
    public static final Item ROBERTIUM_SHARD = registerItem("robertium_shard", new Item(new FabricItemSettings()));
    public static final Item ROBERTIUM_CHESTPLATE = registerItem("robertium_chestplate", new Item(new FabricItemSettings()));
    public static final Item ROBERTIUM_HELMET = registerItem("robertium_helmet", new Item(new FabricItemSettings()));
    public static final Item ROBERTIUM_LEGGINGS = registerItem("robertium_leggings", new Item(new FabricItemSettings()));
    public static final Item ROBERTIUM_BOOTS = registerItem("robertium_boots", new Item(new FabricItemSettings()));
    public static final Item ROBERTIUM_PICKAXE = registerItem("robertium_pickaxe", new CustomPickaxe(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item ROBERTIUM_AXE = registerItem("robertium_axe", new CustomAxe(PENTA, 2, -3.0F, new FabricItemSettings()));
    public static final Item ROBERTIUM_SHOVEL = registerItem("robertium_shovel", new CustomShovel(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item ROBERTIUM_SWORD = registerItem("robertium_sword", new CustomSwordRobertium(new FabricItemSettings()));
    public static final Item ROBERTIUM_HOE = registerItem("robertium_hoe", new CustomHoe(PENTA, 0, -3.0F, new FabricItemSettings()));
    public static final Item ROBERTIUM_HAMMER = registerItem("robertium_hammer", new CustomHammer(PENTA,0, -3.5F, new FabricItemSettings()));
    public static final Item ROBERTIUM_GREAT_AXE = registerItem("robertium_great_axe", new CustomRobertiumGreatAxe(new FabricItemSettings()));

    public static final Item KEVINIUM_INGOT = registerItem("kevinium_ingot", new Item(new FabricItemSettings()));
    public static final Item KEVINIUM_SHARD = registerItem("kevinium_shard", new Item(new FabricItemSettings()));
    public static final Item KEVINIUM_CHESTPLATE = registerItem("kevinium_chestplate", new Item(new FabricItemSettings()));
    public static final Item KEVINIUM_HELMET = registerItem("kevinium_helmet", new Item(new FabricItemSettings()));
    public static final Item KEVINIUM_LEGGINGS = registerItem("kevinium_leggings", new Item(new FabricItemSettings()));
    public static final Item KEVINIUM_BOOTS = registerItem("kevinium_boots", new Item(new FabricItemSettings()));
    public static final Item KEVINIUM_PICKAXE = registerItem("kevinium_pickaxe", new CustomPickaxe(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item KEVINIUM_AXE = registerItem("kevinium_axe", new CustomAxe(PENTA, 2, -3.0F, new FabricItemSettings()));
    public static final Item KEVINIUM_SHOVEL = registerItem("kevinium_shovel", new CustomShovel(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item KEVINIUM_SWORD = registerItem("kevinium_sword", new CustomSwordKevinium(new FabricItemSettings()));
    public static final Item KEVINIUM_HOE = registerItem("kevinium_hoe", new CustomHoe(PENTA, 0, -3.0F, new FabricItemSettings()));
    public static final Item KEVINIUM_HAMMER = registerItem("kevinium_hammer", new CustomHammer(PENTA,0, -3.5F, new FabricItemSettings()));
    public static final Item KEVINIUM_GREAT_AXE = registerItem("kevinium_great_axe", new CustomKeviniumGreatAxe(new FabricItemSettings()));

    public static final Item PANCHIUM_INGOT = registerItem("panchium_ingot", new Item(new FabricItemSettings()));
    public static final Item PANCHIUM_SHARD = registerItem("panchium_shard", new Item(new FabricItemSettings()));
    public static final Item PANCHIUM_CHESTPLATE = registerItem("panchium_chestplate", new Item(new FabricItemSettings()));
    public static final Item PANCHIUM_HELMET = registerItem("panchium_helmet", new Item(new FabricItemSettings()));
    public static final Item PANCHIUM_LEGGINGS = registerItem("panchium_leggings", new Item(new FabricItemSettings()));
    public static final Item PANCHIUM_BOOTS = registerItem("panchium_boots", new Item(new FabricItemSettings()));
    public static final Item PANCHIUM_PICKAXE = registerItem("panchium_pickaxe", new CustomPickaxe(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item PANCHIUM_AXE = registerItem("panchium_axe", new CustomAxe(PENTA, 2, -3.0F, new FabricItemSettings()));
    public static final Item PANCHIUM_SHOVEL = registerItem("panchium_shovel", new CustomShovel(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item PANCHIUM_SWORD = registerItem("panchium_sword", new CustomSwordPanchium(new FabricItemSettings()));
    public static final Item PANCHIUM_HOE = registerItem("panchium_hoe", new CustomHoe(PENTA, 0, -3.0F, new FabricItemSettings()));
    public static final Item PANCHIUM_HAMMER = registerItem("panchium_hammer", new CustomHammer(PENTA,0, -3.5F, new FabricItemSettings()));
    public static final Item PANCHIUM_GREAT_AXE = registerItem("panchium_great_axe", new CustomPanchiumGreatAxe(new FabricItemSettings()));

    public static final Item JUANITIUM_INGOT = registerItem("juanitium_ingot", new Item(new FabricItemSettings()));
    public static final Item JUANITIUM_SHARD = registerItem("juanitium_shard", new Item(new FabricItemSettings()));
    public static final Item JUANITIUM_CHESTPLATE = registerItem("juanitium_chestplate", new Item(new FabricItemSettings()));
    public static final Item JUANITIUM_HELMET = registerItem("juanitium_helmet", new Item(new FabricItemSettings()));
    public static final Item JUANITIUM_LEGGINGS = registerItem("juanitium_leggings", new Item(new FabricItemSettings()));
    public static final Item JUANITIUM_BOOTS = registerItem("juanitium_boots", new Item(new FabricItemSettings()));
    public static final Item JUANITIUM_PICKAXE = registerItem("juanitium_pickaxe", new CustomPickaxe(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item JUANITIUM_AXE = registerItem("juanitium_axe", new CustomAxe(PENTA, 2, -3.0F, new FabricItemSettings()));
    public static final Item JUANITIUM_SHOVEL = registerItem("juanitium_shovel", new CustomShovel(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item JUANITIUM_SWORD = registerItem("juanitium_sword", new CustomJuanitiumSword(new FabricItemSettings()));
    public static final Item JUANITIUM_HOE = registerItem("juanitium_hoe", new CustomHoe(PENTA, 0, -3.0F, new FabricItemSettings()));
    public static final Item JUANITIUM_HAMMER = registerItem("juanitium_hammer", new CustomHammer(PENTA,0, -3.5F, new FabricItemSettings()));
    public static final Item JUANITIUM_GREAT_AXE = registerItem("juanitium_great_axe", new CustomJuanitiumGreatAxe(new FabricItemSettings()));

    public static final Item LUKITE_INGOT = registerItem("lukite_ingot", new Item(new FabricItemSettings()));
    public static final Item LUKITE_SHARD = registerItem("lukite_shard", new Item(new FabricItemSettings()));
    public static final Item LUKITE_CHESTPLATE = registerItem("lukite_chestplate", new Item(new FabricItemSettings()));
    public static final Item LUKITE_HELMET = registerItem("lukite_helmet", new Item(new FabricItemSettings()));
    public static final Item LUKITE_LEGGINGS = registerItem("lukite_leggings", new Item(new FabricItemSettings()));
    public static final Item LUKITE_BOOTS = registerItem("lukite_boots", new Item(new FabricItemSettings()));
    public static final Item LUKITE_PICKAXE = registerItem("lukite_pickaxe", new CustomPickaxe(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item LUKITE_AXE = registerItem("lukite_axe", new CustomAxe(PENTA, 2, -3.0F, new FabricItemSettings()));
    public static final Item LUKITE_SHOVEL = registerItem("lukite_shovel", new CustomShovel(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item LUKITE_SWORD = registerItem("lukite_sword", new CustomLukiteSword(new FabricItemSettings()));
    public static final Item LUKITE_HOE = registerItem("lukite_hoe", new CustomHoe(PENTA, 0, -3.0F, new FabricItemSettings()));
    public static final Item LUKITE_HAMMER = registerItem("lukite_hammer", new CustomHammer(PENTA,0, -3.5F, new FabricItemSettings()));
    public static final Item LUKITE_GREAT_AXE = registerItem("lukite_great_axe", new CustomLukiteGreatAxe(new FabricItemSettings()));

    public static final Item SARITE_INGOT = registerItem("sarite_ingot", new Item(new FabricItemSettings()));
    public static final Item SARITE_SHARD = registerItem("sarite_shard", new Item(new FabricItemSettings()));
    public static final Item SARITE_CHESTPLATE = registerItem("sarite_chestplate", new Item(new FabricItemSettings()));
    public static final Item SARITE_HELMET = registerItem("sarite_helmet", new Item(new FabricItemSettings()));
    public static final Item SARITE_LEGGINGS = registerItem("sarite_leggings", new Item(new FabricItemSettings()));
    public static final Item SARITE_BOOTS = registerItem("sarite_boots", new Item(new FabricItemSettings()));
    public static final Item SARITE_PICKAXE = registerItem("sarite_pickaxe", new CustomPickaxe(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item SARITE_AXE = registerItem("sarite_axe", new CustomAxe(PENTA, 2, -3.0F, new FabricItemSettings()));
    public static final Item SARITE_SHOVEL = registerItem("sarite_shovel", new CustomShovel(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item SARITE_SWORD = registerItem("sarite_sword", new CustomSwordSarite(new FabricItemSettings()));
    public static final Item SARITE_HOE = registerItem("sarite_hoe", new CustomHoe(PENTA, 0, -3.0F, new FabricItemSettings()));
    public static final Item SARITE_HAMMER = registerItem("sarite_hammer", new CustomHammer(PENTA,0, -3.5F, new FabricItemSettings()));
    public static final Item SARITE_GREAT_AXE = registerItem("sarite_great_axe", new CustomSariteGreatAxe(new FabricItemSettings()));

    public static final Item TOMINITE_INGOT = registerItem("tominite_ingot", new Item(new FabricItemSettings()));
    public static final Item TOMINITE_SHARD = registerItem("tominite_shard", new Item(new FabricItemSettings()));
    public static final Item TOMINITE_CHESTPLATE = registerItem("tominite_chestplate", new Item(new FabricItemSettings()));
    public static final Item TOMINITE_HELMET = registerItem("tominite_helmet", new Item(new FabricItemSettings()));
    public static final Item TOMINITE_LEGGINGS = registerItem("tominite_leggings", new Item(new FabricItemSettings()));
    public static final Item TOMINITE_BOOTS = registerItem("tominite_boots", new Item(new FabricItemSettings()));
    public static final Item TOMINITE_PICKAXE = registerItem("tominite_pickaxe", new CustomPickaxe(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item TOMINITE_AXE = registerItem("tominite_axe", new CustomAxe(PENTA, 2, -3.0F, new FabricItemSettings()));
    public static final Item TOMINITE_SHOVEL = registerItem("tominite_shovel", new CustomShovel(PENTA, 0, -3F, new FabricItemSettings()));
    public static final Item TOMINITE_SWORD = registerItem("tominite_sword", new CustomTominiteSword(new FabricItemSettings()));
    public static final Item TOMINITE_HOE = registerItem("tominite_hoe", new CustomHoe(PENTA, 0, -3.0F, new FabricItemSettings()));
    public static final Item TOMINITE_HAMMER = registerItem("tominite_hammer", new CustomHammer(PENTA,0, -3.5F, new FabricItemSettings()));
    public static final Item TOMINITE_GREAT_AXE = registerItem("tominite_great_axe", new CustomTominiteGreatAxe(new FabricItemSettings()));

    public static final Item PENTACRAFTIUM_DUST = registerItem("pentacraftium_dust", new Item(new FabricItemSettings()));

    public static final Item LUKI_TOMATO = registerItem("luki_tomato", new Item(new FabricItemSettings()));
    public static final Item ROBERT_LETUCCE = registerItem("robert_letucce", new Item(new FabricItemSettings()));
    public static final Item LETUCCE_SEED = registerItem("letucce_seed", new Item(new FabricItemSettings()));
    public static final Item TOMATO_SEED = registerItem("tomato_seed", new Item(new FabricItemSettings()));
    public static final Item QUASAR_SAPLING = registerItem("quasar_sapling", new Item(new FabricItemSettings()));
    public static final Item DARK_MATTER_SAPLING = registerItem("dark_matter_sapling", new Item(new FabricItemSettings()));
    public static final Item QUANTUM_SAPLING = registerItem("quantum_sapling", new Item(new FabricItemSettings()));
    public static final Item FRACTAL_SAPLING = registerItem("fractal_sapling", new Item(new FabricItemSettings()));

    public static final Item DEATH_CATALYST = registerItem("drop_death_catalyst", new CustomRelic(new FabricItemSettings()));
    public static final Item DEATH_SCYTHE = registerItem("drop_death_scythe", new CustomRelic(new FabricItemSettings()));
    public static final Item DEEP_SHACKLES = registerItem("drop_deep_shackles", new CustomRelic(new FabricItemSettings()));
    public static final Item WATER_CORE = registerItem("drop_water_core", new CustomRelic(new FabricItemSettings()));
    public static final Item FRAGMENTED_TRIDENT = registerItem("drop_fragmented_trident", new CustomRelic(new FabricItemSettings()));
    public static final Item WIND_CHARGE = registerItem("drop_wind_charge", new CustomRelic(new FabricItemSettings()));
    public static final Item ELEMENTAL_FEATHER = registerItem("drop_elemental_feather", new CustomRelic(new FabricItemSettings()));
    public static final Item SKY_TRINKET = registerItem("drop_sky_trinket", new CustomRelic(new FabricItemSettings()));
    public static final Item END_RELIC = registerItem("drop_end_relic", new CustomRelic(new FabricItemSettings()));
    public static final Item CORRUPTED_EYE = registerItem("drop_corrupted_eye", new CustomRelic(new FabricItemSettings()));
    public static final Item END_ESSENCE = registerItem("drop_end_essence", new CustomRelic(new FabricItemSettings()));
    public static final Item PENTANOMICON = registerItem("drop_pentanomicon", new CustomRelic(new FabricItemSettings()));
    public static final Item MAGIC_BOOK = registerItem("drop_magic_book", new CustomRelic(new FabricItemSettings()));
    public static final Item THUNDER_DUST = registerItem("drop_thunder_dust", new CustomRelic(new FabricItemSettings()));
    public static final Item THUNDER_FRAGMENT = registerItem("drop_thunder_fragment", new CustomRelic(new FabricItemSettings()));
    public static final Item SPARK_BOTTLE = registerItem("drop_spark_bottle", new CustomRelic(new FabricItemSettings()));
    public static final Item EARTH_CLOVER = registerItem("drop_earth_clover", new CustomRelic(new FabricItemSettings()));
    public static final Item MOB_ESSENCE = registerItem("drop_mob_essence", new CustomRelic(new FabricItemSettings()));
    public static final Item PRIMAL_FLAME = registerItem("drop_primal_flame", new CustomRelic(new FabricItemSettings()));
    public static final Item FIRE_FUNGUS = registerItem("drop_fire_fungus", new CustomRelic(new FabricItemSettings()));



    private static Item registerItem(String itemId, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PentacraftOres.MOD_ID, itemId), item);
    }

    public static void registerItems() {
        PentacraftOres.LOGGER.info("Registrando items");
    }
}
