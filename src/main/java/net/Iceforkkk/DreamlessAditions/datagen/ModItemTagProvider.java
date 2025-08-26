package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.DSSItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Dreamless_Spells.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(Tags.Items.INGOTS)
                .add(DSSItems.TUNGSTENINGOT.get())
                .add(DSSItems.PAVARIUM.get())
                .add(DSSItems.TUNGSTEN_MITHRIL_MIXTURE.get());

        tag(Tags.Items.NUGGETS)
                .add(DSSItems.TUNGSTENNUGGET.get())
                .add(DSSItems.PAVARIUM_NUGGET.get());

        tag(Tags.Items.GEMS)
                .add(DSSItems.JADE.get())
                .add(DSSItems.EMPTY_GEM.get())
                .add(DSSItems.ARCANEGEM.get());

        tag(Tags.Items.ENCHANTABLES)
                //Empty Hunter
                .add(DSSItems.EMPTYHUNTERHELMET.get())
                .add(DSSItems.EMPTYHUNTERCHESTPLATE.get())
                .add(DSSItems.EMPTYHUNTERLEGGINGS.get())
                .add(DSSItems.EMPTYHUNTERBOOTS.get())
                //Empty Brawler Armor
                .add(DSSItems.EMPTYBRAWLERBOOTS.get())
                .add(DSSItems.EMPTYBRAWLERLEGGINGS.get())
                .add(DSSItems.EMPTYBRAWLERCHESTPLATE.get())
                .add(DSSItems.EMPTYBRAWLERHELMET.get())
                //Empty Priest Armor
                .add(DSSItems.EMPTYPRIESTBOOTS.get())
                .add(DSSItems.EMPTYPRIESTLEGGINGS.get())
                .add(DSSItems.EMPTYPRIESTCHESTPLATE.get())
                .add(DSSItems.EMPTYPRIESTHELMET.get());
        //Armor Tags
        tag(Tags.Items.ARMORS)
                //Empty Hunter
                .add(DSSItems.EMPTYHUNTERHELMET.get())
                .add(DSSItems.EMPTYHUNTERCHESTPLATE.get())
                .add(DSSItems.EMPTYHUNTERLEGGINGS.get())
                .add(DSSItems.EMPTYHUNTERBOOTS.get())
                //Empty Brawler Armor
                .add(DSSItems.EMPTYBRAWLERBOOTS.get())
                .add(DSSItems.EMPTYBRAWLERLEGGINGS.get())
                .add(DSSItems.EMPTYBRAWLERCHESTPLATE.get())
                .add(DSSItems.EMPTYBRAWLERHELMET.get())
                //Holy Priest Armor
                .add(DSSItems.EMPTYPRIESTBOOTS.get())
                .add(DSSItems.EMPTYPRIESTLEGGINGS.get())
                .add(DSSItems.EMPTYPRIESTCHESTPLATE.get())
                .add(DSSItems.EMPTYPRIESTHELMET.get());

        tag(ItemTags.ARMOR_ENCHANTABLE)
                //Empty Hunter
                .add(DSSItems.EMPTYHUNTERHELMET.get())
                .add(DSSItems.EMPTYHUNTERCHESTPLATE.get())
                .add(DSSItems.EMPTYHUNTERLEGGINGS.get())
                .add(DSSItems.EMPTYHUNTERBOOTS.get())
                //Empty Brawler Armor
                .add(DSSItems.EMPTYBRAWLERBOOTS.get())
                .add(DSSItems.EMPTYBRAWLERLEGGINGS.get())
                .add(DSSItems.EMPTYBRAWLERCHESTPLATE.get())
                .add(DSSItems.EMPTYBRAWLERHELMET.get())
                //Holy Priest Armor
                .add(DSSItems.EMPTYPRIESTBOOTS.get())
                .add(DSSItems.EMPTYPRIESTLEGGINGS.get())
                .add(DSSItems.EMPTYPRIESTCHESTPLATE.get())
                .add(DSSItems.EMPTYPRIESTHELMET.get());

        tag(ItemTags.EQUIPPABLE_ENCHANTABLE)
                //Empty Hunter
                .add(DSSItems.EMPTYHUNTERHELMET.get())
                .add(DSSItems.EMPTYHUNTERCHESTPLATE.get())
                .add(DSSItems.EMPTYHUNTERLEGGINGS.get())
                .add(DSSItems.EMPTYHUNTERBOOTS.get())
                //Empty Brawler Armor
                .add(DSSItems.EMPTYBRAWLERBOOTS.get())
                .add(DSSItems.EMPTYBRAWLERLEGGINGS.get())
                .add(DSSItems.EMPTYBRAWLERCHESTPLATE.get())
                .add(DSSItems.EMPTYBRAWLERHELMET.get())
                //Holy Priest Armor
                .add(DSSItems.EMPTYPRIESTBOOTS.get())
                .add(DSSItems.EMPTYPRIESTLEGGINGS.get())
                .add(DSSItems.EMPTYPRIESTCHESTPLATE.get())
                .add(DSSItems.EMPTYPRIESTHELMET.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE)
                //Empty Hunter
                .add(DSSItems.EMPTYHUNTERHELMET.get())
                .add(DSSItems.EMPTYHUNTERCHESTPLATE.get())
                .add(DSSItems.EMPTYHUNTERLEGGINGS.get())
                .add(DSSItems.EMPTYHUNTERBOOTS.get())
                //Empty Brawler Armor
                .add(DSSItems.EMPTYBRAWLERBOOTS.get())
                .add(DSSItems.EMPTYBRAWLERLEGGINGS.get())
                .add(DSSItems.EMPTYBRAWLERCHESTPLATE.get())
                .add(DSSItems.EMPTYBRAWLERHELMET.get())
                //Holy Priest Armor
                .add(DSSItems.EMPTYPRIESTBOOTS.get())
                .add(DSSItems.EMPTYPRIESTLEGGINGS.get())
                .add(DSSItems.EMPTYPRIESTCHESTPLATE.get())
                .add(DSSItems.EMPTYPRIESTHELMET.get());

        tag(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(DSSItems.EMPTYHUNTERHELMET.get())
                .add(DSSItems.EMPTYBRAWLERHELMET.get())
                .add(DSSItems.EMPTYPRIESTHELMET.get());

        tag(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(DSSItems.EMPTYHUNTERCHESTPLATE.get())
                .add(DSSItems.EMPTYBRAWLERCHESTPLATE.get())
                .add(DSSItems.EMPTYPRIESTCHESTPLATE.get());

        tag(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(DSSItems.EMPTYHUNTERLEGGINGS.get())
                .add(DSSItems.EMPTYBRAWLERLEGGINGS.get())
                .add(DSSItems.EMPTYPRIESTLEGGINGS.get());

        tag(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(DSSItems.EMPTYHUNTERBOOTS.get())
                .add(DSSItems.EMPTYBRAWLERBOOTS.get())
                .add(DSSItems.EMPTYPRIESTBOOTS.get());

        tag(ItemTags.HEAD_ARMOR)
                .add(DSSItems.EMPTYHUNTERHELMET.get())
                .add(DSSItems.EMPTYBRAWLERHELMET.get())
                .add(DSSItems.EMPTYPRIESTHELMET.get());

        tag(ItemTags.CHEST_ARMOR)
                .add(DSSItems.EMPTYHUNTERCHESTPLATE.get())
                .add(DSSItems.EMPTYBRAWLERCHESTPLATE.get())
                .add(DSSItems.EMPTYPRIESTCHESTPLATE.get());

        tag(ItemTags.LEG_ARMOR)
                .add(DSSItems.EMPTYHUNTERLEGGINGS.get())
                .add(DSSItems.EMPTYBRAWLERLEGGINGS.get())
                .add(DSSItems.EMPTYPRIESTLEGGINGS.get());

        tag(ItemTags.FOOT_ARMOR)
                .add(DSSItems.EMPTYHUNTERBOOTS.get())
                .add(DSSItems.EMPTYBRAWLERBOOTS.get())
                .add(DSSItems.EMPTYPRIESTBOOTS.get());
    }
}
