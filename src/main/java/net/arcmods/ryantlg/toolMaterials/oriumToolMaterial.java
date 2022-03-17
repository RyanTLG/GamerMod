package net.arcmods.ryantlg.toolMaterials;

import net.arcmods.ryantlg.items.metalItems.oriumMetals;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class oriumToolMaterial implements ToolMaterial {

    public static final oriumToolMaterial INSTANCE = new oriumToolMaterial();

    @Override
    public int getDurability() {
        return 950;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }
    @Override
    public float getAttackDamage() {
        return 9.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 22;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(oriumMetals.ORIUM);
    }

}