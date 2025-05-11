package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.block.ModBlocks;
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
                .add(ModBlocks.TUNGSTENORE.get())
                .add(ModBlocks.JADEORE.get())
                .add(ModBlocks.TUNGSTENBLOCK.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TUNGSTENORE.get())
                .add(ModBlocks.TUNGSTENBLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.JADEORE.get());

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(ModBlocks.TUNGSTENORE.get())
                .add(ModBlocks.TUNGSTENBLOCK.get());

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(ModBlocks.JADEORE.get())
                .add(ModBlocks.TUNGSTENORE.get())
                .add(ModBlocks.TUNGSTENBLOCK.get());

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(ModBlocks.JADEORE.get())
                .add(ModBlocks.TUNGSTENBLOCK.get())
                .add(ModBlocks.TUNGSTENORE.get());

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(ModBlocks.JADEORE.get())
                .add(ModBlocks.TUNGSTENBLOCK.get())
                .add(ModBlocks.TUNGSTENORE.get());
    }
}
