package net.arcmods.ryantlg.itemClasses;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class jeremiumItem extends Item{

    public jeremiumItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("all.gameritems.jeremium.tooltiptwo").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC) );

    }
    
}
