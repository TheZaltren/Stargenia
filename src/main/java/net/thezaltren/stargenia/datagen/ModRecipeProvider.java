package net.thezaltren.stargenia.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.thezaltren.stargenia.block.ModBlocks;
import net.thezaltren.stargenia.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Cosmic Fragments to Cosmic Shard
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COSMIC_SHARD.get())
                .pattern("   ")
                .pattern(" BB")
                .pattern(" BB")
                .define('B', ModItems.COSMIC_FRAGMENT.get())
                .unlockedBy("has_cosmic_fragment", has(ModItems.COSMIC_FRAGMENT.get()))
                .save(recipeOutput);
        //Cosmic Shard to Cosmic Core
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COSMIC_CORE.get())
                .pattern("ABA")
                .pattern("BAB")
                .pattern("ABA")
                .define('B', ModItems.COSMIC_SHARD.get())
                .define('A', ModItems.COSMIC_INGOT.get())
                .unlockedBy("has_cosmic_ingot", has(ModItems.COSMIC_INGOT.get()))
                .unlockedBy("has_cosmic_shard", has(ModItems.COSMIC_SHARD.get()))
                .save(recipeOutput);
        //Shaped Recipe for Cosmic Star Base Recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COSMIC_STAR.get())
                .pattern("BBB")
                .pattern("ACA")
                .pattern("BAB")
                .define('B', ModItems.COSMIC_SHARD.get())
                .define('A', ModItems.COSMIC_INGOT.get())
                .define('C', ModItems.COSMIC_CORE.get())
                .unlockedBy("has_cosmic_ingot", has(ModItems.COSMIC_INGOT.get()))
                .unlockedBy("has_cosmic_shard", has(ModItems.COSMIC_SHARD.get()))
                .unlockedBy("has_cosmic_core", has(ModItems.COSMIC_CORE.get()))
                .save(recipeOutput);
        //Shaped Recipes for the Cosmic Star Block and compressed variants
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.COSMIC_STAR.get())
                .unlockedBy("has_cosmic_star", has(ModItems.COSMIC_STAR.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X1.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK.get())
                .unlockedBy("has_cosmic_star_block", has(ModBlocks.COSMIC_STAR_BLOCK.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X2.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK_X1.get())
                .unlockedBy("has_cosmic_star_block_x1", has(ModBlocks.COSMIC_STAR_BLOCK_X1.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X3.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK_X2.get())
                .unlockedBy("has_cosmic_star_block_x2", has(ModBlocks.COSMIC_STAR_BLOCK_X2.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X4.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK_X3.get())
                .unlockedBy("has_cosmic_star_block_x3", has(ModBlocks.COSMIC_STAR_BLOCK_X3.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X5.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK_X4.get())
                .unlockedBy("has_cosmic_star_block_x4", has(ModBlocks.COSMIC_STAR_BLOCK_X4.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X6.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK_X5.get())
                .unlockedBy("has_cosmic_star_block_x5", has(ModBlocks.COSMIC_STAR_BLOCK_X5.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X7.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK_X6.get())
                .unlockedBy("has_cosmic_star_block_x6", has(ModBlocks.COSMIC_STAR_BLOCK_X6.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X8.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK_X7.get())
                .unlockedBy("has_cosmic_star_block_x7", has(ModBlocks.COSMIC_STAR_BLOCK_X7.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X9.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COSMIC_STAR_BLOCK_X8.get())
                .unlockedBy("has_cosmic_star_block_x8", has(ModBlocks.COSMIC_STAR_BLOCK_X8.get()))
                .save(recipeOutput);


        //Shapeless Recipes for the Cosmic Star Block and compressed variants
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COSMIC_STAR.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK.get())
                .unlockedBy("has_cosmic_block", has(ModBlocks.COSMIC_STAR_BLOCK)).save(recipeOutput,"cosmic_star_from_cosmic_star_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X1.get())
                .unlockedBy("has_cosmic_block_x1", has(ModBlocks.COSMIC_STAR_BLOCK_X1)).save(recipeOutput, "cosmic_star_block_from_cosmic_star_block_x1");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X1.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X2.get())
                .unlockedBy("has_cosmic_block_x2", has(ModBlocks.COSMIC_STAR_BLOCK_X2)).save(recipeOutput, "cosmic_star_block_x1_from_cosmic_star_block_x2");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X2.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X3.get())
                .unlockedBy("has_cosmic_block_x3", has(ModBlocks.COSMIC_STAR_BLOCK_X3)).save(recipeOutput, "cosmic_star_block_x2_from_cosmic_star_block_x3");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X3.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X4.get())
                .unlockedBy("has_cosmic_block_x4", has(ModBlocks.COSMIC_STAR_BLOCK_X4)).save(recipeOutput, "cosmic_star_block_x3_from_cosmic_star_block_x4");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X4.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X5.get())
                .unlockedBy("has_cosmic_block_x5", has(ModBlocks.COSMIC_STAR_BLOCK_X5)).save(recipeOutput, "cosmic_star_block_x4_from_cosmic_star_block_x5");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X5.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X6.get())
                .unlockedBy("has_cosmic_block_x6", has(ModBlocks.COSMIC_STAR_BLOCK_X6)).save(recipeOutput, "cosmic_star_block_x5_from_cosmic_star_block_x6");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X6.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X7.get())
                .unlockedBy("has_cosmic_block_x7", has(ModBlocks.COSMIC_STAR_BLOCK_X7)).save(recipeOutput, "cosmic_star_block_x6_from_cosmic_star_block_x7");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X7.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X8.get())
                .unlockedBy("has_cosmic_block_x8", has(ModBlocks.COSMIC_STAR_BLOCK_X8)).save(recipeOutput, "cosmic_star_block_x7_from_cosmic_star_block_x8");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COSMIC_STAR_BLOCK_X8.get(), 9)
                .requires(ModBlocks.COSMIC_STAR_BLOCK_X9.get())
                .unlockedBy("has_cosmic_block_x9", has(ModBlocks.COSMIC_STAR_BLOCK_X9)).save(recipeOutput, "cosmic_star_block_x8_from_cosmic_star_block_x9");



    }

}
