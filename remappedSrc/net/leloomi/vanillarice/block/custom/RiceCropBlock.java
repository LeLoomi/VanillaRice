package net.leloomi.vanillarice.block.custom;

import net.leloomi.vanillarice.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class RiceCropBlock extends CropBlock
{
    public RiceCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem()
    {
        return ModItems.RICE_SEEDS;
    }
}
