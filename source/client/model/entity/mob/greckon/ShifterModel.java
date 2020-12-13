package net.tslat.aoa3.client.model.entity.mob.greckon;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class ShifterModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
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
	private final ModelRenderer head22;
	private final ModelRenderer head23;
	private final ModelRenderer head24;
	private final ModelRenderer head25;
	private final ModelRenderer head26;
	private final ModelRenderer head27;
	private final ModelRenderer head28;
	private final ModelRenderer body2;
	private final ModelRenderer leg2p2;
	private final ModelRenderer leg1p2;
	private final ModelRenderer leg3p2;
	private final ModelRenderer leg4p2;
	private final ModelRenderer leg2p3;
	private final ModelRenderer leg1p3;
	private final ModelRenderer leg3p3;
	private final ModelRenderer leg4p3;

	public ShifterModel() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 44, 0)).addBox(-4.0f, -4.0f, -12.0f, 8, 2, 2);
		head.setRotationPoint(0.0f, 4.0f, -3.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 37, 28)).addBox(0.0f, 0.0f, 0.0f, 4, 4, 5);
		body.setRotationPoint(-2.0f, 0.0f, -3.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, -0.4363323f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 20, 29)).addBox(0.0f, 8.0f, -4.0f, 1, 4, 2);
		leg1.setRotationPoint(-3.0f, 12.0f, 12.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 20, 29)).addBox(2.0f, 8.0f, -4.0f, 1, 4, 2);
		leg2.setRotationPoint(3.0f, 12.0f, 12.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 20, 29)).addBox(0.0f, 8.0f, -5.0f, 1, 4, 2);
		leg3.setRotationPoint(-3.0f, 12.0f, 1.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 20, 29)).addBox(2.0f, 8.0f, -5.0f, 1, 4, 2);
		leg4.setRotationPoint(3.0f, 12.0f, 1.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 42)).addBox(-6.0f, 1.0f, 2.0f, 1, 1, 5);
		head2.setRotationPoint(0.0f, 4.0f, -3.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, -2.356194f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 8, 10)).addBox(3.0f, -2.0f, -10.0f, 1, 4, 1);
		head3.setRotationPoint(0.0f, 4.0f, -3.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -5.0f, -10.0f, 8, 3, 4);
		head4.setRotationPoint(0.0f, 4.0f, -3.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 0, 56)).addBox(-0.5f, 6.0f, -10.5f, 1, 3, 1);
		head5.setRotationPoint(0.0f, 4.0f, -3.0f);
		head5.setTextureSize(64, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 43, 11)).addBox(-4.0f, 1.0f, -8.0f, 8, 2, 2);
		head6.setRotationPoint(0.0f, 4.0f, -3.0f);
		head6.setTextureSize(64, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 8, 10)).addBox(-4.0f, -2.0f, -10.0f, 1, 4, 1);
		head7.setRotationPoint(0.0f, 4.0f, -3.0f);
		head7.setTextureSize(64, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 8, 10)).addBox(-4.0f, -2.0f, -8.0f, 1, 3, 1);
		head8.setRotationPoint(0.0f, 4.0f, -3.0f);
		head8.setTextureSize(64, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 8, 10)).addBox(3.0f, -2.0f, -8.0f, 1, 3, 1);
		head9.setRotationPoint(0.0f, 4.0f, -3.0f);
		head9.setTextureSize(64, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 0, 12)).addBox(1.0f, -2.0f, -12.0f, 1, 1, 1);
		head10.setRotationPoint(0.0f, 4.0f, -3.0f);
		head10.setTextureSize(64, 64);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 0, 49)).addBox(-1.0f, 3.0f, -11.0f, 2, 3, 2);
		head11.setRotationPoint(0.0f, 4.0f, -3.0f);
		head11.setTextureSize(64, 64);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 18, 18)).addBox(-4.0f, -5.0f, -6.0f, 8, 8, 2);
		head12.setRotationPoint(0.0f, 4.0f, -3.0f);
		head12.setTextureSize(64, 64);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 39, 18)).addBox(-4.0f, -4.0f, -4.0f, 8, 6, 4);
		head13.setRotationPoint(0.0f, 4.0f, -3.0f);
		head13.setTextureSize(64, 64);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 0, 42)).addBox(5.0f, 1.0f, 2.0f, 1, 1, 5);
		head14.setRotationPoint(0.0f, 4.0f, -3.0f);
		head14.setTextureSize(64, 64);
		head14.mirror = true;
		setRotation(head14, -2.356194f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 26, 0)).addBox(-7.0f, -7.0f, -3.0f, 3, 3, 5);
		head15.setRotationPoint(0.0f, 4.0f, -3.0f);
		head15.setTextureSize(64, 64);
		head15.mirror = true;
		setRotation(head15, 0.5235988f, 0.0f, 0.0f);
		(head16 = new ModelRenderer(this, 26, 0)).addBox(4.0f, -7.0f, -3.0f, 3, 3, 5);
		head16.setRotationPoint(0.0f, 4.0f, -3.0f);
		head16.setTextureSize(64, 64);
		head16.mirror = true;
		setRotation(head16, 0.5235988f, 0.0f, 0.0f);
		(head17 = new ModelRenderer(this, 0, 34)).addBox(4.5f, -6.5f, -3.0f, 2, 2, 5);
		head17.setRotationPoint(0.0f, 4.0f, -3.0f);
		head17.setTextureSize(64, 64);
		head17.mirror = true;
		setRotation(head17, -0.1396263f, 0.0f, 0.0f);
		(head18 = new ModelRenderer(this, 0, 34)).addBox(-6.5f, -6.5f, -3.0f, 2, 2, 5);
		head18.setRotationPoint(0.0f, 4.0f, -3.0f);
		head18.setTextureSize(64, 64);
		head18.mirror = true;
		setRotation(head18, -0.1396263f, 0.0f, 0.0f);
		(head19 = new ModelRenderer(this, 0, 34)).addBox(4.5f, 1.5f, -4.0f, 2, 2, 5);
		head19.setRotationPoint(0.0f, 4.0f, -3.0f);
		head19.setTextureSize(64, 64);
		head19.mirror = true;
		setRotation(head19, -1.658063f, 0.0f, 0.0f);
		(head20 = new ModelRenderer(this, 0, 34)).addBox(-6.5f, 1.5f, -4.0f, 2, 2, 5);
		head20.setRotationPoint(0.0f, 4.0f, -3.0f);
		head20.setTextureSize(64, 64);
		head20.mirror = true;
		setRotation(head20, -1.658063f, 0.0f, 0.0f);
		(head21 = new ModelRenderer(this, 16, 11)).addBox(-4.0f, 2.0f, -12.0f, 8, 1, 4);
		head21.setRotationPoint(0.0f, 4.0f, -3.0f);
		head21.setTextureSize(64, 64);
		head21.mirror = true;
		setRotation(head21, 0.0f, 0.0f, 0.0f);
		(head22 = new ModelRenderer(this, 0, 12)).addBox(-4.0f, -2.0f, -12.0f, 1, 1, 1);
		head22.setRotationPoint(0.0f, 4.0f, -3.0f);
		head22.setTextureSize(64, 64);
		head22.mirror = true;
		setRotation(head22, 0.0f, 0.0f, 0.0f);
		(head23 = new ModelRenderer(this, 0, 12)).addBox(-2.0f, -2.0f, -12.0f, 1, 1, 1);
		head23.setRotationPoint(0.0f, 4.0f, -3.0f);
		head23.setTextureSize(64, 64);
		head23.mirror = true;
		setRotation(head23, 0.0f, 0.0f, 0.0f);
		(head24 = new ModelRenderer(this, 0, 12)).addBox(3.0f, -2.0f, -12.0f, 1, 1, 1);
		head24.setRotationPoint(0.0f, 4.0f, -3.0f);
		head24.setTextureSize(64, 64);
		head24.mirror = true;
		setRotation(head24, 0.0f, 0.0f, 0.0f);
		(head25 = new ModelRenderer(this, 0, 12)).addBox(1.0f, 1.0f, -12.0f, 1, 1, 1);
		head25.setRotationPoint(0.0f, 4.0f, -3.0f);
		head25.setTextureSize(64, 64);
		head25.mirror = true;
		setRotation(head25, 0.0f, 0.0f, 0.0f);
		(head26 = new ModelRenderer(this, 0, 12)).addBox(3.0f, 1.0f, -12.0f, 1, 1, 1);
		head26.setRotationPoint(0.0f, 4.0f, -3.0f);
		head26.setTextureSize(64, 64);
		head26.mirror = true;
		setRotation(head26, 0.0f, 0.0f, 0.0f);
		(head27 = new ModelRenderer(this, 0, 12)).addBox(-2.0f, 1.0f, -12.0f, 1, 1, 1);
		head27.setRotationPoint(0.0f, 4.0f, -3.0f);
		head27.setTextureSize(64, 64);
		head27.mirror = true;
		setRotation(head27, 0.0f, 0.0f, 0.0f);
		(head28 = new ModelRenderer(this, 0, 12)).addBox(-4.0f, 1.0f, -12.0f, 1, 1, 1);
		head28.setRotationPoint(0.0f, 4.0f, -3.0f);
		head28.setTextureSize(64, 64);
		head28.mirror = true;
		setRotation(head28, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 18, 38)).addBox(-6.0f, -9.0f, -7.0f, 12, 16, 10);
		body2.setRotationPoint(0.0f, 5.0f, 7.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 4, 12, 4);
		leg2p2.setRotationPoint(3.0f, 12.0f, 12.0f);
		leg2p2.setTextureSize(64, 64);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -2.0f, 4, 12, 4);
		leg1p2.setRotationPoint(-3.0f, 12.0f, 12.0f);
		leg1p2.setTextureSize(64, 64);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 12, 4);
		leg3p2.setRotationPoint(-3.0f, 12.0f, 1.0f);
		leg3p2.setTextureSize(64, 64);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 12, 4);
		leg4p2.setRotationPoint(3.0f, 12.0f, 1.0f);
		leg4p2.setTextureSize(64, 64);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg2p3 = new ModelRenderer(this, 20, 29)).addBox(-1.0f, 8.0f, -4.0f, 1, 4, 2);
		leg2p3.setRotationPoint(3.0f, 12.0f, 12.0f);
		leg2p3.setTextureSize(64, 64);
		leg2p3.mirror = true;
		setRotation(leg2p3, 0.0f, 0.0f, 0.0f);
		(leg1p3 = new ModelRenderer(this, 20, 29)).addBox(-3.0f, 8.0f, -4.0f, 1, 4, 2);
		leg1p3.setRotationPoint(-3.0f, 12.0f, 12.0f);
		leg1p3.setTextureSize(64, 64);
		leg1p3.mirror = true;
		setRotation(leg1p3, 0.0f, 0.0f, 0.0f);
		(leg3p3 = new ModelRenderer(this, 20, 29)).addBox(-3.0f, 8.0f, -5.0f, 1, 4, 2);
		leg3p3.setRotationPoint(-3.0f, 12.0f, 1.0f);
		leg3p3.setTextureSize(64, 64);
		leg3p3.mirror = true;
		setRotation(leg3p3, 0.0f, 0.0f, 0.0f);
		(leg4p3 = new ModelRenderer(this, 20, 29)).addBox(-1.0f, 8.0f, -5.0f, 1, 4, 2);
		leg4p3.setRotationPoint(3.0f, 12.0f, 1.0f);
		leg4p3.setTextureSize(64, 64);
		leg4p3.mirror = true;
		setRotation(leg4p3, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
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
		head22.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head23.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head24.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head25.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head26.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head27.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head28.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3.rotateAngleY = 0.0f;
		leg1p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1p2.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3p2.rotateAngleY = 0.0f;
		leg1p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1p3.rotateAngleY = 0.0f;
		leg3p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3p3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg2p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg2p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
