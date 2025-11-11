package net.Iceforkkk.DreamlessAditions.events;

import io.redspace.ironsspellbooks.api.events.SpellSummonEvent;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.config.SummonAttrHelper;
import net.Iceforkkk.DreamlessAditions.effect.DSSEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import io.redspace.ironsspellbooks.api.events.SpellPreCastEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class ServerEvents extends SummonAttrHelper {
    public static double getSummonHealthBonus(LivingEntity caster) {
        // 10% extra health for every extra spell power
        return (getSummonHealth(caster) - 1);
    }




    // Doorway effect preventing spell casting on player
    @net.neoforged.bus.api.SubscribeEvent
    public static void onPlayerCastEvent(SpellPreCastEvent event)
    {
        var entity = event.getEntity();
        var spell = SpellRegistry.getSpell(event.getSpellId());

        // Doorway Effect
        boolean hasDoorwayEffectEffect = entity.hasEffect(DSSEffects.MUTE_EFFECT);
        if (entity instanceof ServerPlayer player && !player.level().isClientSide())
        {
            if (hasDoorwayEffectEffect)
            {
                event.setCanceled(true);
                // Effect Duration
                int time = player.getEffect(DSSEffects.MUTE_EFFECT).getDuration();
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


    @SubscribeEvent
    public static void summonEvent(SpellSummonEvent event)
    {
        LivingEntity entity = event.getCaster();
        LivingEntity summon = event.getCreature();
        AttributeModifier summonHealthModifier = new AttributeModifier(Dreamless_Spells.id("summon_health_bonus"), getSummonHealthBonus(entity), AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        //AttributeModifier summonDamageModifier = new AttributeModifier(Dreamless_Spells.id("summon_damage_bonus"), getDamageBonus(entity), AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

        summon.getAttributes().getInstance(Attributes.MAX_HEALTH).addPermanentModifier(summonHealthModifier);
        summon.setHealth(summon.getMaxHealth());
    }
}