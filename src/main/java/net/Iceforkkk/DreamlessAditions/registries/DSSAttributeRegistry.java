package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.api.attribute.MagicRangedAttribute;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


@EventBusSubscriber(modid = Dreamless_Spells.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DSSAttributeRegistry {
    private static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(Registries.ATTRIBUTE, Dreamless_Spells.MOD_ID);

    public static final DeferredHolder<Attribute, Attribute> EMPTY_SPELL_POWER = registerPowerAttribute("empty");
    public static final DeferredHolder<Attribute, Attribute> EMPTY_SPELL_RESIST = registerResistanceAttribute("empty");

    public static void register(IEventBus eventBus)
    {
        ATTRIBUTES.register(eventBus);
    }

    @SubscribeEvent
    public static void modifyEntityAttributes(EntityAttributeModificationEvent event)
    {
        event.getTypes().forEach(entityType ->
                ATTRIBUTES.getEntries().forEach(
                        attributeDeferredHolder -> event.add(entityType, attributeDeferredHolder
                        )));
    }

    // ;_;
    private static DeferredHolder<Attribute, Attribute> registerResistanceAttribute(String id)
    {
        return ATTRIBUTES.register(id + "_magic_resist", () ->
                (new MagicRangedAttribute("attribute.dreamless_spells." + id + "_spell_resist",
                        1.0D, 0, 10).setSyncable(true)));
    }

    private static DeferredHolder<Attribute, Attribute> registerPowerAttribute(String id)
    {
        return ATTRIBUTES.register(id + "_spell_power", () ->
                (new MagicRangedAttribute("attribute.dreamless_spells." + id + "_spell_power",
                        1.0D, 0, 10).setSyncable(true)));
    }
}
