package net.leloomi.vanillarice.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.leloomi.vanillarice.VanillaRice;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup
{
    public static final ItemGroup RICE = FabricItemGroupBuilder.build(
            new Identifier(VanillaRice.MOD_ID, "ricegroup"), () -> new ItemStack(ModItems.RICE_GRAIN));
}
