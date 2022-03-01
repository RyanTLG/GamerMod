package net.fabricmc.ryantlg.itemClasses;


import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class FabricReality extends Item{

    public FabricReality(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

    tooltip.add( new TranslatableText("item.gamermod.fabric_of_reality.tooltip").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC) );

    }
}
