package net.tslat.aoa3.object.entity.projectile.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.object.entity.base.AoAFlyingRangedMob;

public class AnemiaBombEntity extends BaseMobProjectile {
	public AnemiaBombEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}

	public AnemiaBombEntity(World world) {
		super(AoAEntities.Projectiles.ANEMIA_BOMB.get(), world);
	}

	public AnemiaBombEntity(AoAFlyingRangedMob shooter, Type projectileType) {
		super(AoAEntities.Projectiles.ANEMIA_BOMB.get(), shooter.level, shooter, projectileType);
	}

	@Override
	public float getGravity() {
		return 0;
	}
}