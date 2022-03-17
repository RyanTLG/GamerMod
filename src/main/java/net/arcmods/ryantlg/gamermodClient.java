package net.arcmods.ryantlg;

import net.arcmods.ryantlg.blocks.CropBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class gamermodClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.WEEM_CROP_BLOCK);

        gamermod.LOGGER.info("Client only objects loaded");
        
    }
    
}
