package com.remodev.items;

import com.remodev.PentacraftOres;
import com.remodev.blocks.Ores;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {

    public static final ItemGroup PENTACRAFT_MINERALS = registerItemGroup("minerals",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pentacraft-ores.pentacraft_mineral_group"))
                    .icon(() -> new ItemStack(Moditems.ZAMBONIUM_INGOT))
                    .entries((displayContext, entries) -> {
                        entries.add(Moditems.PENTACRAFTIUM_DUST);
                        entries.add(Moditems.ZAMBONIUM_INGOT);
                        entries.add(Moditems.JUANITIUM_INGOT);
                        entries.add(Moditems.KEVINIUM_INGOT);
                        entries.add(Moditems.LUKITE_INGOT);
                        entries.add(Moditems.PANCHIUM_INGOT);
                        entries.add(Moditems.ROBERTIUM_INGOT);
                        entries.add(Moditems.SARITE_INGOT);
                        entries.add(Moditems.TOMINITE_INGOT);
                        entries.add(Moditems.PANCHIUM_SHARD);
                        entries.add(Moditems.ZAMBONIUM_SHARD);
                        entries.add(Moditems.JUANITIUM_SHARD);
                        entries.add(Moditems.KEVINIUM_SHARD);
                        entries.add(Moditems.LUKITE_SHARD);
                        entries.add(Moditems.ROBERTIUM_SHARD);
                        entries.add(Moditems.SARITE_SHARD);
                        entries.add(Moditems.TOMINITE_SHARD);
                    })
                    .build()
    );

    public static final ItemGroup PENTACRAFT_MISC = registerItemGroup("misc",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pentacraft-ores.pentacraft_misc_group"))
                    .icon(() -> new ItemStack(Moditems.PENTACRAFTIUM_CORE))
                    .entries((displayContext, entries) -> {
                        entries.add(Moditems.DRAGON_UPGRADE);
                        entries.add(Moditems.WARDEN_UPGRADE);
                        entries.add(Moditems.GUARDIAN_UPGRADE);
                        entries.add(Moditems.WITHER_UPGRADE);
                        entries.add(Moditems.NETHER_UPGRADE);
                        entries.add(Moditems.END_UPGRADE);
                        entries.add(Moditems.PENTACRAFT_BOOK);
                        entries.add(Moditems.PENTACRAFTIUM_CORE);
                        entries.add(Moditems.PENTACRAFTIUM_HEART);
                        entries.add(Moditems.DEATH_CATALYST);
                        entries.add(Moditems.DEATH_SCYTHE);
                        entries.add(Moditems.DEEP_SHACKLES);
                        entries.add(Moditems.WATER_CORE);
                        entries.add(Moditems.FRAGMENTED_TRIDENT);
                        entries.add(Moditems.WIND_CHARGE);
                        entries.add(Moditems.ELEMENTAL_FEATHER);
                        entries.add(Moditems.SKY_TRINKET);
                        entries.add(Moditems.END_RELIC);
                        entries.add(Moditems.CORRUPTED_EYE);
                        entries.add(Moditems.END_ESSENCE);
                        entries.add(Moditems.PENTANOMICON);
                        entries.add(Moditems.MAGIC_BOOK);
                        entries.add(Moditems.THUNDER_DUST);
                        entries.add(Moditems.THUNDER_FRAGMENT);
                        entries.add(Moditems.SPARK_BOTTLE);
                        entries.add(Moditems.EARTH_CLOVER);
                        entries.add(Moditems.MOB_ESSENCE);
                        entries.add(Moditems.PRIMAL_FLAME);
                        entries.add(Moditems.FIRE_FUNGUS);
                    })
                    .build()
    );


    public static final ItemGroup PENTACRAFT_ARMOR = registerItemGroup("armor",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pentacraft-ores.pentacraft_armor_group"))
                    .icon(() -> new ItemStack(Moditems.ZAMBONIUM_HELMET))
                    .entries((displayContext, entries) -> {
                        entries.add(Moditems.ZAMBONIUM_HELMET);
                        entries.add(Moditems.ZAMBONIUM_CHESTPLATE);
                        entries.add(Moditems.ZAMBONIUM_LEGGINGS);
                        entries.add(Moditems.ZAMBONIUM_BOOTS);
                        entries.add(Moditems.JUANITIUM_HELMET);
                        entries.add(Moditems.JUANITIUM_CHESTPLATE);
                        entries.add(Moditems.JUANITIUM_LEGGINGS);
                        entries.add(Moditems.JUANITIUM_BOOTS);
                        entries.add(Moditems.KEVINIUM_HELMET);
                        entries.add(Moditems.KEVINIUM_CHESTPLATE);
                        entries.add(Moditems.KEVINIUM_LEGGINGS);
                        entries.add(Moditems.KEVINIUM_BOOTS);
                        entries.add(Moditems.LUKITE_HELMET);
                        entries.add(Moditems.LUKITE_CHESTPLATE);
                        entries.add(Moditems.LUKITE_LEGGINGS);
                        entries.add(Moditems.LUKITE_BOOTS);
                        entries.add(Moditems.PANCHIUM_HELMET);
                        entries.add(Moditems.PANCHIUM_CHESTPLATE);
                        entries.add(Moditems.PANCHIUM_LEGGINGS);
                        entries.add(Moditems.PANCHIUM_BOOTS);
                        entries.add(Moditems.ROBERTIUM_HELMET);
                        entries.add(Moditems.ROBERTIUM_CHESTPLATE);
                        entries.add(Moditems.ROBERTIUM_LEGGINGS);
                        entries.add(Moditems.ROBERTIUM_BOOTS);
                        entries.add(Moditems.SARITE_HELMET);
                        entries.add(Moditems.SARITE_CHESTPLATE);
                        entries.add(Moditems.SARITE_LEGGINGS);
                        entries.add(Moditems.SARITE_BOOTS);
                        entries.add(Moditems.TOMINITE_HELMET);
                        entries.add(Moditems.TOMINITE_CHESTPLATE);
                        entries.add(Moditems.TOMINITE_LEGGINGS);
                        entries.add(Moditems.TOMINITE_BOOTS);
                    })
                    .build()
    );

    public static final ItemGroup PENTACRAFT_TOOLS = registerItemGroup("tools",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pentacraft-ores.pentacraft_tools_group"))
                    .icon(() -> new ItemStack(Moditems.ZAMBONIUM_SHOVEL))
                    .entries((displayContext, entries) -> {
                        entries.add(Moditems.ZAMBONIUM_AXE);
                        entries.add(Moditems.ZAMBONIUM_PICKAXE);
                        entries.add(Moditems.ZAMBONIUM_SHOVEL);
                        entries.add(Moditems.ZAMBONIUM_HOE);
                        entries.add(Moditems.ZAMBONIUM_HAMMER);
                        entries.add(Moditems.JUANITIUM_AXE);
                        entries.add(Moditems.JUANITIUM_PICKAXE);
                        entries.add(Moditems.JUANITIUM_SHOVEL);
                        entries.add(Moditems.JUANITIUM_HOE);
                        entries.add(Moditems.JUANITIUM_HAMMER);
                        entries.add(Moditems.KEVINIUM_AXE);
                        entries.add(Moditems.KEVINIUM_PICKAXE);
                        entries.add(Moditems.KEVINIUM_SHOVEL);
                        entries.add(Moditems.KEVINIUM_HOE);
                        entries.add(Moditems.KEVINIUM_HAMMER);
                        entries.add(Moditems.LUKITE_AXE);
                        entries.add(Moditems.LUKITE_PICKAXE);
                        entries.add(Moditems.LUKITE_SHOVEL);
                        entries.add(Moditems.LUKITE_HOE);
                        entries.add(Moditems.LUKITE_HAMMER);
                        entries.add(Moditems.PANCHIUM_AXE);
                        entries.add(Moditems.PANCHIUM_PICKAXE);
                        entries.add(Moditems.PANCHIUM_SHOVEL);
                        entries.add(Moditems.PANCHIUM_HOE);
                        entries.add(Moditems.PANCHIUM_HAMMER);
                        entries.add(Moditems.ROBERTIUM_AXE);
                        entries.add(Moditems.ROBERTIUM_PICKAXE);
                        entries.add(Moditems.ROBERTIUM_SHOVEL);
                        entries.add(Moditems.ROBERTIUM_HOE);
                        entries.add(Moditems.ROBERTIUM_HAMMER);
                        entries.add(Moditems.SARITE_AXE);
                        entries.add(Moditems.SARITE_PICKAXE);
                        entries.add(Moditems.SARITE_SHOVEL);
                        entries.add(Moditems.SARITE_HOE);
                        entries.add(Moditems.SARITE_HAMMER);
                        entries.add(Moditems.TOMINITE_AXE);
                        entries.add(Moditems.TOMINITE_PICKAXE);
                        entries.add(Moditems.TOMINITE_SHOVEL);
                        entries.add(Moditems.TOMINITE_HOE);
                        entries.add(Moditems.TOMINITE_HAMMER);
                    })
                    .build()
    );

    public static final ItemGroup PENTACRAFT_WEAPONS = registerItemGroup("weapons",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pentacraft-ores.pentacraft_weapons_group"))
                    .icon(() -> new ItemStack(Moditems.ZAMBONIUM_SWORD))
                    .entries((displayContext, entries) -> {
                        entries.add(Moditems.ZAMBONIUM_SWORD);
                        entries.add(Moditems.ZAMBONIUM_GREAT_AXE);
                        entries.add(Moditems.JUANITIUM_SWORD);
                        entries.add(Moditems.JUANITIUM_GREAT_AXE);
                        entries.add(Moditems.KEVINIUM_SWORD);
                        entries.add(Moditems.KEVINIUM_GREAT_AXE);
                        entries.add(Moditems.LUKITE_SWORD);
                        entries.add(Moditems.LUKITE_GREAT_AXE);
                        entries.add(Moditems.PANCHIUM_SWORD);
                        entries.add(Moditems.PANCHIUM_GREAT_AXE);
                        entries.add(Moditems.ROBERTIUM_SWORD);
                        entries.add(Moditems.ROBERTIUM_GREAT_AXE);
                        entries.add(Moditems.SARITE_SWORD);
                        entries.add(Moditems.SARITE_GREAT_AXE);
                        entries.add(Moditems.TOMINITE_SWORD);
                        entries.add(Moditems.TOMINITE_GREAT_AXE);
                    })
                    .build()
    );

    public static final ItemGroup PENTACRAFT_BLOCKS = registerItemGroup("blocks",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pentacraft-ores.pentacraft_blocks_group"))
                    .icon(() -> new ItemStack(Ores.ZAMBONIUM_BLOCK.getRight()))
                    .entries((displayContext, entries) -> {
                        entries.add(new ItemStack(Ores.ZAMBONIUM_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.ZAMBONIUM_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.ZAMBONIUM_ORE_ENDSTONE.getLeft()));
                        entries.add(new ItemStack(Ores.ZAMBONIUM_ORE_NETHERRACK.getLeft()));
                        entries.add(new ItemStack(Ores.ZAMBONIUM_BLOCK.getLeft()));
                        entries.add(new ItemStack(Ores.ZAMBONIUM_SHARD_BLOCK.getLeft()));

                        entries.add(new ItemStack(Ores.ROBERTIUM_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.ROBERTIUM_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.ROBERTIUM_ORE_ENDSTONE.getLeft()));
                        entries.add(new ItemStack(Ores.ROBERTIUM_ORE_NETHERRACK.getLeft()));
                        entries.add(new ItemStack(Ores.ROBERTIUM_BLOCK.getLeft()));
                        entries.add(new ItemStack(Ores.ROBERTIUM_SHARD_BLOCK.getLeft()));

                        entries.add(new ItemStack(Ores.PANCHIUM_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.PANCHIUM_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.PANCHIUM_ORE_ENDSTONE.getLeft()));
                        entries.add(new ItemStack(Ores.PANCHIUM_ORE_NETHERRACK.getLeft()));
                        entries.add(new ItemStack(Ores.PANCHIUM_BLOCK.getLeft()));
                        entries.add(new ItemStack(Ores.PANCHIUM_SHARD_BLOCK.getLeft()));

                        entries.add(new ItemStack(Ores.KEVINIUM_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.KEVINIUM_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.KEVINIUM_ORE_ENDSTONE.getLeft()));
                        entries.add(new ItemStack(Ores.KEVINIUM_ORE_NETHERRACK.getLeft()));
                        entries.add(new ItemStack(Ores.KEVINIUM_BLOCK.getLeft()));
                        entries.add(new ItemStack(Ores.KEVINIUM_SHARD_BLOCK.getLeft()));

                        entries.add(new ItemStack(Ores.SARITE_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.SARITE_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.SARITE_ORE_ENDSTONE.getLeft()));
                        entries.add(new ItemStack(Ores.SARITE_ORE_NETHERRACK.getLeft()));
                        entries.add(new ItemStack(Ores.SARITE_BLOCK.getLeft()));
                        entries.add(new ItemStack(Ores.SARITE_SHARD_BLOCK.getLeft()));

                        entries.add(new ItemStack(Ores.TOMINITE_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.TOMINITE_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.TOMINITE_ORE_ENDSTONE.getLeft()));
                        entries.add(new ItemStack(Ores.TOMINITE_ORE_NETHERRACK.getLeft()));
                        entries.add(new ItemStack(Ores.TOMINITE_BLOCK.getLeft()));
                        entries.add(new ItemStack(Ores.TOMINITE_SHARD_BLOCK.getLeft()));

                        entries.add(new ItemStack(Ores.LUKITE_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.LUKITE_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.LUKITE_ORE_ENDSTONE.getLeft()));
                        entries.add(new ItemStack(Ores.LUKITE_ORE_NETHERRACK.getLeft()));
                        entries.add(new ItemStack(Ores.LUKITE_BLOCK.getLeft()));
                        entries.add(new ItemStack(Ores.LUKITE_SHARD_BLOCK.getLeft()));

                        entries.add(new ItemStack(Ores.JUANITIUM_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.JUANITIUM_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.JUANITIUM_ORE_ENDSTONE.getLeft()));
                        entries.add(new ItemStack(Ores.JUANITIUM_ORE_NETHERRACK.getLeft()));
                        entries.add(new ItemStack(Ores.JUANITIUM_BLOCK.getLeft()));
                        entries.add(new ItemStack(Ores.JUANITIUM_SHARD_BLOCK.getLeft()));

                        entries.add(new ItemStack(Ores.PENTACRAFTIUM_ORE_STONE.getLeft()));
                        entries.add(new ItemStack(Ores.PENTACRAFTIUM_ORE_DEEPSLATE.getLeft()));
                        entries.add(new ItemStack(Ores.PENTACRAFTIUM_BLOCK.getLeft()));

                    })
                    .build()
    );



    private static ItemGroup registerItemGroup(String itemGroupId, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, new Identifier(PentacraftOres.MOD_ID, itemGroupId), itemGroup);
    }

    public static void registerItemGroup() {
        PentacraftOres.LOGGER.info("Registrando grupos de items...");
    }
}
