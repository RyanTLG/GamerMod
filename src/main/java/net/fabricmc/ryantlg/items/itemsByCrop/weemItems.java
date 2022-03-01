package net.fabricmc.ryantlg.items.itemsByCrop;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.ryantlg.gamermod;
import net.fabricmc.ryantlg.itemClasses.BreemItem;
import net.fabricmc.ryantlg.itemClasses.WeemItem;
import net.fabricmc.ryantlg.statusEffects.statusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.ryantlg.blocks.CropBlocks;
import net.minecraft.item.AliasedBlockItem;

public class weemItems {

//main items
//================================================================================================================
    public static final Item WEEM = new Item(new Item.Settings().group(gamermod.CHING).maxCount(64));

//  foods
//================================================================================================================
    public static final Item BREEM = new BreemItem(new FabricItemSettings().group(gamermod.CHING)
    .food(
        new FoodComponent
        .Builder()
        .hunger(11)
        .saturationModifier(013f)
        .alwaysEdible()
        .meat()
        .snack()
        .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20*7), 1f)
        .statusEffect(new StatusEffectInstance(statusEffects.HIGH, 20*8), 1f)
        .build()
        ));

    public static final Item WEEM_APPLE = new WeemItem(new FabricItemSettings().group(gamermod.CHING)
    .food(
        new FoodComponent
        .Builder()
        .hunger(11)
        .saturationModifier(013f)
        .alwaysEdible()
        .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20*9), 1f)
        .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*30, 3), 1f)
        .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*150, 2), 1f)
        .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*150, 2), 1f)
        .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*160, 3), 1f)
        .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*160), 1f)
        .build()
        ));
//================================================================================================================

//seeds
//================================================================================================================
    public static final Item WEEM_SEEDS = new AliasedBlockItem(CropBlocks.WEEM_CROP_BLOCK, new Item.Settings().group(gamermod.CHING));


    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gamermod", "breem"), BREEM);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "weem_apple"), WEEM_APPLE);

        Registry.register(Registry.ITEM, new Identifier("gamermod","weem_seeds"), WEEM_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "weem"), WEEM);

        gamermod.LOGGER.info("weemItems loaded");
    }
    
}
