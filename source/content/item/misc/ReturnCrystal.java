package net.tslat.aoa3.content.item.misc;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.tslat.aoa3.common.registration.AoADimensions;
import net.tslat.aoa3.common.registration.AoACreativeModeTabs;
import net.tslat.aoa3.common.registration.item.AoAItems;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.PlayerUtil;
import net.tslat.aoa3.util.WorldUtil;

import javax.annotation.Nullable;
import java.util.List;

public class ReturnCrystal extends Item {
	public ReturnCrystal() {
		super(new Item.Properties().tab(AoACreativeModeTabs.MISC_ITEMS));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack stack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 40;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
		if (WorldUtil.isWorld(world, AoADimensions.NOWHERE.key)) {
			player.startUsingItem(hand);

			return InteractionResultHolder.consume(player.getItemInHand(hand));
		}
		else {
			return InteractionResultHolder.pass(player.getItemInHand(hand));
		}
	}

	@Override
	public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
		if (entity instanceof ServerPlayer) {
			if (!WorldUtil.isWorld(world, AoADimensions.NOWHERE.key)) {
				PlayerUtil.notifyPlayer((ServerPlayer)entity, Component.translatable("message.feedback.item.returnCrystal.wrongDim"));

				return stack;
			}

			if (!((ServerPlayer)entity).isCreative())
				stack.shrink(1);

			ItemUtil.clearInventoryOfItems((ServerPlayer)entity, new ItemStack(AoAItems.RETURN_CRYSTAL.get()));
			entity.teleportTo(0, 212, 0);
		}

		return stack;
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.NEUTRAL, 1));
	}
}
