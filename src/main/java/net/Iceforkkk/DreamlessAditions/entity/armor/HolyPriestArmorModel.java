package net.Iceforkkk.DreamlessAditions.entity.armor;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.item.armor.HolyPriestArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class HolyPriestArmorModel extends DefaultedEntityGeoModel<HolyPriestArmorItem> {

    public HolyPriestArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(HolyPriestArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/holy_priest.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HolyPriestArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/armor/holy_priest.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HolyPriestArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
