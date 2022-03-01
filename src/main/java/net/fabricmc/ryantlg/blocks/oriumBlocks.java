package net.fabricmc.ryantlg.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.ryantlg.gamermod;
import net.fabricmc.ryantlg.blockClasses.oriumBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class oriumBlocks {
    public static final Block ORIUM_ORE = new oriumBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
	public static final Block ORIUM_BLOCK = new oriumBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier("gamermod", "orium_ore"), ORIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "orium_ore"), new BlockItem(ORIUM_ORE, new FabricItemSettings().group(gamermod.CHING).rarity(Rarity.UNCOMMON)));
		Registry.register(Registry.BLOCK, new Identifier("gamermod", "orium_block"), ORIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "orium_block"), new BlockItem(ORIUM_BLOCK, new FabricItemSettings().group(gamermod.CHING).rarity(Rarity.UNCOMMON)));

        gamermod.LOGGER.info("oriumBlocks loaded");
    }
    
}
