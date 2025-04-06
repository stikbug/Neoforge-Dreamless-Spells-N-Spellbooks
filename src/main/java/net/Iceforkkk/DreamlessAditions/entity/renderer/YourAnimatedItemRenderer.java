package net.Iceforkkk.DreamlessAditions.entity.renderer;

import net.Iceforkkk.DreamlessAditions.item.custom.YourAnimatedItem;
import net.Iceforkkk.DreamlessAditions.item.custom.YourAnimatedItemModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class YourAnimatedItemRenderer extends GeoItemRenderer<YourAnimatedItem> {
    public YourAnimatedItemRenderer() {
        super(new YourAnimatedItemModel());
    }
}
