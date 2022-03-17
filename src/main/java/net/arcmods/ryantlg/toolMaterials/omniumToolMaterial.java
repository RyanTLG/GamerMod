package net.arcmods.ryantlg.toolMaterials;

import net.arcmods.ryantlg.items.metalItems.omniumMetals;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class omniumToolMaterial implements ToolMaterial {

    public static final omniumToolMaterial INSTANCE = new omniumToolMaterial();

    @Override
    public int getDurability() {
        return 1780;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }
    @Override
    public float getAttackDamage() {
        return 13.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 25;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(omniumMetals.OMNIUM);
    }

}