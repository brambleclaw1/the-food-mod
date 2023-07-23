
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.thefoodmod.init;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

public class TheFoodModModTrades {
	public static void registerTrades() {
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD, 6), ItemStack.EMPTY, new ItemStack(TheFoodModModItems.TOMATO), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> {
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD, 6), ItemStack.EMPTY, new ItemStack(TheFoodModModItems.MIGHTY_BANANA), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> {
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD, 5), ItemStack.EMPTY, new ItemStack(TheFoodModModItems.SPICY_PEPPER), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 4, factories -> {
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(TheFoodModModItems.HEARTY_RADISH), 10, 5, 0.05f));
		});
	}

	private record BasicTrade(ItemStack price, ItemStack price2, ItemStack offer, int maxTrades, int xp, float priceMult) implements VillagerTrades.ItemListing {
		@Override
		public @NotNull MerchantOffer getOffer(Entity entity, RandomSource random) {
			return new MerchantOffer(price, price2, offer, maxTrades, xp, priceMult);
		}
	}
}
