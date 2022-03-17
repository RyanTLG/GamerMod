package net.arcmods.ryantlg.items.metalItems;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.itemClasses.oriumItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class oriumMetals {

    public static final Item ORIUM = new oriumItem(new Item.Settings().group(gamermod.CHING).maxCount(64).fireproof().rarity(Rarity.UNCOMMON));
	public static final Item RAW_ORIUM = new oriumItem(new Item.Settings().group(gamermod.CHING).maxCount(64).fireproof().rarity(Rarity.UNCOMMON));
    
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gamermod", "orium_ingot"), ORIUM);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "raw_orium"), RAW_ORIUM);

        gamermod.LOGGER.info("oriumMetals loaded");
    }
}