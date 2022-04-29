package net.arcmods.ryantlg.worldGeneration;

import java.util.Arrays;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.blocks.oriumBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.Identifier;

public class DeepslateOriumOreGen {

    // private static ConfiguredFeature<?, ?> ORE_CONFIGURED_FEATURE = Feature.ORE.configure(new OreFeatureConfig(
    //       OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
    //       oriumBlocks.DEEPSLATE_ORIUM_ORE.getDefaultState(),
    //       5)); // vein size

	private static ConfiguredFeature<?, ?> ORE_CONFIGURED_FEATURE = new ConfiguredFeature(
		Feature.ORE, new OreFeatureConfig(
			OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
			oriumBlocks.DEEPSLATE_ORIUM_ORE.getDefaultState(),
			5)); // vein size
 
  	// public static PlacedFeature ORE_PLACED_FEATURE = ORE_CONFIGURED_FEATURE.withPlacement(
    //   	CountPlacementModifier.of(5), // number of veins per chunk
    //   	SquarePlacementModifier.of(), // spreading horizontally
    //   	HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(35))); // height
	
	public static PlacedFeature ORE_PLACED_FEATURE = new PlacedFeature(
		RegistryEntry.of(ORE_CONFIGURED_FEATURE),
		Arrays.asList(
			CountPlacementModifier.of(5), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(35))
		)); // height
    

    public static void register() {
		
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
        new Identifier("gamermod", "deepslate_orium_ore"), ORE_CONFIGURED_FEATURE);
    	Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("gamermod", "deepslate_orium_ore"),
        	ORE_PLACED_FEATURE);
    	BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        	RegistryKey.of(Registry.PLACED_FEATURE_KEY,
            	new Identifier("gamermod", "deepslate_orium_ore")));
		
		gamermod.LOGGER.info("DeepslateOriumOreGen loaded");
    }
}
