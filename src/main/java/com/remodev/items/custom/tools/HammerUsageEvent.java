package com.remodev.items.custom.tools;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HammerUsageEvent implements PlayerBlockBreakEvents.Before {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity) {
        ItemStack mainHandItem = player.getMainHandStack();

        if (mainHandItem.getItem() instanceof CustomHammer hammer && player instanceof ServerPlayerEntity serverPlayer) {
            if (HARVESTED_BLOCKS.contains(pos)) {
                return true;
            }

            Direction facing = player.getHorizontalFacing();
            float pitch = player.getPitch();

            List<BlockPos> blocksToDestroy;

            if (pitch < -45) {
                blocksToDestroy = CustomHammer.getBlocksToBeDestroyed(1, pos, Direction.DOWN);
            } else if (pitch > 45) {
                blocksToDestroy = CustomHammer.getBlocksToBeDestroyed(1, pos, Direction.UP);
            } else {
                blocksToDestroy = CustomHammer.getBlocksToBeDestroyed(1, pos, facing);
            }

            for (BlockPos position : blocksToDestroy) {
                if (!position.equals(pos) && hammer.isSuitableFor(mainHandItem, world.getBlockState(position))) {
                    HARVESTED_BLOCKS.add(position);
                    serverPlayer.interactionManager.tryBreakBlock(position);
                    HARVESTED_BLOCKS.remove(position);
                }
            }
        }

        return true;
    }
}
