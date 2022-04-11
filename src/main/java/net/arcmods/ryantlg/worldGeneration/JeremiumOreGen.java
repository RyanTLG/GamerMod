package net.arcmods.ryantlg.worldGeneration;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.blocks.jeremiumBlocks;
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

public class JeremiumOreGen {

    private static ConfiguredFeature<?, ?> ORE_CONFIGURED_FEATURE = Feature.ORE.configure(new OreFeatureConfig(
          OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
          jeremiumBlocks.DEEPSLATE_JEREMIUM_ORE.getDefaultState(),
          4)); // vein size
 
  	public static PlacedFeature ORE_PLACED_FEATURE = ORE_CONFIGURED_FEATURE.withPlacement(
      	CountPlacementModifier.of(1), // number of veins per chunk
      	SquarePlacementModifier.of(), // spreading horizontally
      	HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(-4))); // height
 
    

    public static void register() {
		gamermod.LOGGER.info("JeremiumOreGen loaded");

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
        new Identifier("gamermod", "deepslate_jeremium_ore"), ORE_CONFIGURED_FEATURE);
    	Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("gamermod", "deepslate_jeremium_ore"),
        	ORE_PLACED_FEATURE);
    	BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
        	RegistryKey.of(Registry.PLACED_FEATURE_KEY,
            	new Identifier("gamermod", "deepslate_jeremium_ore")));

    }
}
