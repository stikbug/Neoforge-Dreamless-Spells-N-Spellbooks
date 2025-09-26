package net.Iceforkkk.DreamlessAditions.entity.mobs.wulfrum_drone;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class WulfrumDroneModel extends DefaultedEntityGeoModel<WulfrumDroneEntity> {
    public WulfrumDroneModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "wulfrum_drone"));
    }

    @Override
    public ResourceLocation getModelResource(WulfrumDroneEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/entity/summon/wulfrum_drone_summon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WulfrumDroneEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/entity/summon/wulfrum_drone_summon.png");
    }





}