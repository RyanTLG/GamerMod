package net.arcmods.ryantlg.enchantments;

import net.arcmods.ryantlg.gameritems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class evadeEnchantment extends Enchantment {

    public evadeEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[] {EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.FEET, EquipmentSlot.LEGS});
    }

    @Override
    public int getMinPower(int level) {
        return 30;
    }
    @Override
    public int getMaxLevel() {
        return 4;
    }
    // public void onTargetDamaged(LivingEntity user, Entity target, int level) {
    //     if(target instanceof LivingEntity) {
    //         ((LivingEntity) user).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 5, level - 1));
    //     }
 
    //     super.onTargetDamaged(user, target, level);
    // }
    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (attacker instanceof LivingEntity) {
            ((LivingEntity) user).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 7, level));
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 5, level));
        }
        super.onUserDamaged(user, attacker, level);
    }

    public static void register() {
        Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("gameritems", "evade"),
            new evadeEnchantment()
        );
        gameritems.LOGGER.info("evadeEnchantment loaded");
    }
    
}
