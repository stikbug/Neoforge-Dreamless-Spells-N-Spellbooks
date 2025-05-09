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
        //Normal Items
        basicItem(ModItems.NITROGLAND.get());
        basicItem(ModItems.NITROCORE.get());
        basicItem(ModItems.MYSTERIOUSCIRCUITRY.get());
        basicItem(ModItems.JADE.get());
        basicItem(ModItems.ARCANEGEM.get());
        basicItem(ModItems.TUNGSTENINGOT.get());
        basicItem(ModItems.RAWTUNGSTEN.get());
        basicItem(ModItems.TUNGSTENNUGGET.get());
        basicItem(ModItems.TUNGSTEN_MITHRIL_MIXTURE.get());
        basicItem(ModItems.PAVARIUM.get());


        //Boots Curios
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
        basicItem(ModItems.GLASS_BOOTS.get());
        basicItem(ModItems.TEMPERED_GLASS_BOOTS.get());
        basicItem(ModItems.AMETHYST_BOOTS.get());
        basicItem(ModItems.EMERALD_BOOTS.get());
        basicItem(ModItems.ARCANE_CRYSTAL_BOOTS.get());
        basicItem(ModItems.JADE_BOOTS.get());
        basicItem(ModItems.BRAHAMS_BOOTS.get());
        basicItem(ModItems.HUNTER_BOOTS.get());
        basicItem(ModItems.VAMPIRE_BARON_BOOTS.get());
        basicItem(ModItems.VAMPIRE_EARL_BOOTS.get());
        basicItem(ModItems.VAMPIRE_KING_BOOTS.get());
        basicItem(ModItems.UNDEFEATED_BOOTS.get());
        basicItem(ModItems.LEGEND_BOOTS.get());
        basicItem(ModItems.TUNGSTEN_BOOTS.get());

        //Tablet Curios
        basicItem(ModItems.BLANK_TABLET.get());
        basicItem(ModItems.ARCANE_TABLET.get());
        basicItem(ModItems.BLOOD_TABLET.get());
        basicItem(ModItems.COOLDOWN_TABLET.get());
        basicItem(ModItems.ENDER_TABLET.get());
        basicItem(ModItems.EVOCATION_TABLET.get());
        basicItem(ModItems.FIRE_TABLET.get());
        basicItem(ModItems.HOLY_TABLET.get());
        basicItem(ModItems.ICE_TABLET.get());
        basicItem(ModItems.LIGHTNING_TABLET.get());
        basicItem(ModItems.NATURE_TABLET.get());
        basicItem(ModItems.PROTECTION_TABLET.get());

        //Ring Curios
        basicItem(ModItems.DORANS_RING.get());
        basicItem(ModItems.ELFIN_RING.get());
        basicItem(ModItems.ABSURD_RING.get());

        //Mask Curios
        basicItem(ModItems.SLAUGHTERERS_MASK.get());


        //Holy Priest Armor
        basicItem(ModItems.HOLYPRIESTHELMET.get());
        basicItem(ModItems.HOLYPRIESTCHESTPLATE.get());
        basicItem(ModItems.HOLYPRIESTLEGGINGS.get());
        basicItem(ModItems.HOLYPRIESTBOOTS.get());


    }
}
