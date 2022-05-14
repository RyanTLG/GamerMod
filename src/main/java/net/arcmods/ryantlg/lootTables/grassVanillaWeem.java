package net.arcmods.ryantlg.lootTables;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.items.itemsByCrop.weemItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class grassVanillaWeem {
    
    private static final Identifier GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/grass");

    private static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {

            if (GRASS_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder weemSeed = FabricLootPoolBuilder.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .with(ItemEntry.builder(weemItems.WEEM_SEEDS))
                .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)).build())
                .conditionally(RandomChanceLootCondition.builder(0.0123132f));
                supplier.withPool(weemSeed.build());

            }

        }));
    }

    public static void register() {
        modifyLootTables();

        gameritems.LOGGER.info("grassVanillaWeem loaded");
    }
}
