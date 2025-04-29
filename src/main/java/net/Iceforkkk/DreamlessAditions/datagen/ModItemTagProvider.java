package net.Iceforkkk.DreamlessAditions.datagen;

import io.redspace.ironsspellbooks.util.ModTags;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.ModArmorItem;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.server.command.CurioArgumentType;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Dreamless_Spells.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(Tags.Items.INGOTS)
                .add(ModItems.TUNGSTENINGOT.get())
                .add(ModItems.PAVARIUM.get());

        tag(Tags.Items.ARMORS)
                .add(ModItems.HOLYPRIESTBOOTS.get())
                .add(ModItems.HOLYPRIESTLEGGINGS.get())
                .add(ModItems.HOLYPRIESTCHESTPLATE.get())
                .add(ModItems.HOLYPRIESTHELMET.get());

        tag(Tags.Items.NUGGETS)
                .add(ModItems.TUNGSTENNUGGET.get());

    }
}
