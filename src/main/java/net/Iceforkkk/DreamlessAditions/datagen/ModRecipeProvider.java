package net.Iceforkkk.DreamlessAditions.datagen;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_BOOTS.get())
                .pattern("COC")
                .pattern("C C")
                .pattern("   ")
                .define('C', Items.COPPER_INGOT)
                .define('O', ModItems.OLD_BOOTS.get())
                .unlockedBy("has_old_boots", has(ModItems.OLD_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_SOCKS.get())
                .pattern("ICI")
                .pattern("I I")
                .pattern("   ")
                .define('I', Items.IRON_INGOT)
                .define('C', ModItems.COPPER_BOOTS.get())
                .unlockedBy("has_copper_boots", has(ModItems.COPPER_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TANK_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', Items.IRON_BLOCK)
                .define('D', ModItems.DEEP_DIVERS.get())
                .unlockedBy("has_deep_diver", has(ModItems.DEEP_DIVERS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEEP_DIVERS.get())
                .pattern("SIS")
                .pattern("B B")
                .pattern("   ")
                .define('S', Items.SPONGE)
                .define('I', ModItems.IRON_SOCKS.get())
                .define('B', Items.BLUE_ICE)
                .unlockedBy("has_iron_socks", has(ModItems.IRON_SOCKS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARCANEGEM.get(), 2)
                .pattern(" A ")
                .pattern("ADA")
                .pattern(" A ")
                .define('D', Items.DIAMOND)
                .define('A', ItemRegistry.ARCANE_ESSENCE.get())
                .unlockedBy("has_diamons", has(Items.DIAMOND)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_GREAVES.get())
                .pattern("GCG")
                .pattern("B B")
                .pattern("   ")
                .define('G', Items.GOLD_INGOT)
                .define('C', ModItems.COPPER_BOOTS.get())
                .define('B', Items.GOLD_BLOCK)
                .unlockedBy("has_copper_boots", has(ModItems.COPPER_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCRAPPED_BOOTS.get())
                .pattern("SGS")
                .pattern("S S")
                .pattern("   ")
                .define('S', Items.NETHERITE_SCRAP)
                .define('G', ModItems.GOLDEN_GREAVES.get())
                .unlockedBy("has_golden_greaves", has(ModItems.GOLDEN_GREAVES)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CLOTH_BOOTS.get())
                .pattern("WOW")
                .pattern("W W")
                .pattern("   ")
                .define('W', Items.WHITE_WOOL)
                .define('O', ModItems.OLD_BOOTS.get())
                .unlockedBy("has_old_boots", has(ModItems.OLD_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARCANE_CLOTH_BOOTS.get())
                .pattern("ACA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ItemRegistry.MAGIC_CLOTH.get())
                .define('C', ModItems.CLOTH_BOOTS.get())
                .unlockedBy("has_cloth_boots", has(ModItems.CLOTH_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGE_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', ItemRegistry.INK_RARE.get())
                .define('D', ModItems.ARCANE_CLOTH_BOOTS.get())
                .unlockedBy("has_arcane_cloth_boots", has(ModItems.ARCANE_CLOTH_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARCHMAGE_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', ItemRegistry.INK_EPIC.get())
                .define('D', ModItems.MAGE_BOOTS.get())
                .unlockedBy("has_mage_boots", has(ModItems.MAGE_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGI_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', ItemRegistry.INK_LEGENDARY.get())
                .define('D', ModItems.ARCHMAGE_BOOTS.get())
                .unlockedBy("has_archmage_boots", has(ModItems.ARCHMAGE_BOOTS)).save(recipeOutput);
// Start of the shapeless recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SLEEPLESSCLOTH.get(), 9)
                .requires(ModBlocks.SLEEPLESSCLOTHBLOCK)
                .unlockedBy("has_sleepless_cloth_block", has(ModBlocks.SLEEPLESSCLOTHBLOCK))
                .save(recipeOutput,"dreamless_spells:sleepless_cloth_from_sleepless_cloth_block");

    }
}
