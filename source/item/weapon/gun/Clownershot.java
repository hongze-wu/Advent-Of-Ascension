package net.tslat.aoa3.item.weapon.gun;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEnchantments;
import net.tslat.aoa3.common.registration.AoAItemGroups;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.projectile.gun.BaseBullet;

import net.tslat.aoa3.entity.projectile.gun.LimoniteBulletEntity;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LocaleUtil;

import javax.annotation.Nullable;
import java.util.List;

public class Clownershot extends BaseGun {
	public Clownershot(double dmg, int durability, int firingDelayTicks, float recoil) {
		super(AoAItemGroups.GUNS, dmg, durability, firingDelayTicks, recoil);
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return AoASounds.ITEM_WOOD_RIFLE_FIRE.get();
	}

	public BaseBullet findAndConsumeAmmo(PlayerEntity player, ItemStack gunStack, Hand hand) {
		if (ItemUtil.findInventoryItem(player, new ItemStack(AoAItems.LIMONITE_BULLET.get()), true, 1 + EnchantmentHelper.getEnchantmentLevel(AoAEnchantments.GREED.get(), gunStack))) {
			if (ItemUtil.findInventoryItem(player, new ItemStack(AoAItems.LIMONITE_BULLET.get()), true, 1 + EnchantmentHelper.getEnchantmentLevel(AoAEnchantments.GREED.get(), gunStack))) {
				BaseBullet bullet2 = new LimoniteBulletEntity(player, (BaseGun)gunStack.getItem(), hand, 120, 0);

				bullet2.setPositionAndUpdate(bullet2.getPosX(), bullet2.getPosY() + 0.1f, bullet2.getPosZ());
				player.world.addEntity(bullet2);
			}

			return new LimoniteBulletEntity(player, (BaseGun)gunStack.getItem(), hand, 120, 0);
		}

		return null;
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
		super.addInformation(stack, world, tooltip, flag);
	}
}
