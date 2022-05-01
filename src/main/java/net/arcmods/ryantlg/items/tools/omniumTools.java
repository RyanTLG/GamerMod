package net.arcmods.ryantlg.items.tools;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.customToolItemClasses.omnium.OmniumAxeItem;
import net.arcmods.ryantlg.customToolItemClasses.omnium.OmniumHoeItem;
import net.arcmods.ryantlg.customToolItemClasses.omnium.OmniumPickaxeItem;
import net.arcmods.ryantlg.customToolItemClasses.omnium.OmniumShovelItem;
import net.arcmods.ryantlg.customToolItemClasses.omnium.OmniumSwordItem;
import net.arcmods.ryantlg.toolMaterials.omniumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class omniumTools {
    
    public static ToolItem OMNIUM_SWORD = new OmniumSwordItem(omniumToolMaterial.INSTANCE, 3, -1.0F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));
	public static ToolItem OMNIUM_PICKAXE = new OmniumPickaxeItem(omniumToolMaterial.INSTANCE, -9, -2.8F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));
	public static ToolItem OMNIUM_SHOVEL = new OmniumShovelItem(omniumToolMaterial.INSTANCE, -10, -3.0F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));
	public static ToolItem OMNIUM_AXE = new OmniumAxeItem(omniumToolMaterial.INSTANCE, 6, -1.9F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));
	public static ToolItem OMNIUM_HOE = new OmniumHoeItem(omniumToolMaterial.INSTANCE, -11, -3.2F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_sword"), OMNIUM_SWORD);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_pickaxe"), OMNIUM_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_shovel"), OMNIUM_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_axe"), OMNIUM_AXE);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_hoe"), OMNIUM_HOE);

		gameritems.LOGGER.info("omniumTools loaded");
    }
}
