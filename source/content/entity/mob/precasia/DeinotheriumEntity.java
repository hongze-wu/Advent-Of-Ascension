package net.tslat.aoa3.content.entity.mob.precasia;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.content.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class DeinotheriumEntity extends AoAMeleeMob {
	public DeinotheriumEntity(EntityType<? extends Monster> entityType, Level world) {
		super(entityType, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntityDimensions sizeIn) {
		return 2.5625f;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_DEINOTHERIUM_AMBIENT.get();
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_DEINOTHERIUM_DEATH.get();
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_DEINOTHERIUM_HURT.get();
	}

	@Nullable
	@Override
	protected SoundEvent getStepSound(BlockPos pos, BlockState blockState) {
		return AoASounds.ENTITY_GENERIC_VERY_HEAVY_STEP.get();
	}
}
