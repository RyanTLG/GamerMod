package net.arcmods.ryantlg.items.tools;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.customToolItemClasses.stupidium.StupidiumAxeItem;
import net.arcmods.ryantlg.customToolItemClasses.stupidium.StupidiumHoeItem;
import net.arcmods.ryantlg.customToolItemClasses.stupidium.StupidiumPickaxeItem;
import net.arcmods.ryantlg.customToolItemClasses.stupidium.StupidiumShovelItem;
import net.arcmods.ryantlg.customToolItemClasses.stupidium.StupidiumSwordItem;
import net.arcmods.ryantlg.toolMaterials.stupidiumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class stupidiumTools {
    
    public static ToolItem STUPID_SWORD = new StupidiumSwordItem(stupidiumToolMaterial.INSTANCE, 6, -2.0F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));
	public static ToolItem STUPID_PICKAXE = new StupidiumPickaxeItem(stupidiumToolMaterial.INSTANCE, -3, -2.8F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));
	public static ToolItem STUPID_SHOVEL = new StupidiumShovelItem(stupidiumToolMaterial.INSTANCE, -2.5F, -3.0F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));
	public static ToolItem STUPID_AXE = new StupidiumAxeItem(stupidiumToolMaterial.INSTANCE, 7, -2.2F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));
	public static ToolItem STUPID_HOE = new StupidiumHoeItem(stupidiumToolMaterial.INSTANCE, -9, -3.2F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_sword"), STUPID_SWORD);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_pickaxe"), STUPID_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_shovel"), STUPID_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_axe"), STUPID_AXE);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_hoe"), STUPID_HOE);

		gameritems.LOGGER.info("stupidiumTools loaded");
    }
}
