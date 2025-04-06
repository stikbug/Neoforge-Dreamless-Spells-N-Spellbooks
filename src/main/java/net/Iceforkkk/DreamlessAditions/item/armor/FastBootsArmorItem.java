package net.Iceforkkk.DreamlessAditions.item.armor;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.armor.ImbuableChestplateArmorItem;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.Iceforkkk.DreamlessAditions.entity.armor.FastBootsArmorModel;
import net.Iceforkkk.DreamlessAditions.item.ModArmorMaterials;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FastBootsArmorItem extends ImbuableChestplateArmorItem {
    public FastBootsArmorItem(Type type, Properties settings) {
        super(ModArmorMaterials.FASTBOOTS_MATERIAL, type, settings,
            new AttributeContainer(Attributes.SAFE_FALL_DISTANCE, 5, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(Attributes.MOVEMENT_SPEED, 0.075, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(Attributes.ATTACK_DAMAGE, -50, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(Attributes.ATTACK_KNOCKBACK, -0.5, AttributeModifier.Operation.ADD_VALUE)
        );
    }

    @Override
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new FastBootsArmorModel());
    }
}
