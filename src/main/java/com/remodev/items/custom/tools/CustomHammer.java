package com.remodev.items.custom.tools;

import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.ArrayList;
import java.util.List;

public class CustomHammer extends MiningToolItem {
    public CustomHammer(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient) {
            BlockPos initialBlockPos = context.getBlockPos();
            ServerPlayerEntity player = (ServerPlayerEntity) context.getPlayer();
            Direction side = context.getSide();

            if (player != null) {
                List<BlockPos> blocksToDestroy = getBlocksToBeDestroyed(1, initialBlockPos, side);

                for (BlockPos pos : blocksToDestroy) {
                    if (world.getBlockState(pos).isToolRequired()) {
                        world.breakBlock(pos, true, player);
                    }
                }
                world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, initialBlockPos);
            }
        }
        return ActionResult.SUCCESS;
    }

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initialBlockPos, Direction side) {
        List<BlockPos> positions = new ArrayList<>();

        if (side == Direction.DOWN || side == Direction.UP) {
            for (int x = -range; x <= range; x++) {
                for (int z = -range; z <= range; z++) {
                    positions.add(initialBlockPos.add(x, 0, z));
                }
            }
        } else if (side == Direction.NORTH || side == Direction.SOUTH) {
            for (int x = -range; x <= range; x++) {
                for (int y = -range; y <= range; y++) {
                    positions.add(initialBlockPos.add(x, y, 0));
                }
            }
        } else if (side == Direction.EAST || side == Direction.WEST) {
            for (int z = -range; z <= range; z++) {
                for (int y = -range; y <= range; y++) {
                    positions.add(initialBlockPos.add(0, y, z));
                }
            }
        }

        return positions;
    }
}
