package net.arcmods.ryantlg.toolMaterials;

import net.arcmods.ryantlg.items.metalItems.jeremiumMetals;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class jeremiumToolMaterial implements ToolMaterial{

    public static final jeremiumToolMaterial INSTANCE = new jeremiumToolMaterial();

    @Override
    public int getDurability() {
        return 2590;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0F;
    }
    @Override
    public float getAttackDamage() {
        return 15.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 32;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(jeremiumMetals.JEREMIUM);
    }
    
}
