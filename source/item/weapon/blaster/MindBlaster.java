package net.tslat.aoa3.item.weapon.blaster;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.projectile.blaster.MindBlasterShotEntity;

import javax.annotation.Nullable;

public class MindBlaster extends BaseBlaster {
	public MindBlaster(double dmg, int durability, int fireDelayTicks, float energyCost) {
		super(dmg, durability, fireDelayTicks, energyCost);
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return AoASounds.ITEM_MIND_BLASTER_FIRE.get();
	}

	@Override
	public void fire(ItemStack blaster, LivingEntity shooter) {
		shooter.world.addEntity(new MindBlasterShotEntity(shooter, this, 60));
	}
}
