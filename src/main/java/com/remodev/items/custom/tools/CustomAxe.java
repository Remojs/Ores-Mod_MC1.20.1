package com.remodev.items.custom.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item.Settings;

public class CustomAxe extends AxeItem {
    public CustomAxe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}