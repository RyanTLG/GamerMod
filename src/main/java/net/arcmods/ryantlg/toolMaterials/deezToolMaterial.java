package net.arcmods.ryantlg.toolMaterials;

import net.arcmods.ryantlg.items.miscItems.FunnyItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class deezToolMaterial implements ToolMaterial {

    public static final deezToolMaterial INSTANCE = new deezToolMaterial();

    @Override
    public int getDurability() {
        return 42069;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }
    @Override
    public float getAttackDamage() {
        return 42.0F;
    }
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public int getEnchantability() {
        return 22;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(FunnyItems.DEEZ);
    }

}