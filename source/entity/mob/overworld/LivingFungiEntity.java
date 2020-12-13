package net.tslat.aoa3.entity.mob.overworld;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class LivingFungiEntity extends AoAMeleeMob {
	public LivingFungiEntity(EntityType<? extends MonsterEntity> entityType, World world) {
		super(entityType, world);

		isSlipperyMovement = true;

		setAIMoveSpeed(1.8f);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return 1.3125f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.1d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 30;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 2.5;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_FUNGI_AMBIENT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_FUNGI_DEATH.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_FUNGI_HURT.get();
	}

	@Nullable
	@Override
	protected SoundEvent getStepSound(BlockPos pos, BlockState blockState) {
		return AoASounds.ENTITY_GENERIC_HEAVY_STEP.get();
	}

	@Override
	protected boolean isDaylightMob() {
		return true;
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}
}
