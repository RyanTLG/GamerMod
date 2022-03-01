package net.fabricmc.ryantlg.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.ryantlg.gamermod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class omniumBlocks {
    public static final Block OMNIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
	public static final Block OMNIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier("gamermod", "omnium_ore"), OMNIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "omnium_ore"), new BlockItem(OMNIUM_ORE, new FabricItemSettings().group(gamermod.CHING)));
		Registry.register(Registry.BLOCK, new Identifier("gamermod", "omnium_block"), OMNIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "omnium_block"), new BlockItem(OMNIUM_BLOCK, new FabricItemSettings().group(gamermod.CHING)));

        gamermod.LOGGER.info("omniumBlocks loaded");
    }
}
