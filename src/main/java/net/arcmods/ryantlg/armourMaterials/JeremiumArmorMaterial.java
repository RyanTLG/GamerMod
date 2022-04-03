package net.arcmods.ryantlg.armourMaterials;

import net.arcmods.ryantlg.items.metalItems.jeremiumMetals;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class JeremiumArmorMaterial implements ArmorMaterial{
    //														{boots, leggings, chestplate, helmet}
	private static final int[] BASE_DURABILITY = new int[] {120, 129, 135, 121};
	private static final int[] PROTECTION_VALUES = new int[] {6, 12, 14, 7}; 
 
	// In which A is helmet, B chestplate, C leggings and D boots. 
	// For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}
	// {A, C, B, D}

    @Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 10;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 43;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(jeremiumMetals.JEREMIUM);
	}
 
	@Override
	public String getName() {
		// Must be all lowercase
		return "jeremium";
	}
 
	@Override
	public float getToughness() {
		return 5.0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 3.0F;
	}
}
