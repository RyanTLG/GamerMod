package net.fabricmc.ryantlg.lootTables;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.ryantlg.gamermod;
import net.fabricmc.ryantlg.items.itemsByCrop.weemItems;
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
                .conditionally(RandomChanceLootCondition.builder(0.04f));
                supplier.withPool(weemSeed.build());

            }

        }));
    }

    public static void register() {
        modifyLootTables();

        gamermod.LOGGER.info("grassVanillaWeem loaded");
    }
}
