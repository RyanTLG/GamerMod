package net.arcmods.ryantlg.items.tools;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.customToolItemClasses.not.notAxeItem;
import net.arcmods.ryantlg.customToolItemClasses.not.notHoeItem;
import net.arcmods.ryantlg.customToolItemClasses.not.notPickaxeItem;
import net.arcmods.ryantlg.customToolItemClasses.not.notShovelItem;
import net.arcmods.ryantlg.customToolItemClasses.not.notSwordItem;
import net.arcmods.ryantlg.toolMaterials.notToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class notTools {
    
    public static ToolItem NOT_SWORD = new notSwordItem(notToolMaterial.INSTANCE, 6, -0.1F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));
	public static ToolItem NOT_PICKAXE = new notPickaxeItem(notToolMaterial.INSTANCE, -48, -0.1F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));
	public static ToolItem NOT_SHOVEL = new notShovelItem(notToolMaterial.INSTANCE, -40, -0.1F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));
	public static ToolItem NOT_AXE = new notAxeItem(notToolMaterial.INSTANCE, 10, -0.1F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));
	public static ToolItem NOT_HOE = new notHoeItem(notToolMaterial.INSTANCE, -49, -0.1F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gameritems", "not_sword"), NOT_SWORD);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "not_pickaxe"), NOT_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "not_shovel"), NOT_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "not_axe"), NOT_AXE);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "not_hoe"), NOT_HOE);

		gameritems.LOGGER.info("notTools loaded");
    }
}
