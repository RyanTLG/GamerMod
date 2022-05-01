package net.arcmods.ryantlg.items.tools;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.customToolItemClasses.orium.OriumAxeItem;
import net.arcmods.ryantlg.customToolItemClasses.orium.OriumHoeItem;
import net.arcmods.ryantlg.customToolItemClasses.orium.OriumPickaxeItem;
import net.arcmods.ryantlg.customToolItemClasses.orium.OriumShovelItem;
import net.arcmods.ryantlg.customToolItemClasses.orium.OriumSwordItem;
import net.arcmods.ryantlg.toolMaterials.oriumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class oriumTools {
    
    public static ToolItem ORIUM_SWORD = new OriumSwordItem(oriumToolMaterial.INSTANCE, 2, -2.2F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));
	public static ToolItem ORIUM_PICKAXE = new OriumPickaxeItem(oriumToolMaterial.INSTANCE, -3, -2.8F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));
	public static ToolItem ORIUM_SHOVEL = new OriumShovelItem(oriumToolMaterial.INSTANCE, -2.5F, -3.0F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));
	public static ToolItem ORIUM_AXE = new OriumAxeItem(oriumToolMaterial.INSTANCE, 4, -1.9F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));
	public static ToolItem ORIUM_HOE = new OriumHoeItem(oriumToolMaterial.INSTANCE, -8, -3.2F, new Item.Settings().fireproof().group(gameritems.THING).rarity(Rarity.RARE));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_sword"), ORIUM_SWORD);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_pickaxe"), ORIUM_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_shovel"), ORIUM_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_axe"), ORIUM_AXE);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_hoe"), ORIUM_HOE);

		gameritems.LOGGER.info("oriumTools loaded");
    }
}
