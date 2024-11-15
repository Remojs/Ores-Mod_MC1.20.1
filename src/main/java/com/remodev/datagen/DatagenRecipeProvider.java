package com.remodev.datagen;

import com.remodev.blocks.Ores;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

import java.util.function.Consumer;

public class DatagenRecipeProvider extends FabricRecipeProvider {

    public DatagenRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.ZAMBONIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, Ores.ZAMBONIUM_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.ROBERTIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, Ores.ROBERTIUM_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.KEVINIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, Ores.KEVINIUM_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.JUANITIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, Ores.JUANITIUM_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.PANCHIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, Ores.PANCHIUM_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.SARITE_INGOT, RecipeCategory.BUILDING_BLOCKS, Ores.SARITE_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.TOMINITE_INGOT, RecipeCategory.BUILDING_BLOCKS, Ores.TOMINITE_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.LUKITE_INGOT, RecipeCategory.BUILDING_BLOCKS, Ores.LUKITE_BLOCK.getRight());

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.PENTACRAFTIUM_DUST, RecipeCategory.BUILDING_BLOCKS, Ores.PENTACRAFTIUM_BLOCK.getRight());

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.ZAMBONIUM_SHARD, RecipeCategory.BUILDING_BLOCKS, Ores.ZAMBONIUM_SHARD_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.ROBERTIUM_SHARD, RecipeCategory.BUILDING_BLOCKS, Ores.ROBERTIUM_SHARD_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.KEVINIUM_SHARD, RecipeCategory.BUILDING_BLOCKS, Ores.KEVINIUM_SHARD_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.JUANITIUM_SHARD, RecipeCategory.BUILDING_BLOCKS, Ores.JUANITIUM_SHARD_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.PANCHIUM_SHARD, RecipeCategory.BUILDING_BLOCKS, Ores.PANCHIUM_SHARD_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.SARITE_SHARD, RecipeCategory.BUILDING_BLOCKS, Ores.SARITE_SHARD_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.TOMINITE_SHARD, RecipeCategory.BUILDING_BLOCKS, Ores.TOMINITE_SHARD_BLOCK.getRight());
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Moditems.LUKITE_SHARD, RecipeCategory.BUILDING_BLOCKS, Ores.LUKITE_SHARD_BLOCK.getRight());



        //Espadas
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ZAMBONIUM_SWORD)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.KEVINIUM_SWORD)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ROBERTIUM_SWORD)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.PANCHIUM_SWORD)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.JUANITIUM_SWORD)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.LUKITE_SWORD)
                .input('I', Moditems.LUKITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.SARITE_SWORD)
                .input('I', Moditems.SARITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.TOMINITE_SWORD)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_SWORD)));

        //Picos

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.TOMINITE_PICKAXE)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.SARITE_PICKAXE)
                .input('I', Moditems.SARITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.LUKITE_PICKAXE)
                .input('I', Moditems.LUKITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.PANCHIUM_PICKAXE)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.JUANITIUM_PICKAXE)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ROBERTIUM_PICKAXE)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.KEVINIUM_PICKAXE)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ZAMBONIUM_PICKAXE)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("PIP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_PICKAXE)));


        //Hacha

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ZAMBONIUM_AXE)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" II")
                .pattern("PSI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ROBERTIUM_AXE)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" II")
                .pattern("PSI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.KEVINIUM_AXE)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" II")
                .pattern("PSI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.JUANITIUM_AXE)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" II")
                .pattern("PSI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.PANCHIUM_AXE)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" II")
                .pattern("PSI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.LUKITE_AXE)
                .input('I', Moditems.LUKITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" II")
                .pattern("PSI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.SARITE_AXE)
                .input('I', Moditems.SARITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" II")
                .pattern("PSI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.TOMINITE_AXE)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" II")
                .pattern("PSI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_AXE)));

        //PALA

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ZAMBONIUM_SHOVEL)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ROBERTIUM_SHOVEL)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.KEVINIUM_SHOVEL)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.JUANITIUM_SHOVEL)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.PANCHIUM_SHOVEL)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.LUKITE_SHOVEL)
                .input('I', Moditems.LUKITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.SARITE_SHOVEL)
                .input('I', Moditems.SARITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.TOMINITE_SHOVEL)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("PIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_SHOVEL)));

        //AZADA

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ZAMBONIUM_HOE)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ROBERTIUM_HOE)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.KEVINIUM_HOE)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.JUANITIUM_HOE)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.PANCHIUM_HOE)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.LUKITE_HOE)
                .input('I', Moditems.LUKITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.SARITE_HOE)
                .input('I', Moditems.SARITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.TOMINITE_HOE)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IIP")
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_HOE)));

        //MARTILLO

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ZAMBONIUM_HAMMER)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .pattern("III")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.ROBERTIUM_HAMMER)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .pattern("III")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.KEVINIUM_HAMMER)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .pattern("III")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.PANCHIUM_HAMMER)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .pattern("III")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.JUANITIUM_HAMMER)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .pattern("III")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.LUKITE_HAMMER)
                .input('I', Moditems.LUKITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .pattern("III")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.SARITE_HAMMER)
                .input('I', Moditems.SARITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .pattern("III")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Moditems.TOMINITE_HAMMER)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .pattern("III")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_HAMMER)));

        //GREAT AXE

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ZAMBONIUM_GREAT_AXE)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .input('B',Ores.ZAMBONIUM_BLOCK.getLeft())
                .pattern("BBB")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_GREAT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ROBERTIUM_GREAT_AXE)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .input('B',Ores.ROBERTIUM_BLOCK.getLeft())
                .pattern("BBB")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_GREAT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.KEVINIUM_GREAT_AXE)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .input('B',Ores.KEVINIUM_BLOCK.getLeft())
                .pattern("BBB")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_GREAT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.JUANITIUM_GREAT_AXE)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .input('B',Ores.JUANITIUM_BLOCK.getLeft())
                .pattern("BBB")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_GREAT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.PANCHIUM_GREAT_AXE)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .input('B',Ores.PANCHIUM_BLOCK.getLeft())
                .pattern("BBB")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_GREAT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.LUKITE_GREAT_AXE)
                .input('I', Moditems.LUKITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .input('B',Ores.LUKITE_BLOCK.getLeft())
                .pattern("BBB")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_GREAT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.SARITE_GREAT_AXE)
                .input('I', Moditems.SARITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .input('B',Ores.SARITE_BLOCK.getLeft())
                .pattern("BBB")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_GREAT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.TOMINITE_GREAT_AXE)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('S', Items.STICK)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .input('C',Moditems.PENTACRAFTIUM_CORE)
                .input('B',Ores.TOMINITE_BLOCK.getLeft())
                .pattern("BBB")
                .pattern("ICI")
                .pattern("PSP")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_GREAT_AXE)));

        //LINGOTES

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.ZAMBONIUM_INGOT)
                .input('I', Moditems.ZAMBONIUM_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.ZAMBONIUM_SHARD), conditionsFromItem(Moditems.ZAMBONIUM_SHARD))
                .offerTo(exporter, new Identifier("pentacraft-ores", "zambonium_ingot_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.KEVINIUM_INGOT)
                .input('I', Moditems.KEVINIUM_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.KEVINIUM_SHARD), conditionsFromItem(Moditems.KEVINIUM_SHARD))
                .offerTo(exporter, new Identifier("pentacraft-ores", "kevinium_ingot_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.ROBERTIUM_INGOT)
                .input('I', Moditems.ROBERTIUM_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.ROBERTIUM_SHARD), conditionsFromItem(Moditems.ROBERTIUM_SHARD))
                .offerTo(exporter, new Identifier("pentacraft-ores", "robertium_ingot_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.JUANITIUM_INGOT)
                .input('I', Moditems.JUANITIUM_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.JUANITIUM_SHARD), conditionsFromItem(Moditems.JUANITIUM_SHARD))
                .offerTo(exporter, new Identifier("pentacraft-ores", "juanitium_ingot_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.PANCHIUM_INGOT)
                .input('I', Moditems.PANCHIUM_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.PANCHIUM_SHARD), conditionsFromItem(Moditems.PANCHIUM_SHARD))
                .offerTo(exporter, new Identifier("pentacraft-ores", "panchium_ingot_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.LUKITE_INGOT)
                .input('I', Moditems.LUKITE_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.LUKITE_SHARD), conditionsFromItem(Moditems.LUKITE_SHARD))
                .offerTo(exporter, new Identifier("pentacraft-ores", "lukite_ingot_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.SARITE_INGOT)
                .input('I', Moditems.SARITE_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.SARITE_SHARD), conditionsFromItem(Moditems.SARITE_SHARD))
                .offerTo(exporter, new Identifier("pentacraft-ores", "sarite_ingot_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.TOMINITE_INGOT)
                .input('I', Moditems.TOMINITE_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.TOMINITE_SHARD), conditionsFromItem(Moditems.TOMINITE_SHARD))
                .offerTo(exporter, new Identifier("pentacraft-ores", "tominite_ingot_shard"));


        //CORE

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.PENTACRAFTIUM_CORE)
                .input('Z', Moditems.ZAMBONIUM_SHARD)
                .input('R', Moditems.ROBERTIUM_SHARD)
                .input('K', Moditems.KEVINIUM_SHARD)
                .input('J', Moditems.JUANITIUM_SHARD)
                .input('C', Moditems.PANCHIUM_SHARD)
                .input('L', Moditems.LUKITE_SHARD)
                .input('S', Moditems.SARITE_SHARD)
                .input('T', Moditems.TOMINITE_SHARD)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("TLZ")
                .pattern("KPC")
                .pattern("SJR")
                .criterion(hasItem(Moditems.ZAMBONIUM_SHARD), conditionsFromItem(Moditems.ZAMBONIUM_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PENTACRAFTIUM_CORE)));

        //HELMET
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ZAMBONIUM_HELMET)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ROBERTIUM_HELMET)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.KEVINIUM_HELMET)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.JUANITIUM_HELMET)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.PANCHIUM_HELMET)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.LUKITE_HELMET)
                .input('I', Moditems.LUKITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.SARITE_HELMET)
                .input('I', Moditems.SARITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.TOMINITE_HELMET)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_HELMET)));

        //CHESTPLATE
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ZAMBONIUM_CHESTPLATE)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IPI")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ROBERTIUM_CHESTPLATE)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IPI")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.KEVINIUM_CHESTPLATE)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IPI")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.JUANITIUM_CHESTPLATE)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IPI")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.PANCHIUM_CHESTPLATE)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IPI")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.LUKITE_CHESTPLATE)
                .input('I', Moditems.LUKITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IPI")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.SARITE_CHESTPLATE)
                .input('I', Moditems.SARITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IPI")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.TOMINITE_CHESTPLATE)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("IPI")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_CHESTPLATE)));


        //LEGGINGS
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ZAMBONIUM_LEGGINGS)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("IPI")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ROBERTIUM_LEGGINGS)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("IPI")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.KEVINIUM_LEGGINGS)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("IPI")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.JUANITIUM_LEGGINGS)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("IPI")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.PANCHIUM_LEGGINGS)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("IPI")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.LUKITE_LEGGINGS)
                .input('I', Moditems.LUKITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("IPI")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.SARITE_LEGGINGS)
                .input('I', Moditems.SARITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("IPI")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.TOMINITE_LEGGINGS)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("IPI")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_LEGGINGS)));

        //BOOTS
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ZAMBONIUM_BOOTS)
                .input('I', Moditems.ZAMBONIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.ZAMBONIUM_INGOT), conditionsFromItem(Moditems.ZAMBONIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ZAMBONIUM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.ROBERTIUM_BOOTS)
                .input('I', Moditems.ROBERTIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.ROBERTIUM_INGOT), conditionsFromItem(Moditems.ROBERTIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.ROBERTIUM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.KEVINIUM_BOOTS)
                .input('I', Moditems.KEVINIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.KEVINIUM_INGOT), conditionsFromItem(Moditems.KEVINIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.KEVINIUM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.JUANITIUM_BOOTS)
                .input('I', Moditems.JUANITIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.JUANITIUM_INGOT), conditionsFromItem(Moditems.JUANITIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.JUANITIUM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.PANCHIUM_BOOTS)
                .input('I', Moditems.PANCHIUM_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.PANCHIUM_INGOT), conditionsFromItem(Moditems.PANCHIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.PANCHIUM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.LUKITE_BOOTS)
                .input('I', Moditems.LUKITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.LUKITE_INGOT), conditionsFromItem(Moditems.LUKITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.LUKITE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.SARITE_BOOTS)
                .input('I', Moditems.SARITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.SARITE_INGOT), conditionsFromItem(Moditems.SARITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.SARITE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Moditems.TOMINITE_BOOTS)
                .input('I', Moditems.TOMINITE_INGOT)
                .input('P', Moditems.PENTACRAFTIUM_DUST)
                .pattern("III")
                .pattern("IPI")
                .pattern("   ")
                .criterion(hasItem(Moditems.TOMINITE_INGOT), conditionsFromItem(Moditems.TOMINITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Moditems.TOMINITE_BOOTS)));

