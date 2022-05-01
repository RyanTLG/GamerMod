package net.arcmods.ryantlg.blockClasses;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;

public class jeremiumBlock extends Block{
    
    public jeremiumBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("block.gameritems.jeremium.tooltip").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC) );
        tooltip.add( new TranslatableText("all.gameritems.jeremium.tooltiptwo").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC) );
    }

}
