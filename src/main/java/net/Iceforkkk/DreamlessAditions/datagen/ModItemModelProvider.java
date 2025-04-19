package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.ModItems;
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
        basicItem(ModItems.JADE.get());
        basicItem(ModItems.ARCANEGEM.get());

        basicItem(ModItems.OLD_BOOTS.get());
        basicItem(ModItems.COPPER_BOOTS.get());
        basicItem(ModItems.IRON_SOCKS.get());
        basicItem(ModItems.TANK_BOOTS.get());
        basicItem(ModItems.DEEP_DIVERS.get());
        basicItem(ModItems.PAGMAS_BOOTS.get());
        basicItem(ModItems.PYRIUM_BOOTS.get());
        basicItem(ModItems.NETHERITE_GREAVES.get());
        basicItem(ModItems.GOLDEN_GREAVES.get());
        basicItem(ModItems.CLOTH_BOOTS.get());
        basicItem(ModItems.ARCANE_CLOTH_BOOTS.get());
        basicItem(ModItems.MAGE_BOOTS.get());
        basicItem(ModItems.ARCHMAGE_BOOTS.get());
        basicItem(ModItems.MAGI_BOOTS.get());
        basicItem(ModItems.SCRAPPED_BOOTS.get());

        basicItem(ModItems.SLEEPLESSHELMET.get());
        basicItem(ModItems.SLEEPLESSCHESTPLATE.get());
        basicItem(ModItems.SLEEPLESSLEGGINGS.get());
        basicItem(ModItems.SLEEPLESSBOOTS.get());
        basicItem(ModItems.FASTBOOTS.get());


    }
}
