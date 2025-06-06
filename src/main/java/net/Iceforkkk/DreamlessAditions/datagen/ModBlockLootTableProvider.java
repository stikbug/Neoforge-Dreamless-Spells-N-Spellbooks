package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.block.ModBlocks;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //Drop Self
        dropSelf(ModBlocks.TUNGSTENBLOCK.get());
        //Ore
        add(ModBlocks.TUNGSTENORE.get(),
                block -> createOreDrop(ModBlocks.TUNGSTENORE.get(), ModItems.RAWTUNGSTEN.get()));
        add(ModBlocks.JADEORE.get(),
                block -> createOreDrop(ModBlocks.JADEORE.get(), ModItems.JADE.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
