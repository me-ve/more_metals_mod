package com.meve.moremetals.util.enums;

import com.meve.moremetals.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    SILVER(2, 420, 7.0F,
            2.0F, 20, () -> {
        return Ingredient.of(ModItems.SILVER_INGOT.get());
    });



    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ModItemTier(int level, int uses,
                float speed, float damage,
                int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
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
    public int getLevel() {
        return level;
    }
    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
