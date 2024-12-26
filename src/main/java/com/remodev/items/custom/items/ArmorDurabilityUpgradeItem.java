package com.remodev.items.custom.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class ArmorUpgradeItem extends Item {

    public ArmorUpgradeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack upgradeStack = player.getStackInHand(hand);

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (slot.getType() == EquipmentSlot.Type.ARMOR) {
                ItemStack armorStack = player.getEquippedStack(slot);

                if (!armorStack.isEmpty() && armorStack.getItem() instanceof ArmorItem) {
                    int currentLevel = getProtectionLevel(armorStack);

                    // Solo permitir mejorar si la armadura tiene Protección IV
                    if (currentLevel < 4 || currentLevel > 5) {
                        if (!world.isClient) {
                            player.sendMessage(Text.literal("Solo puedes mejorar armaduras con Protección IV o V."), true);
                        }
                        return TypedActionResult.fail(upgradeStack);
                    }

                    // Si ya tiene Protección VI, no permitir más mejoras
                    if (currentLevel == 6) {
                        if (!world.isClient) {
                            player.sendMessage(Text.literal("La armadura ya tiene Protección VI. No se puede mejorar más."), true);
                        }
                        return TypedActionResult.fail(upgradeStack);
                    }

                    // Aplicar la mejora
                    if (applyProtection(armorStack, currentLevel)) {
                        upgradeStack.decrement(1); // Consumir la mejora
                        if (!world.isClient) {
                            broadcastMessage((ServerWorld) world, player.getEntityName() + " ha utilizado una mejora de dragón - ¡Protección mejorada a nivel " + (currentLevel + 1) + "!");
                            player.sendMessage(Text.literal("¡Protección mejorada a nivel " + (currentLevel + 1) + "!"), true);
                        }
                        return TypedActionResult.success(upgradeStack, world.isClient());
                    }
                }
            }
        }

        return TypedActionResult.fail(upgradeStack);
    }

    private int getProtectionLevel(ItemStack armorStack) {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = EnchantmentHelper.get(armorStack);
        return enchantments.getOrDefault(Enchantments.PROTECTION, 0);
    }

    private boolean applyProtection(ItemStack armorStack, int currentLevel) {
        if (currentLevel >= 4 && currentLevel < 6) { // Solo mejorar de 4 a 5 o de 5 a 6
            Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = EnchantmentHelper.get(armorStack);
            enchantments.put(Enchantments.PROTECTION, currentLevel + 1);
            EnchantmentHelper.set(enchantments, armorStack);
            return true;
        }
        return false;
    }

    private void broadcastMessage(ServerWorld world, String message) {
        for (ServerPlayerEntity player : world.getPlayers()) {
            player.sendMessage(Text.literal(message), false); // Mensaje global
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Usa esta mejora en armaduras equipadas con Protección IV o V."));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Hacer que el ítem brille
    }
}
