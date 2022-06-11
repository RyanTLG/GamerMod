package net.arcmods.ryantlg;

import net.arcmods.ryantlg.blocks.cropBlocks.weemCrop;
import net.arcmods.ryantlg.utils.bowModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class gameritemsClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), weemCrop.WEEM_CROP_BLOCK);

        bowModelPredicateProvider.registerBowModels();

        gameritems.LOGGER.info("Client only objects loaded");
        
    }
    
}
