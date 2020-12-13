package net.tslat.aoa3.client.model.entity.mob.overworld;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class VertebronModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer body7;
	private final ModelRenderer body8;
	private final ModelRenderer body9;
	private final ModelRenderer body10;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer rightLeg2;

	public VertebronModel() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, -3.0f, 3.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body.setRotationPoint(9.0f, 9.0f, 0.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.5235988f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightArm.setRotationPoint(-6.0f, 2.0f, 0.0f);
		rightArm.setTextureSize(64, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftArm.setRotationPoint(6.0f, 2.0f, 0.0f);
		leftArm.setTextureSize(64, 32);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 50)).addBox(-2.0f, 5.0f, 0.0f, 4, 7, 4);
		rightLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightLeg.setTextureSize(64, 32);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 50)).addBox(-2.0f, 5.0f, 0.0f, 4, 7, 4);
		leftLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftLeg.setTextureSize(64, 32);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 16, 33)).addBox(-4.0f, 0.0f, -2.0f, 8, 3, 6);
		body2.setRotationPoint(0.0f, -3.0f, 0.0f);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body3.setRotationPoint(9.0f, 1.0f, 0.0f);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 2.356194f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body4.setRotationPoint(9.0f, 4.0f, 0.0f);
		body4.setTextureSize(64, 32);
		body4.mirror = true;
		setRotation(body4, 1.919862f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body5.setRotationPoint(9.0f, 6.0f, 0.0f);
		body5.setTextureSize(64, 32);
		body5.mirror = true;
		setRotation(body5, 1.22173f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body6.setRotationPoint(0.0f, 9.0f, 0.0f);
		body6.setTextureSize(64, 32);
		body6.mirror = true;
		setRotation(body6, 0.5235988f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body7.setRotationPoint(0.0f, 6.0f, 0.0f);
		body7.setTextureSize(64, 32);
		body7.mirror = true;
		setRotation(body7, 1.22173f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body8.setRotationPoint(0.0f, 4.0f, 0.0f);
		body8.setTextureSize(64, 32);
		body8.mirror = true;
		setRotation(body8, 1.919862f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 1, 33)).addBox(-5.0f, 0.0f, -2.0f, 1, 12, 3);
		body9.setRotationPoint(0.0f, 1.0f, 0.0f);
		body9.setTextureSize(64, 32);
		body9.mirror = true;
		setRotation(body9, 2.356194f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body10.setRotationPoint(0.0f, 0.0f, 0.0f);
		body10.setTextureSize(64, 32);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(leftLeg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 5, 4);
		leftLeg2.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftLeg2.setTextureSize(64, 32);
		leftLeg2.mirror = true;
		setRotation(leftLeg2, 0.0f, 0.0f, 0.0f);
		(rightLeg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 5, 4);
		rightLeg2.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightLeg2.setTextureSize(64, 32);
		rightLeg2.mirror = true;
		setRotation(rightLeg2, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg.rotateAngleY = 0.0f;
		rightLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg2.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
