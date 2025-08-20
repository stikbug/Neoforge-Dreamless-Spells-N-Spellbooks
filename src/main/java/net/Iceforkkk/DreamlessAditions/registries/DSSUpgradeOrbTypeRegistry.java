package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.armor.UpgradeOrbType;
import io.redspace.ironsspellbooks.registries.UpgradeOrbTypeRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class DSSUpgradeOrbTypeRegistry {

    public static ResourceKey<UpgradeOrbType> EMPTY_SPELL_POWER = ResourceKey.create(UpgradeOrbTypeRegistry.UPGRADE_ORB_REGISTRY_KEY, Dreamless_Spells.id("empty_power"));

    public static void bootstrap(BootstrapContext<UpgradeOrbType> bootstrap) {
        bootstrap.register(EMPTY_SPELL_POWER,
                new UpgradeOrbType(DSSAttributeRegistry.EMPTY_MAGIC_POWER, 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE, DSSItems.EMPTY_UPGRADE_ORB));
    }
}
