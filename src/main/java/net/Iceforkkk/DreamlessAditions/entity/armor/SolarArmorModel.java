package net.Iceforkkk.DreamlessAditions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.armor.EmptyBrawlerArmorItem;
import net.Iceforkkk.DreamlessAditions.item.armor.SolarArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class SolarArmorModel extends DefaultedEntityGeoModel<SolarArmorItem> {

    public SolarArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(SolarArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/armor/solar_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SolarArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/armor/solar_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SolarArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
