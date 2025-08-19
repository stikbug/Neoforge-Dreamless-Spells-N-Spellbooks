package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.block.DSSBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Dreamless_Spells.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DSSBlocks.TUNGSTENORE.get())
                .add(DSSBlocks.JADEORE.get())
                .add(DSSBlocks.TUNGSTENBLOCK.get());

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(DSSBlocks.TUNGSTENORE.get())
                .add(DSSBlocks.TUNGSTENBLOCK.get());

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(DSSBlocks.JADEORE.get());

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(DSSBlocks.JADEORE.get());

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(DSSBlocks.TUNGSTENORE.get())
                .add(DSSBlocks.TUNGSTENBLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(DSSBlocks.JADEORE.get());

    }
}
