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
                        //Items that have durrability
                        output.accept(ModItems.SLEEPLESSBOOTS);
                        output.accept(ModItems.SLEEPLESSLEGGINGS);
                        output.accept(ModItems.SLEEPLESSCHESTPLATE);
                        output.accept(ModItems.SLEEPLESSHELMET);
                        output.accept(ModItems.FASTBOOTS);
                        //Curios
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
                        //Blocks
                        output.accept(ModBlocks.SLEEPLESSCLOTHBLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
