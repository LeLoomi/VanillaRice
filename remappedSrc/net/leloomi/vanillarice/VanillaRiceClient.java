package net.leloomi.vanillarice;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.leloomi.vanillarice.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class VanillaRiceClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RICE_CROP, RenderLayer.getCutout());
    }
}