//ORE BRICKS ------------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.TOMINITE_BRICK.getRight(), 4)
                .input('P', Moditems.TOMINITE_SHARD)
                .input('I', Blocks.STONE_BRICKS)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.TOMINITE_SHARD), conditionsFromItem(Moditems.TOMINITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.TOMINITE_BRICK.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.TOMINITE_BRICK_SLAB.getRight(), 6)
                .input('I', Ores.TOMINITE_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.TOMINITE_BRICK.getRight()), conditionsFromItem(Ores.TOMINITE_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.TOMINITE_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.TOMINITE_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.TOMINITE_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.TOMINITE_BRICK.getRight()), conditionsFromItem(Ores.TOMINITE_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.TOMINITE_BRICK_STAIRS.getRight())));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.LUKITE_BRICK.getRight(), 4)
                .input('P', Moditems.LUKITE_SHARD)
                .input('I', Blocks.STONE_BRICKS)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.LUKITE_SHARD), conditionsFromItem(Moditems.LUKITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.LUKITE_BRICK.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.LUKITE_BRICK_SLAB.getRight(), 6)
                .input('I', Ores.LUKITE_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.LUKITE_BRICK.getRight()), conditionsFromItem(Ores.LUKITE_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.LUKITE_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.LUKITE_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.LUKITE_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.LUKITE_BRICK.getRight()), conditionsFromItem(Ores.LUKITE_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.LUKITE_BRICK_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.SARITE_BRICK.getRight(), 4)
                .input('P', Moditems.SARITE_SHARD)
                .input('I', Blocks.STONE_BRICKS)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.SARITE_SHARD), conditionsFromItem(Moditems.SARITE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.SARITE_BRICK.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.SARITE_BRICK_SLAB.getRight(), 6)
                .input('I', Ores.SARITE_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.SARITE_BRICK.getRight()), conditionsFromItem(Ores.SARITE_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.SARITE_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.SARITE_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.SARITE_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.SARITE_BRICK.getRight()), conditionsFromItem(Ores.SARITE_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.SARITE_BRICK_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.PANCHIUM_BRICK.getRight(), 4)
                .input('P', Moditems.PANCHIUM_SHARD)
                .input('I', Blocks.STONE_BRICKS)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.PANCHIUM_SHARD), conditionsFromItem(Moditems.PANCHIUM_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.PANCHIUM_BRICK.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.PANCHIUM_BRICK_SLAB.getRight(), 6)
                .input('I', Ores.PANCHIUM_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.PANCHIUM_BRICK.getRight()), conditionsFromItem(Ores.PANCHIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.PANCHIUM_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.PANCHIUM_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.PANCHIUM_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.PANCHIUM_BRICK.getRight()), conditionsFromItem(Ores.PANCHIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.PANCHIUM_BRICK_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.JUANITIUM_BRICK.getRight(), 4)
                .input('P', Moditems.JUANITIUM_SHARD)
                .input('I', Blocks.STONE_BRICKS)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.JUANITIUM_SHARD), conditionsFromItem(Moditems.JUANITIUM_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.JUANITIUM_BRICK.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.JUANITIUM_BRICK_SLAB.getRight(), 6)
                .input('I', Ores.JUANITIUM_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.JUANITIUM_BRICK.getRight()), conditionsFromItem(Ores.JUANITIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.JUANITIUM_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.JUANITIUM_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.JUANITIUM_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.JUANITIUM_BRICK.getRight()), conditionsFromItem(Ores.JUANITIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.JUANITIUM_BRICK_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.KEVINIUM_BRICK.getRight(), 4)
                .input('P', Moditems.KEVINIUM_SHARD)
                .input('I', Blocks.STONE_BRICKS)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.KEVINIUM_SHARD), conditionsFromItem(Moditems.KEVINIUM_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.KEVINIUM_BRICK.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.KEVINIUM_BRICK_SLAB.getRight(), 6)
                .input('I', Ores.KEVINIUM_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.KEVINIUM_BRICK.getRight()), conditionsFromItem(Ores.KEVINIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.KEVINIUM_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.KEVINIUM_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.KEVINIUM_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.KEVINIUM_BRICK.getRight()), conditionsFromItem(Ores.KEVINIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.KEVINIUM_BRICK_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.ROBERTIUM_BRICK.getRight(), 4)
                .input('P', Moditems.ROBERTIUM_SHARD)
                .input('I', Blocks.STONE_BRICKS)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.ROBERTIUM_SHARD), conditionsFromItem(Moditems.ROBERTIUM_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.ROBERTIUM_BRICK.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.ROBERTIUM_BRICK_SLAB.getRight(), 6)
                .input('I', Ores.ROBERTIUM_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.ROBERTIUM_BRICK.getRight()), conditionsFromItem(Ores.ROBERTIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.ROBERTIUM_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.ROBERTIUM_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.ROBERTIUM_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.ROBERTIUM_BRICK.getRight()), conditionsFromItem(Ores.ROBERTIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.ROBERTIUM_BRICK_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.ZAMBONIUM_BRICK.getRight(), 4)
                .input('P', Moditems.ZAMBONIUM_SHARD)
                .input('I', Blocks.STONE_BRICKS)
                .pattern(" I ")
                .pattern("IPI")
                .pattern(" I ")
                .criterion(hasItem(Moditems.ZAMBONIUM_SHARD), conditionsFromItem(Moditems.ZAMBONIUM_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.ZAMBONIUM_BRICK.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.ZAMBONIUM_BRICK_SLAB.getRight(), 6)
                .input('I', Ores.ZAMBONIUM_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.ZAMBONIUM_BRICK.getRight()), conditionsFromItem(Ores.ZAMBONIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.ZAMBONIUM_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.ZAMBONIUM_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.ZAMBONIUM_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.ZAMBONIUM_BRICK.getRight()), conditionsFromItem(Ores.ZAMBONIUM_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.ZAMBONIUM_BRICK_STAIRS.getRight())));

