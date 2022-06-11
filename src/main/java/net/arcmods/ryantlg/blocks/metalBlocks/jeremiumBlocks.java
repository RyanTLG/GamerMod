package net.arcmods.ryantlg.blocks.metalBlocks;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.blockClasses.jeremiumBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class jeremiumBlocks {

    public static final Block JEREMIUM_BLOCK = new jeremiumBlock(FabricBlockSettings.of(Material.METAL).strength(5.5f, 4.8f).requiresTool().luminance(16));
    public static final Block JEREMIUM_ORE = new jeremiumBlock(FabricBlockSettings.of(Material.STONE).strength(6.5f, 8.0f).requiresTool().luminance(5));
    public static final Block DEEPSLATE_JEREMIUM_ORE = new jeremiumBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f, 4.2f).requiresTool().luminance(5).sounds(BlockSoundGroup.DEEPSLATE));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("gameritems", "jeremium_ore"), JEREMIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "jeremium_ore"), new BlockItem(JEREMIUM_ORE, new FabricItemSettings().group(gameritems.CHING).fireproof().maxCount(56)));

        Registry.register(Registry.BLOCK, new Identifier("gameritems", "deepslate_jeremium_ore"), DEEPSLATE_JEREMIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "deepslate_jeremium_ore"), new BlockItem(DEEPSLATE_JEREMIUM_ORE, new FabricItemSettings().group(gameritems.CHING).fireproof().maxCount(56)));

        Registry.register(Registry.BLOCK, new Identifier("gameritems", "jeremium_block"), JEREMIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "jeremium_block"), new BlockItem(JEREMIUM_BLOCK, new FabricItemSettings().group(gameritems.CHING).fireproof().maxCount(56)));

        gameritems.LOGGER.info("jeremiumBlocks loaded");
    }
    
}
