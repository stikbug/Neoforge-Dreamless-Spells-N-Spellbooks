package net.Iceforkkk.DreamlessAditions.item;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.armor.FastBootsArmorItem;
import net.Iceforkkk.DreamlessAditions.item.armor.SleeplessArmorArmorItem;
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
    public static final DeferredItem<Item> NITROGLAND = ITEMS.register("nitro_gland",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NITROCORE = ITEMS.register("nitro_core",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MYSTERIOUSCIRCUITRY = ITEMS.register("mysterious_circuitry",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<ArmorItem> SLEEPLESSHELMET = ITEMS.register("sleepless_helmet",
            ()-> new SleeplessArmorArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(39))));
    public static final DeferredItem<ArmorItem> SLEEPLESSCHESTPLATE = ITEMS.register("sleepless_chestplate",
            ()-> new SleeplessArmorArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(39))));
    public static final DeferredItem<ArmorItem> SLEEPLESSLEGGINGS = ITEMS.register("sleepless_leggings",
            ()-> new SleeplessArmorArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(39))));
    public static final DeferredItem<ArmorItem> SLEEPLESSBOOTS = ITEMS.register("sleepless_boots",
            ()-> new SleeplessArmorArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(39))));
    public static final DeferredItem<ArmorItem> FASTBOOTS = ITEMS.register("fastboots",
            ()-> new FastBootsArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(39))));



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
