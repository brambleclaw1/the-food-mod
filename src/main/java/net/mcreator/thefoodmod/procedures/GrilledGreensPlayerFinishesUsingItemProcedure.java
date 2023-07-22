package net.mcreator.thefoodmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thefoodmod.TheFoodModMod;

import java.util.Map;

public class GrilledGreensPlayerFinishesUsingItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheFoodModMod.LOGGER.warn("Failed to load dependency entity for procedure GrilledGreensPlayerFinishesUsingItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 7200, 2, false, false));
	}
}
