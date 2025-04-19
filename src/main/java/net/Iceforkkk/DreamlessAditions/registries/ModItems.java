package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.armor.FastBootsArmorItem;
import net.Iceforkkk.DreamlessAditions.item.armor.SleeplessArmorArmorItem;
import net.Iceforkkk.DreamlessAditions.item.curios.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Dreamless_Spells.MOD_ID);
    //Normal Materials
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
    public static final DeferredItem<Item> JADE = ITEMS.register("jade",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARCANEGEM = ITEMS.register("arcane_gem",
            ()-> new Item(new Item.Properties()));
    //Armor
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
    //Curios
    public static final DeferredItem<OldBootsCurio> OLD_BOOTS = ITEMS.register("old_boots", OldBootsCurio::new);
    public static final DeferredItem<IronSocksCurio> IRON_SOCKS = ITEMS.register("iron_socks", IronSocksCurio::new);
    public static final DeferredItem<CopperBootsCurio> COPPER_BOOTS = ITEMS.register("copper_boots", CopperBootsCurio::new);
    public static final DeferredItem<TankBootsCurio> TANK_BOOTS = ITEMS.register("tank_boots", TankBootsCurio::new);
    public static final DeferredItem<DeepDiversCurio> DEEP_DIVERS = ITEMS.register("deep_divers", DeepDiversCurio::new);
    public static final DeferredItem<PagmasBootsCurio> PAGMAS_BOOTS = ITEMS.register("pagmas_boots", PagmasBootsCurio::new);
    public static final DeferredItem<PyriumBootsCurio> PYRIUM_BOOTS = ITEMS.register("pyrium_boots", PyriumBootsCurio::new);
    public static final DeferredItem<NetheriteGreavesCurio> NETHERITE_GREAVES = ITEMS.register("netherite_greaves", NetheriteGreavesCurio::new);
    public static final DeferredItem<GoldenGreavesCurio> GOLDEN_GREAVES = ITEMS.register("golden_greaves", GoldenGreavesCurio::new);
    public static final DeferredItem<ClothBootsCurio> CLOTH_BOOTS = ITEMS.register("cloth_boots", ClothBootsCurio::new);
    public static final DeferredItem<ArcaneClothBootsCurio> ARCANE_CLOTH_BOOTS = ITEMS.register("arcane_cloth_boots", ArcaneClothBootsCurio::new);
    public static final DeferredItem<MageBootsCurio> MAGE_BOOTS = ITEMS.register("mage_boots", MageBootsCurio::new);
    public static final DeferredItem<ArchmageBootsCurio> ARCHMAGE_BOOTS = ITEMS.register("archmage_boots", ArchmageBootsCurio::new);
    public static final DeferredItem<MagiBootsCurio> MAGI_BOOTS = ITEMS.register("magi_boots", MagiBootsCurio::new);
    public static final DeferredItem<ScrappedBootsCurio> SCRAPPED_BOOTS = ITEMS.register("scrapped_boots", ScrappedBootsCurio::new);

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
