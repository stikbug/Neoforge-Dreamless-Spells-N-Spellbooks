package net.Iceforkkk.DreamlessAditions.item.weapons;

import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.item.weapons.IronsWeaponTier;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.Iceforkkk.DreamlessAditions.registries.DSSAttributeRegistry;
import net.Iceforkkk.DreamlessAditions.registries.DSSItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import java.util.function.Supplier;

public class DSSExtendedWeaponTiers implements Tier, IronsWeaponTier {

    public static DSSExtendedWeaponTiers EMPTY_BROADSWORD = new DSSExtendedWeaponTiers(
            8064,
            7,
            -3.0F,
            10,
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            () -> Ingredient.of(DSSItems.TUNGSTENINGOT.get()),
            new AttributeContainer[DSSAttributeRegistry.EMPTY_SPELL_POWER, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE],
            new AttributeContainer[DSSAttributeRegistry.EMPTY_SPELL_POWER, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE]
            );


    //private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final TagKey<Block> incorrectBlocksForDrops;
    private final Supplier<Ingredient> repairIngredient;
    private final AttributeContainer[] attributeContainers;

    public DSSExtendedWeaponTiers(int uses, float speed, float damage, int enchantmentValue, TagKey<Block> incorrectBlocksForDrops, Supplier<Ingredient> repairIngredient, AttributeContainer[] attributeContainers) {
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.repairIngredient = repairIngredient;
        this.attributeContainers = attributeContainers;
    }

    @Override
    public AttributeContainer[] getAdditionalAttributes() {
        return this.attributeContainers;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
