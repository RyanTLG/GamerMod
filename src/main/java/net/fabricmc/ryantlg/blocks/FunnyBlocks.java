package net.fabricmc.ryantlg.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.ryantlg.gamermod;
import net.fabricmc.ryantlg.blockClasses.Damon;
import net.fabricmc.ryantlg.blockClasses.elon;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FunnyBlocks {
	public static final Block MATT_DAMON = new Damon(FabricBlockSettings.of(Material.BARRIER).strength(4.0f, -1F));
    public static final Block ELON_MUSK = new elon(FabricBlockSettings.of(Material.BARRIER).strength(4.0f, -1F));

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier("gamermod", "matt_damon"), MATT_DAMON);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "matt_damon"), new BlockItem(MATT_DAMON, new FabricItemSettings().group(gamermod.FNUTS)));

        Registry.register(Registry.BLOCK, new Identifier("gamermod", "elon_musk"), ELON_MUSK);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "elon_musk"), new BlockItem(ELON_MUSK, new FabricItemSettings().group(gamermod.FNUTS)));

        gamermod.LOGGER.info("FunnyBlocks loaded");
    }
}
