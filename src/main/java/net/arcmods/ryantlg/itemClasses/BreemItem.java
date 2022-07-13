package net.arcmods.ryantlg.itemClasses;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class BreemItem extends Item {
    
    public BreemItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("item.gameritems.breem.tooltip").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC) );

        //tooltip.add( new TranslatableText("item.gameritems.breem.tooltip").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC) );
    }
}
