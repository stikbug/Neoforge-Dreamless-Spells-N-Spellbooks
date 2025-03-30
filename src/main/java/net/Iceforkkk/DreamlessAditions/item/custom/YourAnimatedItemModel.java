package net.Iceforkkk.DreamlessAditions.item.custom;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class YourAnimatedItemModel extends DefaultedItemGeoModel<YourAnimatedItem> {
    public YourAnimatedItemModel() {
        super(ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(YourAnimatedItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "geo/your_item.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(YourAnimatedItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/item/your_item.png");
    }

    @Override
    public ResourceLocation getAnimationResource(YourAnimatedItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "animations/your_item.animation.json");
    }
}
