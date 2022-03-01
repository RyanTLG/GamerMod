package net.fabricmc.ryantlg.worldGeneration;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.ryantlg.gamermod;
import net.fabricmc.ryantlg.blocks.omniumBlocks;
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

public class OmniumOreGen {

    private static ConfiguredFeature<?, ?> OMNIUM_ORE_CONFIGURED_FEATURE = Feature.ORE.configure(new OreFeatureConfig(
          OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
          omniumBlocks.OMNIUM_ORE.getDefaultState(),
          4)); // vein size
 
  	public static PlacedFeature OMNIUM_ORE_PLACED_FEATURE = OMNIUM_ORE_CONFIGURED_FEATURE.withPlacement(
      	CountPlacementModifier.of(6), // number of veins per chunk
      	SquarePlacementModifier.of(), // spreading horizontally
      	HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(28))); // height
 
    

    public static void register() {
		gamermod.LOGGER.info("OmniumOreGen loaded");

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
        new Identifier("gamermod", "omnium_ore"), OMNIUM_ORE_CONFIGURED_FEATURE);
    	Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("gamermod", "omnium_ore"),
        	OMNIUM_ORE_PLACED_FEATURE);
    	BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        	RegistryKey.of(Registry.PLACED_FEATURE_KEY,
            	new Identifier("gamermod", "omnium_ore")));

    }
}
