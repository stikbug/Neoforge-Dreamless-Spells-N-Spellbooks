package net.Iceforkkk.DreamlessAditions.item.curios;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
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

public class VampireEarlBootsCurio extends CurioBaseItem {
    public VampireEarlBootsCurio() {
        super(ItemPropertiesHelper.equipment().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
    }

    @Override
    public Multimap<Holder<Attribute>, AttributeModifier> getAttributeModifiers(SlotContext slotContext, ResourceLocation id, ItemStack stack) {
        Multimap<Holder<Attribute>, AttributeModifier> attr = LinkedHashMultimap.create();
        attr.put(ALObjects.Attributes.CRIT_DAMAGE, new AttributeModifier(id, -0.4, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
        attr.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(id, 0.3, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
        attr.put(ALObjects.Attributes.ARROW_DAMAGE, new AttributeModifier(id, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));
        attr.put(ALObjects.Attributes.LIFE_STEAL, new AttributeModifier(id, 0.08, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));

        return attr;
    }
}
