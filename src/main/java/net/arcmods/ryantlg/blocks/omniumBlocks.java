package net.arcmods.ryantlg.blocks;

import net.arcmods.ryantlg.gameritems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class omniumBlocks {
    public static final Block OMNIUM_ORE           = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5f, 4.0f).requiresTool());
	public static final Block OMNIUM_BLOCK         = new Block(FabricBlockSettings.of(Material.METAL).strength(5.5f, 7f).requiresTool());
    public static final Block DEEPSLATE_OMNIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));

    public static void register() {

        Registry.register(Registry.BLOCK,       new Identifier("gameritems", "omnium_ore"),           OMNIUM_ORE);
        Registry.register(Registry.ITEM,        new Identifier("gameritems", "omnium_ore"),           new BlockItem(OMNIUM_ORE,            new FabricItemSettings().group(gameritems.CHING)));
        Registry.register(Registry.BLOCK,       new Identifier("gameritems", "deepslate_omnium_ore"), DEEPSLATE_OMNIUM_ORE);
        Registry.register(Registry.ITEM,        new Identifier("gameritems", "deepslate_omnium_ore"), new BlockItem(DEEPSLATE_OMNIUM_ORE,  new FabricItemSettings().group(gameritems.CHING)));
		Registry.register(Registry.BLOCK,       new Identifier("gameritems", "omnium_block"),         OMNIUM_BLOCK);
        Registry.register(Registry.ITEM,        new Identifier("gameritems", "omnium_block"),         new BlockItem(OMNIUM_BLOCK,          new FabricItemSettings().group(gameritems.CHING)));

        gameritems.LOGGER.info("omniumBlocks loaded");
    }
}
