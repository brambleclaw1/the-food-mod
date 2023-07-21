
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefoodmod.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.thefoodmod.TheFoodModMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class TheFoodModModTabs {
	public static ResourceKey<CreativeModeTab> TAB_THE_FOOD_MOD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(TheFoodModMod.MODID, "the_food_mod"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_THE_FOOD_MOD, FabricItemGroup.builder().title(Component.translatable("item_group." + TheFoodModMod.MODID + ".the_food_mod")).icon(() -> new ItemStack(Items.COOKIE)).build());
	}
}
