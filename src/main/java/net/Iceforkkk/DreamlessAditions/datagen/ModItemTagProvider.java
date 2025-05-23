package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
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


        tag(Tags.Items.ARMORS)
                //Holy Priest Armor
                .add(ModItems.HOLYPRIESTBOOTS.get())
                .add(ModItems.HOLYPRIESTLEGGINGS.get())
                .add(ModItems.HOLYPRIESTCHESTPLATE.get())
                .add(ModItems.HOLYPRIESTHELMET.get());

        tag(Tags.Items.NUGGETS)
                .add(ModItems.TUNGSTENNUGGET.get());

        tag(Tags.Items.GEMS)
                .add(ModItems.JADE.get())
                .add(ModItems.ARCANEGEM.get())
                .add(ModItems.TUNGSTENNUGGET.get());

    }
}
