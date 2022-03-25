package net.tslat.aoa3.content.entity.mob.creeponia;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.content.entity.base.AoARangedAttacker;
import net.tslat.aoa3.content.entity.projectile.mob.BaseMobProjectile;
import net.tslat.aoa3.content.entity.projectile.mob.CreeperShotEntity;
import net.tslat.aoa3.util.DamageUtil;
import net.tslat.aoa3.util.RandomUtil;
import net.tslat.aoa3.util.WorldUtil;

import javax.annotation.Nullable;

public class CreeperlockEntity extends AoACreeponiaCreeper implements AoARangedAttacker {
    public CreeperlockEntity(EntityType<? extends AoACreeponiaCreeper> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 1.40625f;
    }

    @Override
	public float getExplosionStrength() {
        return 4;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return AoASounds.ENTITY_CREEPOID_AMBIENT.get();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return AoASounds.ENTITY_CREEPOID_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return AoASounds.ENTITY_CREEPOID_HURT.get();
    }

    @Override
    public void aiStep() {
        super.aiStep();

        if (!isAlive())
            return;

        PlayerEntity target = level.getNearestPlayer(getX(), getY(), getZ(), 20, false);

        if (target == null || target.isCreative())
            return;

        if (!level.isClientSide && RandomUtil.oneInNChance(120)) {
            setPos(target.getX(), target.getY(), target.getZ());
            level.playSound(null, getX(), getY(), getZ(), AoASounds.ENTITY_CREEPERLOCK_TELEPORT.get(), SoundCategory.HOSTILE, 1.0f, 1.0f);
        }

        if (RandomUtil.oneInNChance(70)) {
            CreeperShotEntity projectile = new CreeperShotEntity(this, BaseMobProjectile.Type.MAGIC);

            double distanceFactorX = target.getX() - getX();
            double distanceFactorY = target.getBoundingBox().minY + (double)(target.getBbHeight() / 3.0f) - projectile.getY();
            double distanceFactorZ = target.getZ() - this.getZ();
            double hyp = MathHelper.sqrt(distanceFactorX * distanceFactorX + distanceFactorZ * distanceFactorZ) + 0.2D;

            level.playSound(null, getX(), getY(), getZ(), AoASounds.ENTITY_MAGICAL_CREEPER_SHOOT.get(), SoundCategory.HOSTILE, 1.0f, 1.0f);
            projectile.shoot(distanceFactorX, distanceFactorY + hyp * 0.20000000298023224D, distanceFactorZ, 1.6f, (float)(4 - this.level.getDifficulty().getId()));
            level.addFreshEntity(projectile);
        }
    }

    @Override
    public void doProjectileBlockImpact(BaseMobProjectile projectile, BlockState blockHit, BlockPos pos, Direction sideHit) {
        WorldUtil.createExplosion(this, level, projectile, 2f);
    }

    @Override
    public void doProjectileImpactEffect(BaseMobProjectile projectile, Entity target) {
        WorldUtil.createExplosion(this, level, projectile, 2f);
    }

    @Override
    public void doProjectileEntityImpact(BaseMobProjectile projectile, Entity target) {
        if (DamageUtil.dealBlasterDamage(this, target, projectile, 7f, false))
            doProjectileImpactEffect(projectile, target);
    }
}