package net.arcmods.ryantlg.items.tools;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.customToolItemClasses.jeremium.JeremiumAxeItem;
import net.arcmods.ryantlg.customToolItemClasses.jeremium.JeremiumHoeItem;
import net.arcmods.ryantlg.customToolItemClasses.jeremium.JeremiumPickaxeItem;
import net.arcmods.ryantlg.customToolItemClasses.jeremium.JeremiumShovelItem;
import net.arcmods.ryantlg.customToolItemClasses.jeremium.JeremiumSwordItem;
import net.arcmods.ryantlg.toolMaterials.jeremiumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class jeremiumTools {

    public static ToolItem JEREMIUM_SWORD = new JeremiumSwordItem(jeremiumToolMaterial.INSTANCE, 3, -2.9F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.EPIC));
	public static ToolItem JEREMIUM_PICKAXE = new JeremiumPickaxeItem(jeremiumToolMaterial.INSTANCE, -10, -3.0F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.EPIC));
	public static ToolItem JEREMIUM_SHOVEL = new JeremiumShovelItem(jeremiumToolMaterial.INSTANCE, -11, -3.0F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.EPIC));
	public static ToolItem JEREMIUM_AXE = new JeremiumAxeItem(jeremiumToolMaterial.INSTANCE, 5, -3.0F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.EPIC));
	public static ToolItem JEREMIUM_HOE = new JeremiumHoeItem(jeremiumToolMaterial.INSTANCE, -12, -3.0F, new Item.Settings().fireproof().group(gamermod.THING).rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_sword"), JEREMIUM_SWORD);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_pickaxe"), JEREMIUM_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_shovel"), JEREMIUM_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_axe"), JEREMIUM_AXE);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_hoe"), JEREMIUM_HOE);

		gamermod.LOGGER.info("jeremiumTools loaded");
    }
    
}
