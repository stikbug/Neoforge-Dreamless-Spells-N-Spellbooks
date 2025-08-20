package net.Iceforkkk.DreamlessAditions.datagen;

import io.redspace.ironsspellbooks.registries.UpgradeOrbTypeRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.worldgen.ModBiomeModifiers;
import net.Iceforkkk.DreamlessAditions.worldgen.ModConfiguredFeatures;
import net.Iceforkkk.DreamlessAditions.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;


import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(UpgradeOrbTypeRegistry.UPGRADE_ORB_REGISTRY_KEY, UpgradeOrbTypeRegistry::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootsrtap)
            ;


    public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Dreamless_Spells.MOD_ID));
    }
}
