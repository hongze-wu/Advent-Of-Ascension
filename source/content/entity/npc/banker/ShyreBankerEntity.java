package net.tslat.aoa3.content.entity.npc.banker;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.tslat.aoa3.common.container.BankerContainer;
import net.tslat.aoa3.common.registration.AoADimensions;
import net.tslat.aoa3.util.WorldUtil;

import javax.annotation.Nullable;

public class ShyreBankerEntity extends AoABanker {
	public ShyreBankerEntity(EntityType<? extends PathfinderMob> entityType, Level world) {
		super(entityType, world);
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return !WorldUtil.isWorld(level, AoADimensions.SHYRELANDS.key);
	}

	@Override
	protected void openGui(Player player) {
		NetworkHooks.openGui((ServerPlayer)player, new MenuProvider() {
			@Override
			public Component getDisplayName() {
				return ShyreBankerEntity.this.getDisplayName();
			}

			@Nullable
			@Override
			public AbstractContainerMenu createMenu(int screenId, Inventory inv, Player player) {
				return new BankerContainer(screenId, player.getInventory(), ShyreBankerEntity.this);
			}
		}, buffer -> buffer.writeInt(getId()));
	}
}
