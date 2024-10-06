package com.remodev.items;

import com.remodev.PentacraftOres;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {

    public static final ItemGroup PENTACRAFT_MINERALS = registerItemGroup("pentacraft_minerals",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pentacraft-ores.pentacraft_minerals_group"))
                    .icon(() -> new ItemStack(Moditems.ZAMBONIUM))
                    .entries((displayContext, entries) -> {
                        entries.add(Moditems.ZAMBONIUM);
                        entries.add(Moditems.ZAMBONIUM_SHARD);
                        entries.add(Moditems.JUANITE);
                        entries.add(Moditems.JUANITE_SHARD);
                        entries.add(Moditems.KEVINIUM);
                        entries.add(Moditems.KEVINIUM_SHARD);
                        entries.add(Moditems.LUKITE);
                        entries.add(Moditems.LUKITE_SHARD);
                        entries.add(Moditems.PANCHIUM);
                        entries.add(Moditems.PANCHIUM_SHARD);
                        entries.add(Moditems.ROBERTIUM);
                        entries.add(Moditems.ROBERTIUM_SHARD);
                        entries.add(Moditems.SARITE);
                        entries.add(Moditems.SARITE_SHARD);
                        entries.add(Moditems.TOMYONITE);
                        entries.add(Moditems.TOMYONITE_SHARD);
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
