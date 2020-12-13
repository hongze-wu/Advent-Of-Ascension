package net.tslat.aoa3.block.functional.utility;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.tslat.aoa3.common.container.WhitewashingTableContainer;
import net.tslat.aoa3.util.BlockUtil;

public class WhitewashingTable extends Block {
	public WhitewashingTable() {
		super(BlockUtil.generateBlockProperties(Material.ROCK, MaterialColor.WHITE_TERRACOTTA, 5, 10, SoundType.STONE));
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
		if (player instanceof ServerPlayerEntity)
			WhitewashingTableContainer.openContainer((ServerPlayerEntity)player, pos);

		return ActionResultType.SUCCESS;
	}
}
