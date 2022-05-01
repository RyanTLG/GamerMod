package net.arcmods.ryantlg.blocks;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.blockClasses.oriumBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class oriumBlocks {
    public static final Block ORIUM_ORE = new oriumBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
	public static final Block ORIUM_BLOCK = new oriumBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());
    public static final Block DEEPSLATE_ORIUM_ORE = new oriumBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier("gameritems", "orium_ore"), ORIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_ore"), new BlockItem(ORIUM_ORE, new FabricItemSettings().group(gameritems.CHING).rarity(Rarity.UNCOMMON)));
        Registry.register(Registry.BLOCK, new Identifier("gameritems", "deepslate_orium_ore"), DEEPSLATE_ORIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "deepslate_orium_ore"), new BlockItem(DEEPSLATE_ORIUM_ORE, new FabricItemSettings().group(gameritems.CHING).rarity(Rarity.UNCOMMON)));
		Registry.register(Registry.BLOCK, new Identifier("gameritems", "orium_block"), ORIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "orium_block"), new BlockItem(ORIUM_BLOCK, new FabricItemSettings().group(gameritems.CHING).rarity(Rarity.UNCOMMON)));

        gameritems.LOGGER.info("oriumBlocks loaded");
    }
    
}
