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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolUpgradeItem extends Item {

    public ToolUpgradeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack upgradeStack = player.getStackInHand(hand);
        Hand otherHand = hand == Hand.MAIN_HAND ? Hand.OFF_HAND : Hand.MAIN_HAND;
        ItemStack armorStack = player.getStackInHand(otherHand);

        // Verificar si el objeto en la otra mano es una pieza de armadura
        if (!armorStack.isEmpty() && armorStack.getItem() instanceof ArmorItem) {
            if (applyUltimateEnchantments(armorStack)) {
                upgradeStack.decrement(1); // Consumir la mejora
                if (!world.isClient) {
                    broadcastMessage((ServerWorld) world, player.getEntityName() + " ha utilizado una mejora definitiva de dragón en su armadura.");
                    player.sendMessage(Text.literal("¡Tu armadura ha sido mejorada con los mejores encantamientos!"), true);
                }
                return TypedActionResult.success(upgradeStack, world.isClient());
            }
        }

        return TypedActionResult.fail(upgradeStack);
    }

    private boolean applyUltimateEnchantments(ItemStack armorStack) {
        // Eliminar todos los encantamientos actuales
        Map<net.minecraft.enchantment.Enchantment, Integer> newEnchantments = new HashMap<>();
        newEnchantments.put(Enchantments.PROTECTION, 4);
        newEnchantments.put(Enchantments.BLAST_PROTECTION, 4);
        newEnchantments.put(Enchantments.PROJECTILE_PROTECTION, 4);
        newEnchantments.put(Enchantments.THORNS, 3);
        newEnchantments.put(Enchantments.MENDING, 1);
        newEnchantments.put(Enchantments.UNBREAKING, 3);

        // Aplicar nuevos encantamientos
        EnchantmentHelper.set(newEnchantments, armorStack);
        return true;
    }

    private void broadcastMessage(ServerWorld world, String message) {
        for (ServerPlayerEntity player : world.getPlayers()) {
            player.sendMessage(Text.literal(message), false); // Enviar mensaje global
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Aplicable solo a piezas de armadura."));
        tooltip.add(Text.literal("Otorga Protección IV, Protección contra Proyectiles IV,"));
        tooltip.add(Text.literal("Protección contra Explosiones IV, Espinas III, Reparación, y Durabilidad III."));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Hacer que el ítem brille
    }
}
