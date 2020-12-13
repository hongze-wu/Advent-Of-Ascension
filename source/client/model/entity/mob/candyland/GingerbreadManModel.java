package net.tslat.aoa3.client.model.entity.mob.candyland;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class GingerbreadManModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer head5;
	private final ModelRenderer head6;
	private final ModelRenderer head7;
	private final ModelRenderer head8;
	private final ModelRenderer head9;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer rightArm3;
	private final ModelRenderer leftArm3;
	private final ModelRenderer rightArm4;
	private final ModelRenderer leftArm4;
	private final ModelRenderer rightLeg5;
	private final ModelRenderer leftLeg5;
	private final ModelRenderer rightLeg6;
	private final ModelRenderer leftLeg6;
	private final ModelRenderer head10;
	private final ModelRenderer head11;
	private final ModelRenderer head12;
	private final ModelRenderer head13;
	private final ModelRenderer head14;
	private final ModelRenderer head15;
	private final ModelRenderer head16;
	private final ModelRenderer head17;
	private final ModelRenderer head18;
	private final ModelRenderer head19;

	public GingerbreadManModel() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 18)).addBox(3.0f, -4.0f, -3.0f, 1, 3, 1);
		head.setRotationPoint(0.0f, 0.0f, 2.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 1, 24)).addBox(-1.0f, 5.0f, -3.0f, 2, 2, 1);
		body.setRotationPoint(0.0f, 0.0f, 2.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 54, 0)).addBox(-2.0f, 5.0f, -3.0f, 2, 1, 1);
		rightArm.setRotationPoint(-5.0f, 2.0f, 2.0f);
		rightArm.setTextureSize(64, 64);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 54, 0)).addBox(0.0f, 5.0f, -3.0f, 2, 1, 1);
		leftArm.setRotationPoint(5.0f, 2.0f, 2.0f);
		leftArm.setTextureSize(64, 64);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 9, 25)).addBox(0.5f, 0.0f, -3.0f, 1, 2, 1);
		rightLeg.setRotationPoint(-2.0f, 12.0f, 2.0f);
		rightLeg.setTextureSize(64, 64);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 9, 25)).addBox(0.5f, 0.0f, -3.0f, 1, 2, 1);
		leftLeg.setRotationPoint(2.0f, 12.0f, 2.0f);
		leftLeg.setTextureSize(64, 64);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 20, 14)).addBox(-5.0f, -10.0f, -2.0f, 10, 10, 2);
		head2.setRotationPoint(0.0f, 0.0f, 2.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 13, 6)).addBox(-4.0f, -8.0f, -3.0f, 1, 1, 1);
		head3.setRotationPoint(0.0f, 0.0f, 2.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 13, 6)).addBox(3.0f, -8.0f, -3.0f, 1, 1, 1);
		head4.setRotationPoint(0.0f, 0.0f, 2.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 2, 15)).addBox(-1.0f, -3.0f, -3.0f, 2, 1, 1);
		head5.setRotationPoint(0.0f, 0.0f, 2.0f);
		head5.setTextureSize(64, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 2, 15)).addBox(-1.0f, -1.5f, -3.0f, 2, 1, 1);
		head6.setRotationPoint(0.0f, 0.0f, 2.0f);
		head6.setTextureSize(64, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 0, 18)).addBox(-4.0f, -4.0f, -3.0f, 1, 3, 1);
		head7.setRotationPoint(0.0f, 0.0f, 2.0f);
		head7.setTextureSize(64, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 13, 1)).addBox(-3.0f, -7.0f, -3.0f, 2, 2, 1);
		head8.setRotationPoint(0.0f, 0.0f, 2.0f);
		head8.setTextureSize(64, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 13, 1)).addBox(1.0f, -7.0f, -3.0f, 2, 2, 1);
		head9.setRotationPoint(0.0f, 0.0f, 2.0f);
		head9.setTextureSize(64, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 1, 24)).addBox(-1.0f, 2.0f, -3.0f, 2, 2, 1);
		body2.setRotationPoint(0.0f, 0.0f, 2.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 20, 0)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 2);
		body3.setRotationPoint(0.0f, 0.0f, 2.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 7, 21)).addBox(-1.5f, 9.0f, -3.0f, 3, 1, 1);
		body4.setRotationPoint(0.0f, 0.0f, 2.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 7, 18)).addBox(-3.5f, 9.5f, -3.0f, 2, 1, 1);
		body5.setRotationPoint(0.0f, 0.0f, 2.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 7, 18)).addBox(1.5f, 9.5f, -3.0f, 2, 1, 1);
		body6.setRotationPoint(0.0f, 0.0f, 2.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(rightLeg2 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 2);
		rightLeg2.setRotationPoint(-2.0f, 12.0f, 2.0f);
		rightLeg2.setTextureSize(64, 64);
		rightLeg2.mirror = true;
		setRotation(rightLeg2, 0.0f, 0.0f, 0.0f);
		(leftLeg2 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 2);
		leftLeg2.setRotationPoint(2.0f, 12.0f, 2.0f);
		leftLeg2.setTextureSize(64, 64);
		leftLeg2.mirror = true;
		setRotation(leftLeg2, 0.0f, 0.0f, 0.0f);
		(rightArm3 = new ModelRenderer(this, 40, 0)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 2);
		rightArm3.setRotationPoint(-5.0f, 2.0f, 2.0f);
		rightArm3.setTextureSize(64, 64);
		rightArm3.mirror = true;
		setRotation(rightArm3, 0.0f, 0.0f, 0.0f);
		(leftArm3 = new ModelRenderer(this, 40, 0)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 2);
		leftArm3.setRotationPoint(5.0f, 2.0f, 2.0f);
		leftArm3.setTextureSize(64, 64);
		leftArm3.mirror = true;
		setRotation(leftArm3, 0.0f, 0.0f, 0.0f);
		(rightArm4 = new ModelRenderer(this, 54, 0)).addBox(-2.0f, 8.0f, -3.0f, 2, 1, 1);
		rightArm4.setRotationPoint(-5.0f, 2.0f, 2.0f);
		rightArm4.setTextureSize(64, 64);
		rightArm4.mirror = true;
		setRotation(rightArm4, 0.0f, 0.0f, 0.0f);
		(leftArm4 = new ModelRenderer(this, 54, 0)).addBox(0.0f, 8.0f, -3.0f, 2, 1, 1);
		leftArm4.setRotationPoint(5.0f, 2.0f, 2.0f);
		leftArm4.setTextureSize(64, 64);
		leftArm4.mirror = true;
		setRotation(leftArm4, 0.0f, 0.0f, 0.0f);
		(rightLeg5 = new ModelRenderer(this, 0, 28)).addBox(-1.5f, 8.0f, -3.0f, 3, 1, 1);
		rightLeg5.setRotationPoint(-2.0f, 12.0f, 2.0f);
		rightLeg5.setTextureSize(64, 64);
		rightLeg5.mirror = true;
		setRotation(rightLeg5, 0.0f, 0.0f, 0.0f);
		(leftLeg5 = new ModelRenderer(this, 0, 28)).addBox(-1.5f, 8.0f, -3.0f, 3, 1, 1);
		leftLeg5.setRotationPoint(2.0f, 12.0f, 2.0f);
		leftLeg5.setTextureSize(64, 64);
		leftLeg5.mirror = true;
		setRotation(leftLeg5, 0.0f, 0.0f, 0.0f);
		(rightLeg6 = new ModelRenderer(this, 9, 25)).addBox(-1.5f, 0.0f, -3.0f, 1, 2, 1);
		rightLeg6.setRotationPoint(-2.0f, 12.0f, 2.0f);
		rightLeg6.setTextureSize(64, 64);
		rightLeg6.mirror = true;
		setRotation(rightLeg6, 0.0f, 0.0f, 0.0f);
		(leftLeg6 = new ModelRenderer(this, 9, 25)).addBox(-1.5f, 0.0f, -3.0f, 1, 2, 1);
		leftLeg6.setRotationPoint(2.0f, 12.0f, 2.0f);
		leftLeg6.setTextureSize(64, 64);
		leftLeg6.mirror = true;
		setRotation(leftLeg6, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 13, 6)).addBox(1.0f, -9.0f, -3.0f, 2, 1, 1);
		head10.setRotationPoint(0.0f, 0.0f, 2.0f);
		head10.setTextureSize(64, 64);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 13, 6)).addBox(-3.0f, -9.0f, -3.0f, 2, 1, 1);
		head11.setRotationPoint(0.0f, 0.0f, 2.0f);
		head11.setTextureSize(64, 64);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 2, 15)).addBox(-3.0f, -2.0f, -3.0f, 1, 1, 1);
		head12.setRotationPoint(0.0f, 0.0f, 2.0f);
		head12.setTextureSize(64, 64);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 2, 15)).addBox(-3.0f, -3.5f, -3.0f, 1, 1, 1);
		head13.setRotationPoint(0.0f, 0.0f, 2.0f);
		head13.setTextureSize(64, 64);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 2, 15)).addBox(-2.0f, -1.75f, -3.0f, 1, 1, 1);
		head14.setRotationPoint(0.0f, 0.0f, 2.0f);
		head14.setTextureSize(64, 64);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 2, 15)).addBox(-2.0f, -3.25f, -3.0f, 1, 1, 1);
		head15.setRotationPoint(0.0f, 0.0f, 2.0f);
		head15.setTextureSize(64, 64);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		(head16 = new ModelRenderer(this, 2, 15)).addBox(2.0f, -3.5f, -3.0f, 1, 1, 1);
		head16.setRotationPoint(0.0f, 0.0f, 2.0f);
		head16.setTextureSize(64, 64);
		head16.mirror = true;
		setRotation(head16, 0.0f, 0.0f, 0.0f);
		(head17 = new ModelRenderer(this, 2, 15)).addBox(2.0f, -2.0f, -3.0f, 1, 1, 1);
		head17.setRotationPoint(0.0f, 0.0f, 2.0f);
		head17.setTextureSize(64, 64);
		head17.mirror = true;
		setRotation(head17, 0.0f, 0.0f, 0.0f);
		(head18 = new ModelRenderer(this, 2, 15)).addBox(1.0f, -3.25f, -3.0f, 1, 1, 1);
		head18.setRotationPoint(0.0f, 0.0f, 2.0f);
		head18.setTextureSize(64, 64);
		head18.mirror = true;
		setRotation(head18, 0.0f, 0.0f, 0.0f);
		(head19 = new ModelRenderer(this, 2, 15)).addBox(1.0f, -1.75f, -3.0f, 1, 1, 1);
		head19.setRotationPoint(0.0f, 0.0f, 2.0f);
		head19.setTextureSize(64, 64);
		head19.mirror = true;
		setRotation(head19, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.rotateAngleY = netHeadYaw / 57.295776f;
		head.rotateAngleX = headPitch / 54.11268f;
		head2.rotateAngleY = netHeadYaw / 57.295776f;
		head2.rotateAngleX = headPitch / 54.11268f;
		head3.rotateAngleY = netHeadYaw / 57.295776f;
		head3.rotateAngleX = headPitch / 54.11268f;
		head4.rotateAngleY = netHeadYaw / 57.295776f;
		head4.rotateAngleX = headPitch / 54.11268f;
		head5.rotateAngleY = netHeadYaw / 57.295776f;
		head5.rotateAngleX = headPitch / 54.11268f;
		head6.rotateAngleY = netHeadYaw / 57.295776f;
		head6.rotateAngleX = headPitch / 54.11268f;
		head7.rotateAngleY = netHeadYaw / 57.295776f;
		head7.rotateAngleX = headPitch / 54.11268f;
		head8.rotateAngleY = netHeadYaw / 57.295776f;
		head8.rotateAngleX = headPitch / 54.11268f;
		head9.rotateAngleY = netHeadYaw / 57.295776f;
		head9.rotateAngleX = headPitch / 54.11268f;
		head10.rotateAngleY = netHeadYaw / 57.295776f;
		head10.rotateAngleX = headPitch / 54.11268f;
		head11.rotateAngleY = netHeadYaw / 57.295776f;
		head11.rotateAngleX = headPitch / 54.11268f;
		head12.rotateAngleY = netHeadYaw / 57.295776f;
		head12.rotateAngleX = headPitch / 54.11268f;
		head13.rotateAngleY = netHeadYaw / 57.295776f;
		head13.rotateAngleX = headPitch / 54.11268f;
		head14.rotateAngleY = netHeadYaw / 57.295776f;
		head14.rotateAngleX = headPitch / 54.11268f;
		head15.rotateAngleY = netHeadYaw / 57.295776f;
		head15.rotateAngleX = headPitch / 54.11268f;
		head16.rotateAngleY = netHeadYaw / 57.295776f;
		head16.rotateAngleX = headPitch / 54.11268f;
		head17.rotateAngleY = netHeadYaw / 57.295776f;
		head17.rotateAngleX = headPitch / 54.11268f;
		head18.rotateAngleY = netHeadYaw / 57.295776f;
		head18.rotateAngleX = headPitch / 54.11268f;
		head19.rotateAngleY = netHeadYaw / 57.295776f;
		head19.rotateAngleX = headPitch / 54.11268f;
		rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		rightArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm3.rotateAngleZ = 0.0f;
		rightArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm4.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		leftArm3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm3.rotateAngleZ = 0.0f;
		leftArm4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm4.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg.rotateAngleY = 0.0f;
		rightLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg2.rotateAngleY = 0.0f;
		rightLeg5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg5.rotateAngleY = 0.0f;
		rightLeg6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg6.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
