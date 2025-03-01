package net.tslat.aoa3.content.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.tslat.aoa3.common.registration.AoAEnchantments;
import net.tslat.aoa3.content.item.weapon.staff.BaseStaff;

public class ArchmageEnchantment extends Enchantment {
	public ArchmageEnchantment() {
		super(Enchantment.Rarity.VERY_RARE, AoAEnchantments.STAFF, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
	}

	public boolean canEnchant(ItemStack stack) {
		Item item = stack.getItem();

		return item instanceof BaseStaff;
	}

	public int getMaxLevel() {
		return 3;
	}

	@Override
	public int getMinCost(int enchantmentLevel) {
		return 24 + enchantmentLevel * 3;
	}

	@Override
	public int getMaxCost(int enchantmentLevel) {
		return getMinCost(enchantmentLevel) + 50;
	}
}
