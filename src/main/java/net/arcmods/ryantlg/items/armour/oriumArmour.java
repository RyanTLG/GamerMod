package net.arcmods.ryantlg.items.armour;

import net.minecraft.util.registry.Registry;
import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.armourMaterials.OriumArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class oriumArmour {
    public static final ArmorMaterial ORIUM_ARMOR_MATERIAL = new OriumArmorMaterial();
    public static final Item ORIUM_HELMET = new ArmorItem(ORIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(gameritems.THING).fireproof().rarity(Rarity.RARE));
    public static final Item ORIUM_CHESTPLATE = new ArmorItem(ORIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(gameritems.THING).fireproof().rarity(Rarity.RARE));
    public static final Item ORIUM_LEGGINGS = new ArmorItem(ORIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(gameritems.THING).fireproof().rarity(Rarity.RARE));
    public static final Item ORIUM_BOOTS = new ArmorItem(ORIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(gameritems.THING).fireproof().rarity(Rarity.RARE));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_helmet"), ORIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_chestplate"), ORIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_leggings"), ORIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_boots"), ORIUM_BOOTS);

        gameritems.LOGGER.info("oriumArmour loaded");
    }
}
