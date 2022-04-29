package net.arcmods.ryantlg.worldGeneration;

import java.util.Arrays;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.blocks.omniumBlocks;
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

public class OmniumOreGen {

    // private static ConfiguredFeature<?, ?> OMNIUM_ORE_CONFIGURED_FEATURE = Feature.ORE.configure(new OreFeatureConfig(
    //       OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
    //       omniumBlocks.OMNIUM_ORE.getDefaultState(),
    //       4)); // vein size

	private static ConfiguredFeature<?, ?> ORE_CONFIGURED_FEATURE = new ConfiguredFeature(
		Feature.ORE, new OreFeatureConfig(
			OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
			omniumBlocks.OMNIUM_ORE.getDefaultState(),
			4)); // vein size
 
  	// public static PlacedFeature OMNIUM_ORE_PLACED_FEATURE = OMNIUM_ORE_CONFIGURED_FEATURE.withPlacement(
    //   	CountPlacementModifier.of(2), // number of veins per chunk
    //   	SquarePlacementModifier.of(), // spreading horizontally
    //   	HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(19))); // height
 
	public static PlacedFeature ORE_PLACED_FEATURE = new PlacedFeature(
		RegistryEntry.of(ORE_CONFIGURED_FEATURE),
		Arrays.asList(
			CountPlacementModifier.of(2), // number of veins per chunk
			SquarePlacementModifier.of(), // spreading horizontally
			HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(19))
		)); // height
    

    public static void register() {

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
        new Identifier("gamermod", "omnium_ore"), ORE_CONFIGURED_FEATURE);
    	Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("gamermod", "omnium_ore"),
        	ORE_PLACED_FEATURE);
    	BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        	RegistryKey.of(Registry.PLACED_FEATURE_KEY,
            	new Identifier("gamermod", "omnium_ore")));

		gamermod.LOGGER.info("OmniumOreGen loaded");
    }
}
