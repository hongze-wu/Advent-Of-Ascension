package net.tslat.aoa3.client.model.entity.mob.precasia;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class OpteryxModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftArm2;
	private final ModelRenderer body2;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer head5;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer head6;
	private final ModelRenderer head7;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer rightLeg4;
	private final ModelRenderer leftLeg4;
	private final ModelRenderer rightLeg5;
	private final ModelRenderer leftLeg5;

	public OpteryxModel() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 19, 1)).addBox(2.0f, -1.0f, -9.0f, 0, 1, 5);
		head.setRotationPoint(0.0f, 5.0f, -4.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 58, 16)).addBox(-1.0f, -1.0f, 0.0f, 0, 5, 2);
		body.setRotationPoint(1.0f, 4.0f, -5.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.8726646f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 21, 56)).addBox(-9.0f, 0.0f, 1.0f, 10, 0, 5);
		rightArm.setRotationPoint(-5.0f, 8.0f, -1.0f);
		rightArm.setTextureSize(64, 64);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 21, 56)).addBox(-1.0f, 0.0f, 1.0f, 10, 0, 5);
		leftArm.setRotationPoint(5.0f, 8.0f, -1.0f);
		leftArm.setTextureSize(64, 64);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 27)).addBox(-0.5f, 9.0f, -2.0f, 1, 1, 2);
		rightLeg.setRotationPoint(-3.0f, 14.0f, 0.0f);
		rightLeg.setTextureSize(64, 64);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 27)).addBox(-0.5f, 9.0f, -2.0f, 1, 1, 2);
		leftLeg.setRotationPoint(3.0f, 14.0f, 0.0f);
		leftLeg.setTextureSize(64, 64);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(rightLeg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 4, 4);
		rightLeg2.setRotationPoint(-3.0f, 14.0f, 0.0f);
		rightLeg2.setTextureSize(64, 64);
		rightLeg2.mirror = true;
		setRotation(rightLeg2, 0.0f, 0.0f, 0.0f);
		(leftLeg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 4, 4);
		leftLeg2.setRotationPoint(3.0f, 14.0f, 0.0f);
		leftLeg2.setTextureSize(64, 64);
		leftLeg2.mirror = true;
		setRotation(leftLeg2, 0.0f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 1, 47)).addBox(-9.0f, -1.0f, -2.0f, 10, 2, 3);
		rightArm2.setRotationPoint(-5.0f, 8.0f, -1.0f);
		rightArm2.setTextureSize(64, 64);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.0f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 1, 47)).addBox(-1.0f, -1.0f, -2.0f, 10, 2, 3);
		leftArm2.setRotationPoint(5.0f, 8.0f, -1.0f);
		leftArm2.setTextureSize(64, 64);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 19, 36)).addBox(-1.0f, 4.0f, 14.0f, 2, 1, 5);
		body2.setRotationPoint(0.0f, 6.0f, -2.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 41, 0)).addBox(-2.0f, -3.0f, -4.0f, 0, 2, 3);
		head2.setRotationPoint(2.0f, 3.0f, -4.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 41, 8)).addBox(-2.0f, -3.0f, -9.0f, 0, 2, 5);
		head3.setRotationPoint(2.0f, 3.0f, -4.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 19, 8)).addBox(-2.0f, 0.0f, -9.0f, 4, 1, 5);
		head4.setRotationPoint(0.0f, 5.0f, -4.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 19, 1)).addBox(-2.0f, -1.0f, -9.0f, 0, 1, 5);
		head5.setRotationPoint(0.0f, 5.0f, -4.0f);
		head5.setTextureSize(64, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 18, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 8, 8);
		body3.setRotationPoint(0.0f, 6.0f, -2.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 29, 36)).addBox(0.0f, 5.0f, 6.0f, 0, 3, 13);
		body4.setRotationPoint(0.0f, 6.0f, -2.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 1, 36)).addBox(-2.0f, 4.0f, 6.0f, 4, 1, 8);
		body5.setRotationPoint(0.0f, 6.0f, -2.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 17, 16)).addBox(-1.0f, -1.0f, -2.0f, 2, 4, 2);
		body6.setRotationPoint(0.0f, 4.0f, -5.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0.8726646f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 0, 8)).addBox(-2.0f, -3.0f, -9.0f, 4, 2, 5);
		head6.setRotationPoint(0.0f, 5.0f, -4.0f);
		head6.setTextureSize(64, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -3.0f, -4.0f, 4, 4, 3);
		head7.setRotationPoint(0.0f, 5.0f, -4.0f);
		head7.setTextureSize(64, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(rightLeg3 = new ModelRenderer(this, 0, 25)).addBox(-1.0f, 4.0f, -1.0f, 2, 6, 2);
		rightLeg3.setRotationPoint(-3.0f, 14.0f, 0.0f);
		rightLeg3.setTextureSize(64, 64);
		rightLeg3.mirror = true;
		setRotation(rightLeg3, 0.0f, 0.0f, 0.0f);
		(leftLeg3 = new ModelRenderer(this, 0, 25)).addBox(-1.0f, 4.0f, -1.0f, 2, 6, 2);
		leftLeg3.setRotationPoint(3.0f, 14.0f, 0.0f);
		leftLeg3.setTextureSize(64, 64);
		leftLeg3.mirror = true;
		setRotation(leftLeg3, 0.0f, 0.0f, 0.0f);
		(rightLeg4 = new ModelRenderer(this, 0, 27)).addBox(-2.0f, 9.0f, -2.0f, 1, 1, 2);
		rightLeg4.setRotationPoint(-3.0f, 14.0f, 0.0f);
		rightLeg4.setTextureSize(64, 64);
		rightLeg4.mirror = true;
		setRotation(rightLeg4, 0.0f, 0.0f, 0.0f);
		(leftLeg4 = new ModelRenderer(this, 0, 27)).addBox(-2.0f, 9.0f, -2.0f, 1, 1, 2);
		leftLeg4.setRotationPoint(3.0f, 14.0f, 0.0f);
		leftLeg4.setTextureSize(64, 64);
		leftLeg4.mirror = true;
		setRotation(leftLeg4, 0.0f, 0.0f, 0.0f);
		(rightLeg5 = new ModelRenderer(this, 0, 27)).addBox(1.0f, 9.0f, -2.0f, 1, 1, 2);
		rightLeg5.setRotationPoint(-3.0f, 14.0f, 0.0f);
		rightLeg5.setTextureSize(64, 64);
		rightLeg5.mirror = true;
		setRotation(rightLeg5, 0.0f, 0.0f, 0.0f);
		(leftLeg5 = new ModelRenderer(this, 0, 27)).addBox(1.0f, 9.0f, -2.0f, 1, 1, 2);
		leftLeg5.setRotationPoint(3.0f, 14.0f, 0.0f);
		leftLeg5.setTextureSize(64, 64);
		leftLeg5.mirror = true;
		setRotation(leftLeg5, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg.rotateAngleY = 0.0f;
		rightLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg2.rotateAngleY = 0.0f;
		rightLeg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg3.rotateAngleY = 0.0f;
		rightLeg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg4.rotateAngleY = 0.0f;
		rightLeg5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg5.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		rightArm.rotateAngleZ = MathHelper.cos(ageInTicks * 0.2f) * 3.1415927f * 0.35f;
		rightArm2.rotateAngleZ = MathHelper.cos(ageInTicks * 0.2f) * 3.1415927f * 0.35f;
		leftArm.rotateAngleZ = -rightArm.rotateAngleZ;
		leftArm2.rotateAngleZ = -rightArm2.rotateAngleZ;
	}
}
