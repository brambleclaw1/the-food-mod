
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefoodmod.init;

import net.mcreator.thefoodmod.procedures.FriedBananasPlayerFinishesUsingItemProcedure;
import net.mcreator.thefoodmod.procedures.FrenchFriesPlayerFinishesUsingItemProcedure;
import net.mcreator.thefoodmod.procedures.EggPuddingPlayerFinishesUsingItemProcedure;
import net.mcreator.thefoodmod.procedures.CarrotCakePlayerFinishesUsingItemProcedure;
import net.mcreator.thefoodmod.procedures.ButteredApplePlayerFinishesUsingItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class TheFoodModModProcedures {
	public static void load() {
		new CarrotCakePlayerFinishesUsingItemProcedure();
		new ButteredApplePlayerFinishesUsingItemProcedure();
		new EggPuddingPlayerFinishesUsingItemProcedure();
		new FrenchFriesPlayerFinishesUsingItemProcedure();
		new FriedBananasPlayerFinishesUsingItemProcedure();
	}
}
