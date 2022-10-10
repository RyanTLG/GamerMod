package net.arcmods.ryantlg.toolMaterials;

import net.arcmods.ryantlg.items.metalItems.stupidiumMetals;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class stupidiumToolMaterial implements ToolMaterial {

    public static final stupidiumToolMaterial INSTANCE = new stupidiumToolMaterial();

    @Override
    public int getDurability() {
        return 1530;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }
    @Override
    public float getAttackDamage() {
        return 10.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 27;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(stupidiumMetals.STUPIDIUM);
    }

}