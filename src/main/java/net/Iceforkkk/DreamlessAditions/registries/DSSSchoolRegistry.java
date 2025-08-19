package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.api.spells.SchoolType;
import io.redspace.ironsspellbooks.registries.SoundRegistry;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.api.registry.SchoolRegistry.SCHOOL_REGISTRY_KEY;

public class DSSSchoolRegistry {
    private static final DeferredRegister<SchoolType> DSS_SCHOOLS = DeferredRegister.create(SCHOOL_REGISTRY_KEY, Dreamless_Spells.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        DSS_SCHOOLS.register(eventBus);
    }

    private static Supplier<SchoolType> registerSchool(SchoolType type)
    {
        return DSS_SCHOOLS.register(type.getId().getPath(), () -> type);
    }

    //Empty School
    public static final ResourceLocation EMPTY_RESOURCE = Dreamless_Spells.id("empty");

    public static final Supplier<SchoolType> EMPTY = registerSchool(new SchoolType
            (
                    EMPTY_RESOURCE,
                    DSSTags.EMPTY_FOCUS,
                    Component.translatable("school.dreamless_spells.empty").withStyle(Style.EMPTY.withColor(141414)),
                    DSSAttributeRegistry.EMPTY_MAGIC_POWER,
                    DSSAttributeRegistry.EMPTY_MAGIC_RESIST,
                    SoundRegistry.EVOCATION_CAST,
                    DSSDamageTypes.EMPTY_MAGIC
            ));

}
