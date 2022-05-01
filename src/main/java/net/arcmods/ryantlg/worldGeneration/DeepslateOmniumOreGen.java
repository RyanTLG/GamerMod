package net.arcmods.ryantlg.worldGeneration;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.blocks.omniumBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class DeepslateOmniumOreGen {

    private static ConfiguredFeature<?, ?> ORE_CONFIGURED_FEATURE = Feature.ORE.configure(new OreFeatureConfig(
          OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
          omniumBlocks.DEEPSLATE_OMNIUM_ORE.getDefaultState(),
          4)); // vein size
 
  	public static PlacedFeature ORE_PLACED_FEATURE = ORE_CONFIGURED_FEATURE.withPlacement(
      	CountPlacementModifier.of(2), // number of veins per chunk
      	SquarePlacementModifier.of(), // spreading horizontally
      	HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(19))); // height
 
    

    public static void register() {
		
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
        new Identifier("gameritems", "deepslate_omnium_ore"), ORE_CONFIGURED_FEATURE);
    	Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("gameritems", "deepslate_omnium_ore"),
        	ORE_PLACED_FEATURE);
    	BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        	RegistryKey.of(Registry.PLACED_FEATURE_KEY,
            	new Identifier("gameritems", "deepslate_omnium_ore")));
		
		gameritems.LOGGER.info("DeepslateOmniumOreGen loaded");
    }
}
