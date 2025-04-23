package net.Iceforkkk.DreamlessAditions.datagen;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.Iceforkkk.DreamlessAditions.block.ModBlocks;
import net.Iceforkkk.DreamlessAditions.item.curios.NetheriteGreavesCurio;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HUNTER_BOOTS.get())
                .pattern("LCL")
                .pattern("L L")
                .pattern("   ")
                .define('L', Items.LEATHER)
                .define('C', ModItems.CLOTH_BOOTS.get())
                .unlockedBy("has_cloth_boots", has(ModItems.CLOTH_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VAMPIRE_BARON_BOOTS.get())
                .pattern("BHB")
                .pattern("I I")
                .pattern("   ")
                .define('B', ItemRegistry.BLOOD_VIAL.get())
                .define('I', ItemRegistry.INK_RARE.get())
                .define('H', ModItems.HUNTER_BOOTS.get())
                .unlockedBy("has_hunter_boots", has(ModItems.HUNTER_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VAMPIRE_EARL_BOOTS.get())
                .pattern("BVB")
                .pattern("I I")
                .pattern("   ")
                .define('B', ItemRegistry.BLOOD_VIAL.get())
                .define('I', ItemRegistry.INK_EPIC.get())
                .define('V', ModItems.VAMPIRE_BARON_BOOTS.get())
                .unlockedBy("has_vampire_baron_boots", has(ModItems.VAMPIRE_BARON_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VAMPIRE_KING_BOOTS.get())
                .pattern("BVB")
                .pattern("I I")
                .pattern("   ")
                .define('B', ItemRegistry.BLOOD_VIAL.get())
                .define('I', ItemRegistry.INK_LEGENDARY.get())
                .define('V', ModItems.VAMPIRE_EARL_BOOTS.get())
                .unlockedBy("has_vampire_earl_boots", has(ModItems.VAMPIRE_EARL_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRAHAMS_BOOTS.get())
                .pattern("VCM")
                .pattern("I I")
                .pattern("   ")
                .define('C', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('V', ModItems.VAMPIRE_KING_BOOTS.get())
                .define('M', ModItems.MAGI_BOOTS.get())
                .define('I', ItemRegistry.INK_LEGENDARY.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLASS_BOOTS.get())
                .pattern("GOG")
                .pattern("G G")
                .pattern("   ")
                .define('G', Items.GLASS)
                .define('O', ModItems.OLD_BOOTS.get())
                .unlockedBy("has_old_boots", has(ModItems.OLD_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TEMPERED_GLASS_BOOTS.get())
                .pattern("TGT")
                .pattern("T T")
                .pattern("   ")
                .define('T', Items.TINTED_GLASS)
                .define('G', ModItems.GLASS_BOOTS.get())
                .unlockedBy("has_glass_boots", has(ModItems.GLASS_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AMETHYST_BOOTS.get())
                .pattern("AGA")
                .pattern("A A")
                .pattern("   ")
                .define('A', Items.AMETHYST_BLOCK)
                .define('G', ModItems.GLASS_BOOTS.get())
                .unlockedBy("has_glass_boots", has(ModItems.GLASS_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARCANE_CRYSTAL_BOOTS.get())
                .pattern("CAC")
                .pattern("C C")
                .pattern("   ")
                .define('C', ModItems.ARCANEGEM.get())
                .define('A', ModItems.AMETHYST_BOOTS.get())
                .unlockedBy("has_amethyst_boots", has(ModItems.AMETHYST_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_BOOTS.get())
                .pattern("EAE")
                .pattern("E E")
                .pattern("   ")
                .define('E', Items.EMERALD_BLOCK)
                .define('A', ModItems.ARCANE_CRYSTAL_BOOTS.get())
                .unlockedBy("has_arcane_crystal_boots", has(ModItems.ARCANE_CRYSTAL_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JADE_BOOTS.get())
                .pattern("JEJ")
                .pattern("J J")
                .pattern("   ")
                .define('J', ModItems.JADE.get())
                .define('E', ModItems.EMERALD_BOOTS.get())
                .unlockedBy("has_emerald_boots", has(ModItems.EMERALD_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UNDEFEATED_BOOTS.get())
                .pattern("QJQ")
                .pattern("QSQ")
                .pattern("   ")
                .define('Q', Items.QUARTZ)
                .define('J', ModItems.JADE_BOOTS.get())
                .define('S', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_jade_boots", has(ModItems.JADE_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEGEND_BOOTS.get())
                .pattern(" P ")
                .pattern("BDU")
                .pattern(" F ")
                .define('F', ItemRegistry.BOOTS_OF_SPEED.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('B', ModItems.BRAHAMS_BOOTS.get())
                .define('U', ModItems.UNDEFEATED_BOOTS.get())
                .define('P', ModItems.PAGMAS_BOOTS.get())
                .unlockedBy("has_undefeated_boots", has(ModItems.UNDEFEATED_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PYRIUM_BOOTS.get())
                .pattern("PNP")
                .pattern("P P")
                .pattern("   ")
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('N', ModItems.NETHERITE_GREAVES.get())
                .unlockedBy("has_netherite_greaves", has(ModItems.NETHERITE_GREAVES)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGMAS_BOOTS.get())
                .pattern("PST")
                .pattern("I I")
                .pattern("   ")
                .define('I', ItemRegistry.PYRIUM_INGOT.get() )
                .define('P', ModItems.PYRIUM_BOOTS.get())
                .define('T', ModItems.TUNGSTEN_BOOTS.get())
                .define('S', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TUNGSTENBLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TUNGSTENINGOT.get())
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_BOOTS.get())
                .pattern("TBT")
                .pattern("T T")
                .pattern("   ")
                .define('B', ModItems.TANK_BOOTS.get())
                .define('T', ModBlocks.TUNGSTENBLOCK.get())
                .unlockedBy("has_tank_boos", has(ModItems.TANK_BOOTS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OLD_BOOTS.get())
                .pattern("L L")
                .pattern("L L")
                .pattern("L L")
                .define('L', Items.LEATHER)
                .unlockedBy("has_leather", has(Items.LEATHER)).save(recipeOutput);

//Shapeless recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SLEEPLESSCLOTH.get(), 9)
                .requires(ModBlocks.SLEEPLESSCLOTHBLOCK)
                .unlockedBy("has_sleepless_cloth_block", has(ModBlocks.SLEEPLESSCLOTHBLOCK))
                .save(recipeOutput,"dreamless_spells:sleepless_cloth_from_sleepless_cloth_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTENINGOT.get(), 9)
                .requires(ModBlocks.TUNGSTENBLOCK)
                .unlockedBy("has_tungsten_block", has(ModBlocks.TUNGSTENBLOCK))
                .save(recipeOutput,"dreamless_spells:tungsten_ingot_from_tungsten_block");
// Smithing Recipes
        //SmithingTransformRecipeBuilder.smithing(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.SCRAPPED_BOOTS, Items.NETHERITE_INGOT, RecipeCategory.MISC, result)
                //.unlocks("scrappec_boots", has(ModItems.SCRAPPED_BOOTS)) // How the recipe is unlocked
                //.save(ModItems.NETHERITE_GREAVES,); // Add data to builder
//Smelting Recipes
        List<ItemLike> TUNGSTEN_SMELTABLES = List.of(ModItems.RAWTUNGSTEN,
                ModBlocks.TUNGSTENORE);

        oreSmelting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTENINGOT.get(), 0.25f, 200, "tungsten_ingot");
        oreBlasting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTENINGOT.get(), 0.25f, 100, "tungsten_ingot");


    }
}
