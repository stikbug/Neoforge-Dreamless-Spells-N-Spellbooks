package net.Iceforkkk.DreamlessAditions.item.armor;

import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.Iceforkkk.DreamlessAditions.effect.DSSEffects;
import net.Iceforkkk.DreamlessAditions.entity.armor.EmptyBrawlerArmorModel;
import net.Iceforkkk.DreamlessAditions.entity.armor.VortexArmorModel;
import net.Iceforkkk.DreamlessAditions.registries.DSSArmorItem;
import net.Iceforkkk.DreamlessAditions.registries.DSSArmorMaterials;
import net.Iceforkkk.DreamlessAditions.registries.DSSAttributeRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class VortexArmorItem extends DSSArmorItem {
    public VortexArmorItem(Type type, Properties settings) {
        super(DSSArmorMaterials.VORTEX_MATERIAL.getDelegate(), type, settings,
                new AttributeContainer(AttributeRegistry.LIGHTNING_SPELL_POWER, 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(ALObjects.Attributes.ARROW_DAMAGE, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 125, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new VortexArmorModel());
    }
}
