package net.arcmods.ryantlg.blocks;

import net.arcmods.ryantlg.gamermod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class jeremiumBlocks {

    public static final Block JEREMIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());
    public static final Block JEREMIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("gamermod", "jeremium_ore"), JEREMIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_ore"), new BlockItem(JEREMIUM_ORE, new FabricItemSettings().group(gamermod.CHING)));

        Registry.register(Registry.BLOCK, new Identifier("gamermod", "jeremium_block"), JEREMIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_block"), new BlockItem(JEREMIUM_BLOCK, new FabricItemSettings().group(gamermod.CHING)));

        gamermod.LOGGER.info("jeremiumBlocks loaded");
    }
    
}
