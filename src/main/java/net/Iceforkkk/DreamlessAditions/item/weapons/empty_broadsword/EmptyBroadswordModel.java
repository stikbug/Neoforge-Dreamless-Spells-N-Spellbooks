package net.Iceforkkk.DreamlessAditions.item.weapons.empty_broadsword;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class EmptyBroadswordModel extends DefaultedItemGeoModel<EmptyBroadswordItem> {
    public EmptyBroadswordModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(EmptyBroadswordItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/weapons/empty_broadsword.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EmptyBroadswordItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/item/empty_broadsword.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EmptyBroadswordItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}