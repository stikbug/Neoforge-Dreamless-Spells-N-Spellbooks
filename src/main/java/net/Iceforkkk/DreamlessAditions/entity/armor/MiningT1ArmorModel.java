package net.Iceforkkk.DreamlessAditions.entity.armor;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.item.armor.MinerT1ArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class MiningT1ArmorModel extends DefaultedEntityGeoModel<MinerT1ArmorItem> {

    public MiningT1ArmorModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    // Just replace where the path is with the file path of your texture, EZ PZ
    @Override
    public ResourceLocation getModelResource(MinerT1ArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/armor/mining_t1.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MinerT1ArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/models/armor/mining_t1.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MinerT1ArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(IronsSpellbooks.MODID, "animations/wizard_armor_animation.json");
    }
}
