
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefoodmod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thefoodmod.block.HeartyRadishPlantBlock;
import net.mcreator.thefoodmod.TheFoodModMod;

public class TheFoodModModBlocks {
	public static Block HEARTY_RADISH_PLANT;

	public static void load() {
		HEARTY_RADISH_PLANT = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TheFoodModMod.MODID, "hearty_radish_plant"), new HeartyRadishPlantBlock());
	}

	public static void clientLoad() {
		HeartyRadishPlantBlock.clientInit();
	}
}
