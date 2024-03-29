package net.leloomi.vanillarice.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leloomi.vanillarice.VanillaRice;
import net.leloomi.vanillarice.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            new AliasedBlockItem(ModBlocks.RICE_CROP, new FabricItemSettings()));
    
    public static final Item RICE_GRAIN = registerItem("rice_grain",
            new Item(new FabricItemSettings()));

    public static final Item RICE_BOWL = registerItem("rice_bowl",
            new StewItem(new FabricItemSettings().food(ModFoodComponents.RICE_BOWL)));

    public static final Item MAKI_SUSHI = registerItem("maki_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.MAKI_SUSHI)));

    public static final Item FRIED_RICE = registerItem("fried_rice",
            new StewItem(new FabricItemSettings().food(ModFoodComponents.FRIED_RICE)));

    public static final Item MOCHI = registerItem("mochi",
            new Item(new FabricItemSettings().food(ModFoodComponents.MOCHI)));

    public static final Item RICE_BAG = registerItem("rice_bag",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(VanillaRice.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        VanillaRice.LOGGER.debug(VanillaRice.MOD_ID + ": Registering Items...");
    }
}
