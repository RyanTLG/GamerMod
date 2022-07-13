package net.arcmods.ryantlg.lootTables;

import net.arcmods.ryantlg.gameritems;
import net.arcmods.ryantlg.items.itemsByCrop.weemItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class grassVanillaWeem {
    
    private static final Identifier GRASS_LOOT_TABLE_ID = Blocks.GRASS.getLootTableId();

    private static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, tableBuilder, source) -> {

            if (source.isBuiltin() && GRASS_LOOT_TABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                .with(ItemEntry.builder(weemItems.WEEM_SEEDS))
                .conditionally(RandomChanceLootCondition.builder(0.0123132f));;
 
                tableBuilder.pool(poolBuilder);
            }


            // if (GRASS_LOOT_TABLE_ID.equals(id)) {
            //     FabricLootPoolBuilder weemSeed = FabricLootPoolBuilder.builder()
            //     .rolls(ConstantLootNumberProvider.create(1))
            //     .with(ItemEntry.builder(weemItems.WEEM_SEEDS))
            //     .withFunction(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)).build())
            //     .conditionally(RandomChanceLootCondition.builder(0.0123132f));
            //     supplier.withPool(weemSeed.build());

            // }

        }));
    }

    public static void register() {
        modifyLootTables();

        gameritems.LOGGER.info("grassVanillaWeem loaded");
    }
}
