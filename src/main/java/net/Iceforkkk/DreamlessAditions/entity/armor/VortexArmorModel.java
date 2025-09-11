package net.Iceforkkk.DreamlessAditions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.armor.EmptyBrawlerArmorItem;
import net.Iceforkkk.DreamlessAditions.item.armor.VortexArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class VortexArmorModel extends DefaultedEntityGeoModel<VortexArmorItem> {

    public VortexArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(VortexArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/armor/vortex_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VortexArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/armor/vortex_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VortexArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
