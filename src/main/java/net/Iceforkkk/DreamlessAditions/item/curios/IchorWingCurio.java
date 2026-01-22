package net.Iceforkkk.DreamlessAditions.item.curios;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import top.theillusivec4.curios.api.SlotContext;

public class IchorWingCurio extends CurioBaseItem {
    public IchorWingCurio() {
        super(ItemPropertiesHelper.equipment().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
    }

    @Override
    public Multimap<Holder<Attribute>, AttributeModifier> getAttributeModifiers(SlotContext slotContext, ResourceLocation id, ItemStack stack) {
        Multimap<Holder<Attribute>, AttributeModifier> attr = LinkedHashMultimap.create();
        attr.put(ALObjects.Attributes.ELYTRA_FLIGHT, new AttributeModifier(id, 1, AttributeModifier.Operation.ADD_VALUE));
        attr.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(id, -0.75, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        attr.put(ALObjects.Attributes.ARROW_DAMAGE, new AttributeModifier(id, -0.75, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        attr.put(AttributeRegistry.SPELL_POWER, new AttributeModifier(id, -0.75, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        return attr;
    }
}