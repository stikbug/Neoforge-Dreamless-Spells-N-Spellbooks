package net.Iceforkkk.DreamlessAditions.item;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>  CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dreamless_Spells.MOD_ID);

    public static final Supplier<CreativeModeTab> DREAMLESS_SPELLS_TAB = CREATIVE_MODE_TAB.register("dreamless_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SLEEPLESSCLOTH.get()))
                    .title(Component.translatable("creative.dreamless_spells.dreamless_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SLEEPLESSCLOTH);
                        output.accept(ModItems.SLEEPLESSCHAIN);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
