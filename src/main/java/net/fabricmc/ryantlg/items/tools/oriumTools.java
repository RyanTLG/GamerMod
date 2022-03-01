package net.fabricmc.ryantlg.items.tools;

import net.fabricmc.ryantlg.gamermod;
import net.fabricmc.ryantlg.customToolItemClasses.orium.OriumPickaxeItem;
import net.fabricmc.ryantlg.customToolItemClasses.orium.OriumShovelItem;
import net.fabricmc.ryantlg.customToolItemClasses.orium.OriumSwordItem;
import net.fabricmc.ryantlg.customToolItemClasses.orium.OriumAxeItem;
import net.fabricmc.ryantlg.customToolItemClasses.orium.OriumHoeItem;
import net.fabricmc.ryantlg.toolMaterials.oriumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class oriumTools {
    
    public static ToolItem ORIUM_SWORD = new OriumSwordItem(oriumToolMaterial.INSTANCE, 2, -2.2F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.RARE));
	public static ToolItem ORIUM_PICKAXE = new OriumPickaxeItem(oriumToolMaterial.INSTANCE, -3, -2.8F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.RARE));
	public static ToolItem ORIUM_SHOVEL = new OriumShovelItem(oriumToolMaterial.INSTANCE, -2.5F, -3.0F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.RARE));
	public static ToolItem ORIUM_AXE = new OriumAxeItem(oriumToolMaterial.INSTANCE, 4, -1.9F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.RARE));
	public static ToolItem ORIUM_HOE = new OriumHoeItem(oriumToolMaterial.INSTANCE, -8, -3.2F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.RARE));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gamermod", "orium_sword"), ORIUM_SWORD);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "orium_pickaxe"), ORIUM_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "orium_shovel"), ORIUM_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "orium_axe"), ORIUM_AXE);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "orium_hoe"), ORIUM_HOE);

		gamermod.LOGGER.info("oriumTools loaded");
    }
}
