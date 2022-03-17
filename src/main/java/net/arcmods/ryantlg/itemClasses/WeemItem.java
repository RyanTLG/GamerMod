package net.arcmods.ryantlg.itemClasses;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class WeemItem extends Item {
    
    public WeemItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

    tooltip.add( new TranslatableText("item.gamermod.weem.tooltip").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC) );
}
}
