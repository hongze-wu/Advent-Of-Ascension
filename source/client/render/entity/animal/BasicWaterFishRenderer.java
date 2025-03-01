package net.tslat.aoa3.client.render.entity.animal;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.util.Mth;
import net.tslat.aoa3.client.model.entity.EntityGeoModel;
import net.tslat.aoa3.client.render.entity.AnimatedMobRenderer;
import net.tslat.aoa3.content.entity.animal.fish.BasicFishEntity;

public class BasicWaterFishRenderer extends AnimatedMobRenderer<BasicFishEntity> {
	public BasicWaterFishRenderer(EntityRendererProvider.Context renderManager, EntityGeoModel<BasicFishEntity> model) {
		super(renderManager, model, 0.23f);
	}

	@Override
	protected void applyRotations(BasicFishEntity entityLiving, PoseStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(4.3f * Mth.sin(0.6f * ageInTicks)));

		if (!entityLiving.isInWater()) {
			matrixStackIn.translate(0.2f, 0.1f, 0);
			matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90));
		}
	}
}
