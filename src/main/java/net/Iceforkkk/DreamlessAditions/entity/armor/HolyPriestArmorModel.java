package net.Iceforkkk.DreamlessAditions.entity.armor;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.item.armor.EmptyPriestArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class HolyPriestArmorModel extends DefaultedEntityGeoModel<EmptyPriestArmorItem> {

    public HolyPriestArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(EmptyPriestArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/empty_priest.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EmptyPriestArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/armor/empty_priest.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EmptyPriestArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
