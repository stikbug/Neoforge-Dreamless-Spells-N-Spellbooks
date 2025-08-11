package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
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
                .add(ModItems.TUNGSTENINGOT.get())
                .add(ModItems.PAVARIUM.get())
                .add(ModItems.TUNGSTEN_MITHRIL_MIXTURE.get());

        tag(Tags.Items.NUGGETS)
                .add(ModItems.TUNGSTENNUGGET.get());

        tag(Tags.Items.GEMS)
                .add(ModItems.JADE.get())
                .add(ModItems.ARCANEGEM.get())
                .add(ModItems.TUNGSTENNUGGET.get());

        tag(Tags.Items.ENCHANTABLES)
                //Holy Priest Armor
                .add(ModItems.HOLYPRIESTBOOTS.get())
                .add(ModItems.HOLYPRIESTLEGGINGS.get())
                .add(ModItems.HOLYPRIESTCHESTPLATE.get())
                .add(ModItems.HOLYPRIESTHELMET.get());
        //Armor Tags
        tag(Tags.Items.ARMORS)
                //Holy Priest Armor
                .add(ModItems.HOLYPRIESTBOOTS.get())
                .add(ModItems.HOLYPRIESTLEGGINGS.get())
                .add(ModItems.HOLYPRIESTCHESTPLATE.get())
                .add(ModItems.HOLYPRIESTHELMET.get());

        tag(ItemTags.ARMOR_ENCHANTABLE)
                //Holy Priest Armor
                .add(ModItems.HOLYPRIESTBOOTS.get())
                .add(ModItems.HOLYPRIESTLEGGINGS.get())
                .add(ModItems.HOLYPRIESTCHESTPLATE.get())
                .add(ModItems.HOLYPRIESTHELMET.get());

        tag(ItemTags.EQUIPPABLE_ENCHANTABLE)
                //Holy Priest Armor
                .add(ModItems.HOLYPRIESTBOOTS.get())
                .add(ModItems.HOLYPRIESTLEGGINGS.get())
                .add(ModItems.HOLYPRIESTCHESTPLATE.get())
                .add(ModItems.HOLYPRIESTHELMET.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE)
                //Holy Priest Armor
                .add(ModItems.HOLYPRIESTBOOTS.get())
                .add(ModItems.HOLYPRIESTLEGGINGS.get())
                .add(ModItems.HOLYPRIESTCHESTPLATE.get())
                .add(ModItems.HOLYPRIESTHELMET.get());

        tag(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.HOLYPRIESTHELMET.get());

        tag(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.HOLYPRIESTCHESTPLATE.get());

        tag(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.HOLYPRIESTLEGGINGS.get());

        tag(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.HOLYPRIESTBOOTS.get());

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.HOLYPRIESTHELMET.get());

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.HOLYPRIESTCHESTPLATE.get());

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.HOLYPRIESTLEGGINGS.get());

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.HOLYPRIESTBOOTS.get());
    }
}
