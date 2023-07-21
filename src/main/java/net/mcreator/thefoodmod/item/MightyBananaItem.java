
package net.mcreator.thefoodmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.thefoodmod.init.TheFoodModModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MightyBananaItem extends Item {
	public MightyBananaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(1.1f)

				.build()));
		ItemGroupEvents.modifyEntriesEvent(TheFoodModModTabs.TAB_THE_FOOD_MOD).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
