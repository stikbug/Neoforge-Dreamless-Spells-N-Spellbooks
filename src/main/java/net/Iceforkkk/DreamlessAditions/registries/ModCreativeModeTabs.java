package net.Iceforkkk.DreamlessAditions.registries;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>  CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dreamless_Spells.MOD_ID);

    public static final Supplier<CreativeModeTab> DREAMLESS_SPELLS_TAB = CREATIVE_MODE_TAB.register("dreamless_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARCANE_TABLET.get()))
                    .title(Component.translatable("creativetab.dreamless_spells.dreamless_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Basic items
                        output.accept(ModItems.ARCANEGEM);
                        output.accept(ModItems.NITROCORE);
                        output.accept(ModItems.NITROGLAND);
                        output.accept(ModItems.MYSTERIOUSCIRCUITRY);
                        output.accept(ModItems.JADE);
                        output.accept(ModItems.TUNGSTENINGOT);
                        output.accept(ModItems.RAWTUNGSTEN);
                        output.accept(ModItems.TUNGSTENNUGGET);
                        output.accept(ModItems.TUNGSTEN_MITHRIL_MIXTURE);
                        output.accept(ModItems.PAVARIUM);
                        //Holy Priest Armor
                        output.accept(ModItems.HOLYPRIESTBOOTS);
                        output.accept(ModItems.HOLYPRIESTLEGGINGS);
                        output.accept(ModItems.HOLYPRIESTCHESTPLATE);
                        output.accept(ModItems.HOLYPRIESTHELMET);
                        //Boot Curios
                        output.accept(ModItems.OLD_BOOTS);
                        output.accept(ModItems.IRON_SOCKS);
                        output.accept(ModItems.COPPER_BOOTS);
                        output.accept(ModItems.DEEP_DIVERS);
                        output.accept(ModItems.TANK_BOOTS);
                        output.accept(ModItems.PYRIUM_BOOTS);
                        output.accept(ModItems.PAGMAS_BOOTS);
                        output.accept(ModItems.NETHERITE_GREAVES);
                        output.accept(ModItems.GOLDEN_GREAVES);
                        output.accept(ModItems.CLOTH_BOOTS);
                        output.accept(ModItems.ARCANE_CLOTH_BOOTS);
                        output.accept(ModItems.MAGE_BOOTS);
                        output.accept(ModItems.ARCHMAGE_BOOTS);
                        output.accept(ModItems.MAGI_BOOTS);
                        output.accept(ModItems.GLASS_BOOTS);
                        output.accept(ModItems.TEMPERED_GLASS_BOOTS);
                        output.accept(ModItems.AMETHYST_BOOTS);
                        output.accept(ModItems.ARCANE_CRYSTAL_BOOTS);
                        output.accept(ModItems.EMERALD_BOOTS);
                        output.accept(ModItems.JADE_BOOTS);
                        output.accept(ModItems.UNDEFEATED_BOOTS);
                        output.accept(ModItems.HUNTER_BOOTS);
                        output.accept(ModItems.VAMPIRE_BARON_BOOTS);
                        output.accept(ModItems.VAMPIRE_EARL_BOOTS);
                        output.accept(ModItems.VAMPIRE_KING_BOOTS);
                        output.accept(ModItems.BRAHAMS_BOOTS);
                        output.accept(ModItems.LEGEND_BOOTS);
                        output.accept(ModItems.SCRAPPED_BOOTS);
                        output.accept(ModItems.TUNGSTEN_BOOTS);
                        //Tablet Curios
                        output.accept(ModItems.ARCANE_TABLET);
                        output.accept(ModItems.ICE_TABLET);
                        output.accept(ModItems.BLANK_TABLET);
                        output.accept(ModItems.COOLDOWN_TABLET);
                        output.accept(ModItems.BLOOD_TABLET);
                        output.accept(ModItems.ENDER_TABLET);
                        output.accept(ModItems.EVOCATION_TABLET);
                        output.accept(ModItems.FIRE_TABLET);
                        output.accept(ModItems.HOLY_TABLET);
                        output.accept(ModItems.LIGHTNING_TABLET);
                        output.accept(ModItems.NATURE_TABLET);
                        output.accept(ModItems.PROTECTION_TABLET);
                        //Blocks
                        output.accept(ModBlocks.TUNGSTENORE);
                        output.accept(ModBlocks.TUNGSTENBLOCK);
                        output.accept(ModBlocks.JADEORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
