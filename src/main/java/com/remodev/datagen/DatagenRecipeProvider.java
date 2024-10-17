package com.remodev.datagen;

import com.remodev.blocks.Ores;
import com.remodev.items.Moditems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
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
    }
}

