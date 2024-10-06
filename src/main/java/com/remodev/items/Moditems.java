package com.remodev.items;

import com.remodev.PentacraftOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Moditems {

    public static final Item JUANITE = registerItem("juanite", new Item(new FabricItemSettings()));
    public static final Item JUANITE_SHARD = registerItem("juanite_shard", new Item(new FabricItemSettings()));
    public static final Item KEVINIUM = registerItem("kevinium", new Item(new FabricItemSettings()));
    public static final Item KEVINIUM_SHARD = registerItem("kevinium_shard", new Item(new FabricItemSettings()));
    public static final Item LUKITE = registerItem("lukite", new Item(new FabricItemSettings()));
    public static final Item LUKITE_SHARD = registerItem("lukite_shard", new Item(new FabricItemSettings()));
    public static final Item PANCHIUM = registerItem("panchium", new Item(new FabricItemSettings()));
    public static final Item PANCHIUM_SHARD = registerItem("panchium_shard", new Item(new FabricItemSettings()));
    public static final Item ROBERTIUM = registerItem("robertium", new Item(new FabricItemSettings()));
    public static final Item ROBERTIUM_SHARD = registerItem("robertium_shard", new Item(new FabricItemSettings()));
    public static final Item SARITE = registerItem("sarite", new Item(new FabricItemSettings()));
    public static final Item SARITE_SHARD = registerItem("sarite_shard", new Item(new FabricItemSettings()));
    public static final Item TOMYONITE = registerItem("tomyonite", new Item(new FabricItemSettings()));
    public static final Item TOMYONITE_SHARD = registerItem("tomyonite_shard", new Item(new FabricItemSettings()));
    public static final Item ZAMBONIUM = registerItem("zambonium", new Item(new FabricItemSettings()));
    public static final Item ZAMBONIUM_SHARD = registerItem("zambonium_shard", new Item(new FabricItemSettings()));
    public static final Item PENTACRAFTIUM_DUST = registerItem("pentacraftium_dust", new Item(new FabricItemSettings()));

    private static Item registerItem(String itemId, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PentacraftOres.MOD_ID, itemId), item);
    }

    public static void registerItems() {
        PentacraftOres.LOGGER.info("Registrando items");
    }
}
