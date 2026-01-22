package net.Iceforkkk.DreamlessAditions.item.armor;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.Iceforkkk.DreamlessAditions.entity.armor.MiningT1ArmorModel;
import net.Iceforkkk.DreamlessAditions.registries.DSSArmorItem;
import net.Iceforkkk.DreamlessAditions.registries.DSSArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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

public class MinerT1ArmorItem extends DSSArmorItem {
    public MinerT1ArmorItem(Type type, Properties settings) {
        super(DSSArmorMaterials.MINING_T1_MATERIAL.getDelegate(), type, settings,
                new AttributeContainer(Attributes.BLOCK_BREAK_SPEED, 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
        );
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack,@NotNull Level level,@NotNull Entity entity, int slotId, boolean isSelected) {
        /*
        * To do more armor effects (for if you want a certain piece to give a specific effect)
        * Duplicate the below code block and change the names slightly
        * Ex: isWearingFullSet -> isWearingHelmet, evaluateArmorEffects -> evaluateHelmetEffects
        */
        if (entity instanceof Player player && !level.isClientSide() && isWearingFullSet(player)) {
            evaluateArmorEffects(player);
        }
    }

    private void evaluateArmorEffects(Player player) {
        if (!player.hasEffect(MobEffects.NIGHT_VISION)) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 0, false, false, false));
        }
    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(Type.HELMET.getSlot()).getItem() instanceof MinerT1ArmorItem &&
                player.getItemBySlot(Type.CHESTPLATE.getSlot()).getItem() instanceof MinerT1ArmorItem &&
                player.getItemBySlot(Type.LEGGINGS.getSlot()).getItem() instanceof MinerT1ArmorItem &&
                player.getItemBySlot(Type.BOOTS.getSlot()).getItem() instanceof MinerT1ArmorItem;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new MiningT1ArmorModel());
    }
}
