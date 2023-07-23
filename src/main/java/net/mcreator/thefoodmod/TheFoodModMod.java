/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.thefoodmod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.thefoodmod.init.TheFoodModModTrades;
import net.mcreator.thefoodmod.init.TheFoodModModTabs;
import net.mcreator.thefoodmod.init.TheFoodModModProcedures;
import net.mcreator.thefoodmod.init.TheFoodModModItems;

import net.fabricmc.api.ModInitializer;

public class TheFoodModMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "the_food_mod";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing TheFoodModMod");

		TheFoodModModTabs.load();

		TheFoodModModItems.load();

		TheFoodModModProcedures.load();

		TheFoodModModTrades.registerTrades();

	}
}
