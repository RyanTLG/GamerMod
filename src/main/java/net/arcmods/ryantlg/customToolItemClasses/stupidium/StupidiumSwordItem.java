package net.arcmods.ryantlg.customToolItemClasses.stupidium;

import java.util.List;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.arcmods.ryantlg.statusEffects.GamerEffects;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class StupidiumSwordItem extends SwordItem {
    public StupidiumSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.gameritems.stupidium_sword.tooltip").formatted(Formatting.RED));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity attackee, LivingEntity attacker) {
        attackee.addStatusEffect(new StatusEffectInstance(GamerEffects.STUPID, 20*6, 0), attacker);
        return super.postHit(stack, attackee, attacker);
    }
    
}
