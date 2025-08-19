package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.block.DSSBlocks;
import net.Iceforkkk.DreamlessAditions.registries.DSSItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //Drop Self
        dropSelf(DSSBlocks.TUNGSTENBLOCK.get());
        //Ore
        add(DSSBlocks.TUNGSTENORE.get(),
                block -> createOreDrop(DSSBlocks.TUNGSTENORE.get(), DSSItems.RAWTUNGSTEN.get()));
        add(DSSBlocks.JADEORE.get(),
                block -> createOreDrop(DSSBlocks.JADEORE.get(), DSSItems.JADE.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DSSBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
