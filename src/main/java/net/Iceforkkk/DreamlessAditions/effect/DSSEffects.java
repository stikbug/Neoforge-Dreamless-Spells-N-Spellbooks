package net.Iceforkkk.DreamlessAditions.effect;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.DSSAttributeRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DSSEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, Dreamless_Spells.MOD_ID);

    //Jadeskin
    public static final Holder<MobEffect> JADESKIN_EFFECT = MOB_EFFECTS.register("jadeskin",
            () -> new JadeskinEffect(MobEffectCategory.BENEFICIAL, 0xfbb741)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE,
                            ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "jadeskin"), 0.5f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.ICE_SPELL_POWER,
                            ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "jadeskin"), 0.12f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(Attributes.ATTACK_SPEED,
                            ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "jadeskin"), 1.0f,
                            AttributeModifier.Operation.ADD_VALUE)
    );

    //Drained
    public static final Holder<MobEffect> DRAINED_EFFECT = MOB_EFFECTS.register("drained",
            () -> new JadeskinEffect(MobEffectCategory.HARMFUL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.MAX_MANA,
                            ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "drained"), -0.1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );


    //Emptied
    public static final Holder<MobEffect> EMPTIED_EFFECT = MOB_EFFECTS.register("emptied",
            () -> new JadeskinEffect(MobEffectCategory.NEUTRAL, 0xfbb741)
                    .addAttributeModifier(AttributeRegistry.SPELL_RESIST,
                            ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "emptied"), 0.25f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(DSSAttributeRegistry.EMPTY_SPELL_POWER,
                            ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "emptied"), 0.05f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
                    .addAttributeModifier(AttributeRegistry.MAX_MANA,
                            ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "emptied"), -0.25f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    public static final Holder<MobEffect> DOORWAY_EFFECT_EFFECT = MOB_EFFECTS.register("doorway_effect",
            () -> new DoorwayEffectEfftect()
    );
    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
