package net.leloomi.vanillarice.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leloomi.vanillarice.VanillaRice;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.RICE)));
    
    public static final Item RICE_GRAIN = registerItem("rice_grain",
            new Item(new FabricItemSettings().group(ModItemGroup.RICE)));

    public static final Item RICE_BOWL = registerItem("rice_bowl",
            new Item(new FabricItemSettings().group(ModItemGroup.RICE).food(ModFoodComponents.RICE_BOWL)));

    public static final Item MAKI_SUSHI = registerItem("maki_sushi",
            new Item(new FabricItemSettings().group(ModItemGroup.RICE).food(ModFoodComponents.MAKI_SUSHI)));

    public static final Item FRIED_RICE = registerItem("fried_rice",
            new Item(new FabricItemSettings().group(ModItemGroup.RICE).food(ModFoodComponents.FRIED_RICE)));

    public static final Item MOCHI = registerItem("mochi",
            new Item(new FabricItemSettings().group(ModItemGroup.RICE).food(ModFoodComponents.MOCHI)));

    public static final Item RICE_BAG = registerItem("rice_bag",
            new Item(new FabricItemSettings().group(ModItemGroup.RICE)));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(VanillaRice.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        VanillaRice.LOGGER.debug(VanillaRice.MOD_ID + ": Registering Items...");
    }
}
