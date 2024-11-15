package com.remodev.custom;

import com.remodev.PentacraftOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks{

        private static TagKey<Block> createTag(String tagId) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(PentacraftOres.MOD_ID, tagId));
        }

    }

    public static class Items{

        private static TagKey<Item> createTag(String tagId) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(PentacraftOres.MOD_ID, tagId));
        }

    }

}
