package net.arcmods.ryantlg.statusEffects.effectClasses;

import net.arcmods.ryantlg.damageSources.stupidDamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class stupidStatusEffect extends StatusEffect {
    public stupidStatusEffect() {
        super(
          StatusEffectCategory.HARMFUL, 
          0x6b3f7f
          ); 
      }
     
      @Override
      public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
      }
     
      @Override
      public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        
            entity.damage(stupidDamageSource.STUPID, 1);
        
      }
    
}
