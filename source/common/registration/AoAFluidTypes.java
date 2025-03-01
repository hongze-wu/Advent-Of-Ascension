package net.tslat.aoa3.common.registration;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.client.IFluidTypeRenderProperties;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.RegistryObject;
import net.tslat.aoa3.content.fluid.ToxicWaste;
import net.tslat.aoa3.util.ColourUtil;

import java.util.function.Consumer;
import java.util.function.Supplier;

public final class AoAFluidTypes {
	public static void init() {}

	private static final ResourceLocation WATER_STILL_TEXTURE = new ResourceLocation("block/water_still");
	private static final ResourceLocation WATER_FLOWING_TEXTURE = new ResourceLocation("block/water_flow");
	private static final ResourceLocation WATER_OVERLAY_TEXTURE = new ResourceLocation("block/water_overlay");
	private static final ResourceLocation UNDERWATER_TEXTURE = new ResourceLocation("textures/misc/underwater.png");

	public static final RegistryObject<FluidType> TOXIC_WASTE = register("toxic_waste", ToxicWaste::new);
	public static final RegistryObject<FluidType> CANDIED_WATER = register("candied_water", () -> new DefaultWaterFluidType(FluidType.Properties.create()
			.canSwim(true)
			.canDrown(true)
			.supportsBoating(true)
			.canHydrate(true)
			.canExtinguish(true)
			.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
			.sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
			.sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)
			.fallDistanceModifier(0)
			.viscosity(1200)
			.density(1200))
			.colour(ColourUtil.RGBA(255, 105, 180, 200)));

	private static <T extends FluidType> RegistryObject<T> register(String id, Supplier<T> fluidType) {
		return AoARegistries.FLUID_TYPES.register(id, fluidType);
	}

	static class DefaultWaterFluidType extends FluidType {
		private int colour;

		public DefaultWaterFluidType(Properties properties) {
			super(properties);
		}

		DefaultWaterFluidType colour(int colour) {
			this.colour = colour;

			return this;
		}

		@Override
		public void initializeClient(Consumer<IFluidTypeRenderProperties> consumer) {
			consumer.accept(new IFluidTypeRenderProperties() {
				@Override
				public ResourceLocation getStillTexture() {
					return WATER_STILL_TEXTURE;
				}

				@Override
				public ResourceLocation getFlowingTexture() {
					return WATER_FLOWING_TEXTURE;
				}

				@Override
				public ResourceLocation getOverlayTexture() {
					return WATER_OVERLAY_TEXTURE;
				}

				@Override
				public ResourceLocation getRenderOverlayTexture(Minecraft mc) {
					return UNDERWATER_TEXTURE;
				}

				@Override
				public int getColorTint() {
					return colour;
				}

				@Override
				public int getColorTint(FluidState state, BlockAndTintGetter getter, BlockPos pos) {
					return getColorTint();
				}
			});
		}
	}
}
