package net.fabricmc.ryantlg.customToolItemClasses.generic;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CSTSwordItem extends SwordItem{

    public CSTSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    
}
