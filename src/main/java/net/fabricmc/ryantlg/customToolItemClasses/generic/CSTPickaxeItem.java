package net.fabricmc.ryantlg.customToolItemClasses.generic;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CSTPickaxeItem extends PickaxeItem {
    public CSTPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}