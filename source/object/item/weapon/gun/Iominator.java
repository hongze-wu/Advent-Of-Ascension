package net.tslat.aoa3.object.item.weapon.gun;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.AoAItemGroups;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.object.entity.projectile.gun.BaseBullet;
import net.tslat.aoa3.object.entity.projectile.gun.ToxicBulletEntity;

import javax.annotation.Nullable;

public class Iominator extends BaseGun {
	public Iominator(double dmg, int durability, int firingDelayTicks, float recoil) {
		super(AoAItemGroups.GUNS, dmg, durability, firingDelayTicks, recoil);
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return AoASounds.ITEM_ABOMINATOR_FIRE.get();
	}

	@Override
	public BaseBullet createProjectileEntity(LivingEntity shooter, ItemStack gunStack, Hand hand) {
		return new ToxicBulletEntity(shooter, this, hand, 120, 0);
	}
}