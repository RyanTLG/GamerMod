package net.arcmods.ryantlg.blocks.metalBlocks;

import net.arcmods.ryantlg.gameritems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class stupidiumBlocks {

    public static final Block STUPIDIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(6.9f, 8.3f).requiresTool());
    public static final Block STUPIDIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(6.5f, 6.0f).requiresTool());
    public static final Block DEEPSLATE_STUPIDIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(7.2f, 7.2f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("gameritems", "stupidium_ore"), STUPIDIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_ore"), new BlockItem(STUPIDIUM_ORE, new FabricItemSettings().group(gameritems.CHING).fireproof().maxCount(56)));

        Registry.register(Registry.BLOCK, new Identifier("gameritems", "deepslate_stupidium_ore"), DEEPSLATE_STUPIDIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "deepslate_stupidium_ore"), new BlockItem(DEEPSLATE_STUPIDIUM_ORE, new FabricItemSettings().group(gameritems.CHING).fireproof().maxCount(56)));

        Registry.register(Registry.BLOCK, new Identifier("gameritems", "stupidium_block"), STUPIDIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_block"), new BlockItem(STUPIDIUM_BLOCK, new FabricItemSettings().group(gameritems.CHING).fireproof().maxCount(56)));

        gameritems.LOGGER.info("stupidiumBlocks loaded");
    }
    
}
