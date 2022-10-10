package net.arcmods.ryantlg.toolMaterials;

import net.arcmods.ryantlg.items.miscItems.fabricOfReality;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class notToolMaterial implements ToolMaterial {

    public static final notToolMaterial INSTANCE = new notToolMaterial();

    @Override
    public int getDurability() {
        return 50000;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 50.0F;
    }
    @Override
    public float getAttackDamage() {
        return 50.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 50;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(fabricOfReality.FABRIC_OF_REALITY);
    }

}