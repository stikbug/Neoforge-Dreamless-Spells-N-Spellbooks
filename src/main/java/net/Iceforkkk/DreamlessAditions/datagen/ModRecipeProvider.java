package net.Iceforkkk.DreamlessAditions.datagen;

import com.mojang.datafixers.types.templates.Tag;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.Iceforkkk.DreamlessAditions.block.ModBlocks;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TUNGSTENBLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TUNGSTENINGOT.get())
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT.get())).save(recipeOutput);

        //Items ----------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTENINGOT.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TUNGSTENNUGGET.get())
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_MITHRIL_MIXTURE.get())
                .pattern(" T ")
                .pattern(" M ")
                .pattern("   ")
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', ModItems.TUNGSTENINGOT.get())
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARCANEGEM.get(), 2)
                .pattern(" A ")
                .pattern("ADA")
                .pattern(" A ")
                .define('D', Tags.Items.GEMS_DIAMOND)
                .define('A', ItemRegistry.ARCANE_ESSENCE.get())
                .unlockedBy("has_diamonds", has(Items.DIAMOND)).save(recipeOutput);

        //Holy Priest Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HOLYPRIESTHELMET.get())
                .pattern("PHP")
                .pattern("T T")
                .pattern("   ")
                .define('T', ModItems.TUNGSTENINGOT.get())
                .define('P', ModItems.PAVARIUM.get())
                .define('H', ItemRegistry.PRIEST_HELMET.get())
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HOLYPRIESTCHESTPLATE.get())
                .pattern("P P")
                .pattern("TCT")
                .pattern("PTP")
                .define('T', ModItems.TUNGSTENINGOT.get())
                .define('P', ModItems.PAVARIUM.get())
                .define('C', ItemRegistry.PRIEST_CHESTPLATE.get())
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HOLYPRIESTLEGGINGS.get())
                .pattern("TLT")
                .pattern("T T")
                .pattern("P P")
                .define('T', ModItems.TUNGSTENINGOT.get())
                .define('P', ModItems.PAVARIUM.get())
                .define('L', ItemRegistry.PRIEST_LEGGINGS.get())
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HOLYPRIESTBOOTS.get())
                .pattern("TBT")
                .pattern("P P")
                .pattern("   ")
                .define('T', ModItems.TUNGSTENINGOT.get())
                .define('P', ModItems.PAVARIUM.get())
                .define('B', ItemRegistry.PRIEST_BOOTS.get())
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT)).save(recipeOutput);

        //Boots Curios ----------------------------------------------------------------------------------------------------
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_BOOTS.get())
                .pattern("COC")
                .pattern("C C")
                .pattern("   ")
                .define('C', Tags.Items.INGOTS_COPPER)
                .define('O', ModItems.OLD_BOOTS.get())
                .unlockedBy("has_old_boots", has(ModItems.OLD_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_SOCKS.get())
                .pattern("ICI")
                .pattern("I I")
                .pattern("   ")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('C', ModItems.COPPER_BOOTS.get())
                .unlockedBy("has_copper_boots", has(ModItems.COPPER_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TANK_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', Tags.Items.INGOTS_IRON)
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_GREAVES.get())
                .pattern("GCG")
                .pattern("B B")
                .pattern("   ")
                .define('G', Tags.Items.INGOTS_GOLD)
                .define('C', ModItems.COPPER_BOOTS.get())
                .define('B', Tags.Items.STORAGE_BLOCKS_GOLD)
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
                .define('W', ItemTags.WOOL)
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
                .define('L', Tags.Items.LEATHERS)
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
                .define('G', Tags.Items.GLASS_BLOCKS)
                .define('O', ModItems.OLD_BOOTS.get())
                .unlockedBy("has_old_boots", has(ModItems.OLD_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TEMPERED_GLASS_BOOTS.get())
                .pattern("TGT")
                .pattern("T T")
                .pattern("   ")
                .define('T', Tags.Items.GLASS_BLOCKS_TINTED)
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
                .define('E', Tags.Items.STORAGE_BLOCKS_EMERALD)
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
                .define('Q', Tags.Items.GEMS_QUARTZ)
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
                .define('L', Tags.Items.LEATHERS)
                .unlockedBy("has_leather", has(Items.LEATHER)).save(recipeOutput);

        //Tablet Recipes ----------------------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLANK_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.BLANK_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARCANE_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.MANA_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLOOD_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.BLOOD_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COOLDOWN_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.COOLDOWN_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDER_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.ENDER_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EVOCATION_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.EVOCATION_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIRE_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.FIRE_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HOLY_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.HOLY_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ICE_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.ICE_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIGHTNING_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.LIGHTNING_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NATURE_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.NATURE_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PROTECTION_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.PROTECTION_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        //Ring recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DORANS_RING.get())
                .pattern("PDP")
                .pattern("NMN")
                .pattern("PTP")
                .define('M', ItemRegistry.MANA_RING.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('N', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', ModItems.TUNGSTENINGOT.get())
                .define('P', ModItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ABSURD_RING.get())
                .pattern("PDP")
                .pattern("NMN")
                .pattern("PTP")
                .define('M', ItemRegistry.COOLDOWN_RING.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('N', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', ModItems.TUNGSTENINGOT.get())
                .define('P', ModItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELFIN_RING.get())
                .pattern("PDP")
                .pattern("NMN")
                .pattern("PTP")
                .define('M', ItemRegistry.BLOOD_STAFF.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('N', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', ModItems.TUNGSTENINGOT.get())
                .define('P', ModItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        //Mask recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SLAUGHTERERS_MASK.get())
                .pattern("MPM")
                .pattern("PSP")
                .pattern("MPM")
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('S', ItemRegistry.RUINED_BOOK.get())
                .define('P', ModItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);


        //Shapeless recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTENINGOT.get(), 9)
                .requires(ModBlocks.TUNGSTENBLOCK)
                .unlockedBy("has_tungsten_block", has(ModBlocks.TUNGSTENBLOCK))
                .save(recipeOutput,"dreamless_spells:tungsten_ingot_from_tungsten_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTENNUGGET.get(), 9)
                .requires(ModItems.TUNGSTENINGOT)
                .unlockedBy("has_tungsten_ingot", has(ModItems.TUNGSTENINGOT));

        //Smelting Recipes -----------------------------------------------------------------------------------------------------------------------------------------------
        List<ItemLike> TUNGSTEN_SMELTABLES = List.of(ModItems.RAWTUNGSTEN, ModBlocks.TUNGSTENORE);
        oreSmelting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTENINGOT.get(), 0.25f, 200, "tungsten_ingot");
        oreBlasting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, ModItems.TUNGSTENINGOT.get(), 0.25f, 100, "tungsten_ingot");
        //
        List<ItemLike> TUNGSTEN_MITHRIL_SMELTABLES = List.of(ModItems.TUNGSTEN_MITHRIL_MIXTURE);
        oreBlasting(recipeOutput, TUNGSTEN_MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.PAVARIUM.get(), 0.25f, 100, "pavarium");



    }
}