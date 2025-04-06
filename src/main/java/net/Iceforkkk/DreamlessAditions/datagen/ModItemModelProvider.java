package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Dreamless_Spells.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SLEEPLESSCLOTH.get());
        basicItem(ModItems.SLEEPLESSCHAIN.get());
        basicItem(ModItems.NITROGLAND.get());
        basicItem(ModItems.NITROCORE.get());
        basicItem(ModItems.MYSTERIOUSCIRCUITRY.get());

        basicItem(ModItems.SLEEPLESSHELMET.get());
        basicItem(ModItems.SLEEPLESSCHESTPLATE.get());
        basicItem(ModItems.SLEEPLESSLEGGINGS.get());
        basicItem(ModItems.SLEEPLESSBOOTS.get());
        basicItem(ModItems.FASTBOOTS.get());


    }
}
