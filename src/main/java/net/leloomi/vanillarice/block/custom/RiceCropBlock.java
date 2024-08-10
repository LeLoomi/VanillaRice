// see https://fabricmc.net/wiki/tutorial:waterloggable
package net.leloomi.vanillarice.block.custom;

import net.leloomi.vanillarice.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class RiceCropBlock extends CropBlock implements Waterloggable
{
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public RiceCropBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState()
                .with(WATERLOGGED, false));
    }

    @Override
    protected ItemConvertible getSeedsItem()
    {
        return ModItems.RICE_SEEDS;
    }


    // +++ Water logging stuff +++

    // Make the block recognize the property, otherwise setting the property will throw exceptions.
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, WATERLOGGED);    // all properties need to be added here, so age too!
    }

    // make plantable on dirt and mud
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.DIRT) || floor.isOf(Blocks.MUD);
    }

    // make plantable only in water
    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getFluidState(pos).isOf(Fluids.WATER) &&
                world.getBlockState(pos.up()).isOf(Blocks.AIR) &&
                (
                        world.getBlockState(pos.down()).isOf(Blocks.DIRT) ||
                                world.getBlockState(pos.down()).isOf(Blocks.MUD)
                );
    }

    // instantly water log the crop if placed in water
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER));
    }

    // display crop with water in it when waterlogged
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    // handle water flow through the crops
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
}
