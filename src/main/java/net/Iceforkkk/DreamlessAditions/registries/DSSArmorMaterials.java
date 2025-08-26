package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.Util;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;


public class DSSArmorMaterials {
    private static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, Dreamless_Spells.MOD_ID);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> EMPTY_PRIEST_MATERIAL = register("empty_priest_armor",
            makeArmorMap(3, 8, 6, 3),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(DSSItems.TUNGSTENINGOT.get()),
            0,
            0F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> EMPTY_BRAWLER_MATERIAL = register("empty_brawler_armor",
            makeArmorMap(6, 11, 9, 6),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(DSSItems.TUNGSTENINGOT.get()),
            2,
            0.1F);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> EMPTY_HUNTER_MATERIAL = register("empty_hunter_armor",
            makeArmorMap(5, 9, 8, 5),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(DSSItems.TUNGSTENINGOT.get()),
            2,
            0F);




    private static Holder<ArmorMaterial> register(EnumMap<ArmorItem.Type, Integer> typeProtection) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "sleepless_armor");
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(((Supplier<Item>) DSSItems.TUNGSTENINGOT).get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, 16, equipSound, ingredient, layers, (float) 0, (float) 0.0));

    }
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

    public static EnumMap<ArmorItem.Type, Integer> makeArmorMap(int helmet, int chestplate, int leggings, int boots)
    {
        return Util.make(new EnumMap<>(ArmorItem.Type.class), (typeIntegerEnumMap) -> {
            typeIntegerEnumMap.put(ArmorItem.Type.HELMET, helmet);
            typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, chestplate);
            typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, leggings);
            typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, boots);
        });
    }

    public static EnumMap<ArmorItem.Type, Integer> emptyAdvancedArmorMap(){return makeArmorMap(5, 11, 9, 5);}
    public static EnumMap<ArmorItem.Type, Integer> emptyArmorMap(){return makeArmorMap(3, 8, 6, 3);}

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}