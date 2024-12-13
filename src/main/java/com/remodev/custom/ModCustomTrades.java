package com.remodev.custom;

import com.remodev.blocks.Ores;
import com.remodev.items.Moditems;
import com.remodev.villager.ModVillager;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        // ---------------------------------------------------------------------------------------
        // -------------------------------      FARMER       -------------------------------------
        // ---------------------------------------------------------------------------------------

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 1),
                            new ItemStack(Moditems.LUKI_TOMATO, 4),
                            10, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 1),
                            new ItemStack(Moditems.ROBERT_LETUCCE, 4),
                            10, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 3),
                            new ItemStack(Moditems.SPEED_FOOD, 8),
                            4, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 3),
                            new ItemStack(Moditems.BURGER_FOOD, 4),
                            10, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 1),
                            new ItemStack(Moditems.PATY_FOOD, 2),
                            10, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_FARMER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 3),
                            new ItemStack(Moditems.CHORIPAN_FOOD, 4),
                            10, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 3),
                            new ItemStack(Moditems.MONSTER_FOOD, 8),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Moditems.MATE_FOOD, 7),
                            6, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_FARMER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 1),
                            new ItemStack(Ores.QUANTUM_SAPLING, 12),
                            10, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 1),
                            new ItemStack(Ores.FRACTAL_SAPLING, 12),
                            10, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 1),
                            new ItemStack(Ores.QUASAR_SAPLING, 12),
                            10, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 1),
                            new ItemStack(Ores.DARK_MATTER_SAPLING, 12),
                            10, 5, 0.05f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_FARMER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.PENTACRAFTIUM_DUST, 6),
                            10, 5, 0.00f));
                }
        );

        // ---------------------------------------------------------------------------------------
        // -------------------------------       SAGE        -------------------------------------
        // ---------------------------------------------------------------------------------------

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_SAGE, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.TOMINITE_SHARD, 2),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.ZAMBONIUM_SHARD, 2),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.ROBERTIUM_SHARD, 2),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.SARITE_SHARD, 2),
                            4, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_SAGE, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.KEVINIUM_SHARD, 2),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.PANCHIUM_SHARD, 2),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.JUANITIUM_SHARD, 2),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Moditems.LUKITE_SHARD, 2),
                            4, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_SAGE, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.CORRUPTED_EYE, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 6),
                            new ItemStack(Moditems.DEATH_CATALYST, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 6),
                            new ItemStack(Moditems.DEATH_SCYTHE, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.DEEP_SHACKLES, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 6),
                            new ItemStack(Moditems.EARTH_CLOVER, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.ELEMENTAL_FEATHER, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.END_ESSENCE, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.END_RELIC, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 6),
                            new ItemStack(Moditems.FIRE_FUNGUS, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 6),
                            new ItemStack(Moditems.FRAGMENTED_TRIDENT, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 6),
                            new ItemStack(Moditems.MOB_ESSENCE, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CHAOTIC_EMERALD, 2),
                            new ItemStack(Moditems.PENTANOMICON, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CHAOTIC_EMERALD, 2),
                            new ItemStack(Moditems.MAGIC_BOOK, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 6),
                            new ItemStack(Moditems.PRIMAL_FLAME, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.SKY_TRINKET, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.SPARK_BOTTLE, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.THUNDER_DUST, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.THUNDER_FRAGMENT, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 6),
                            new ItemStack(Moditems.WATER_CORE, 1),
                            1, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 5),
                            new ItemStack(Moditems.WIND_CHARGE, 1),
                            1, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_SAGE, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CHAOTIC_EMERALD, 1),
                            new ItemStack(Moditems.PENTACRAFTIUM_CORE, 1),
                            4, 5, 0.00f));
                }
        );

        // ---------------------------------------------------------------------------------------
        // -------------------------------    CONSTRUCTOR     ------------------------------------
        // ---------------------------------------------------------------------------------------

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_CONSTRUCTOR, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.FRACTAL_PACKED_PLANKS.getRight(), 18),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.DARK_MATTER_PACKED_PLANKS.getRight(), 18),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.QUASAR_PACKED_PLANKS.getRight(), 18),
                            4, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.QUANTUM_PACKED_PLANKS.getRight(), 18),
                            4, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_CONSTRUCTOR, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.ZAMBONIUM_BRICK.getRight(), 4),
                            8, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.LUKITE_BRICK.getRight(), 4),
                            8, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.ROBERTIUM_BRICK.getRight(), 4),
                            8, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.TOMINITE_BRICK.getRight(), 4),
                            8, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_CONSTRUCTOR, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.KEVINIUM_BRICK.getRight(), 4),
                            8, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.PANCHIUM_BRICK.getRight(), 4),
                            8, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.JUANITIUM_BRICK.getRight(), 4),
                            8, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.SARITE_BRICK.getRight(), 4),
                            8, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_CONSTRUCTOR, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 2),
                            new ItemStack(Ores.PENTACRAFTIUM_ANTIMATTER_LANTERN.getRight(), 1),
                            10, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 2),
                            new ItemStack(Ores.PENTACRAFTIUM_BIG_BANG_LANTERN.getRight(), 1),
                            10, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_CONSTRUCTOR, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.STELLAR_MARBLE_BRICKS.getRight(), 18),
                            6, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.FULGURATION_BRICKS.getRight(), 18),
                            6, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.CAVE_MUD_BRICK.getRight(), 18),
                            6, 5, 0.00f));
                }
        );

        // ---------------------------------------------------------------------------------------
        // ---------------------------------     DECORATOR      -----------------------------------
        // ---------------------------------------------------------------------------------------

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_DECORATOR, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.STELLAR_MARBLE_STONE.getRight(), 24),
                            6, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.FULGURATION_STONE.getRight(), 24),
                            6, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.CAVE_MUD_BLOCK.getRight(), 24),
                            6, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_DECORATOR, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.STELLAR_MARBLE_CHISELED.getRight(), 12),
                            6, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.FULGURATION_CHISELED.getRight(), 12),
                            6, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.DISTORSION_EMERALD, 2),
                            new ItemStack(Ores.CAVE_MUD_CHISELED.getRight(), 12),
                            6, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_DECORATOR, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 2),
                            new ItemStack(Ores.PENTACRAFTIUM_INFINITY_LANTERN.getRight(), 1),
                            10, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 2),
                            new ItemStack(Ores.PENTACRAFTIUM_ETERNAL_LANTERN.getRight(), 1),
                            10, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 2),
                            new ItemStack(Ores.PENTACRAFTIUM_ORIGIN_LANTERN.getRight(), 1),
                            10, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 2),
                            new ItemStack(Ores.PENTACRAFTIUM_CUANTIC_LANTERN.getRight(), 1),
                            10, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_DECORATOR, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.PENTACRAFTIUM_GLASS.getRight(), 16),
                            4, 5, 0.00f));
                }
        );

        TradeOfferHelper.registerVillagerOffers(ModVillager.DIMENSIONAL_DECORATOR, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.BEGINNING_STONE.getRight(), 8),
                            6, 5, 0.00f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Moditems.CORRUPTED_EMERALD, 1),
                            new ItemStack(Ores.BEGINNING_STONE_BRICK.getRight(), 8),
                            6, 5, 0.00f));

                }
        );

    }
}
