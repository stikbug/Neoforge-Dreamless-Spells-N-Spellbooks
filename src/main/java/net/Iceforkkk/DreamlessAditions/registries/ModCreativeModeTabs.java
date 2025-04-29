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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SLEEPLESSCLOTH.get()))
                    .title(Component.translatable("creativetab.dreamless_spells.dreamless_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Basic items
                        output.accept(ModItems.SLEEPLESSCLOTH);
                        output.accept(ModItems.SLEEPLESSCHAIN);
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
                        output.accept((ItemLike) ModItems.OLD_BOOTS);
                        output.accept((ItemLike) ModItems.IRON_SOCKS);
                        output.accept((ItemLike) ModItems.COPPER_BOOTS);
                        output.accept((ItemLike) ModItems.DEEP_DIVERS);
                        output.accept((ItemLike) ModItems.TANK_BOOTS);
                        output.accept((ItemLike) ModItems.PYRIUM_BOOTS);
                        output.accept((ItemLike) ModItems.PAGMAS_BOOTS);
                        output.accept((ItemLike) ModItems.NETHERITE_GREAVES);
                        output.accept((ItemLike) ModItems.GOLDEN_GREAVES);
                        output.accept((ItemLike) ModItems.CLOTH_BOOTS);
                        output.accept((ItemLike) ModItems.ARCANE_CLOTH_BOOTS);
                        output.accept((ItemLike) ModItems.MAGE_BOOTS);
                        output.accept((ItemLike) ModItems.ARCHMAGE_BOOTS);
                        output.accept((ItemLike) ModItems.MAGI_BOOTS);
                        output.accept((ItemLike) ModItems.GLASS_BOOTS);
                        output.accept((ItemLike) ModItems.TEMPERED_GLASS_BOOTS);
                        output.accept((ItemLike) ModItems.AMETHYST_BOOTS);
                        output.accept((ItemLike) ModItems.ARCANE_CRYSTAL_BOOTS);
                        output.accept((ItemLike) ModItems.EMERALD_BOOTS);
                        output.accept((ItemLike) ModItems.JADE_BOOTS);
                        output.accept((ItemLike) ModItems.UNDEFEATED_BOOTS);
                        output.accept((ItemLike) ModItems.HUNTER_BOOTS);
                        output.accept((ItemLike) ModItems.VAMPIRE_BARON_BOOTS);
                        output.accept((ItemLike) ModItems.VAMPIRE_EARL_BOOTS);
                        output.accept((ItemLike) ModItems.VAMPIRE_KING_BOOTS);
                        output.accept((ItemLike) ModItems.BRAHAMS_BOOTS);
                        output.accept((ItemLike) ModItems.LEGEND_BOOTS);
                        output.accept((ItemLike) ModItems.SCRAPPED_BOOTS);
                        output.accept((ItemLike) ModItems.TUNGSTEN_BOOTS);
                        //Tablet Curios
                        output.accept((ItemLike) ModItems.ARCANE_TABLET);
                        output.accept((ItemLike) ModItems.ICE_TABLET);
                        output.accept((ItemLike) ModItems.BLANK_TABLET);
                        output.accept((ItemLike) ModItems.COOLDOWN_TABLET);
                        output.accept((ItemLike) ModItems.BLOOD_TABLET);
                        output.accept((ItemLike) ModItems.ENDER_TABLET);
                        output.accept((ItemLike) ModItems.EVOCATION_TABLET);
                        output.accept((ItemLike) ModItems.FIRE_TABLET);
                        output.accept((ItemLike) ModItems.HOLY_TABLET);
                        output.accept((ItemLike) ModItems.LIGHTNING_TABLET);
                        output.accept((ItemLike) ModItems.NATURE_TABLET);
                        output.accept((ItemLike) ModItems.PROTECTION_TABLET);
                        //Blocks
                        output.accept(ModBlocks.TUNGSTENORE);
                        output.accept(ModBlocks.TUNGSTENBLOCK);
                        output.accept(ModBlocks.JADEORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
