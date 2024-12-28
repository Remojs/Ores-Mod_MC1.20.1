package com.remodev.enchantments.handlers;

import com.remodev.enchantments.ModEnchantments;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LeafPruningHandler {
    public static void register() {
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            ItemStack tool = player.getMainHandStack();

            // Solo aplica lógica si el encantamiento está presente y el bloque es una hoja
            if (EnchantmentHelper.getLevel(ModEnchantments.DEEP_PRUNING, tool) > 0 && isLeaf(state.getBlock())) {
                pruneLeaves(world, pos, player, tool);
                // Devuelve `false` para evitar que el bloque se rompa normalmente
                return false;
            }

            return true;
        });
    }

    private static boolean isLeaf(Block block) {
        return block.getDefaultState().isIn(BlockTags.LEAVES);
    }

    private static void pruneLeaves(World world, BlockPos start, PlayerEntity player, ItemStack tool) {
        if (world instanceof ServerWorld serverWorld) {
            Set<BlockPos> leaves = new HashSet<>();
            collectLeaves(world, start, leaves, 15); // Limitar profundidad a 15 bloques

            int delayPerLeaf = 10; // 10 ticks por bloque
            int[] totalDelay = {0};

            for (BlockPos leafPos : leaves) {
                int finalDelay = totalDelay[0];
                serverWorld.getServer().execute(() -> {
                    if (serverWorld.getBlockState(leafPos).isIn(BlockTags.LEAVES)) {
                        serverWorld.breakBlock(leafPos, true, player);
                    }
                });
                totalDelay[0] += delayPerLeaf;
            }

            player.getItemCooldownManager().set(tool.getItem(), totalDelay[0]);
        }
    }

    private static void collectLeaves(World world, BlockPos start, Set<BlockPos> leaves, int maxDepth) {
        Queue<BlockPos> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty() && leaves.size() < maxDepth) {
            BlockPos pos = queue.poll();
            if (!leaves.contains(pos)) {
                BlockState state = world.getBlockState(pos);
                if (isLeaf(state.getBlock())) {
                    leaves.add(pos);

                    queue.add(pos.up());
                    queue.add(pos.down());
                    queue.add(pos.north());
                    queue.add(pos.south());
                    queue.add(pos.east());
                    queue.add(pos.west());
                }
            }
        }
    }
}
