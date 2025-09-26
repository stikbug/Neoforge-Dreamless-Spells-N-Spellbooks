package net.Iceforkkk.DreamlessAditions.entity.mobs.wulfrum_drone;

import com.mojang.blaze3d.vertex.PoseStack;

import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WulfrumDroneRenderer extends GeoEntityRenderer<WulfrumDroneEntity> {

    public WulfrumDroneRenderer(EntityRendererProvider.Context renderManager, GeoModel<WulfrumDroneEntity> model) {
        super(renderManager, model);
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation( WulfrumDroneEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "textures/entity/summon/wulfrum_drone_summon.png");
    }

    @Override
    public void render(WulfrumDroneEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}