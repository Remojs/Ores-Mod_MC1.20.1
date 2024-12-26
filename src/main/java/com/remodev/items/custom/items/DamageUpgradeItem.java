package com.remodev.items.custom.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class DurabilityUpgradeItem extends Item {

    public DurabilityUpgradeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack upgradeStack = player.getStackInHand(hand);
        Hand otherHand = hand == Hand.MAIN_HAND ? Hand.OFF_HAND : Hand.MAIN_HAND;
        ItemStack toolStack = player.getStackInHand(otherHand);

        if (!toolStack.isEmpty() && toolStack.getItem() instanceof ToolItem) {
            int currentLevel = getUnbreakingLevel(toolStack);
            if (currentLevel == 5) {if (!world.isClient) {
                player.sendMessage(Text.literal("La herramienta ya tiene Unbreaking V. No se puede mejorar más."), true);}
                return TypedActionResult.fail(upgradeStack);
            }

            if (applyUnbreaking(toolStack, currentLevel)) {
                upgradeStack.decrement(1);
                if (!world.isClient) {
                    broadcastMessage((ServerWorld) world, player.getEntityName() + " Ha utilizado una mejora de dragón - ¡Unbreaking mejorado a nivel " + (currentLevel + 1) + "!");
                    player.sendMessage(Text.literal("¡Unbreaking mejorado a nivel " + (currentLevel + 1) + "!"), true);
                }
                return TypedActionResult.success(upgradeStack, world.isClient());
            }
        }
        return TypedActionResult.fail(upgradeStack);
    }

    private int getUnbreakingLevel(ItemStack toolStack) {
        Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = EnchantmentHelper.get(toolStack);
        return enchantments.getOrDefault(Enchantments.UNBREAKING, 0);
    }

    private boolean applyUnbreaking(ItemStack toolStack, int currentLevel) {
        if (currentLevel >= 3 && currentLevel < 5) {
            Map<net.minecraft.enchantment.Enchantment, Integer> enchantments = EnchantmentHelper.get(toolStack);
            enchantments.put(Enchantments.UNBREAKING, currentLevel + 1);
            EnchantmentHelper.set(enchantments, toolStack);
            return true;
        }
        return false;
    }

    private void broadcastMessage(ServerWorld world, String message) {
        for (ServerPlayerEntity player : world.getPlayers()) { player.sendMessage(Text.literal(message), false);}
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Aplicable para armas y herramientas"));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
