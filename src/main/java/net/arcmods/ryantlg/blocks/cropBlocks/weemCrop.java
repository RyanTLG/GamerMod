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
    public static final Block WEEM_HAYBALE = new PillarBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).nonOpaque().strength(1, 1).sounds(BlockSoundGroup.GRASS));

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier("gameritems","weem_crop_block"), WEEM_CROP_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("gameritems", "weem_haybale"), WEEM_HAYBALE);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "weem_haybale"), new BlockItem(WEEM_HAYBALE, new FabricItemSettings().group(gameritems.CHING)));
        FlammableBlockRegistry.getDefaultInstance().add(WEEM_HAYBALE, 60, 20);

        gameritems.LOGGER.info("CropBlocks loaded");
    }
}
