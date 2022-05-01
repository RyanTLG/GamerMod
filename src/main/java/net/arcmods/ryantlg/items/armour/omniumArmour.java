package net.arcmods.ryantlg.items.armour;

import net.minecraft.util.registry.Registry;
import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.armourMaterials.OmniumArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class omniumArmour {
    
    public static final ArmorMaterial OMNIUM_ARMOR_MATERIAL = new OmniumArmorMaterial();
    public static final Item OMNIUM_HELMET = new ArmorItem(OMNIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(gameritems.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item OMNIUM_CHESTPLATE = new ArmorItem(OMNIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(gameritems.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item OMNIUM_LEGGINGS = new ArmorItem(OMNIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(gameritems.THING).fireproof().rarity(Rarity.EPIC));
    public static final Item OMNIUM_BOOTS = new ArmorItem(OMNIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(gameritems.THING).fireproof().rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_helmet"), OMNIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_chestplate"), OMNIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_leggings"), OMNIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_boots"), OMNIUM_BOOTS);

        gameritems.LOGGER.info("omniumArmour loaded");
    }

}
