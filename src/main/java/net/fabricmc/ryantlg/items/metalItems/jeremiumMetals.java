package net.fabricmc.ryantlg.items.metalItems;

import net.fabricmc.ryantlg.gamermod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class jeremiumMetals {

    public static final Item JEREMIUM = new Item(new Item.Settings().fireproof().group(gamermod.CHING).maxCount(128).rarity(Rarity.EPIC));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gamermod", "jeremium_ingot"), JEREMIUM);

        gamermod.LOGGER.info("jeremiumMetals loaded");
    }
    
}
