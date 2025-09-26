package net.Iceforkkk.DreamlessAditions.events;

import io.redspace.ironsspellbooks.api.events.SpellSummonEvent;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import net.Iceforkkk.DreamlessAditions.effect.DSSEffects;
import net.Iceforkkk.DreamlessAditions.registries.DSSAttributeRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import io.redspace.ironsspellbooks.api.events.SpellPreCastEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import java.util.UUID;

@EventBusSubscriber
public class ServerEvents {
    // Silence effect preventing spell casting on player
    @net.neoforged.bus.api.SubscribeEvent
    public static void onPlayerCastEvent(SpellPreCastEvent event)
    {
        var entity = event.getEntity();
        var spell = SpellRegistry.getSpell(event.getSpellId());

        // Doorway Effect
        boolean hasDoorwayEffectEffect = entity.hasEffect(DSSEffects.DOORWAY_EFFECT_EFFECT);
        if (entity instanceof ServerPlayer player && !player.level().isClientSide())
        {
            if (hasDoorwayEffectEffect)
            {
                event.setCanceled(true);
                // Effect Duration
                int time = player.getEffect(DSSEffects.DOORWAY_EFFECT_EFFECT).getDuration();
                // convert duration to time format using the method convertTicksToTime
                //String formattedTime = ASUtils.convertTicksToTime(time);

                if (player instanceof ServerPlayer serverPlayer)
                {
                    // display a message to the player
                    serverPlayer.connection.send(new ClientboundSetActionBarTextPacket(Component.translatable("display.dreamless_spells.doorway_effect_spell_forgotten")
                            .withStyle(s -> s.withColor(TextColor.fromRgb(0xF35F5F)))));
                    serverPlayer.level().playSound(null , player.getX() , player.getY() , player.getZ() ,
                            SoundEvents.FIRE_EXTINGUISH , SoundSource.PLAYERS , 0.5f , 1f);
                }
            }
        }
    }


    //commented out rn because im a fucking idiot and don't know how to make this work
//    @SubscribeEvent
//    public static void summonHealthEvent(SpellSummonEvent event) {
//        LivingEntity summoner = event.getCaster();
//        if (summoner == null) return;

        // Use .get() to obtain the actual Attribute object from DeferredHolder
//        AttributeInstance summonHealthAttrInstance = summoner.getAttribute(DSSAttributeRegistry.SUMMON_HEALTH.get());
//        if (summonHealthAttrInstance == null) return;

//        double summonHealthValue = summonHealthAttrInstance.getValue();
//        if (summonHealthValue <= 0) return;

        // Unique UUID for this modifier
//        UUID SUMMON_HEALTH_MODIFIER_UUID = UUID.fromString("c16a5320-a4b9-4aeb-8ad5-f53c9c4d1c97");

        // If your attribute is meant to be a percentage (e.g., +0.2 for +20% health), use ADD_MULTIPLIED_BASE
        // If meant to be a flat increase, use ADDITION
//        AttributeModifier summonHealthModifier = new AttributeModifier(
//                SUMMON_HEALTH_MODIFIER_UUID,
//                summonHealthValue,
//                AttributeModifier.Operation.ADD_MULTIPLIED_BASE // Use ADDITION if you want a flat number
//        );
//
//        AttributeInstance maxHealth = summoner.getAttribute(Attributes.MAX_HEALTH);
//        if (maxHealth != null) {
//            maxHealth.removeModifier(summonHealthModifier); // Prevent stacking
//            maxHealth.addPermanentModifier(summonHealthModifier);
//        }
//    }
}