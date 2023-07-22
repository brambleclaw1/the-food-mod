
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
import net.mcreator.thefoodmod.item.MeatStewItem;
import net.mcreator.thefoodmod.item.MeatSkewerItem;
import net.mcreator.thefoodmod.item.HoneyedAppleItem;
import net.mcreator.thefoodmod.item.HeartySoupItem;
import net.mcreator.thefoodmod.item.HeartyRadishItem;
import net.mcreator.thefoodmod.item.GrilledGreensItem;
import net.mcreator.thefoodmod.item.FruitAndMushroomMixItem;
import net.mcreator.thefoodmod.item.FriedEggItem;
import net.mcreator.thefoodmod.item.FriedBananasItem;
import net.mcreator.thefoodmod.item.FrenchFriesItem;
import net.mcreator.thefoodmod.item.EggPuddingItem;
import net.mcreator.thefoodmod.item.CarrotCakeItem;
import net.mcreator.thefoodmod.item.ButteredAppleItem;
import net.mcreator.thefoodmod.TheFoodModMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class TheFoodModModItems {
	public static Item MIGHTY_BANANA;
	public static Item TOMATO;
	public static Item HEARTY_RADISH;
	public static Item SPICY_PEPPER;
	public static Item HEARTY_RADISH_PLANT;
	public static Item BUTTERED_APPLE;
	public static Item CARROT_CAKE;
	public static Item EGG_PUDDING;
	public static Item FRENCH_FRIES;
	public static Item FRIED_BANANAS;
	public static Item FRIED_EGG;
	public static Item FRUIT_AND_MUSHROOM_MIX;
	public static Item GRILLED_GREENS;
	public static Item HEARTY_SOUP;
	public static Item HONEYED_APPLE;
	public static Item MEAT_SKEWER;
	public static Item MEAT_STEW;

	public static void load() {
		MIGHTY_BANANA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "mighty_banana"), new MightyBananaItem());
		TOMATO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "tomato"), new TomatoItem());
		HEARTY_RADISH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "hearty_radish"), new HeartyRadishItem());
		SPICY_PEPPER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "spicy_pepper"), new SpicyPepperItem());
		HEARTY_RADISH_PLANT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "hearty_radish_plant"), new BlockItem(TheFoodModModBlocks.HEARTY_RADISH_PLANT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(HEARTY_RADISH_PLANT));
		BUTTERED_APPLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "buttered_apple"), new ButteredAppleItem());
		CARROT_CAKE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "carrot_cake"), new CarrotCakeItem());
		EGG_PUDDING = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "egg_pudding"), new EggPuddingItem());
		FRENCH_FRIES = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "french_fries"), new FrenchFriesItem());
		FRIED_BANANAS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "fried_bananas"), new FriedBananasItem());
		FRIED_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "fried_egg"), new FriedEggItem());
		FRUIT_AND_MUSHROOM_MIX = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "fruit_and_mushroom_mix"), new FruitAndMushroomMixItem());
		GRILLED_GREENS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "grilled_greens"), new GrilledGreensItem());
		HEARTY_SOUP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "hearty_soup"), new HeartySoupItem());
		HONEYED_APPLE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "honeyed_apple"), new HoneyedAppleItem());
		MEAT_SKEWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "meat_skewer"), new MeatSkewerItem());
		MEAT_STEW = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "meat_stew"), new MeatStewItem());
	}
}
