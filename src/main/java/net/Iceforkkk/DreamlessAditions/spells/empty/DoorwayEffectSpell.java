package net.Iceforkkk.DreamlessAditions.spells.empty;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.api.util.AnimationHolder;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.MagicManager;
import io.redspace.ironsspellbooks.damage.DamageSources;
import io.redspace.ironsspellbooks.entity.spells.ray_of_frost.RayOfFrostVisualEntity;
import io.redspace.ironsspellbooks.registries.SoundRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.effect.DSSEffects;
import net.Iceforkkk.DreamlessAditions.registries.DSSSchoolRegistry;
import net.Iceforkkk.DreamlessAditions.registries.SpellRegistries;
import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.Optional;

@AutoSpellConfig
public class DoorwayEffectSpell extends AbstractSpell {
    private final ResourceLocation spellId = ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "doorway_effect");


    private final DefaultConfig defaultConfig = new DefaultConfig()
            .setMinRarity(SpellRarity.LEGENDARY)
            .setSchoolResource(DSSSchoolRegistry.EMPTY_RESOURCE)
            .setMaxLevel(5)
            .setCooldownSeconds(10)
            .build();

    public DoorwayEffectSpell()
    {
        this.manaCostPerLevel = 0;
        this.baseSpellPower = 5;
        this.spellPowerPerLevel = 5;
        this.castTime = 0;
        this.baseManaCost = 0;
    }

    @Override
    public ResourceLocation getSpellResource() {
        return spellId;
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    public CastType getCastType() {
        return CastType.INSTANT;
    }

    @Override
    public Optional<SoundEvent> getCastFinishSound() {
        return Optional.of(SoundRegistry.NATURE_CAST.get());
    }

    @Override
    public boolean checkPreCastConditions(Level level, int spellLevel, LivingEntity entity, MagicData playerMagicData) {
        if (!entity.hasEffect(DSSEffects.EMPTIED_EFFECT)) {
            if (entity instanceof ServerPlayer serverPlayer) {
                serverPlayer.connection.send(
                        new ClientboundSetActionBarTextPacket(
                                Component.translatable("ui.dreamless_spells.unforsaken_status", this.getDisplayName(serverPlayer))
                                        .withStyle(ChatFormatting.RED)
                        )
                );
            }
            return false; //prevents casting
        }
        return false;
    }

    @Override
    public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        if (entity.hasEffect(DSSEffects.EMPTIED_EFFECT)) {
            if (entity instanceof ServerPlayer serverPlayer) {
                serverPlayer.connection.send(new ClientboundSetActionBarTextPacket(Component.translatable("ui.dreamless_spells.forsaken_status", this.getDisplayName(serverPlayer)).withStyle(ChatFormatting.RED)));
                var hitResult = Utils.raycastForEntity(level, entity, 30, true, 0.15F);
                RayOfFrostVisualEntity ray = new RayOfFrostVisualEntity(level, entity.getEyePosition(), hitResult.getLocation(), entity);
                level.addFreshEntity(ray);

                if (hitResult.getType() == HitResult.Type.ENTITY) {
                    Entity target = ((EntityHitResult) hitResult).getEntity();
                    DamageSources.applyDamage(target, getDamage(spellLevel, entity), SpellRegistries.DOORWAY_EFFECT.get().getDamageSource(entity));
                    if (target instanceof LivingEntity livingTarget) {
                        livingTarget.addEffect(new MobEffectInstance(DSSEffects.DOORWAY_EFFECT_EFFECT, 60, 1, true, true, true));
                        MagicManager.spawnParticles(level, ParticleTypes.DRAGON_BREATH, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 10, 0, 0, 0, 0.1, true);
                    } else if (hitResult.getType() == HitResult.Type.BLOCK) {
                        MagicManager.spawnParticles(level, ParticleTypes.DRAGON_BREATH, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 10, 0, 0, 0, 0.1, false);
                    }
                    MagicManager.spawnParticles(level, ParticleTypes.DRAGON_BREATH, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 10, 0, 0, 0, 0.1, false);
                }
            } else {
                if (entity instanceof ServerPlayer serverPlayer) {
                    serverPlayer.connection.send(new ClientboundSetActionBarTextPacket(Component.translatable("ui.dreamless_spells.unforsaken_status", this.getDisplayName(serverPlayer)).withStyle(ChatFormatting.RED)));
                }
            }
        }

        super.onCast(level, spellLevel, entity, castSource, playerMagicData);
    }

    private float getDamage(int spellLevel, LivingEntity caster)
    {
        return getSpellPower(spellLevel, caster) * 2F;
    }


    @Override
    public AnimationHolder getCastStartAnimation() {
        return SpellAnimations.ANIMATION_INSTANT_CAST;
    }

}