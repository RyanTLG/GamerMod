package net.arcmods.ryantlg.items.metalItems;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.itemClasses.StupidiumItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class stupidiumMetals {

    public static final Item STUPIDIUM = new StupidiumItem(new Item.Settings().group(gameritems.CHING).maxCount(64).rarity(Rarity.UNCOMMON));
	public static final Item RAW_STUPIDIUM = new StupidiumItem(new Item.Settings().group(gameritems.CHING).maxCount(64).rarity(Rarity.UNCOMMON));
    
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupidium_ingot"), STUPIDIUM);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "raw_stupidium"), RAW_STUPIDIUM);

        gameritems.LOGGER.info("stupidiumMetals loaded");
    }
}