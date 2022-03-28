package net.arcmods.ryantlg.items.metalItems;

import net.arcmods.ryantlg.gamermod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class jeremiumMetals {

    public static final Item JEREMIUM = new Item(new Item.Settings().fireproof().group(gamermod.CHING).maxCount(64).rarity(Rarity.UNCOMMON));
    public static final Item RAW_JEREMIUM = new Item(new Item.Settings()
    .fireproof()
    .group(gamermod.CHING)
    .maxCount(64)
    .rarity(Rarity.UNCOMMON)
    .food(
        new FoodComponent
        .Builder()
        .hunger(11)
        .saturationModifier(013f)
        .alwaysEdible()
        .meat()
        .snack()
        .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20*7), 1f)
        .build()
    ));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_ingot"), JEREMIUM);

        gamermod.LOGGER.info("jeremiumMetals loaded");
    }
    
}
