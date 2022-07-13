package net.arcmods.ryantlg.blockClasses;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;

public class oriumBlock extends Block{

    public oriumBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("block.gameritems.orium.tooltip").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC) );
    }
}
