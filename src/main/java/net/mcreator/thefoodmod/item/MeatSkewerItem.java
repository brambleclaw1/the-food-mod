
package net.mcreator.thefoodmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.thefoodmod.procedures.MeatSkewerPlayerFinishesUsingItemProcedure;
import net.mcreator.thefoodmod.init.TheFoodModModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MeatSkewerItem extends Item {
	public MeatSkewerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(18).saturationMod(5.6f)

				.build()));
		ItemGroupEvents.modifyEntriesEvent(TheFoodModModTabs.TAB_THE_FOOD_MOD).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MeatSkewerPlayerFinishesUsingItemProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return retval;
	}
}
