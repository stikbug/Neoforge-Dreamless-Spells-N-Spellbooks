package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.block.ModBlocks;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SLEEPLESSCLOTHBLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SLEEPLESSCLOTH.get())
                .unlockedBy("has_sleepless_cloth", has(ModItems.SLEEPLESSCLOTH)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SLEEPLESSCLOTH.get())
                .pattern(" S ")
                .pattern("SWS")
                .pattern(" S ")
                .define('S', Items.PHANTOM_MEMBRANE)
                .define('W', Items.WHITE_WOOL)
                .unlockedBy("has_wool", has(Items.WHITE_WOOL)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SLEEPLESSCHAIN.get())
                .pattern("CSC")
                .pattern("S S")
                .pattern("CSC")
                .define('S', Items.PHANTOM_MEMBRANE)
                .define('C', Items.CHAIN)
                .unlockedBy("has_chain", has(Items.CHAIN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SLEEPLESSHELMET.get())
                .pattern("SSS")
                .pattern("W W")
                .pattern("   ")
                .define('S', ModItems.SLEEPLESSCHAIN.get())
                .define('W', ModItems.SLEEPLESSCLOTH.get())
                .unlockedBy("has_sleepless_chain", has(ModItems.SLEEPLESSCHAIN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SLEEPLESSCHESTPLATE.get())
                .pattern("S S")
                .pattern("WSW")
                .pattern("WWW")
                .define('S', ModItems.SLEEPLESSCHAIN.get())
                .define('W', ModItems.SLEEPLESSCLOTH.get())
                .unlockedBy("has_sleepless_chain", has(ModItems.SLEEPLESSCHAIN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SLEEPLESSLEGGINGS.get())
                .pattern("WWW")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SLEEPLESSCHAIN.get())
                .define('W', ModItems.SLEEPLESSCLOTH.get())
                .unlockedBy("has_sleepless_chain", has(ModItems.SLEEPLESSCHAIN)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SLEEPLESSBOOTS.get())
                .pattern("S S")
                .pattern("W W")
                .pattern("   ")
                .define('S', ModItems.SLEEPLESSCHAIN.get())
                .define('W', ModItems.SLEEPLESSCLOTH.get())
                .unlockedBy("has_sleepless_chain", has(ModItems.SLEEPLESSCHAIN)).save(recipeOutput);
// Start of the shapeless recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SLEEPLESSCLOTH.get(), 9)
                .requires(ModBlocks.SLEEPLESSCLOTHBLOCK)
                .unlockedBy("has_sleepless_cloth_block", has(ModBlocks.SLEEPLESSCLOTHBLOCK))
                .save(recipeOutput,"dreamless_spells:sleepless_cloth_from_sleepless_cloth_block");
    }
}
