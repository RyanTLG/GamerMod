package net.arcmods.ryantlg.customToolItemClasses.jeremium;

import java.util.List;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class JeremiumSwordItem extends SwordItem {
    public JeremiumSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add( new TranslatableText("item.gamermod.jeremium_sword.tooltip").formatted(Formatting.DARK_PURPLE, Formatting.ITALIC) );
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity attackee, LivingEntity attacker) {
        attackee.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 3), attacker);
        return super.postHit(stack, attackee, attacker);
    }
    
}
