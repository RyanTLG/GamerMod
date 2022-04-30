package net.arcmods.ryantlg;

import net.arcmods.ryantlg.blocks.CropBlocks;
import net.arcmods.ryantlg.blocks.FunnyBlocks;
import net.arcmods.ryantlg.blocks.jeremiumBlocks;
import net.arcmods.ryantlg.blocks.omniumBlocks;
import net.arcmods.ryantlg.blocks.oriumBlocks;
import net.arcmods.ryantlg.items.armour.jeremiumArmour;
import net.arcmods.ryantlg.items.armour.notArmour;
import net.arcmods.ryantlg.items.armour.omniumArmour;
import net.arcmods.ryantlg.items.armour.oriumArmour;
import net.arcmods.ryantlg.items.bows.strongBow;
import net.arcmods.ryantlg.items.itemsByCrop.weemItems;
import net.arcmods.ryantlg.items.metalItems.jeremiumMetals;
import net.arcmods.ryantlg.items.metalItems.omniumMetals;
import net.arcmods.ryantlg.items.metalItems.oriumMetals;
import net.arcmods.ryantlg.items.miscItems.FunnyItems;
import net.arcmods.ryantlg.items.miscItems.OtherItems;
import net.arcmods.ryantlg.items.miscItems.fabricOfReality;
import net.arcmods.ryantlg.items.tools.jeremiumTools;
import net.arcmods.ryantlg.items.tools.omniumTools;
import net.arcmods.ryantlg.items.tools.oriumTools;
import net.arcmods.ryantlg.lootTables.grassVanillaWeem;
import net.arcmods.ryantlg.statusEffects.GamerEffects;
import net.arcmods.ryantlg.worldGeneration.DeepslateOmniumOreGen;
import net.arcmods.ryantlg.worldGeneration.DeepslateOriumOreGen;
import net.arcmods.ryantlg.worldGeneration.JeremiumOreGen;
import net.arcmods.ryantlg.worldGeneration.OmniumOreGen;
import net.arcmods.ryantlg.worldGeneration.OriumOreGen;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gamermod implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("gamermod");
	

	public static final ItemGroup FNUTS = FabricItemGroupBuilder.build(
		new Identifier("gamermod", "chins"),
		() -> new ItemStack(Items.NETHERITE_INGOT)
		);

	public static final ItemGroup CHING = FabricItemGroupBuilder.create(
		new Identifier("gamermod", "things"))
		.icon(() -> new ItemStack(FunnyItems.DEEZ_NUTS_ON_CHIN))
		.build();

	public static final ItemGroup THING = FabricItemGroupBuilder.create(
		new Identifier("gamermod", "armour_and_tools"))
		.icon(() -> new ItemStack(omniumMetals.OMNIUM))
		.build();
	
	@Override
	public void onInitialize() {
		LOGGER.info("Sup gamer");
		
		omniumMetals.register();
		omniumArmour.register();
		omniumTools.register();
		omniumBlocks.register();
		OmniumOreGen.register();
		DeepslateOmniumOreGen.register();

		weemItems.register();

		OtherItems.register();
		
		FunnyBlocks.register();
		
		FunnyItems.register();
		grassVanillaWeem.register();

		oriumMetals.register();
		oriumBlocks.register();
		oriumArmour.register();
		oriumTools.register();
		OriumOreGen.register();
		DeepslateOriumOreGen.register();

		CropBlocks.register();

		fabricOfReality.register();

		GamerEffects.register();

		jeremiumMetals.register();
		jeremiumBlocks.register();
		jeremiumArmour.register();
		jeremiumTools.register();
		JeremiumOreGen.register();

		notArmour.register();
		strongBow.register();

	}
	//fight me
	
}