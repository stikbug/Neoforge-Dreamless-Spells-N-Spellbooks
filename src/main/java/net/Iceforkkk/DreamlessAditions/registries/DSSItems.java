package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.item.UpgradeOrbItem;
import io.redspace.ironsspellbooks.registries.ComponentRegistry;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.armor.EmptyPriestArmorItem;
import net.Iceforkkk.DreamlessAditions.item.curios.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class DSSItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Dreamless_Spells.MOD_ID);
    //Normal Materials
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
    public static final DeferredItem<Item> RAWTUNGSTEN = ITEMS.register("raw_tungsten",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTENINGOT = ITEMS.register("tungsten_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTENNUGGET = ITEMS.register("tungsten_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PAVARIUM = ITEMS.register("pavarium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_MITHRIL_MIXTURE = ITEMS.register("tungsten_mithril_mixture",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMPTY_RUNE = ITEMS.register("empty_rune",
            ()-> new Item(new Item.Properties()));

    //Holy Priest Armor
    public static final DeferredItem<ArmorItem> EMPTYPRIESTHELMET = ITEMS.register("empty_priest_helmet",
            ()-> new EmptyPriestArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(39))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.dreamless_spells.empty_priest.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<ArmorItem> EMPTYPRIESTCHESTPLATE = ITEMS.register("empty_priest_chestplate",
            ()-> new EmptyPriestArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(39))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.dreamless_spells.empty_priest.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<ArmorItem> EMPTYPRIESTLEGGINGS = ITEMS.register("empty_priest_leggings",
            ()-> new EmptyPriestArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(39))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.dreamless_spells.empty_priest.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<ArmorItem> EMPTYPRIESTBOOTS = ITEMS.register("empty_priest_boots",
            ()-> new EmptyPriestArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(39))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.dreamless_spells.empty_priest.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    //Boots Curios
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
    public static final DeferredItem<GlassBootsCurio> GLASS_BOOTS = ITEMS.register("glass_boots", GlassBootsCurio::new);
    public static final DeferredItem<TemperedGlassBootsCurio> TEMPERED_GLASS_BOOTS = ITEMS.register("tempered_glass_boots", TemperedGlassBootsCurio::new);
    public static final DeferredItem<ArcaneCrystalBootsCurio> ARCANE_CRYSTAL_BOOTS = ITEMS.register("arcane_crystal_boots", ArcaneCrystalBootsCurio::new);
    public static final DeferredItem<AmethystBootsCurio> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", AmethystBootsCurio::new);
    public static final DeferredItem<EmeraldBootsCurio> EMERALD_BOOTS = ITEMS.register("emerald_boots", EmeraldBootsCurio::new);
    public static final DeferredItem<JadeBootsCurio> JADE_BOOTS = ITEMS.register("jade_boots", JadeBootsCurio::new);
    public static final DeferredItem<UndefeatedBootsCurio> UNDEFEATED_BOOTS = ITEMS.register("undefeated_boots", UndefeatedBootsCurio::new);
    public static final DeferredItem<LegendBootsCurio> LEGEND_BOOTS = ITEMS.register("legend_boots", LegendBootsCurio::new);
    public static final DeferredItem<BrahamsBootsCurio> BRAHAMS_BOOTS = ITEMS.register("brahams_boots", BrahamsBootsCurio::new);
    public static final DeferredItem<HunterBootsCurio> HUNTER_BOOTS = ITEMS.register("hunter_boots", HunterBootsCurio::new);
    public static final DeferredItem<VampireBaronBootsCurio> VAMPIRE_BARON_BOOTS = ITEMS.register("vampire_baron_boots", VampireBaronBootsCurio::new);
    public static final DeferredItem<VampireEarlBootsCurio> VAMPIRE_EARL_BOOTS = ITEMS.register("vampire_earl_boots", VampireEarlBootsCurio::new);
    public static final DeferredItem<VampireKingBootsCurio> VAMPIRE_KING_BOOTS = ITEMS.register("vampire_king_boots", VampireKingBootsCurio::new);
    public static final DeferredItem<TungstenBootsCurio> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", TungstenBootsCurio::new);
    public static final DeferredItem<AbsurdRingCurio> ABSURD_RING = ITEMS.register("absurd_ring", AbsurdRingCurio::new);
    public static final DeferredItem<DoransRingCurio> DORANS_RING = ITEMS.register("dorans_ring", DoransRingCurio::new);
    public static final DeferredItem<ElfinRingCurio> ELFIN_RING = ITEMS.register("elfin_ring", ElfinRingCurio::new);
    public static final DeferredItem<SlaughterersMaskCurio> SLAUGHTERERS_MASK = ITEMS.register("slaughterers_mask", SlaughterersMaskCurio::new);
    public static final DeferredItem<GoatHoofCurio> GOAT_HOOF = ITEMS.register("goat_hoof", GoatHoofCurio::new);

    //Tablet Curios
    public static final DeferredItem<BlankTabletCurio> BLANK_TABLET = ITEMS.register("blank_tablet", BlankTabletCurio::new);
    public static final DeferredItem<ArcaneTabletCurio> ARCANE_TABLET = ITEMS.register("arcane_tablet", ArcaneTabletCurio::new);
    public static final DeferredItem<BloodTabletCurio> BLOOD_TABLET = ITEMS.register("blood_tablet", BloodTabletCurio::new);
    public static final DeferredItem<CooldownTabletCurio> COOLDOWN_TABLET = ITEMS.register("cooldown_tablet", CooldownTabletCurio::new);
    public static final DeferredItem<EnderTabletCurio> ENDER_TABLET = ITEMS.register("ender_tablet", EnderTabletCurio::new);
    public static final DeferredItem<EvocationTabletCurio> EVOCATION_TABLET = ITEMS.register("evocation_tablet", EvocationTabletCurio::new);
    public static final DeferredItem<FireTabletCurio> FIRE_TABLET = ITEMS.register("fire_tablet", FireTabletCurio::new);
    public static final DeferredItem<HolyTabletCurio> HOLY_TABLET = ITEMS.register("holy_tablet", HolyTabletCurio::new);
    public static final DeferredItem<IceTabletCurio> ICE_TABLET = ITEMS.register("ice_tablet", IceTabletCurio::new);
    public static final DeferredItem<LightningTabletCurio> LIGHTNING_TABLET = ITEMS.register("lightning_tablet", LightningTabletCurio::new);
    public static final DeferredItem<NatureTabletCurio> NATURE_TABLET = ITEMS.register("nature_tablet", NatureTabletCurio::new);
    public static final DeferredItem<ProtectionTabletCurio> PROTECTION_TABLET = ITEMS.register("protection_tablet", ProtectionTabletCurio::new);

    //Necklace Curios
    public static final DeferredItem<HeartyNecklaceCurio> HEARTY_NECKLACE = ITEMS.register("hearty_necklace", HeartyNecklaceCurio::new);

    //Charm Curios
    public static final DeferredItem<BustlingFungusCurio> BUSTLING_FUNGUS = ITEMS.register("bustling_fungus", BustlingFungusCurio::new);
    public static final DeferredItem<SaleStarCurio> SALE_STAR = ITEMS.register("sale_star", SaleStarCurio::new);

    //Bracelet Curios
    public static final DeferredItem<KyrosBandCurio> KYROS_BAND = ITEMS.register("kyros_band", KyrosBandCurio::new);
    public static final DeferredItem<RolandsBandCurio> ROLANDS_BAND = ITEMS.register("rolands_band", RolandsBandCurio::new);

    //Belt Curios
    public static final DeferredItem<HopooFeatherCurio> HOPOO_FEATHER = ITEMS.register("hopoo_feather", HopooFeatherCurio::new);
    public static final DeferredItem<WaxQuailCurio> WAX_QUAIL = ITEMS.register("wax_quail", WaxQuailCurio::new);

    //Upgrade Orbs

    //Empty Orb
    public static final DeferredHolder<Item, Item> EMPTY_UPGRADE_ORB = ITEMS.register("empty_upgrade_orb",
            () -> new UpgradeOrbItem(ItemPropertiesHelper
                    .material()
                    .rarity(Rarity.EPIC)
                    .component(ComponentRegistry.UPGRADE_ORB_TYPE, DSSUpgradeOrbTypeRegistry.EMPTY_SPELL_POWER)));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
