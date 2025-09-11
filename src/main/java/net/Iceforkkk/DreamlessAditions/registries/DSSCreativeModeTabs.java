package net.Iceforkkk.DreamlessAditions.registries;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.block.DSSBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DSSCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>  CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dreamless_Spells.MOD_ID);

    public static final Supplier<CreativeModeTab> DREAMLESS_SPELLS_TAB = CREATIVE_MODE_TAB.register("dreamless_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DSSItems.ARCANE_TABLET.get()))
                    .title(Component.translatable("creativetab.dreamless_spells.dreamless_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Basic items
                        output.accept(DSSItems.ARCANEGEM);
                        output.accept(DSSItems.NITROCORE);
                        output.accept(DSSItems.NITROGLAND);
                        output.accept(DSSItems.MYSTERIOUSCIRCUITRY);
                        output.accept(DSSItems.JADE);
                        output.accept(DSSItems.TUNGSTENINGOT);
                        output.accept(DSSItems.RAWTUNGSTEN);
                        output.accept(DSSItems.TUNGSTENNUGGET);
                        output.accept(DSSItems.TUNGSTEN_MITHRIL_MIXTURE);
                        output.accept(DSSItems.PAVARIUM);
                        output.accept(DSSItems.PAVARIUM_NUGGET);
                        output.accept(DSSItems.EMPTY_GEM);
                        output.accept(DSSItems.EMPTY_RUNE);
                        output.accept((ItemLike) DSSItems.EMPTY_UPGRADE_ORB);
                        //Empty Priest Armor
                        output.accept(DSSItems.EMPTYPRIESTHELMET);
                        output.accept(DSSItems.EMPTYPRIESTCHESTPLATE);
                        output.accept(DSSItems.EMPTYPRIESTLEGGINGS);
                        output.accept(DSSItems.EMPTYPRIESTBOOTS);
                        //Empty Brawler Armor
                        output.accept(DSSItems.EMPTYBRAWLERHELMET);
                        output.accept(DSSItems.EMPTYBRAWLERCHESTPLATE);
                        output.accept(DSSItems.EMPTYBRAWLERLEGGINGS);
                        output.accept(DSSItems.EMPTYBRAWLERBOOTS);
                        //Empty Hunter Armor
                        output.accept(DSSItems.EMPTYHUNTERHELMET);
                        output.accept(DSSItems.EMPTYHUNTERCHESTPLATE);
                        output.accept(DSSItems.EMPTYHUNTERLEGGINGS);
                        output.accept(DSSItems.EMPTYHUNTERBOOTS);
                        //Solar Armor
                        output.accept(DSSItems.SOLAR_HELMET);
                        output.accept(DSSItems.SOLAR_CHESTPLATE);
                        output.accept(DSSItems.SOLAR_LEGGINGS);
                        output.accept(DSSItems.SOLAR_BOOTS);
                        //Vortex Armor
                        output.accept(DSSItems.VORTEX_HELMET);
                        output.accept(DSSItems.VORTEX_CHESTPLATE);
                        output.accept(DSSItems.VORTEX_LEGGINGS);
                        output.accept(DSSItems.VORTEX_BOOTS);
                        //Boot Curios
                        output.accept(DSSItems.OLD_BOOTS);
                        output.accept(DSSItems.IRON_SOCKS);
                        output.accept(DSSItems.COPPER_BOOTS);
                        output.accept(DSSItems.DEEP_DIVERS);
                        output.accept(DSSItems.TANK_BOOTS);
                        output.accept(DSSItems.PYRIUM_BOOTS);
                        output.accept(DSSItems.PAGMAS_BOOTS);
                        output.accept(DSSItems.NETHERITE_GREAVES);
                        output.accept(DSSItems.GOLDEN_GREAVES);
                        output.accept(DSSItems.CLOTH_BOOTS);
                        output.accept(DSSItems.ARCANE_CLOTH_BOOTS);
                        output.accept(DSSItems.MAGE_BOOTS);
                        output.accept(DSSItems.ARCHMAGE_BOOTS);
                        output.accept(DSSItems.MAGI_BOOTS);
                        output.accept(DSSItems.GLASS_BOOTS);
                        output.accept(DSSItems.TEMPERED_GLASS_BOOTS);
                        output.accept(DSSItems.AMETHYST_BOOTS);
                        output.accept(DSSItems.ARCANE_CRYSTAL_BOOTS);
                        output.accept(DSSItems.EMERALD_BOOTS);
                        output.accept(DSSItems.JADE_BOOTS);
                        output.accept(DSSItems.UNDEFEATED_BOOTS);
                        output.accept(DSSItems.HUNTER_BOOTS);
                        output.accept(DSSItems.VAMPIRE_BARON_BOOTS);
                        output.accept(DSSItems.VAMPIRE_EARL_BOOTS);
                        output.accept(DSSItems.VAMPIRE_KING_BOOTS);
                        output.accept(DSSItems.BRAHAMS_BOOTS);
                        output.accept(DSSItems.LEGEND_BOOTS);
                        output.accept(DSSItems.SCRAPPED_BOOTS);
                        output.accept(DSSItems.TUNGSTEN_BOOTS);
                        //Tablet Curios
                        output.accept(DSSItems.ARCANE_TABLET);
                        output.accept(DSSItems.ICE_TABLET);
                        output.accept(DSSItems.BLANK_TABLET);
                        output.accept(DSSItems.COOLDOWN_TABLET);
                        output.accept(DSSItems.BLOOD_TABLET);
                        output.accept(DSSItems.ENDER_TABLET);
                        output.accept(DSSItems.EVOCATION_TABLET);
                        output.accept(DSSItems.FIRE_TABLET);
                        output.accept(DSSItems.HOLY_TABLET);
                        output.accept(DSSItems.LIGHTNING_TABLET);
                        output.accept(DSSItems.NATURE_TABLET);
                        output.accept(DSSItems.PROTECTION_TABLET);
                        //Ring Curios
                        output.accept(DSSItems.ABSURD_RING);
                        output.accept(DSSItems.DORANS_RING);
                        output.accept(DSSItems.ELFIN_RING);
                        //Mask Curios
                        output.accept(DSSItems.SLAUGHTERERS_MASK);
                        //Necklace Curios
                        output.accept(DSSItems.HEARTY_NECKLACE);
                        //Bracelet Curios
                        output.accept(DSSItems.KYROS_BAND);
                        output.accept(DSSItems.ROLANDS_BAND);
                        //Charm Curios
                        output.accept(DSSItems.BUSTLING_FUNGUS);
                        output.accept(DSSItems.SALE_STAR);
                        //Belt Curios
                        output.accept(DSSItems.HOPOO_FEATHER);
                        output.accept(DSSItems.WAX_QUAIL);
                        //Weapons
                        output.accept(DSSItems.EMPTY_BROADSWORD.get());
                        //Blocks
                        output.accept(DSSBlocks.TUNGSTENORE);
                        output.accept(DSSBlocks.TUNGSTENBLOCK);
                        output.accept(DSSBlocks.JADEORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
