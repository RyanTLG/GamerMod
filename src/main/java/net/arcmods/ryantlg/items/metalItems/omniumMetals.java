package net.arcmods.ryantlg.items.metalItems;

import net.arcmods.ryantlg.gameritems;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class omniumMetals {

    public static final Item OMNIUM = new Item(new Item.Settings().group(gameritems.CHING).maxCount(64).fireproof().rarity(Rarity.RARE));
	public static final Item RAW_OMNIUM = new Item(new Item.Settings().group(gameritems.CHING).maxCount(64).fireproof().rarity(Rarity.RARE));
    
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gameritems", "omnium_ingot"), OMNIUM);
		Registry.register(Registry.ITEM, new Identifier("gameritems", "raw_omnium"), RAW_OMNIUM);

        gameritems.LOGGER.info("omniumMetals loaded");
    }
}
