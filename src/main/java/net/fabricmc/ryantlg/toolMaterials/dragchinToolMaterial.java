package net.fabricmc.ryantlg.toolMaterials;

import net.fabricmc.ryantlg.items.miscItems.FunnyItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class dragchinToolMaterial implements ToolMaterial {

    public static final dragchinToolMaterial INSTANCE = new dragchinToolMaterial();

    @Override
    public int getDurability() {
        return 42069420;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }
    @Override
    public float getAttackDamage() {
        return 69418.0F;
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