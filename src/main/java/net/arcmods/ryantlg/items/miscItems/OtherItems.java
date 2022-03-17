package net.arcmods.ryantlg.items.miscItems;

import net.arcmods.ryantlg.gamermod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class OtherItems {
    
	public static final Item NETHERITE_STICK = new Item(new Item.Settings().group(gamermod.CHING).maxCount(64).fireproof().rarity(Rarity.EPIC));

    public static void register() {

		Registry.register(Registry.ITEM, new Identifier("gamermod", "netherite_stick"), NETHERITE_STICK);
        
        gamermod.LOGGER.info("OtherItems loaded");
    }
}
