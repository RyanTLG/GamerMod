package net.fabricmc.ryantlg.customToolItemClasses.omnium;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class OmniumSwordItem extends SwordItem {
    public OmniumSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add( new TranslatableText("item.gamermod.omnium_sword.tooltip").formatted(Formatting.DARK_PURPLE, Formatting.ITALIC) );
}
}
