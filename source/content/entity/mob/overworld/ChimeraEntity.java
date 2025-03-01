package net.tslat.aoa3.content.entity.mob.overworld;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.content.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class ChimeraEntity extends AoAMeleeMob {
	public ChimeraEntity(EntityType<? extends Monster> entityType, Level world) {
		super(entityType, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
		return 1.05f;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_CHIMERA_AMBIENT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_CHIMERA_DEATH.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_CHIMERA_HURT.get();
	}

	@Override
	protected void onAttack(Entity target) {
		if (target instanceof LivingEntity)
			((LivingEntity)target).addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 240, 1, true, true));
	}

}
