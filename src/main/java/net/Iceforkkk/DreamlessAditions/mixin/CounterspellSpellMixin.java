package net.Iceforkkk.DreamlessAditions.mixin;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import io.redspace.ironsspellbooks.spells.ender.CounterspellSpell;
import net.Iceforkkk.DreamlessAditions.registries.DSSSchoolRegistry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CounterspellSpell.class)
public abstract class CounterspellSpellMixin extends AbstractSpell {

    @Override
    public SchoolType getSchoolType() {
        return DSSSchoolRegistry.EMPTY.get();
    }
}