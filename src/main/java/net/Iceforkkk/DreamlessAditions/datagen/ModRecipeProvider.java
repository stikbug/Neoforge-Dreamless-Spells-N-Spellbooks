package net.Iceforkkk.DreamlessAditions.datagen;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.Iceforkkk.DreamlessAditions.block.DSSBlocks;
import net.Iceforkkk.DreamlessAditions.registries.DSSItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmithingTransformRecipe;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSBlocks.TUNGSTENBLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .unlockedBy("has_tungsten_ingot", has(DSSItems.TUNGSTENINGOT.get())).save(recipeOutput);

        //Items ----------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.TUNGSTENINGOT.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', DSSItems.TUNGSTENNUGGET.get())
                .unlockedBy("has_tungsten_ingot", has(DSSItems.TUNGSTENINGOT.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.PAVARIUM.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', DSSItems.PAVARIUM_NUGGET.get())
                .unlockedBy("has_pavarium_nugget", has(DSSItems.PAVARIUM_NUGGET.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.TUNGSTEN_MITHRIL_MIXTURE.get())
                .pattern(" T ")
                .pattern(" M ")
                .pattern("   ")
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .unlockedBy("has_tungsten_ingot", has(DSSItems.TUNGSTENINGOT.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ARCANEGEM.get(), 2)
                .pattern(" A ")
                .pattern("ADA")
                .pattern(" A ")
                .define('D', Tags.Items.GEMS_DIAMOND)
                .define('A', ItemRegistry.ARCANE_ESSENCE.get())
                .unlockedBy("has_diamonds", has(Items.DIAMOND)).save(recipeOutput);

        //Boots Curios ----------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.COPPER_BOOTS.get())
                .pattern("COC")
                .pattern("C C")
                .pattern("   ")
                .define('C', Tags.Items.INGOTS_COPPER)
                .define('O', DSSItems.OLD_BOOTS.get())
                .unlockedBy("has_old_boots", has(DSSItems.OLD_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.IRON_SOCKS.get())
                .pattern("ICI")
                .pattern("I I")
                .pattern("   ")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('C', DSSItems.COPPER_BOOTS.get())
                .unlockedBy("has_copper_boots", has(DSSItems.COPPER_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.TANK_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('D', DSSItems.DEEP_DIVERS.get())
                .unlockedBy("has_deep_diver", has(DSSItems.DEEP_DIVERS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.DEEP_DIVERS.get())
                .pattern("SIS")
                .pattern("B B")
                .pattern("   ")
                .define('S', Items.SPONGE)
                .define('I', DSSItems.IRON_SOCKS.get())
                .define('B', Items.BLUE_ICE)
                .unlockedBy("has_iron_socks", has(DSSItems.IRON_SOCKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.GOLDEN_GREAVES.get())
                .pattern("GCG")
                .pattern("B B")
                .pattern("   ")
                .define('G', Tags.Items.INGOTS_GOLD)
                .define('C', DSSItems.COPPER_BOOTS.get())
                .define('B', Tags.Items.STORAGE_BLOCKS_GOLD)
                .unlockedBy("has_copper_boots", has(DSSItems.COPPER_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.SCRAPPED_BOOTS.get())
                .pattern("SGS")
                .pattern("S S")
                .pattern("   ")
                .define('S', Items.NETHERITE_SCRAP)
                .define('G', DSSItems.GOLDEN_GREAVES.get())
                .unlockedBy("has_golden_greaves", has(DSSItems.GOLDEN_GREAVES)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.CLOTH_BOOTS.get())
                .pattern("WOW")
                .pattern("W W")
                .pattern("   ")
                .define('W', ItemTags.WOOL)
                .define('O', DSSItems.OLD_BOOTS.get())
                .unlockedBy("has_old_boots", has(DSSItems.OLD_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ARCANE_CLOTH_BOOTS.get())
                .pattern("ACA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ItemRegistry.MAGIC_CLOTH.get())
                .define('C', DSSItems.CLOTH_BOOTS.get())
                .unlockedBy("has_cloth_boots", has(DSSItems.CLOTH_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.MAGE_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', ItemRegistry.INK_RARE.get())
                .define('D', DSSItems.ARCANE_CLOTH_BOOTS.get())
                .unlockedBy("has_arcane_cloth_boots", has(DSSItems.ARCANE_CLOTH_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ARCHMAGE_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', ItemRegistry.INK_EPIC.get())
                .define('D', DSSItems.MAGE_BOOTS.get())
                .unlockedBy("has_mage_boots", has(DSSItems.MAGE_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.MAGI_BOOTS.get())
                .pattern("IDI")
                .pattern("I I")
                .pattern("   ")
                .define('I', ItemRegistry.INK_LEGENDARY.get())
                .define('D', DSSItems.ARCHMAGE_BOOTS.get())
                .unlockedBy("has_archmage_boots", has(DSSItems.ARCHMAGE_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.HUNTER_BOOTS.get())
                .pattern("LCL")
                .pattern("L L")
                .pattern("   ")
                .define('L', Tags.Items.LEATHERS)
                .define('C', DSSItems.CLOTH_BOOTS.get())
                .unlockedBy("has_cloth_boots", has(DSSItems.CLOTH_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.VAMPIRE_BARON_BOOTS.get())
                .pattern("BHB")
                .pattern("I I")
                .pattern("   ")
                .define('B', ItemRegistry.BLOOD_VIAL.get())
                .define('I', ItemRegistry.INK_RARE.get())
                .define('H', DSSItems.HUNTER_BOOTS.get())
                .unlockedBy("has_hunter_boots", has(DSSItems.HUNTER_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.VAMPIRE_EARL_BOOTS.get())
                .pattern("BVB")
                .pattern("I I")
                .pattern("   ")
                .define('B', ItemRegistry.BLOOD_VIAL.get())
                .define('I', ItemRegistry.INK_EPIC.get())
                .define('V', DSSItems.VAMPIRE_BARON_BOOTS.get())
                .unlockedBy("has_vampire_baron_boots", has(DSSItems.VAMPIRE_BARON_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.VAMPIRE_KING_BOOTS.get())
                .pattern("BVB")
                .pattern("I I")
                .pattern("   ")
                .define('B', ItemRegistry.BLOOD_VIAL.get())
                .define('I', ItemRegistry.INK_LEGENDARY.get())
                .define('V', DSSItems.VAMPIRE_EARL_BOOTS.get())
                .unlockedBy("has_vampire_earl_boots", has(DSSItems.VAMPIRE_EARL_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.BRAHAMS_BOOTS.get())
                .pattern("VCM")
                .pattern("I I")
                .pattern("   ")
                .define('C', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('V', DSSItems.VAMPIRE_KING_BOOTS.get())
                .define('M', DSSItems.MAGI_BOOTS.get())
                .define('I', ItemRegistry.INK_LEGENDARY.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.GLASS_BOOTS.get())
                .pattern("GOG")
                .pattern("G G")
                .pattern("   ")
                .define('G', Tags.Items.GLASS_BLOCKS)
                .define('O', DSSItems.OLD_BOOTS.get())
                .unlockedBy("has_old_boots", has(DSSItems.OLD_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.TEMPERED_GLASS_BOOTS.get())
                .pattern("TGT")
                .pattern("T T")
                .pattern("   ")
                .define('T', Tags.Items.GLASS_BLOCKS_TINTED)
                .define('G', DSSItems.GLASS_BOOTS.get())
                .unlockedBy("has_glass_boots", has(DSSItems.GLASS_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.AMETHYST_BOOTS.get())
                .pattern("AGA")
                .pattern("A A")
                .pattern("   ")
                .define('A', Items.AMETHYST_BLOCK)
                .define('G', DSSItems.GLASS_BOOTS.get())
                .unlockedBy("has_glass_boots", has(DSSItems.GLASS_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ARCANE_CRYSTAL_BOOTS.get())
                .pattern("CAC")
                .pattern("C C")
                .pattern("   ")
                .define('C', DSSItems.ARCANEGEM.get())
                .define('A', DSSItems.AMETHYST_BOOTS.get())
                .unlockedBy("has_amethyst_boots", has(DSSItems.AMETHYST_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.EMERALD_BOOTS.get())
                .pattern("EAE")
                .pattern("E E")
                .pattern("   ")
                .define('E', Tags.Items.STORAGE_BLOCKS_EMERALD)
                .define('A', DSSItems.ARCANE_CRYSTAL_BOOTS.get())
                .unlockedBy("has_arcane_crystal_boots", has(DSSItems.ARCANE_CRYSTAL_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.JADE_BOOTS.get())
                .pattern("JEJ")
                .pattern("J J")
                .pattern("   ")
                .define('J', DSSItems.JADE.get())
                .define('E', DSSItems.EMERALD_BOOTS.get())
                .unlockedBy("has_emerald_boots", has(DSSItems.EMERALD_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.UNDEFEATED_BOOTS.get())
                .pattern("QJQ")
                .pattern("QSQ")
                .pattern("   ")
                .define('Q', Tags.Items.GEMS_QUARTZ)
                .define('J', DSSItems.JADE_BOOTS.get())
                .define('S', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_jade_boots", has(DSSItems.JADE_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.LEGEND_BOOTS.get())
                .pattern(" P ")
                .pattern("BDU")
                .pattern(" F ")
                .define('F', ItemRegistry.BOOTS_OF_SPEED.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('B', DSSItems.BRAHAMS_BOOTS.get())
                .define('U', DSSItems.UNDEFEATED_BOOTS.get())
                .define('P', DSSItems.PAGMAS_BOOTS.get())
                .unlockedBy("has_undefeated_boots", has(DSSItems.UNDEFEATED_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.PYRIUM_BOOTS.get())
                .pattern("PNP")
                .pattern("P P")
                .pattern("   ")
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('N', DSSItems.NETHERITE_GREAVES.get())
                .unlockedBy("has_netherite_greaves", has(DSSItems.NETHERITE_GREAVES)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.PAGMAS_BOOTS.get())
                .pattern("PST")
                .pattern("I I")
                .pattern("   ")
                .define('I', ItemRegistry.PYRIUM_INGOT.get() )
                .define('P', DSSItems.PYRIUM_BOOTS.get())
                .define('T', DSSItems.TUNGSTEN_BOOTS.get())
                .define('S', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.TUNGSTEN_BOOTS.get())
                .pattern("TBT")
                .pattern("T T")
                .pattern("   ")
                .define('B', DSSItems.TANK_BOOTS.get())
                .define('T', DSSBlocks.TUNGSTENBLOCK.get())
                .unlockedBy("has_tank_boos", has(DSSItems.TANK_BOOTS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.OLD_BOOTS.get())
                .pattern("L L")
                .pattern("L L")
                .pattern("L L")
                .define('L', Tags.Items.LEATHERS)
                .unlockedBy("has_leather", has(Items.LEATHER)).save(recipeOutput);

        //Tablet Recipes ----------------------------------------------------------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.BLANK_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.BLANK_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ARCANE_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.MANA_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.BLOOD_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.BLOOD_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.COOLDOWN_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.COOLDOWN_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ENDER_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.ENDER_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.EVOCATION_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.EVOCATION_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.FIRE_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.FIRE_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.HOLY_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.HOLY_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ICE_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.ICE_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.LIGHTNING_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.LIGHTNING_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.NATURE_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.NATURE_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.PROTECTION_TABLET.get())
                .pattern("RPR")
                .pattern("MDM")
                .pattern("RPR")
                .define('R', ItemRegistry.PROTECTION_RUNE.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('P', ItemRegistry.PYRIUM_INGOT.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        //Ring recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.DORANS_RING.get())
                .pattern("PDP")
                .pattern("NMN")
                .pattern("PTP")
                .define('M', ItemRegistry.MANA_RING.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('N', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .define('P', DSSItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ABSURD_RING.get())
                .pattern("PDP")
                .pattern("NMN")
                .pattern("PTP")
                .define('M', ItemRegistry.COOLDOWN_RING.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('N', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .define('P', DSSItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ELFIN_RING.get())
                .pattern("PDP")
                .pattern("NMN")
                .pattern("PTP")
                .define('M', ItemRegistry.BLOOD_STAFF.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('N', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .define('P', DSSItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        //Mask recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.SLAUGHTERERS_MASK.get())
                .pattern("MPM")
                .pattern("PSP")
                .pattern("MPM")
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('S', ItemRegistry.RUINED_BOOK.get())
                .define('P', DSSItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        //Necklace recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.HEARTY_NECKLACE.get())
                .pattern("TTT")
                .pattern("BAT")
                .pattern("BBT")
                .define('A', ItemRegistry.AMETHYST_RESONANCE_NECKLACE.get())
                .define('B', ItemRegistry.BLOODY_VELLUM.get())
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .unlockedBy("has_tungsten_ingot", has(DSSItems.TUNGSTENINGOT.get())).save(recipeOutput);

        //Charm recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.BUSTLING_FUNGUS.get())
                .pattern("TTP")
                .pattern("MAT")
                .pattern("NMT")
                .define('A', ItemRegistry.POISONWARD_RING.get())
                .define('M', ItemRegistry.MITHRIL_INGOT.get())
                .define('N', ItemRegistry.NATURE_UPGRADE_ORB.get())
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .define('P', DSSItems.PAVARIUM.get())
                .unlockedBy("has_pavarium", has(DSSItems.PAVARIUM.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.SALE_STAR.get())
                .pattern("MPC")
                .pattern("PDP")
                .pattern("HPE")
                .define('H', ItemRegistry.HOLY_UPGRADE_ORB.get())
                .define('E', ItemRegistry.EVOCATION_UPGRADE_ORB.get())
                .define('M', ItemRegistry.MANA_UPGRADE_ORB.get())
                .define('C', ItemRegistry.COOLDOWN_UPGRADE_ORB.get())
                .define('D', ItemRegistry.DIVINE_SOULSHARD.get())
                .define('P', DSSItems.PAVARIUM.get())
                .unlockedBy("has_divine_soulshard", has(ItemRegistry.DIVINE_SOULSHARD.get())).save(recipeOutput);

        //Bracelet recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.ROLANDS_BAND.get())
                .pattern("BPB")
                .pattern("TAT")
                .pattern("BPB")
                .define('A', ItemRegistry.FROSTWARD_RING.get())
                .define('B', ItemRegistry.MITHRIL_INGOT.get())
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .define('P', DSSItems.PAVARIUM.get())
                .unlockedBy("has_tungsten_ingot", has(DSSItems.TUNGSTENINGOT.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DSSItems.KYROS_BAND.get())
                .pattern("BPB")
                .pattern("TAT")
                .pattern("BPB")
                .define('A', ItemRegistry.FIREWARD_RING.get())
                .define('B', ItemRegistry.BLOODY_VELLUM.get())
                .define('T', DSSItems.TUNGSTENINGOT.get())
                .define('P', DSSItems.PAVARIUM.get())
                .unlockedBy("has_tungsten_ingot", has(DSSItems.TUNGSTENINGOT.get())).save(recipeOutput);

        //Belt recipes -------------------------------------------------------------------------------------------------------------------------------------------+


        //Shapeless recipes -------------------------------------------------------------------------------------------------------------------------------------------+
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DSSItems.TUNGSTENINGOT.get(), 9)
                .requires(DSSBlocks.TUNGSTENBLOCK)
                .unlockedBy("has_tungsten_block", has(DSSBlocks.TUNGSTENBLOCK))
                .save(recipeOutput,"dreamless_spells:tungsten_ingot_from_tungsten_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DSSItems.EMPTY_GEM.get(), 1)
                .requires(DSSItems.ARCANEGEM)
                .requires(DSSItems.PAVARIUM_NUGGET)
                .unlockedBy("has_pavarium", has(DSSItems.PAVARIUM))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DSSItems.PAVARIUM_NUGGET.get(), 9)
                .requires(DSSItems.PAVARIUM)
                .unlockedBy("has_tungsten_ingot", has(DSSItems.TUNGSTENINGOT))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DSSItems.TUNGSTENNUGGET.get(), 9)
                .requires(DSSItems.TUNGSTENINGOT)
                .unlockedBy("has_tungsten_ingot", has(DSSItems.TUNGSTENINGOT))
                .save(recipeOutput);

        //Smelting Recipes -----------------------------------------------------------------------------------------------------------------------------------------------
        List<ItemLike> TUNGSTEN_SMELTABLES = List.of(DSSItems.RAWTUNGSTEN, DSSBlocks.TUNGSTENORE);
        oreSmelting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, DSSItems.TUNGSTENINGOT.get(), 0.25f, 200, "tungsten_ingot");
        oreBlasting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, DSSItems.TUNGSTENINGOT.get(), 0.25f, 100, "tungsten_ingot");
        //
        List<ItemLike> TUNGSTEN_MITHRIL_SMELTABLES = List.of(DSSItems.TUNGSTEN_MITHRIL_MIXTURE);
        oreBlasting(recipeOutput, TUNGSTEN_MITHRIL_SMELTABLES, RecipeCategory.MISC, DSSItems.PAVARIUM.get(), 0.25f, 100, "pavarium");

        //Smithing Recipes

        //Empty Priest Armor
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(ItemRegistry.WIZARD_HELMET.get()), Ingredient.EMPTY, RecipeCategory.COMBAT, DSSItems.EMPTYPRIESTHELMET.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_priest_headpiece");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(ItemRegistry.WIZARD_CHESTPLATE.get()), Ingredient.EMPTY, RecipeCategory.COMBAT, DSSItems.EMPTYPRIESTCHESTPLATE.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_priest_robes");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(ItemRegistry.WIZARD_LEGGINGS.get()), Ingredient.EMPTY, RecipeCategory.COMBAT, DSSItems.EMPTYPRIESTLEGGINGS.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_priest_skirt");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(ItemRegistry.WIZARD_BOOTS.get()), Ingredient.EMPTY, RecipeCategory.COMBAT, DSSItems.EMPTYPRIESTBOOTS.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_priest_boots");

        //Empty Brawler Armor
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(DSSItems.EMPTYPRIESTHELMET.get()), Ingredient.of(Items.IRON_SWORD), RecipeCategory.COMBAT, DSSItems.EMPTYBRAWLERHELMET.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_brawler_headpiece");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(DSSItems.EMPTYPRIESTCHESTPLATE.get()), Ingredient.of(Items.IRON_SWORD), RecipeCategory.COMBAT, DSSItems.EMPTYBRAWLERCHESTPLATE.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_brawler_robes");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(DSSItems.EMPTYPRIESTLEGGINGS.get()), Ingredient.of(Items.IRON_SWORD), RecipeCategory.COMBAT, DSSItems.EMPTYBRAWLERLEGGINGS.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_brawler_skirt");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(DSSItems.EMPTYPRIESTBOOTS.get()), Ingredient.of(Items.IRON_SWORD), RecipeCategory.COMBAT, DSSItems.EMPTYBRAWLERBOOTS.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_brawler_boots");

        //Empty Hunter Armor
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(DSSItems.EMPTYPRIESTHELMET.get()), Ingredient.of(Items.BOW), RecipeCategory.COMBAT, DSSItems.EMPTYHUNTERHELMET.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_hunter_headpiece");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(DSSItems.EMPTYPRIESTCHESTPLATE.get()), Ingredient.of(Items.BOW), RecipeCategory.COMBAT, DSSItems.EMPTYHUNTERCHESTPLATE.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_hunter_robes");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(DSSItems.EMPTYPRIESTLEGGINGS.get()), Ingredient.of(Items.BOW), RecipeCategory.COMBAT, DSSItems.EMPTYHUNTERLEGGINGS.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_hunter_skirt");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(DSSItems.EMPTY_RUNE.get()), Ingredient.of(DSSItems.EMPTYPRIESTBOOTS.get()), Ingredient.of(Items.BOW), RecipeCategory.COMBAT, DSSItems.EMPTYHUNTERBOOTS.get()).unlocks("has_rune", has(DSSItems.EMPTY_RUNE.get())).save(recipeOutput, "empty_hunter_boots");

        //Vortex Armor
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ItemRegistry.FIRE_RUNE.get()), Ingredient.of(ItemRegistry.PYROMANCER_HELMET.get()), Ingredient.of(Items.IRON_SWORD), RecipeCategory.COMBAT, DSSItems.SOLAR_HELMET.get()).unlocks("has_rune", has(ItemRegistry.FIRE_RUNE.get())).save(recipeOutput, "solar_helmet");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ItemRegistry.FIRE_RUNE.get()), Ingredient.of(ItemRegistry.PYROMANCER_CHESTPLATE.get()), Ingredient.of(Items.IRON_SWORD), RecipeCategory.COMBAT, DSSItems.SOLAR_CHESTPLATE.get()).unlocks("has_rune", has(ItemRegistry.FIRE_RUNE.get())).save(recipeOutput, "solar_chestplate");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ItemRegistry.FIRE_RUNE.get()), Ingredient.of(ItemRegistry.PYROMANCER_LEGGINGS.get()), Ingredient.of(Items.IRON_SWORD), RecipeCategory.COMBAT, DSSItems.SOLAR_LEGGINGS.get()).unlocks("has_rune", has(ItemRegistry.FIRE_RUNE.get())).save(recipeOutput, "solar_leggings");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ItemRegistry.FIRE_RUNE.get()), Ingredient.of(ItemRegistry.PYROMANCER_BOOTS.get()), Ingredient.of(Items.IRON_SWORD), RecipeCategory.COMBAT, DSSItems.SOLAR_BOOTS.get()).unlocks("has_rune", has(ItemRegistry.FIRE_RUNE.get())).save(recipeOutput, "solar_boots");

        //Solar Armor
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ItemRegistry.LIGHTNING_RUNE.get()), Ingredient.of(ItemRegistry.ELECTROMANCER_HELMET.get()), Ingredient.of(Items.BOW), RecipeCategory.COMBAT, DSSItems.VORTEX_HELMET.get()).unlocks("has_rune", has(ItemRegistry.LIGHTNING_RUNE.get())).save(recipeOutput, "vortex_helmet");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ItemRegistry.LIGHTNING_RUNE.get()), Ingredient.of(ItemRegistry.ELECTROMANCER_CHESTPLATE.get()), Ingredient.of(Items.BOW), RecipeCategory.COMBAT, DSSItems.VORTEX_CHESTPLATE.get()).unlocks("has_rune", has(ItemRegistry.LIGHTNING_RUNE.get())).save(recipeOutput, "vortex_chestplate");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ItemRegistry.LIGHTNING_RUNE.get()), Ingredient.of(ItemRegistry.ELECTROMANCER_LEGGINGS.get()), Ingredient.of(Items.BOW), RecipeCategory.COMBAT, DSSItems.VORTEX_LEGGINGS.get()).unlocks("has_rune", has(ItemRegistry.LIGHTNING_RUNE.get())).save(recipeOutput, "vortex_leggings");
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ItemRegistry.LIGHTNING_RUNE.get()), Ingredient.of(ItemRegistry.ELECTROMANCER_BOOTS.get()), Ingredient.of(Items.BOW), RecipeCategory.COMBAT, DSSItems.VORTEX_BOOTS.get()).unlocks("has_rune", has(ItemRegistry.LIGHTNING_RUNE.get())).save(recipeOutput, "vortex_boots");
    }
}