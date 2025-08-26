package net.Iceforkkk.DreamlessAditions.spells;

import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.registries.DSSAttributeRegistry;
import net.Iceforkkk.DreamlessAditions.registries.DSSDamageTypes;
import net.Iceforkkk.DreamlessAditions.registries.DSSTags;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DSSSpells {
    public static class Schools {
        public static final ResourceLocation EMPTY_RESOURCE = Dreamless_Spells.id("empty");
        private static final DeferredRegister<SchoolType> SCHOOLS = DeferredRegister.create(SchoolRegistry.SCHOOL_REGISTRY_KEY, Dreamless_Spells.MOD_ID);


        public static final Supplier<SchoolType> EMPTY = registerSchool(new SchoolType(
                EMPTY_RESOURCE,
                DSSTags.EMPTY_FOCUS,
                Component.translatable("school.dreamless_spells.empty").withColor(0xa3b6ff),
                DSSAttributeRegistry.EMPTY_SPELL_POWER,
                DSSAttributeRegistry.EMPTY_SPELL_RESIST,
                ALObjects.Sounds.DODGE,
                DSSDamageTypes.EMPTY_MAGIC
        ));

        private static Supplier<SchoolType> registerSchool(SchoolType schoolType) {
            return SCHOOLS.register(schoolType.getId().getPath(), () -> schoolType);
        }
    }
}
