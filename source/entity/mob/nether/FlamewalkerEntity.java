package net.tslat.aoa3.entity.mob.nether;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class FlamewalkerEntity extends AoAMeleeMob {
    public FlamewalkerEntity(EntityType<? extends MonsterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 2.03125f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0d;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 65d;
    }

    @Override
    protected double getBaseMeleeDamage() {
        return 6.5d;
    }

    @Override
    protected double getBaseMovementSpeed() {
        return 0.2875;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return AoASounds.ENTITY_FLAMEWALKER_AMBIENT.get();
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return AoASounds.ENTITY_FLAMEWALKER_DEATH.get();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return AoASounds.ENTITY_FLAMEWALKER_HURT.get();
    }

    @Override
    public void livingTick() {
        super.livingTick();

        if (!world.isRemote && world.getGameRules().getBoolean(GameRules.MOB_GRIEFING) && (getAttackTarget() != null || getRevengeTarget() != null) && world.isAirBlock(getPosition()))
            world.setBlockState(getPosition(), Blocks.FIRE.getDefaultState());
    }
}
