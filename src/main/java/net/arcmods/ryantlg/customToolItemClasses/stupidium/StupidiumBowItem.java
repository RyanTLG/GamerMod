package net.arcmods.ryantlg.customToolItemClasses.stupidium;

import net.minecraft.item.BowItem;
import net.arcmods.ryantlg.statusEffects.GamerEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;

public class StupidiumBowItem extends BowItem{

    public StupidiumBowItem(Settings settings) {
        super(settings);
    }
    
    @Override
    public boolean postHit(ItemStack stack, LivingEntity attackee, LivingEntity attacker) {
        attackee.addStatusEffect(new StatusEffectInstance(GamerEffects.STUPID, 20*5, 0), attacker);
        return super.postHit(stack, attackee, attacker);
    }
}
