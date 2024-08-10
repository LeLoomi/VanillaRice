package net.leloomi.vanillarice.item;

import net.leloomi.vanillarice.VanillaRice;
import net.leloomi.vanillarice.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            new AliasedBlockItem(ModBlocks.RICE_CROP, new Item.Settings()));
    
    public static final Item RICE_GRAIN = registerItem("rice_grain",
            new Item(new Item.Settings()));

    public static final Item RICE_BOWL = registerItem("rice_bowl",
            new Item(new Item.Settings().food(ModFoodComponents.RICE_BOWL)));

    public static final Item MAKI_SUSHI = registerItem("maki_sushi",
            new Item(new Item.Settings().food(ModFoodComponents.MAKI_SUSHI)));

    public static final Item FRIED_RICE = registerItem("fried_rice",
            new Item(new Item.Settings().food(ModFoodComponents.FRIED_RICE)));

    public static final Item MOCHI = registerItem("mochi",
            new Item(new Item.Settings().food(ModFoodComponents.MOCHI)));

    public static final Item RICE_BAG = registerItem("rice_bag",
            new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaRice.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        VanillaRice.LOGGER.debug(VanillaRice.MOD_ID + ": Registering Items...");
    }
}
