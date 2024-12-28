package com.remodev.enchantments;

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

public class TreeChopperHandler {
    public static void register() {
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            ItemStack tool = player.getMainHandStack();

            // Solo aplica lógica si el hacha tiene el encantamiento y el bloque es un tronco
            if (EnchantmentHelper.getLevel(ModEnchantments.TREECHOPPER_ENCHANTMENT, tool) > 0 && isLog(state.getBlock())) {
                chopTree(world, pos, player, tool);
                // Devuelve `false` para permitir que el bloque original se rompa correctamente
                return false;
            }

            return true;
        });
    }

    private static boolean isLog(Block block) {
        return block.getDefaultState().isIn(BlockTags.LOGS);
    }

    private static void chopTree(World world, BlockPos start, PlayerEntity player, ItemStack tool) {
        if (world instanceof ServerWorld serverWorld) {
            Set<BlockPos> logs = new HashSet<>();
            collectLogs(world, start, logs, 15); // Limitar profundidad a 100 bloques

            int delayPerLog = 20;
            int[] totalDelay = {0};

            for (BlockPos logPos : logs) {
                int finalDelay = totalDelay[0];
                serverWorld.getServer().execute(() -> {
                    if (serverWorld.getBlockState(logPos).isIn(BlockTags.LOGS)) {
                        serverWorld.breakBlock(logPos, true, player);
                    }
                });
                totalDelay[0] += delayPerLog;
            }

            player.getItemCooldownManager().set(tool.getItem(), totalDelay[0]);
        }
    }

    private static void collectLogs(World world, BlockPos start, Set<BlockPos> logs, int maxDepth) {
        Queue<BlockPos> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty() && logs.size() < maxDepth) {
            BlockPos pos = queue.poll();
            if (!logs.contains(pos)) {
                BlockState state = world.getBlockState(pos);
                if (isLog(state.getBlock())) {
                    logs.add(pos);

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
