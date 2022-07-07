package net.leloomi.vanillarice;

import net.fabricmc.api.ModInitializer;
import net.leloomi.vanillarice.block.ModBlocks;
import net.leloomi.vanillarice.item.ModItems;
import net.leloomi.vanillarice.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaRice implements ModInitializer
{
	public static final String MOD_ID = "vanillarice";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();

		VanillaRice.LOGGER.debug(VanillaRice.MOD_ID + ": Initialization done!");
	}
}
