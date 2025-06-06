package net.Iceforkkk.DreamlessAditions.spells.ice;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.events.SpellHealEvent;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.api.util.AnimationHolder;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.registries.SoundRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.effect.ModEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.NeoForge;

import java.util.List;
import java.util.Optional;

public class JadeskinSpell extends AbstractSpell {
    private final ResourceLocation spellId = ResourceLocation.fromNamespaceAndPath(Dreamless_Spells.MOD_ID, "jadeskin");

    @Override
    public List<MutableComponent> getUniqueInfo(int spellLevel, LivingEntity caster) {
        return List.of(
                Component.translatable("ui.irons_spellbooks.effect_length", Utils.timeFromTicks(getSpellPower(spellLevel, caster) * 40, 1))
        );
    }

    private final DefaultConfig defaultConfig = new DefaultConfig()
            .setMinRarity(SpellRarity.LEGENDARY)
            .setSchoolResource(SchoolRegistry.ICE_RESOURCE)
            .setMaxLevel(3)
            .setCooldownSeconds(60)
            .build();

    public JadeskinSpell()
    {
        this.manaCostPerLevel = 80;
        this.baseSpellPower = 5;
        this.spellPowerPerLevel = 3;
        this.castTime = 0;
        this.baseManaCost = 150;
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
    public AnimationHolder getCastStartAnimation() {
        return SpellAnimations.SELF_CAST_TWO_HANDS;
    }

    @Override
    public Optional<SoundEvent> getCastFinishSound() {
        return Optional.of(SoundRegistry.SUMMONED_SWORDS_CAST.get());
    }

    @Override
    public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        float healing = getHealAmount(entity, spellLevel);

        NeoForge.EVENT_BUS.post(new SpellHealEvent(entity, entity, healing, this.getSchoolType()));
        entity.heal(healing);
        entity.addEffect(new MobEffectInstance(ModEffects.JADESKIN_EFFECT, getEffectDuration(entity, spellLevel), 0, false, false, true));

        int count = 8;
        float radius = 0.25F;

        super.onCast(level, spellLevel, entity, castSource, playerMagicData);
    }

    private float getHealAmount(LivingEntity caster, int spellLevel)
    {
        return getSpellPower(spellLevel, caster) / 3.5F;
    }

    //Obtaining Methods
    @Override
    public boolean canBeCraftedBy(Player player) {
        return true;
    }

    @Override
    public boolean allowLooting() {
        return false;
    }

    @Override
    public boolean allowCrafting() {
        return true;
    }
    @Override
    public boolean requiresLearning() {
        return false;
    }


    private int getEffectDuration(LivingEntity caster, int spellLevel)
    {
        return (int) (20 * getSpellPower(spellLevel, caster));
    }
}