package net.Iceforkkk.DreamlessAditions.effect;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
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

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
