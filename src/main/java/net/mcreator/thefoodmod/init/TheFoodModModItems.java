
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefoodmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thefoodmod.item.TomatoItem;
import net.mcreator.thefoodmod.item.SteamedMushroomItem;
import net.mcreator.thefoodmod.item.SteamedMeatItem;
import net.mcreator.thefoodmod.item.SteamedFruitItem;
import net.mcreator.thefoodmod.item.SteamedFishItem;
import net.mcreator.thefoodmod.item.SpicyPepperItem;
import net.mcreator.thefoodmod.item.SauteedPeppersItem;
import net.mcreator.thefoodmod.item.RadishSaladItem;
import net.mcreator.thefoodmod.item.PizzaItem;
import net.mcreator.thefoodmod.item.PepperSaladItem;
import net.mcreator.thefoodmod.item.MushroomSkewerItem;
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

public class TheFoodModModItems {
	public static Item MIGHTY_BANANA;
	public static Item TOMATO;
	public static Item HEARTY_RADISH;
	public static Item SPICY_PEPPER;
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
	public static Item MUSHROOM_SKEWER;
	public static Item PEPPER_SALAD;
	public static Item RADISH_SALAD;
	public static Item SAUTEED_PEPPERS;
	public static Item STEAMED_FISH;
	public static Item STEAMED_FRUIT;
	public static Item STEAMED_MEAT;
	public static Item STEAMED_MUSHROOM;
	public static Item PIZZA;

	public static void load() {
		MIGHTY_BANANA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "mighty_banana"), new MightyBananaItem());
		TOMATO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "tomato"), new TomatoItem());
		HEARTY_RADISH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "hearty_radish"), new HeartyRadishItem());
		SPICY_PEPPER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "spicy_pepper"), new SpicyPepperItem());
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
		MUSHROOM_SKEWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "mushroom_skewer"), new MushroomSkewerItem());
		PEPPER_SALAD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "pepper_salad"), new PepperSaladItem());
		RADISH_SALAD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "radish_salad"), new RadishSaladItem());
		SAUTEED_PEPPERS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "sauteed_peppers"), new SauteedPeppersItem());
		STEAMED_FISH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "steamed_fish"), new SteamedFishItem());
		STEAMED_FRUIT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "steamed_fruit"), new SteamedFruitItem());
		STEAMED_MEAT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "steamed_meat"), new SteamedMeatItem());
		STEAMED_MUSHROOM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "steamed_mushroom"), new SteamedMushroomItem());
		PIZZA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheFoodModMod.MODID, "pizza"), new PizzaItem());
	}
}
