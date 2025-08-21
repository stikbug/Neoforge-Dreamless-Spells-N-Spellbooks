package net.Iceforkkk.DreamlessAditions.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.Iceforkkk.DreamlessAditions.entity.armor.HolyPriestArmorModel;
import net.Iceforkkk.DreamlessAditions.registries.DSSArmorItem;
import net.Iceforkkk.DreamlessAditions.registries.DSSArmorMaterials;
import net.Iceforkkk.DreamlessAditions.registries.DSSAttributeRegistry;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class EmptyPriestArmorItem extends DSSArmorItem {
    public EmptyPriestArmorItem(Type type, Properties settings) {
        super(DSSArmorMaterials.EMPTY_ARMOR_MATERIAL, type, settings,
                new AttributeContainer(DSSAttributeRegistry.EMPTY_SPELL_POWER, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
        );
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new HolyPriestArmorModel());
    }
}
