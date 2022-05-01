package net.arcmods.ryantlg.items.metalItems;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.itemClasses.jeremiumItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class jeremiumMetals {

    public static final Item JEREMIUM = new jeremiumItem(new Item.Settings().fireproof().group(gameritems.CHING).maxCount(56).rarity(Rarity.UNCOMMON));
    public static final Item RAW_JEREMIUM = new jeremiumItem(new Item.Settings().fireproof().group(gameritems.CHING).maxCount(56).rarity(Rarity.UNCOMMON));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gameritems", "jeremium_ingot"), JEREMIUM);
        Registry.register(Registry.ITEM, new Identifier("gameritems", "raw_jeremium"), RAW_JEREMIUM);

        gameritems.LOGGER.info("jeremiumMetals loaded");
    }
    
}
