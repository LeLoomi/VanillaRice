package net.leloomi.vanillarice.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leloomi.vanillarice.VanillaRice;
import net.leloomi.vanillarice.block.custom.RiceCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block RICE_CROP = registerBlockPure("rice_crop",
            new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));

    public static final Block RICE_CROP1 = registerBlockPure("rice_crop",
            new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));



    public static Block registerBlockPure(String name, Block block)
    {
        Identifier id = Identifier.of(VanillaRice.MOD_ID, name);
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return registerBlockPure(name, block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        Identifier id = Identifier.of(VanillaRice.MOD_ID, name);
        BlockItem blockItem = new BlockItem(block, new Item.Settings());
        return Registry.register(Registries.ITEM, id, blockItem);
    }

        public static void registerModBlocks()
    {
        VanillaRice.LOGGER.debug(VanillaRice.MOD_ID + ": Registering blocks...");
    }
}
