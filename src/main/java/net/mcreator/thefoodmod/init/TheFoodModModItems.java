
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefoodmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thefoodmod.item.TomatoItem;
import net.mcreator.thefoodmod.item.SpicyPepperItem;
import net.mcreator.thefoodmod.item.MightyBananaItem;
import net.mcreator.thefoodmod.item.HeartyRadishItem;
import net.mcreator.thefoodmod.TheFoodModMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class TheFoodModModItems {
	public static Item MIGHTY_BANANA;
	public static Item TOMATO;
	public static Item HEARTY_RADISH;
	public static Item SPICY_PEPPER;
	public static Item HEARTY_RADISH_PLANT;

	public static void load() {
		MIGHTY_BANANA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "mighty_banana"), new MightyBananaItem());
		TOMATO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "tomato"), new TomatoItem());
		HEARTY_RADISH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "hearty_radish"), new HeartyRadishItem());
		SPICY_PEPPER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "spicy_pepper"), new SpicyPepperItem());
		HEARTY_RADISH_PLANT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "hearty_radish_plant"), new BlockItem(TheFoodModModBlocks.HEARTY_RADISH_PLANT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(HEARTY_RADISH_PLANT));
	}
}
