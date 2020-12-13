package net.tslat.aoa3.client.render.entity.projectile.staff;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.tslat.aoa3.client.render.entity.projectile.ParticleProjectileRenderer;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.entity.projectile.staff.MeteorFallEntity;
import net.tslat.aoa3.library.misc.CustomisableParticleType;
import net.tslat.aoa3.util.NumberUtil;

public class MeteorFallRenderer extends ParticleProjectileRenderer<MeteorFallEntity> {
	public MeteorFallRenderer(final EntityRendererManager manager) {
		super(manager);
	}

	@Override
	protected void addParticles(MeteorFallEntity entity, float partialTicks) {
		for (int i = 0; i < 3; i++) {
			entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(255, 0, 0)), entity.getPosX(), entity.getPosY() , entity.getPosZ(), 0, 0, 0);
			entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(223, 153, 0)), entity.getPosX(), entity.getPosY() - 0.3D , entity.getPosZ(), 0, 0, 0);
			entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(255, 255, 0)), entity.getPosX(), entity.getPosY() - 0.6D , entity.getPosZ(), 0, 0, 0);
		}
	}
}
