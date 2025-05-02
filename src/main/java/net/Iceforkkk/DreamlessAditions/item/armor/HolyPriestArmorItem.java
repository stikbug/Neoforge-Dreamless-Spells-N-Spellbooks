package net.Iceforkkk.DreamlessAditions.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.Iceforkkk.DreamlessAditions.entity.armor.HolyPriestArmorModel;
import net.Iceforkkk.DreamlessAditions.registries.ModArmorItem;
import net.Iceforkkk.DreamlessAditions.registries.ModArmorMaterials;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HolyPriestArmorItem extends ModArmorItem {
    public HolyPriestArmorItem(Type type, Properties settings) {
        super(ModArmorMaterials.SLEEPLESS_ARMOR_MATERIAL, type, settings,
                new AttributeContainer(AttributeRegistry.SPELL_RESIST, .25, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, -0.33, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, -0.33, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
        );
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new HolyPriestArmorModel());
    }
}
