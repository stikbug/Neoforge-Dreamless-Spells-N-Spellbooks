package net.Iceforkkk.DreamlessAditions.spells.empty;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.api.util.AnimationHolder;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.TargetEntityCastData;
import io.redspace.ironsspellbooks.entity.spells.target_area.TargetedAreaEntity;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import io.redspace.ironsspellbooks.registries.SoundRegistry;
import io.redspace.ironsspellbooks.spells.TargetedTargetAreaCastData;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.effect.DSSEffects;
import net.Iceforkkk.DreamlessAditions.registries.DSSSchoolRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Optional;

@AutoSpellConfig
public class MuteSpell extends AbstractSpell {
    private final ResourceLocation spellId = ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "doorway_effect");

    @Override
    public List<MutableComponent> getUniqueInfo(int spellLevel, LivingEntity caster) {
        return List.of(
                Component.translatable("ui.irons_spellbooks.effect_length", Utils.timeFromTicks(getSpellPower(spellLevel, caster) * 5, 1)));
    }

    private final DefaultConfig defaultConfig = new DefaultConfig()
            .setMinRarity(SpellRarity.LEGENDARY)
            .setSchoolResource(DSSSchoolRegistry.EMPTY_RESOURCE)
            .setMaxLevel(5)
            .setCooldownSeconds(10)
            .build();

    public MuteSpell()
    {
        this.manaCostPerLevel = 0;
        this.baseSpellPower = 5;
        this.spellPowerPerLevel = 5;
        this.castTime = 60;
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
        return CastType.LONG;
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

        if (Utils.preCastTargetHelper(level, entity, playerMagicData, this, 32, .35f)) {
            float radius = 3f;
            assert playerMagicData.getAdditionalCastData() != null;
            var target = ((TargetEntityCastData) playerMagicData.getAdditionalCastData()).getTarget((ServerLevel) level);
            assert target != null;
            var area = TargetedAreaEntity.createTargetAreaEntity(level, target.position(), radius, MobEffectRegistry.SLOWED.get().getColor(), target);
            playerMagicData.setAdditionalCastData(new TargetedTargetAreaCastData(target, area));
            return true;
        }
        return false;
    }

    @Override
    public void onCast(Level world, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {

        if (entity.hasEffect(DSSEffects.EMPTIED_EFFECT)) {
            if (entity instanceof ServerPlayer serverPlayer) {
                serverPlayer.connection.send(new ClientboundSetActionBarTextPacket(Component.translatable("ui.dreamless_spells.forsaken_status", this.getDisplayName(serverPlayer)).withStyle(ChatFormatting.DARK_PURPLE)));

                if (playerMagicData.getAdditionalCastData() instanceof TargetEntityCastData targetData) {
                    var targetEntity = targetData.getTarget((ServerLevel) world);
                    if (targetEntity != null) {
                        targetEntity.addEffect(new MobEffectInstance(DSSEffects.MUTE_EFFECT, getDuration(spellLevel, entity), getAmplifier(spellLevel, entity)));
                    }
                }

                super.onCast(world, spellLevel, entity, castSource, playerMagicData);
            }


        } else {
            if (entity instanceof ServerPlayer serverPlayer) {
                serverPlayer.connection.send(new ClientboundSetActionBarTextPacket(Component.translatable("ui.dreamless_spells.unforsaken_status", this.getDisplayName(serverPlayer)).withStyle(ChatFormatting.RED)));
            }
        }
    }

    public int getDuration(int spellLevel, LivingEntity caster) {
        return (int) (getSpellPower(spellLevel, caster) * 0.1);
    }

    public int getAmplifier(int spellLevel, LivingEntity caster) {
        return 1;
    }

    @Override
    public AnimationHolder getCastStartAnimation() {
        return SpellAnimations.ANIMATION_LONG_CAST;
    }

    @Override
    public AnimationHolder getCastFinishAnimation() {return SpellAnimations.ANIMATION_LONG_CAST_FINISH;}

}