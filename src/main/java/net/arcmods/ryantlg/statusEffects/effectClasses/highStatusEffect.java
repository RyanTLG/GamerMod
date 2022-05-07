package net.arcmods.ryantlg.statusEffects.effectClasses;

import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class highStatusEffect extends StatusEffect{
    public highStatusEffect() {
        super(
            StatusEffectCategory.BENEFICIAL,
            0x3dad51
        );
    }
    
    @Override
  public boolean canApplyUpdateEffect(int duration, int amplifier) {
    return true;
  }
 
  @Override
  public void applyUpdateEffect(LivingEntity entity, int amplifier) {
    if (entity instanceof PlayerEntity) {
      ((PlayerEntity) entity).getFallSounds();
      ((PlayerEntity) entity).disableShield(true);
      ((PlayerEntity) entity).dismountVehicle();
    }
  }
    
}
