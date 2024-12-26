package com.remodev.items.custom.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class LifeBoostItem extends Item {
    public LifeBoostItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();

        if (!world.isClient && player != null) {
            // Aumenta la vida máxima del jugador al consumir el ítem
            givePermanentHealthBoost(player);
            player.getStackInHand(Hand.MAIN_HAND).decrement(1); // Consume el ítem
        }
        return ActionResult.SUCCESS;
    }
    private void givePermanentHealthBoost(PlayerEntity player) {
        // Obtener la cantidad de vida extra almacenada en los datos persistentes
        int currentHealthBoost = player.getPersistentData().getInt("extraHealth");

        // Establecer el nuevo valor de vida extra (por ejemplo, 10 puntos de vida)
        int newHealthBoost = currentHealthBoost + 10;

        // Guardar el nuevo valor de vida extra en los datos persistentes del jugador
        player.getPersistentData().putInt("extraHealth", newHealthBoost);

        // Modificar la vida máxima del jugador
        player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(20.0 + newHealthBoost); // 20 es la vida base
    }
}
