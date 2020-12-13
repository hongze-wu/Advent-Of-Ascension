package net.tslat.aoa3.client.model.entity.mob.greckon;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class SugarfaceModel extends EntityModel<MobEntity> {
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
	private final ModelRenderer head20;
	private final ModelRenderer head21;
	private final ModelRenderer body2;

	public SugarfaceModel() {
		textureWidth = 128;
		textureHeight = 32;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -7.0f, -4.0f, 8, 1, 8);
		head.setRotationPoint(0.0f, -3.0f, 0.0f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 27, 21)).addBox(-12.0f, -2.0f, -3.0f, 24, 5, 6);
		body.setRotationPoint(0.0f, 0.0f, 0.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 109, 5)).addBox(-3.0f, -2.0f, -2.0f, 4, 23, 4);
		rightArm.setRotationPoint(-8.0f, 2.0f, 0.0f);
		rightArm.setTextureSize(128, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 109, 5)).addBox(-1.0f, -2.0f, -2.0f, 4, 23, 4);
		leftArm.setRotationPoint(8.0f, 2.0f, 0.0f);
		leftArm.setTextureSize(128, 32);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 90, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		rightLeg.setRotationPoint(-3.0f, 12.0f, 0.0f);
		rightLeg.setTextureSize(128, 32);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 90, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		leftLeg.setRotationPoint(3.0f, 12.0f, 0.0f);
		leftLeg.setTextureSize(128, 32);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 90, 0)).addBox(3.0f, -6.0f, -4.0f, 1, 6, 8);
		head2.setRotationPoint(0.0f, -3.0f, 0.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 10)).addBox(-3.0f, -3.0f, -2.0f, 1, 1, 1);
		head3.setRotationPoint(0.0f, -3.0f, 0.0f);
		head3.setTextureSize(128, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 34, 11)).addBox(-3.0f, -6.0f, 3.0f, 6, 6, 1);
		head4.setRotationPoint(0.0f, -3.0f, 0.0f);
		head4.setTextureSize(128, 32);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 71, 0)).addBox(-4.0f, -6.0f, -4.0f, 1, 6, 8);
		head5.setRotationPoint(0.0f, -3.0f, 0.0f);
		head5.setTextureSize(128, 32);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 37, 0)).addBox(-4.0f, 0.0f, -4.0f, 8, 1, 8);
		head6.setRotationPoint(0.0f, -3.0f, 0.0f);
		head6.setTextureSize(128, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 0, 10)).addBox(-1.0f, -6.0f, -2.0f, 1, 1, 1);
		head7.setRotationPoint(0.0f, -3.0f, 0.0f);
		head7.setTextureSize(128, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 0, 10)).addBox(0.0f, -1.0f, -2.0f, 1, 1, 1);
		head8.setRotationPoint(0.0f, -3.0f, 0.0f);
		head8.setTextureSize(128, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 0, 10)).addBox(-1.0f, -1.0f, -2.0f, 1, 1, 1);
		head9.setRotationPoint(0.0f, -3.0f, 0.0f);
		head9.setTextureSize(128, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 0, 10)).addBox(0.0f, -6.0f, -2.0f, 1, 1, 1);
		head10.setRotationPoint(0.0f, -3.0f, 0.0f);
		head10.setTextureSize(128, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 0, 10)).addBox(-3.0f, -4.0f, -2.0f, 1, 1, 1);
		head11.setRotationPoint(0.0f, -3.0f, 0.0f);
		head11.setTextureSize(128, 32);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 0, 10)).addBox(2.0f, -3.0f, -2.0f, 1, 1, 1);
		head12.setRotationPoint(0.0f, -3.0f, 0.0f);
		head12.setTextureSize(128, 32);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 0, 10)).addBox(2.0f, -4.0f, -2.0f, 1, 1, 1);
		head13.setRotationPoint(0.0f, -3.0f, 0.0f);
		head13.setTextureSize(128, 32);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 0, 10)).addBox(1.0f, -1.0f, -4.0f, 1, 1, 1);
		head14.setRotationPoint(0.0f, -3.0f, 0.0f);
		head14.setTextureSize(128, 32);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 0, 10)).addBox(-2.0f, -1.0f, -4.0f, 1, 1, 1);
		head15.setRotationPoint(0.0f, -3.0f, 0.0f);
		head15.setTextureSize(128, 32);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		(head16 = new ModelRenderer(this, 0, 10)).addBox(2.0f, -2.0f, -4.0f, 1, 1, 1);
		head16.setRotationPoint(0.0f, -3.0f, 0.0f);
		head16.setTextureSize(128, 32);
		head16.mirror = true;
		setRotation(head16, 0.0f, 0.0f, 0.0f);
		(head17 = new ModelRenderer(this, 0, 10)).addBox(2.0f, -5.0f, -4.0f, 1, 1, 1);
		head17.setRotationPoint(0.0f, -3.0f, 0.0f);
		head17.setTextureSize(128, 32);
		head17.mirror = true;
		setRotation(head17, 0.0f, 0.0f, 0.0f);
		(head18 = new ModelRenderer(this, 0, 10)).addBox(1.0f, -6.0f, -4.0f, 1, 1, 1);
		head18.setRotationPoint(0.0f, -3.0f, 0.0f);
		head18.setTextureSize(128, 32);
		head18.mirror = true;
		setRotation(head18, 0.0f, 0.0f, 0.0f);
		(head19 = new ModelRenderer(this, 0, 10)).addBox(-2.0f, -6.0f, -4.0f, 1, 1, 1);
		head19.setRotationPoint(0.0f, -3.0f, 0.0f);
		head19.setTextureSize(128, 32);
		head19.mirror = true;
		setRotation(head19, 0.0f, 0.0f, 0.0f);
		(head20 = new ModelRenderer(this, 0, 10)).addBox(-3.0f, -5.0f, -4.0f, 1, 1, 1);
		head20.setRotationPoint(0.0f, -3.0f, 0.0f);
		head20.setTextureSize(128, 32);
		head20.mirror = true;
		setRotation(head20, 0.0f, 0.0f, 0.0f);
		(head21 = new ModelRenderer(this, 0, 10)).addBox(-3.0f, -2.0f, -4.0f, 1, 1, 1);
		head21.setRotationPoint(0.0f, -3.0f, 0.0f);
		head21.setTextureSize(128, 32);
		head21.mirror = true;
		setRotation(head21, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 0, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body2.setRotationPoint(0.0f, 0.0f, 0.0f);
		body2.setTextureSize(128, 32);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
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
		head20.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head21.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head2.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head3.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head4.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head5.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head6.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head7.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head8.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head9.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head10.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head11.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head12.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head13.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head14.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head15.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head16.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head17.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head18.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head19.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head20.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		head21.rotateAngleY = netHeadYaw / (float)(180f / Math.PI);
		rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 2.0f * limbSwingAmount * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 2.0f * limbSwingAmount * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
