package net.leloomi.vanillarice.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

// this was shamelessly stolen from https://github.com/skniro and their https://github.com/skniro/UsefulFood-Reborn/ mod D:
public class StewItem extends Item {
    public StewItem(Item.Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        if (user instanceof PlayerEntity playerEntity) {
            if (playerEntity.isInCreativeMode()) {
                return itemStack;
            }
        }

        return new ItemStack(Items.BOWL);
    }
}
