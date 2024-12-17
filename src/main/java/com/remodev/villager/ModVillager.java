package com.remodev.villager;

import com.google.common.collect.ImmutableSet;
import com.remodev.PentacraftOres;
import com.remodev.blocks.Ores;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillager {

    public static final RegistryKey<PointOfInterestType> SAGE_POI_KEY = poiKey("sage_poi");
    public static final PointOfInterestType SAGE_POI = registerPoi("sage_poi", Ores.PENTACRAFTIUM_INFINITY_CATALYST.getLeft());
    public static final VillagerProfession DIMENSIONAL_SAGE = registerProfession("dimensional_sage", SAGE_POI_KEY);

    public static final RegistryKey<PointOfInterestType> CONSTRUCTOR_POI_KEY = poiKey("constructor_poi");
    public static final PointOfInterestType CONSTRUCTOR_POI = registerPoi("constructor_poi", Ores.PENTACRAFTIUM_ORIGIN_CATALYST.getLeft());
    public static final VillagerProfession DIMENSIONAL_CONSTRUCTOR = registerProfession("dimensional_constructor", CONSTRUCTOR_POI_KEY);

    public static final RegistryKey<PointOfInterestType> DECORATOR_POI_KEY = poiKey("decorator_poi");
    public static final PointOfInterestType DECORATOR_POI = registerPoi("decorator_poi", Ores.PENTACRAFTIUM_ETERNAL_CATALYST.getLeft());
    public static final VillagerProfession DIMENSIONAL_DECORATOR = registerProfession("dimensional_decorator", DECORATOR_POI_KEY);

    public static final RegistryKey<PointOfInterestType> FARMER_POI_KEY = poiKey("d_farmer_poi");
    public static final PointOfInterestType FARMER_POI = registerPoi("d_farmer_poi", Ores.PENTACRAFTIUM_CUANTIC_CATALYST.getLeft());
    public static final VillagerProfession DIMENSIONAL_FARMER = registerProfession("dimensional_farmer", FARMER_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(PentacraftOres.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(PentacraftOres.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name){
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(PentacraftOres.MOD_ID, name));
    }

    public static void registerVillager() {
        PentacraftOres.LOGGER.info("Registering Villagers");
    }
}