//DARK MATTER LOGS ------------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.DARK_MATTER_DOOR.getRight(), 3)
                .input('I', Ores.DARK_MATTER_PLANKS.getRight())
                .pattern("II ")
                .pattern("II ")
                .pattern("II ")
                .criterion(hasItem(Ores.DARK_MATTER_PLANKS.getRight()), conditionsFromItem(Ores.DARK_MATTER_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_DOOR.getRight())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.DARK_MATTER_PLANKS.getRight(), 4)
                .input(Ores.DARK_MATTER_LOG.getRight())
                .criterion("has_item", conditionsFromItem(Ores.DARK_MATTER_LOG.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_PLANKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.DARK_MATTER_PACKED_PLANKS.getRight(), 9)
                .input('I', Ores.DARK_MATTER_PLANKS.getRight())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Ores.DARK_MATTER_PLANKS.getRight()), conditionsFromItem(Ores.DARK_MATTER_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_PACKED_PLANKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.DARK_MATTER_STAIRS.getRight(), 4)
                .input('I', Ores.DARK_MATTER_PLANKS.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.DARK_MATTER_PLANKS.getRight()), conditionsFromItem(Ores.DARK_MATTER_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.DARK_MATTER_SLAB.getRight(), 3)
                .input('I', Ores.DARK_MATTER_PLANKS.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.DARK_MATTER_PLANKS.getRight()), conditionsFromItem(Ores.DARK_MATTER_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.DARK_MATTER_FENCE.getRight(), 3)
                .input('I', Ores.DARK_MATTER_PLANKS.getRight())
                .input('S', Items.STICK)
                .pattern("ISI")
                .pattern("ISI")
                .pattern("   ")
                .criterion(hasItem(Ores.DARK_MATTER_PLANKS.getRight()), conditionsFromItem(Ores.DARK_MATTER_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_FENCE.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.DARK_MATTER_FENCE_GATE.getRight())
                .input('I', Ores.DARK_MATTER_PLANKS.getRight())
                .input('S', Items.STICK)
                .pattern("SIS")
                .pattern("SIS")
                .pattern("   ")
                .criterion(hasItem(Ores.DARK_MATTER_PLANKS.getRight()), conditionsFromItem(Ores.DARK_MATTER_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_FENCE_GATE.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.DARK_MATTER_TRAPDOOR.getRight(), 2)
                .input('I', Ores.DARK_MATTER_PLANKS.getRight())
                .pattern("III")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.DARK_MATTER_PLANKS.getRight()), conditionsFromItem(Ores.DARK_MATTER_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_TRAPDOOR.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.DARK_MATTER_STRIPPED_LOG.getRight(), 2)
                .input('I', Ores.DARK_MATTER_LOG.getRight())
                .pattern("   ")
                .pattern("II ")
                .pattern("   ")
                .criterion(hasItem(Ores.DARK_MATTER_LOG.getRight()), conditionsFromItem(Ores.DARK_MATTER_LOG.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.DARK_MATTER_STRIPPED_LOG.getRight())));

        //-----------------------------------------------------------------------------------------------------------------------------------------

        //QUANTUM LOGS ------------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.QUANTUM_DOOR.getRight(), 3)
                .input('I', Ores.QUANTUM_PLANKS.getRight())
                .pattern("II ")
                .pattern("II ")
                .pattern("II ")
                .criterion(hasItem(Ores.QUANTUM_PLANKS.getRight()), conditionsFromItem(Ores.QUANTUM_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_DOOR.getRight())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUANTUM_PLANKS.getRight(), 4)
                .input(Ores.QUANTUM_LOG.getRight())
                .criterion("has_item", conditionsFromItem(Ores.QUANTUM_LOG.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_PLANKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUANTUM_PACKED_PLANKS.getRight(), 9)
                .input('I', Ores.QUANTUM_PLANKS.getRight())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Ores.QUANTUM_PLANKS.getRight()), conditionsFromItem(Ores.QUANTUM_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_PACKED_PLANKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUANTUM_STAIRS.getRight(), 4)
                .input('I', Ores.QUANTUM_PLANKS.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.QUANTUM_PLANKS.getRight()), conditionsFromItem(Ores.QUANTUM_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUANTUM_SLAB.getRight(), 3)
                .input('I', Ores.QUANTUM_PLANKS.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.QUANTUM_PLANKS.getRight()), conditionsFromItem(Ores.QUANTUM_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUANTUM_FENCE.getRight(), 3)
                .input('I', Ores.QUANTUM_PLANKS.getRight())
                .input('S', Items.STICK)
                .pattern("ISI")
                .pattern("ISI")
                .pattern("   ")
                .criterion(hasItem(Ores.QUANTUM_PLANKS.getRight()), conditionsFromItem(Ores.QUANTUM_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_FENCE.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.QUANTUM_FENCE_GATE.getRight())
                .input('I', Ores.QUANTUM_PLANKS.getRight())
                .input('S', Items.STICK)
                .pattern("SIS")
                .pattern("SIS")
                .pattern("   ")
                .criterion(hasItem(Ores.QUANTUM_PLANKS.getRight()), conditionsFromItem(Ores.QUANTUM_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_FENCE_GATE.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.QUANTUM_TRAPDOOR.getRight(), 2)
                .input('I', Ores.QUANTUM_PLANKS.getRight())
                .pattern("III")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.QUANTUM_PLANKS.getRight()), conditionsFromItem(Ores.QUANTUM_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_TRAPDOOR.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUANTUM_STRIPPED_LOG.getRight(), 2)
                .input('I', Ores.QUANTUM_LOG.getRight())
                .pattern("   ")
                .pattern("II ")
                .pattern("   ")
                .criterion(hasItem(Ores.QUANTUM_LOG.getRight()), conditionsFromItem(Ores.QUANTUM_LOG.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUANTUM_STRIPPED_LOG.getRight())));

        //-----------------------------------------------------------------------------------------------------------------------------------------

        //QUASAR LOGS ------------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.QUASAR_DOOR.getRight(), 3)
                .input('I', Ores.QUASAR_PLANKS.getRight())
                .pattern("II ")
                .pattern("II ")
                .pattern("II ")
                .criterion(hasItem(Ores.QUASAR_PLANKS.getRight()), conditionsFromItem(Ores.QUASAR_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_DOOR.getRight())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUASAR_PLANKS.getRight(), 4)
                .input(Ores.QUASAR_LOG.getRight())
                .criterion("has_item", conditionsFromItem(Ores.QUASAR_LOG.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_PLANKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUASAR_PACKED_PLANKS.getRight(), 9)
                .input('I', Ores.QUASAR_PLANKS.getRight())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Ores.QUASAR_PLANKS.getRight()), conditionsFromItem(Ores.QUASAR_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_PACKED_PLANKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUASAR_STAIRS.getRight(), 4)
                .input('I', Ores.QUASAR_PLANKS.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.QUASAR_PLANKS.getRight()), conditionsFromItem(Ores.QUASAR_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUASAR_SLAB.getRight(), 3)
                .input('I', Ores.QUASAR_PLANKS.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.QUASAR_PLANKS.getRight()), conditionsFromItem(Ores.QUASAR_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUASAR_FENCE.getRight(), 3)
                .input('I', Ores.QUASAR_PLANKS.getRight())
                .input('S', Items.STICK)
                .pattern("ISI")
                .pattern("ISI")
                .pattern("   ")
                .criterion(hasItem(Ores.QUASAR_PLANKS.getRight()), conditionsFromItem(Ores.QUASAR_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_FENCE.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.QUASAR_FENCE_GATE.getRight())
                .input('I', Ores.QUASAR_PLANKS.getRight())
                .input('S', Items.STICK)
                .pattern("SIS")
                .pattern("SIS")
                .pattern("   ")
                .criterion(hasItem(Ores.QUASAR_PLANKS.getRight()), conditionsFromItem(Ores.QUASAR_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_FENCE_GATE.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.QUASAR_TRAPDOOR.getRight(), 2)
                .input('I', Ores.QUASAR_PLANKS.getRight())
                .pattern("III")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.QUASAR_PLANKS.getRight()), conditionsFromItem(Ores.QUASAR_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_TRAPDOOR.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.QUASAR_STRIPPED_LOG.getRight(), 2)
                .input('I', Ores.QUASAR_LOG.getRight())
                .pattern("   ")
                .pattern("II ")
                .pattern("   ")
                .criterion(hasItem(Ores.QUASAR_LOG.getRight()), conditionsFromItem(Ores.QUASAR_LOG.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.QUASAR_STRIPPED_LOG.getRight())));

        //-----------------------------------------------------------------------------------------------------------------------------------------

        //QUASAR LOGS ------------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.FRACTAL_DOOR.getRight(), 3)
                .input('I', Ores.FRACTAL_PLANKS.getRight())
                .pattern("II ")
                .pattern("II ")
                .pattern("II ")
                .criterion(hasItem(Ores.FRACTAL_PLANKS.getRight()), conditionsFromItem(Ores.FRACTAL_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_DOOR.getRight())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FRACTAL_PLANKS.getRight(), 4)
                .input(Ores.FRACTAL_LOG.getRight())
                .criterion("has_item", conditionsFromItem(Ores.FRACTAL_LOG.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_PLANKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FRACTAL_PACKED_PLANKS.getRight(), 9)
                .input('I', Ores.FRACTAL_PLANKS.getRight())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .criterion(hasItem(Ores.FRACTAL_PLANKS.getRight()), conditionsFromItem(Ores.FRACTAL_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_PACKED_PLANKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FRACTAL_STAIRS.getRight(), 4)
                .input('I', Ores.FRACTAL_PLANKS.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.FRACTAL_PLANKS.getRight()), conditionsFromItem(Ores.FRACTAL_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FRACTAL_SLAB.getRight(), 3)
                .input('I', Ores.FRACTAL_PLANKS.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.FRACTAL_PLANKS.getRight()), conditionsFromItem(Ores.FRACTAL_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FRACTAL_FENCE.getRight(), 3)
                .input('I', Ores.FRACTAL_PLANKS.getRight())
                .input('S', Items.STICK)
                .pattern("ISI")
                .pattern("ISI")
                .pattern("   ")
                .criterion(hasItem(Ores.FRACTAL_PLANKS.getRight()), conditionsFromItem(Ores.FRACTAL_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_FENCE.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.FRACTAL_FENCE_GATE.getRight())
                .input('I', Ores.FRACTAL_PLANKS.getRight())
                .input('S', Items.STICK)
                .pattern("SIS")
                .pattern("SIS")
                .pattern("   ")
                .criterion(hasItem(Ores.FRACTAL_PLANKS.getRight()), conditionsFromItem(Ores.FRACTAL_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_FENCE_GATE.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Ores.FRACTAL_TRAPDOOR.getRight(), 2)
                .input('I', Ores.FRACTAL_PLANKS.getRight())
                .pattern("III")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.FRACTAL_PLANKS.getRight()), conditionsFromItem(Ores.FRACTAL_PLANKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_TRAPDOOR.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FRACTAL_STRIPPED_LOG.getRight(), 2)
                .input('I', Ores.FRACTAL_LOG.getRight())
                .pattern("   ")
                .pattern("II ")
                .pattern("   ")
                .criterion(hasItem(Ores.FRACTAL_LOG.getRight()), conditionsFromItem(Ores.FRACTAL_LOG.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FRACTAL_STRIPPED_LOG.getRight())));

        //-----------------------------------------------------------------------------------------------------------------------------------------

        //-----------------------------------------------------------------------------------------------------------------------------------------

        //LANTERN / GLASS --------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.PENTACRAFTIUM_ORIGIN_LANTERN.getRight(), 4)
                .input('B', Ores.PENTACRAFTIUM_BLOCK.getRight())
                .input('S', Moditems.ROBERTIUM_SHARD)
                .input('I', Moditems.JUANITIUM_SHARD)
                .pattern("SSS")
                .pattern("IBS")
                .pattern("III")
                .criterion(hasItem(Ores.PENTACRAFTIUM_BLOCK.getRight()), conditionsFromItem(Ores.PENTACRAFTIUM_BLOCK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.PENTACRAFTIUM_ORIGIN_LANTERN.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.PENTACRAFTIUM_ETERNAL_LANTERN.getRight(), 4)
                .input('B', Ores.PENTACRAFTIUM_BLOCK.getRight())
                .input('S', Moditems.SARITE_SHARD)
                .input('I', Moditems.TOMINITE_SHARD)
                .pattern("SSS")
                .pattern("IBS")
                .pattern("III")
                .criterion(hasItem(Ores.PENTACRAFTIUM_BLOCK.getRight()), conditionsFromItem(Ores.PENTACRAFTIUM_BLOCK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.PENTACRAFTIUM_ETERNAL_LANTERN.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.PENTACRAFTIUM_INFINITY_LANTERN.getRight(), 4)
                .input('B', Ores.PENTACRAFTIUM_BLOCK.getRight())
                .input('S', Moditems.PANCHIUM_SHARD)
                .input('I', Moditems.KEVINIUM_SHARD)
                .pattern("SSS")
                .pattern("IBS")
                .pattern("III")
                .criterion(hasItem(Ores.PENTACRAFTIUM_BLOCK.getRight()), conditionsFromItem(Ores.PENTACRAFTIUM_BLOCK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.PENTACRAFTIUM_INFINITY_LANTERN.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.PENTACRAFTIUM_CUANTIC_LANTERN.getRight(), 4)
                .input('B', Ores.PENTACRAFTIUM_BLOCK.getRight())
                .input('S', Moditems.ZAMBONIUM_SHARD)
                .input('I', Moditems.LUKITE_SHARD)
                .pattern("SSS")
                .pattern("IBS")
                .pattern("III")
                .criterion(hasItem(Ores.PENTACRAFTIUM_BLOCK.getRight()), conditionsFromItem(Ores.PENTACRAFTIUM_BLOCK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.PENTACRAFTIUM_CUANTIC_LANTERN.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.PENTACRAFTIUM_GLASS.getRight(), 8)
                .input('B', Moditems.PENTACRAFTIUM_DUST)
                .input('S', Blocks.GLASS)
                .pattern("SSS")
                .pattern("SBS")
                .pattern("SSS")
                .criterion(hasItem(Moditems.PENTACRAFTIUM_DUST), conditionsFromItem(Moditems.PENTACRAFTIUM_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.PENTACRAFTIUM_GLASS.getRight())));


        //-----------------------------------------------------------------------------------------------------------------------------------------

        //NEW BLOCKS SMELT ------------------------------------------------------------------------------------------------------------------------

        List<ItemConvertible> stellarMarbleCobblestone = List.of(Ores.STELLAR_MARBLE_COBBLESTONE.getRight().asItem());
        offerSmelting(exporter, stellarMarbleCobblestone, RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_STONE.getRight().asItem(), 0.1f, 200, "stellar_marble_cobblestone_to_stone");

        List<ItemConvertible> stellarMarbleSmooth = List.of(Ores.STELLAR_MARBLE_STONE.getRight().asItem());
        offerSmelting(exporter, stellarMarbleSmooth, RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_SMOOTH.getRight().asItem(), 0.1f, 200, "stellar_marble_stone_to_smooth");

        List<ItemConvertible> fulgurationCobblestone = List.of(Ores.FULGURATION_COBBLESTONE.getRight().asItem());
        offerSmelting(exporter, fulgurationCobblestone, RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_STONE.getRight().asItem(), 0.1f, 200, "fulguration_cobblestone_to_stone");

        List<ItemConvertible> fulgurationSmooth = List.of(Ores.FULGURATION_STONE.getRight().asItem());
        offerSmelting(exporter, fulgurationSmooth, RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_SMOOTH.getRight().asItem(), 0.1f, 200, "fulguration_stone_to_smooth");

        List<ItemConvertible> caveMudBlock = List.of(Ores.CAVE_MUD_BLOCK.getRight().asItem());
        offerSmelting(exporter, caveMudBlock, RecipeCategory.BUILDING_BLOCKS, Ores.CAVE_MUD_SMOOTH.getRight().asItem(), 0.1f, 200, "cave_mud_block_to_smooth");

        //-----------------------------------------------------------------------------------------------------------------------------------------

        //NEW BLOCKS BRICK CRAFT ------------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_BRICKS.getRight(), 4)
                .input('B', Ores.STELLAR_MARBLE_STONE.getRight())
                .pattern("   ")
                .pattern("BB ")
                .pattern("BB ")
                .criterion(hasItem(Ores.STELLAR_MARBLE_STONE.getRight()), conditionsFromItem(Ores.STELLAR_MARBLE_STONE.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.STELLAR_MARBLE_BRICKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_BRICKS.getRight(), 4)
                .input('B', Ores.FULGURATION_STONE.getRight())
                .pattern("   ")
                .pattern("BB ")
                .pattern("BB ")
                .criterion(hasItem(Ores.FULGURATION_STONE.getRight()), conditionsFromItem(Ores.FULGURATION_STONE.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FULGURATION_BRICKS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.CAVE_MUD_BRICK.getRight(), 4)
                .input('B', Ores.CAVE_MUD_BLOCK.getRight())
                .pattern("   ")
                .pattern("BB ")
                .pattern("BB ")
                .criterion(hasItem(Ores.CAVE_MUD_BLOCK.getRight()), conditionsFromItem(Ores.CAVE_MUD_BLOCK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.CAVE_MUD_BRICK.getRight())));

        //-----------------------------------------------------------------------------------------------------------------------------------------

        //NEW BLOCKS SLAB/STAIRS CRAFT ------------------------------------------------------------------------------------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_BRICKS_STAIRS.getRight(), 4)
                .input('I', Ores.STELLAR_MARBLE_BRICKS.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.STELLAR_MARBLE_BRICKS.getRight()), conditionsFromItem(Ores.STELLAR_MARBLE_BRICKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.STELLAR_MARBLE_BRICKS_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_BRICKS_SLAB.getRight(), 3)
                .input('I', Ores.STELLAR_MARBLE_BRICKS.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.STELLAR_MARBLE_BRICKS.getRight()), conditionsFromItem(Ores.STELLAR_MARBLE_BRICKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.STELLAR_MARBLE_BRICKS_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_SMOOTH_STAIRS.getRight(), 4)
                .input('I', Ores.STELLAR_MARBLE_SMOOTH.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.STELLAR_MARBLE_SMOOTH.getRight()), conditionsFromItem(Ores.STELLAR_MARBLE_SMOOTH.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.STELLAR_MARBLE_SMOOTH_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_SMOOTH_SLAB.getRight(), 3)
                .input('I', Ores.STELLAR_MARBLE_SMOOTH.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.STELLAR_MARBLE_SMOOTH.getRight()), conditionsFromItem(Ores.STELLAR_MARBLE_SMOOTH.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.STELLAR_MARBLE_SMOOTH_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_COBBLESTONE_STAIRS.getRight(), 4)
                .input('I', Ores.STELLAR_MARBLE_COBBLESTONE.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.STELLAR_MARBLE_COBBLESTONE.getRight()), conditionsFromItem(Ores.STELLAR_MARBLE_COBBLESTONE.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.STELLAR_MARBLE_COBBLESTONE_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.STELLAR_MARBLE_COBBLESTONE_SLAB.getRight(), 3)
                .input('I', Ores.STELLAR_MARBLE_COBBLESTONE.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.STELLAR_MARBLE_COBBLESTONE.getRight()), conditionsFromItem(Ores.STELLAR_MARBLE_COBBLESTONE.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.STELLAR_MARBLE_COBBLESTONE_SLAB.getRight())));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_BRICKS_STAIRS.getRight(), 4)
                .input('I', Ores.FULGURATION_BRICKS.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.FULGURATION_BRICKS.getRight()), conditionsFromItem(Ores.FULGURATION_BRICKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FULGURATION_BRICKS_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_BRICKS_SLAB.getRight(), 3)
                .input('I', Ores.FULGURATION_BRICKS.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.FULGURATION_BRICKS.getRight()), conditionsFromItem(Ores.FULGURATION_BRICKS.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FULGURATION_BRICKS_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_SMOOTH_STAIRS.getRight(), 4)
                .input('I', Ores.FULGURATION_SMOOTH.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.FULGURATION_SMOOTH.getRight()), conditionsFromItem(Ores.FULGURATION_SMOOTH.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FULGURATION_SMOOTH_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_SMOOTH_SLAB.getRight(), 3)
                .input('I', Ores.FULGURATION_SMOOTH.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.FULGURATION_SMOOTH.getRight()), conditionsFromItem(Ores.FULGURATION_SMOOTH.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FULGURATION_SMOOTH_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_COBBLESTONE_STAIRS.getRight(), 4)
                .input('I', Ores.FULGURATION_COBBLESTONE.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.FULGURATION_COBBLESTONE.getRight()), conditionsFromItem(Ores.FULGURATION_COBBLESTONE.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FULGURATION_COBBLESTONE_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.FULGURATION_COBBLESTONE_SLAB.getRight(), 3)
                .input('I', Ores.FULGURATION_COBBLESTONE.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.FULGURATION_COBBLESTONE.getRight()), conditionsFromItem(Ores.FULGURATION_COBBLESTONE.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.FULGURATION_COBBLESTONE_SLAB.getRight())));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.CAVE_MUD_BRICK_STAIRS.getRight(), 4)
                .input('I', Ores.CAVE_MUD_BRICK.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.CAVE_MUD_BRICK.getRight()), conditionsFromItem(Ores.CAVE_MUD_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.CAVE_MUD_BRICK_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.CAVE_MUD_BRICK_SLAB.getRight(), 3)
                .input('I', Ores.CAVE_MUD_BRICK.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.CAVE_MUD_BRICK.getRight()), conditionsFromItem(Ores.CAVE_MUD_BRICK.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.CAVE_MUD_BRICK_SLAB.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.CAVE_MUD_SMOOTH_STAIRS.getRight(), 4)
                .input('I', Ores.CAVE_MUD_SMOOTH.getRight())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .criterion(hasItem(Ores.CAVE_MUD_SMOOTH.getRight()), conditionsFromItem(Ores.CAVE_MUD_SMOOTH.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.CAVE_MUD_SMOOTH_STAIRS.getRight())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Ores.CAVE_MUD_SMOOTH_SLAB.getRight(), 3)
                .input('I', Ores.CAVE_MUD_SMOOTH.getRight())
                .pattern("   ")
                .pattern("III")
                .pattern("   ")
                .criterion(hasItem(Ores.CAVE_MUD_SMOOTH.getRight()), conditionsFromItem(Ores.CAVE_MUD_SMOOTH.getRight()))
                .offerTo(exporter, new Identifier(getRecipeName(Ores.CAVE_MUD_SMOOTH_SLAB.getRight())));


    }
}

