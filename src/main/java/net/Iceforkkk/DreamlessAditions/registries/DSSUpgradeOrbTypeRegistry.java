package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.item.armor.UpgradeOrbType;
import io.redspace.ironsspellbooks.registries.UpgradeOrbTypeRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.resources.ResourceKey;

public class DSSUpgradeOrbTypeRegistry {

    public static ResourceKey<UpgradeOrbType> EMPTY_SPELL_POWER = ResourceKey.create(UpgradeOrbTypeRegistry.UPGRADE_ORB_REGISTRY_KEY, Dreamless_Spells.id("empty_spell_power"));
}