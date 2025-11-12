package net.Iceforkkk.DreamlessAditions.datagen;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.DSSItems;
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
        basicItem(DSSItems.JADE.get());
        basicItem(DSSItems.ARCANEGEM.get());
        basicItem(DSSItems.TUNGSTENINGOT.get());
        basicItem(DSSItems.RAWTUNGSTEN.get());
        basicItem(DSSItems.TUNGSTENNUGGET.get());
        basicItem(DSSItems.TUNGSTEN_MITHRIL_MIXTURE.get());
        basicItem(DSSItems.PAVARIUM.get());
        basicItem(DSSItems.EMPTY_RUNE.get());
        basicItem(DSSItems.PAVARIUM_NUGGET.get());
        basicItem(DSSItems.EMPTY_GEM.get());

        //Upgrade Orbs
        basicItem(DSSItems.EMPTY_UPGRADE_ORB.get());

        //Boots Curios
        basicItem(DSSItems.OLD_BOOTS.get());
        basicItem(DSSItems.COPPER_BOOTS.get());
        basicItem(DSSItems.IRON_SOCKS.get());
        basicItem(DSSItems.TANK_BOOTS.get());
        basicItem(DSSItems.DEEP_DIVERS.get());
        basicItem(DSSItems.PAGMAS_BOOTS.get());
        basicItem(DSSItems.PYRIUM_BOOTS.get());
        basicItem(DSSItems.NETHERITE_GREAVES.get());
        basicItem(DSSItems.GOLDEN_GREAVES.get());
        basicItem(DSSItems.CLOTH_BOOTS.get());
        basicItem(DSSItems.ARCANE_CLOTH_BOOTS.get());
        basicItem(DSSItems.MAGE_BOOTS.get());
        basicItem(DSSItems.ARCHMAGE_BOOTS.get());
        basicItem(DSSItems.MAGI_BOOTS.get());
        basicItem(DSSItems.SCRAPPED_BOOTS.get());
        basicItem(DSSItems.GLASS_BOOTS.get());
        basicItem(DSSItems.TEMPERED_GLASS_BOOTS.get());
        basicItem(DSSItems.AMETHYST_BOOTS.get());
        basicItem(DSSItems.EMERALD_BOOTS.get());
        basicItem(DSSItems.ARCANE_CRYSTAL_BOOTS.get());
        basicItem(DSSItems.JADE_BOOTS.get());
        basicItem(DSSItems.BRAHAMS_BOOTS.get());
        basicItem(DSSItems.HUNTER_BOOTS.get());
        basicItem(DSSItems.VAMPIRE_BARON_BOOTS.get());
        basicItem(DSSItems.VAMPIRE_EARL_BOOTS.get());
        basicItem(DSSItems.VAMPIRE_KING_BOOTS.get());
        basicItem(DSSItems.UNDEFEATED_BOOTS.get());
        basicItem(DSSItems.LEGEND_BOOTS.get());
        basicItem(DSSItems.GOAT_HOOF.get());
        basicItem(DSSItems.TUNGSTEN_BOOTS.get());

        //Tablet Curios
        basicItem(DSSItems.BLANK_TABLET.get());
        basicItem(DSSItems.ARCANE_TABLET.get());
        basicItem(DSSItems.BLOOD_TABLET.get());
        basicItem(DSSItems.COOLDOWN_TABLET.get());
        basicItem(DSSItems.ENDER_TABLET.get());
        basicItem(DSSItems.EVOCATION_TABLET.get());
        basicItem(DSSItems.FIRE_TABLET.get());
        basicItem(DSSItems.HOLY_TABLET.get());
        basicItem(DSSItems.ICE_TABLET.get());
        basicItem(DSSItems.LIGHTNING_TABLET.get());
        basicItem(DSSItems.NATURE_TABLET.get());
        basicItem(DSSItems.PROTECTION_TABLET.get());

        //Ring Curios
        basicItem(DSSItems.DORANS_RING.get());
        basicItem(DSSItems.ELFIN_RING.get());
        basicItem(DSSItems.ABSURD_RING.get());

        //Mask Curios
        basicItem(DSSItems.SLAUGHTERERS_MASK.get());

        //Neclace Curios
        basicItem(DSSItems.HEARTY_NECKLACE.get());

        //Charm Curios
        basicItem(DSSItems.BUSTLING_FUNGUS.get());
        basicItem(DSSItems.SALE_STAR.get());
        basicItem(DSSItems.MINERS_CHARM.get());
        basicItem(DSSItems.PUTRID_SCENT.get());

        //Bracelet Curios
        basicItem(DSSItems.KYROS_BAND.get());
        basicItem(DSSItems.ROLANDS_BAND.get());

        //Belt Curios
        basicItem(DSSItems.HOPOO_FEATHER.get());
        basicItem(DSSItems.WAX_QUAIL.get());
        basicItem(DSSItems.ICHOR_WING.get());

        //Armor
        //Solar Armor
        basicItem(DSSItems.SOLAR_HELMET.get());
        basicItem(DSSItems.SOLAR_CHESTPLATE.get());
        basicItem(DSSItems.SOLAR_LEGGINGS.get());
        basicItem(DSSItems.SOLAR_BOOTS.get());
        //Vortex Armor
        basicItem(DSSItems.VORTEX_HELMET.get());
        basicItem(DSSItems.VORTEX_CHESTPLATE.get());
        basicItem(DSSItems.VORTEX_LEGGINGS.get());
        basicItem(DSSItems.VORTEX_BOOTS.get());
        //Empty Priest Armor
        basicItem(DSSItems.EMPTYPRIESTHELMET.get());
        basicItem(DSSItems.EMPTYPRIESTCHESTPLATE.get());
        basicItem(DSSItems.EMPTYPRIESTLEGGINGS.get());
        basicItem(DSSItems.EMPTYPRIESTBOOTS.get());
        //Empty Hunter Armor
        basicItem(DSSItems.EMPTYHUNTERHELMET.get());
        basicItem(DSSItems.EMPTYHUNTERCHESTPLATE.get());
        basicItem(DSSItems.EMPTYHUNTERLEGGINGS.get());
        basicItem(DSSItems.EMPTYHUNTERBOOTS.get());
        //Empty Brawler Armor
        basicItem(DSSItems.EMPTYBRAWLERHELMET.get());
        basicItem(DSSItems.EMPTYBRAWLERCHESTPLATE.get());
        basicItem(DSSItems.EMPTYBRAWLERLEGGINGS.get());
        basicItem(DSSItems.EMPTYBRAWLERBOOTS.get());
    }
}
