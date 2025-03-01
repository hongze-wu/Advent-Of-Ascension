package net.tslat.aoa3.content.entity.mob.greckon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.common.packet.AoAPackets;
import net.tslat.aoa3.common.packet.packets.ScreenOverlayPacket;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.content.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class GrillfaceEntity extends AoAMeleeMob {
    private int scareCooldown = 0;

    public GrillfaceEntity(EntityType<? extends Monster> entityType, Level world) {
        super(entityType, world);
    }

    @Override
    protected float getStandingEyeHeight(Pose poseIn, EntityDimensions sizeIn) {
        return 2f;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return AoASounds.ENTITY_GRILLFACE_AMBIENT.get();
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return AoASounds.ENTITY_GRILLFACE_DEATH.get();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return AoASounds.ENTITY_GRILLFACE_HURT.get();
    }

    @Override
    protected void onAttack(Entity target) {
        if (target instanceof ServerPlayer && getLastHurtByMob() == null && scareCooldown <= 0) {
            playSound(AoASounds.ENTITY_GRILLFACE_SCARE.get(), 1.0f, 1.0f);
            AoAPackets.messagePlayer((ServerPlayer)target, new ScreenOverlayPacket(new ResourceLocation(AdventOfAscension.MOD_ID, "textures/gui/overlay/effect/grillface.png"), 20));

            scareCooldown = 100;
        }
    }

    @Override
    public void aiStep() {
        super.aiStep();

        if (scareCooldown > 0)
            scareCooldown--;
    }
}
