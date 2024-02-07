package net.leloomi.vanillarice.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leloomi.vanillarice.VanillaRice;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup
{
    public static final ItemGroup RICE = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(VanillaRice.MOD_ID, "rice"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.vanillarice"))
                    .icon( () -> new ItemStack(ModItems.RICE_BOWL))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RICE_SEEDS);
                        entries.add(ModItems.RICE_GRAIN);
                        entries.add(ModItems.RICE_BAG);
                        entries.add(ModItems.RICE_BOWL);
                        entries.add(ModItems.FRIED_RICE);
                        entries.add(ModItems.MAKI_SUSHI);
                        entries.add(ModItems.MOCHI);

                    }).build());

    public static void registerItemGroups() {

    }
}
