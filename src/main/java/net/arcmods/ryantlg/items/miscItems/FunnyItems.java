package net.arcmods.ryantlg.items.miscItems;

import net.arcmods.ryantlg.gamermod;
import net.arcmods.ryantlg.toolMaterials.deezToolMaterial;
import net.arcmods.ryantlg.toolMaterials.dragchinToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FunnyItems {
    public static final Item CHIN = new Item(new Item.Settings().group(gamermod.FNUTS).maxCount(4));
	public static final Item NUTS = new Item(new Item.Settings().group(gamermod.FNUTS).maxCount(4));
	public static final Item DEEZ = new Item(new Item.Settings().group(gamermod.FNUTS).maxCount(4));
	public static final Item DEEZ_NUTS = new Item(new Item.Settings().group(gamermod.FNUTS).maxCount(4));
	public static ToolItem DEEZ_NUTS_ON_CHIN = new SwordItem(deezToolMaterial.INSTANCE, 1, -1.0F, new Item.Settings().group(gamermod.FNUTS));
	public static final Item DRAG = new Item(new Item.Settings().group(gamermod.FNUTS).maxCount(4));
	public static ToolItem DRAG_DEEZ_NUTS_ON_CHIN = new SwordItem(dragchinToolMaterial.INSTANCE, 1, -1.0F, new Item.Settings().group(gamermod.FNUTS));
    public static final Item YOUR_MOTHER = new Item(new Item.Settings().group(gamermod.FNUTS).maxCount(1));


    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("gamermod", "chin"), CHIN);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "nuts"), NUTS);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "deez"), DEEZ);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "deez_nuts"), DEEZ_NUTS);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "deez_nuts_on_your_chin"), DEEZ_NUTS_ON_CHIN);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "drag"), DRAG);
		Registry.register(Registry.ITEM, new Identifier("gamermod", "drag_deez_nuts_on_your_chin"), DRAG_DEEZ_NUTS_ON_CHIN);
        Registry.register(Registry.ITEM, new Identifier("gamermod", "your_mother"), YOUR_MOTHER);

		gamermod.LOGGER.info("FunnyItems loaded");
    }
}
