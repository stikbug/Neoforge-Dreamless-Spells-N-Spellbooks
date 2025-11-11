package net.Iceforkkk.DreamlessAditions.registries;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.Iceforkkk.DreamlessAditions.Dreamless_Spells;
import net.Iceforkkk.DreamlessAditions.spells.empty.MuteSpell;
import net.Iceforkkk.DreamlessAditions.spells.empty.DrainedSpell;
import net.Iceforkkk.DreamlessAditions.spells.empty.DullardSpell;
import net.Iceforkkk.DreamlessAditions.spells.ice.JadeskinSpell;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static io.redspace.ironsspellbooks.api.registry.SpellRegistry.SPELL_REGISTRY_KEY;


public class SpellRegistries {
    public static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SPELL_REGISTRY_KEY, Dreamless_Spells.MOD_ID);

    public static Supplier<AbstractSpell> registerSpell(AbstractSpell spell) {
        return SPELLS.register(spell.getSpellName(), ()-> spell);
    }

    public static final Supplier<AbstractSpell> JADESKIN = registerSpell(new JadeskinSpell());
    public static final Supplier<AbstractSpell> DRAINED = registerSpell(new DrainedSpell());
    public static final Supplier<AbstractSpell> DULLARD = registerSpell(new DullardSpell());
    public static final Supplier<AbstractSpell> MUTE = registerSpell(new MuteSpell());


    public static void register(IEventBus eventBus)
    {
        SPELLS.register(eventBus);
    }
}
