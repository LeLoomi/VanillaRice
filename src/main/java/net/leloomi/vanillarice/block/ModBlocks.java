package net.leloomi.vanillarice.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leloomi.vanillarice.VanillaRice;
import net.leloomi.vanillarice.block.custom.RiceCropBlock;
import net.leloomi.vanillarice.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block RICE_CROP = registerBlockWithoutBlockItem("rice_crop",
            new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));



    public static Block registerBlockWithoutBlockItem(String name, Block block)
    {
        return Registry.register(Registries.BLOCK, new Identifier(VanillaRice.MOD_ID, name), block);
    }

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VanillaRice.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(VanillaRice.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks()
    {
        VanillaRice.LOGGER.debug(VanillaRice.MOD_ID + ": Registering blocks...");
    }
}
