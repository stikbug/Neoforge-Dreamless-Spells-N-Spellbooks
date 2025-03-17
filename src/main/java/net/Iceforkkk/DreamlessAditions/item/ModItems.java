package net.Iceforkkk.DreamlessAditions.item;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Dreamless_Spells.MOD_ID);

    public static final DeferredItem<Item> SLEEPLESSCHAIN = ITEMS.register("sleepless_chain",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SLEEPLESSCLOTH = ITEMS.register("sleepless_cloth",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<ArmorItem> SLEEPLESSHELMET = ITEMS.register("sleepless_helmet",
            ()-> new ArmorItem(ModArmorMaterials.SLEEPLESS_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(39))));
    public static final DeferredItem<ArmorItem> SLEEPLESSCHESTPLATE = ITEMS.register("sleepless_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.SLEEPLESS_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(39))));
    public static final DeferredItem<ArmorItem> SLEEPLESSLEGGINGS = ITEMS.register("sleepless_leggings",
            ()-> new ArmorItem(ModArmorMaterials.SLEEPLESS_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(39))));
    public static final DeferredItem<ArmorItem> SLEEPLESSBOOTS = ITEMS.register("sleepless_boots",
            ()-> new ArmorItem(ModArmorMaterials.SLEEPLESS_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(39))));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
