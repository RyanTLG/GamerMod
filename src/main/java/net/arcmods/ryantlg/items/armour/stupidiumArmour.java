package net.arcmods.ryantlg.items.armour;

import net.arcmods.ryantlg.armourMaterials.stupidiumArmorMaterial;
import net.minecraft.util.registry.Registry;
import net.arcmods.ryantlg.gameritems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class stupidiumArmour {
    public static final ArmorMaterial STUPIDIUM_ARMOR_MATERIAL = new stupidiumArmorMaterial();
    public static final Item STUPIDIUM_HELMET = new ArmorItem(STUPIDIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(gameritems.THING).rarity(Rarity.RARE));
    public static final Item STUPIDIUM_CHESTPLATE = new ArmorItem(STUPIDIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(gameritems.THING).rarity(Rarity.RARE));
    public static final Item STUPIDIUM_LEGGINGS = new ArmorItem(STUPIDIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(gameritems.THING).rarity(Rarity.RARE));
    public static final Item STUPIDIUM_BOOTS = new ArmorItem(STUPIDIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(gameritems.THING).rarity(Rarity.RARE));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_helmet"), STUPIDIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_chestplate"), STUPIDIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_leggings"), STUPIDIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_boots"), STUPIDIUM_BOOTS);

        gameritems.LOGGER.info("stupidiumArmour loaded");
    }
}
