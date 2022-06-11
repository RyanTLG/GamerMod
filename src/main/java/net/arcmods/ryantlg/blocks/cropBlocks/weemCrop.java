package net.arcmods.ryantlg.blocks.cropBlocks;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.blockClasses.WeemCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class weemCrop {
    public static final CropBlock WEEM_CROP_BLOCK = new WeemCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Block WEEM_HAY_BLOCK = new PillarBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).nonOpaque().strength(1, 1).sounds(BlockSoundGroup.GRASS));

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier("gameritems","weem_crop_block"), WEEM_CROP_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("gameritems", "weem_hay_block"), WEEM_HAY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "weem_hay_block"), new BlockItem(WEEM_HAY_BLOCK, new FabricItemSettings().group(gameritems.CHING)));
        FlammableBlockRegistry.getDefaultInstance().add(WEEM_HAY_BLOCK, 60, 20);

        gameritems.LOGGER.info("CropBlocks loaded");
    }
}
