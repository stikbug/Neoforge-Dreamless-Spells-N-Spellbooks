package net.Iceforkkk.DreamlessAditions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.armor.EmptyBrawlerArmorItem;
import net.Iceforkkk.DreamlessAditions.item.armor.EmptyHunterArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class EmptyHunterArmorModel extends DefaultedEntityGeoModel<EmptyHunterArmorItem> {

    public EmptyHunterArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(EmptyHunterArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/empty_hunter.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EmptyHunterArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/armor/empty_hunter.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EmptyHunterArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
