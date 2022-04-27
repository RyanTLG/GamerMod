package net.arcmods.ryantlg.armourMaterials;

import net.arcmods.ryantlg.items.miscItems.fabricOfReality;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class notArmorMaterial implements ArmorMaterial{
    //														{boots, leggings, chestplate, helmet}
	private static final int[] BASE_DURABILITY = new int[] {1200, 1290, 1350, 1210};
	private static final int[] PROTECTION_VALUES = new int[] {15, 15, 15, 15}; 
 
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
		return 100;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(fabricOfReality.FABRIC_OF_REALITY);
	}
 
	@Override
	public String getName() {
		// Must be all lowercase
		return "not";
	}
 
	@Override
	public float getToughness() {
		return 10.0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 10.0F;
	}
}
