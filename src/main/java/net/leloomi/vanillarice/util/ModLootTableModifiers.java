package net.leloomi.vanillarice.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.leloomi.vanillarice.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.predicate.entity.LocationPredicate;
import net.minecraft.world.biome.BiomeKeys;

public class ModLootTableModifiers
{
    private static final float RICESEEDSDROPCHANCE = 0.4f;

    public static void modifyLootTables()
    {
        //Rice seeds in Bamboo jungle biome
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // If the loot table is for the grass block, and it is not overridden by a user:
            if (Blocks.GRASS.getLootTableId().equals(id) && source.isBuiltin()) {

                //Create a new loot pool that will hold the seeds.
                LootPool.Builder pool = LootPool.builder()

                // Add rice seeds...
                .with(ItemEntry.builder(ModItems.RICE_SEEDS.asItem()))

                // ...only if the grass is in the biome.
                .conditionally(LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.BAMBOO_JUNGLE)))
                        .conditionally(RandomChanceLootCondition.builder(RICESEEDSDROPCHANCE));

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        //Rice seeds in River biome
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // If the loot table is for the grass block, and it is not overridden by a user:
            if (Blocks.GRASS.getLootTableId().equals(id) && source.isBuiltin()) {

                //Create a new loot pool that will hold the seeds.
                LootPool.Builder pool = LootPool.builder()

                        // Add rice seeds...
                        .with(ItemEntry.builder(ModItems.RICE_SEEDS.asItem()))

                        // ...only if the grass is in the biome.
                        .conditionally(LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.RIVER)))
                        .conditionally(RandomChanceLootCondition.builder(RICESEEDSDROPCHANCE));

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        //Rice seeds in Mangroove Swamp
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // If the loot table is for the grass block, and it is not overridden by a user:
            if (Blocks.GRASS.getLootTableId().equals(id) && source.isBuiltin()) {

                //Create a new loot pool that will hold the seeds.
                LootPool.Builder pool = LootPool.builder()

                        // Add rice seeds...
                        .with(ItemEntry.builder(ModItems.RICE_SEEDS.asItem()))

                        // ...only if the grass is in the biome.
                        .conditionally(LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.MANGROVE_SWAMP)))
                        .conditionally(RandomChanceLootCondition.builder(RICESEEDSDROPCHANCE));

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });

        //Rice seeds in Swamp
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // If the loot table is for the grass block, and it is not overridden by a user:
            if (Blocks.GRASS.getLootTableId().equals(id) && source.isBuiltin()) {

                //Create a new loot pool that will hold the seeds.
                LootPool.Builder pool = LootPool.builder()

                        // Add rice seeds...
                        .with(ItemEntry.builder(ModItems.RICE_SEEDS.asItem()))

                        // ...only if the grass is in the biome.
                        .conditionally(LocationCheckLootCondition.builder(LocationPredicate.Builder.create().biome(BiomeKeys.SWAMP)))
                        .conditionally(RandomChanceLootCondition.builder(RICESEEDSDROPCHANCE));

                // Add the loot pool to the loot table
                tableBuilder.pool(pool);
            }
        });
    }
}
