package net.arcmods.ryantlg.items.miscItems;

import net.arcmods.ryantlg.gameritems;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class OtherItems {
    
	public static final Item NETHERITE_STICK = new Item(new Item.Settings().group(gameritems.CHING).maxCount(64).fireproof().rarity(Rarity.EPIC));

    public static void register() {

		Registry.register(Registry.ITEM, new Identifier("gameritems", "netherite_stick"), NETHERITE_STICK);
        
        gameritems.LOGGER.info("OtherItems loaded");
    }
}
