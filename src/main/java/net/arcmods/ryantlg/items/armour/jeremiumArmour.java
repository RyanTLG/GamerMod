package net.arcmods.ryantlg.items.armour;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.armourMaterials.JeremiumArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class jeremiumArmour {

    public static final ArmorMaterial JEREMIUM_ARMOR_MATERIAL = new JeremiumArmorMaterial();
    public static final Item JEREMIUM_HELMET = new ArmorItem(JEREMIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(gamermod.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item JEREMIUM_CHESTPLATE = new ArmorItem(JEREMIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(gamermod.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item JEREMIUM_LEGGINGS = new ArmorItem(JEREMIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(gamermod.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item JEREMIUM_BOOTS = new ArmorItem(JEREMIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(gamermod.THING).fireproof().rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_helmet"), JEREMIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_chestplate"), JEREMIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_leggings"), JEREMIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_boots"), JEREMIUM_BOOTS);

        gamermod.LOGGER.info("jeremiumArmour loaded");
    }
    
}
