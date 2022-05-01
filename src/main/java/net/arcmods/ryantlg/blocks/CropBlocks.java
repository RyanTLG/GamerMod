package net.arcmods.ryantlg.blocks;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.blockClasses.WeemCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CropBlocks {
    public static final CropBlock WEEM_CROP_BLOCK = new WeemCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier("gameritems","weem_crop_block"), WEEM_CROP_BLOCK);

        gameritems.LOGGER.info("CropBlocks loaded");
    }
}
