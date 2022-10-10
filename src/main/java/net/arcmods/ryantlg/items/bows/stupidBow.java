package net.arcmods.ryantlg.items.bows;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.customToolItemClasses.stupidium.StupidiumBowItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class stupidBow {
    
    public static final Item STUPID_BOW = new StupidiumBowItem(new FabricItemSettings().group(gameritems.CHING).maxCount(1).fireproof().maxDamage(458));

    public static void register(){
        Registry.register(Registry.ITEM, new Identifier("gameritems", "stupid_bow"), STUPID_BOW);
    }


}
