package net.Iceforkkk.DreamlessAditions.item.armor;

import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.Iceforkkk.DreamlessAditions.effect.DSSEffects;
import net.Iceforkkk.DreamlessAditions.entity.armor.EmptyBrawlerArmorModel;
import net.Iceforkkk.DreamlessAditions.entity.armor.EmptyHunterArmorModel;
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

public class EmptyHunterArmorItem extends DSSArmorItem {
    public EmptyHunterArmorItem(Type type, Properties settings) {
        super(DSSArmorMaterials.EMPTY_HUNTER_MATERIAL, type, settings,
                new AttributeContainer(DSSAttributeRegistry.EMPTY_SPELL_POWER, 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(ALObjects.Attributes.ARROW_DAMAGE, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
        );
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack,@NotNull Level level,@NotNull Entity entity, int slotId, boolean isSelected) {
        if (entity instanceof Player player && !level.isClientSide() && isWearingFullSet(player)) {
            evaluateArmorEffects(player);
        }
    }

    private void evaluateArmorEffects(Player player) {
        if (!player.hasEffect(DSSEffects.EMPTIED_EFFECT)) {
            player.addEffect(new MobEffectInstance(DSSEffects.EMPTIED_EFFECT, 200, 3, false, false, false));
        }
    }

    private boolean isWearingFullSet(Player player) {
        return player.getItemBySlot(Type.HELMET.getSlot()).getItem() instanceof EmptyHunterArmorItem &&
                player.getItemBySlot(Type.CHESTPLATE.getSlot()).getItem() instanceof EmptyHunterArmorItem &&
                player.getItemBySlot(Type.LEGGINGS.getSlot()).getItem() instanceof EmptyHunterArmorItem &&
                player.getItemBySlot(Type.BOOTS.getSlot()).getItem() instanceof EmptyHunterArmorItem;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new EmptyHunterArmorModel());
    }
}
