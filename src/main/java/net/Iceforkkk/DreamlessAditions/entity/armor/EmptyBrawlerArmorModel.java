package net.Iceforkkk.DreamlessAditions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.armor.EmptyBrawlerArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class EmptyBrawlerArmorModel extends DefaultedEntityGeoModel<EmptyBrawlerArmorItem> {

    public EmptyBrawlerArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(EmptyBrawlerArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/armor/empty_brawler.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EmptyBrawlerArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/armor/empty_brawler.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EmptyBrawlerArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
