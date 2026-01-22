package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;


public class DSSArmorMaterials {
    private static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, Dreamless_Spells.MOD_ID);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> MINING_T1_MATERIAL = register("mining_t1",
            MiningT1ArmorMap(),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(Items.GOLD_INGOT),
            0,
            0F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> SOLAR_MATERIAL = register("solar",
            AdvancedArmorMap(),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemRegistry.MITHRIL_INGOT.get()),
            0,
            0F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> VORTEX_MATERIAL = register("vortex",
            AdvancedArmorMap(),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemRegistry.MITHRIL_INGOT.get()),
            0,
            0F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> EMPTY_PRIEST_MATERIAL = register("empty_priest",
            RegularArmorMap(),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(DSSItems.TUNGSTENINGOT.get()),
            0,
            0F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> EMPTY_BRAWLER_MATERIAL = register("empty_brawler",
            AdvancedArmorMap(),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(DSSItems.TUNGSTENINGOT.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> EMPTY_HUNTER_MATERIAL = register("empty_hunter",
            AdvancedArmorMap(),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(DSSItems.TUNGSTENINGOT.get()),
            2,
            0F);


    private static DeferredHolder<ArmorMaterial, ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            Supplier<Ingredient> repairIngredient,
            float toughness,
            float knockbackResistance
    )
    {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Dreamless_Spells.id(name)));
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(defense, enchantmentValue, equipSound, repairIngredient, list, toughness, knockbackResistance));
    }

    private static EnumMap<ArmorItem.Type, Integer> makeArmorMap(int helmet, int chestplate, int leggings, int boots) {
        return Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.HELMET, helmet);
            map.put(ArmorItem.Type.CHESTPLATE, chestplate);
            map.put(ArmorItem.Type.LEGGINGS, leggings);
            map.put(ArmorItem.Type.BOOTS, boots);
        });
    }

    public static EnumMap<ArmorItem.Type, Integer> AdvancedArmorMap(){return makeArmorMap(5, 11, 9, 5);}
    public static EnumMap<ArmorItem.Type, Integer> RegularArmorMap(){return makeArmorMap(3, 8, 6, 3);}
    public static EnumMap<ArmorItem.Type, Integer> MiningT1ArmorMap(){return makeArmorMap(1, 4, 3, 1);}


    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}