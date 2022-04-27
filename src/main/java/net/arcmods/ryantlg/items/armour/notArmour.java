package net.arcmods.ryantlg.items.armour;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.armourMaterials.notArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class notArmour {
    
    public static final ArmorMaterial OMNIUM_ARMOR_MATERIAL = new notArmorMaterial();
    public static final Item NOT_HELMET = new ArmorItem(OMNIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(gamermod.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item NOT_CHESTPLATE = new ArmorItem(OMNIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(gamermod.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item NOT_LEGGINGS = new ArmorItem(OMNIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(gamermod.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item NOT_BOOTS = new ArmorItem(OMNIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(gamermod.THING).fireproof().rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gamermod", "not_helmet"), NOT_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "not_chestplate"), NOT_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "not_leggings"), NOT_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "not_boots"), NOT_BOOTS);

        gamermod.LOGGER.info("notArmour loaded");
    }

}
