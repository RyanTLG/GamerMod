package net.arcmods.ryantlg.items.miscItems;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.itemClasses.FabricReality;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class fabricOfReality {

    public static final Item FABRIC_OF_REALITY = new FabricReality(new Item.Settings().fireproof());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("gameritems", "fabric_of_reality"), FABRIC_OF_REALITY);

        gameritems.LOGGER.info("fabricOfReality loaded");
    }
    
}
