package net.Iceforkkk.DreamlessAditions.item;

import net.Iceforkkk.DreamlessAditions.DreamelssSpellsAndSpellbooks;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DreamelssSpellsAndSpellbooks.MOD_ID);

    public static final DeferredItem<Item> SLEEPLESSCHAIN = ITEMS.register("sleepless_chain",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SLEEPLESSCLOTH = ITEMS.register("sleepless_cloth",
            ()-> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
