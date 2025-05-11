package net.Iceforkkk.DreamlessAditions.item.curios;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.curios.CurioBaseItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import top.theillusivec4.curios.api.SlotContext;

public class AbsurdRingCurio extends CurioBaseItem {
    public AbsurdRingCurio() {
        super(ItemPropertiesHelper.equipment().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
    }

    @Override
    public Multimap<Holder<Attribute>, AttributeModifier> getAttributeModifiers(SlotContext slotContext, ResourceLocation id, ItemStack stack) {
        Multimap<Holder<Attribute>, AttributeModifier> attr = LinkedHashMultimap.create();
        attr.put(AttributeRegistry.MANA_REGEN, new AttributeModifier(id, 10, AttributeModifier.Operation.ADD_VALUE));
        attr.put(AttributeRegistry.COOLDOWN_REDUCTION, new AttributeModifier(id, 0.75, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
        attr.put(AttributeRegistry.MAX_MANA, new AttributeModifier(id, -0.97, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

        return attr;
    }
}
