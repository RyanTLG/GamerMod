package net.arcmods.ryantlg.items.metalItems;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.itemClasses.jeremiumItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class jeremiumMetals {

    public static final Item JEREMIUM = new jeremiumItem(new Item.Settings().fireproof().group(gamermod.CHING).maxCount(56).rarity(Rarity.UNCOMMON));
    public static final Item RAW_JEREMIUM = new jeremiumItem(new Item.Settings().fireproof().group(gamermod.CHING).maxCount(56).rarity(Rarity.UNCOMMON));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_ingot"), JEREMIUM);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "raw_jeremium"), RAW_JEREMIUM);

        gamermod.LOGGER.info("jeremiumMetals loaded");
    }
    
}
