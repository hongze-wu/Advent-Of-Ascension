package net.tslat.aoa3.common.registration.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;
import net.tslat.aoa3.common.registration.AoAItemGroups;
import net.tslat.aoa3.common.registration.AoARegistries;
import net.tslat.aoa3.content.item.tool.axe.*;
import net.tslat.aoa3.content.item.tool.hoe.DryadsBlessing;
import net.tslat.aoa3.content.item.tool.misc.*;
import net.tslat.aoa3.content.item.tool.pickaxe.*;
import net.tslat.aoa3.content.item.tool.shovel.*;
import net.tslat.aoa3.util.ItemUtil;

import java.util.function.Supplier;

public final class AoATools {
	public static void init() {}

	public static final RegistryObject<BasePickaxe> AMETHYST_PICKAXE = registerTool("amethyst_pickaxe", () -> new BasePickaxe(ItemUtil.customItemTier(1200, 8.0f, 4.5f, 3, 14, AoAItems.AMETHYST, BlockTags.MINEABLE_WITH_PICKAXE)));
	public static final RegistryObject<BasePickaxe> EMBERSTONE_PICKAXE = registerTool("emberstone_pickaxe", EmberstonePickaxe::new);
	public static final RegistryObject<BasePickaxe> ENERGISTIC_PICKAXE = registerTool("energistic_pickaxe", EnergisticPickaxe::new);
	public static final RegistryObject<BasePickaxe> GEMCRACKER = registerTool("gemcracker", Gemcracker::new);
	public static final RegistryObject<BasePickaxe> GOOFY_PICKAXE = registerTool("goofy_pickaxe", GoofyPickaxe::new);
	public static final RegistryObject<BasePickaxe> JADE_PICKAXE = registerTool("jade_pickaxe", () -> new BasePickaxe(ItemUtil.customItemTier(650, 7.5f, 4.0f, 3, 11, AoAItems.JADE, BlockTags.MINEABLE_WITH_PICKAXE)));
	public static final RegistryObject<BasePickaxe> LIMONITE_PICKAXE = registerTool("limonite_pickaxe", () -> new BasePickaxe(ItemUtil.customItemTier(350, 5.0f, 2.0f, 2, 3, AoAItems.LIMONITE_INGOT, BlockTags.MINEABLE_WITH_PICKAXE)));
	public static final RegistryObject<BasePickaxe> OCCULT_PICKAXE = registerTool("occult_pickaxe", OccultPickaxe::new);
	public static final RegistryObject<BasePickaxe> ORNAMYTE_PICKAXE = registerTool("ornamyte_pickaxe", OrnamytePickaxe::new);
	public static final RegistryObject<BasePickaxe> PICKMAX = registerTool("pickmax", Pickmax::new);
	public static final RegistryObject<BasePickaxe> ROSITE_PICKAXE = registerTool("rosite_pickaxe", () -> new BasePickaxe(ItemUtil.customItemTier(600, 6.5f, 3.5f, 3, 6, AoAItems.ROSITE_INGOT, BlockTags.MINEABLE_WITH_PICKAXE)));
	public static final RegistryObject<BasePickaxe> SAPPHIRE_PICKAXE = registerTool("sapphire_pickaxe", () -> new BasePickaxe(ItemUtil.customItemTier(2500, 9.0f, 5.0f, 4, 19, AoAItems.SAPPHIRE, BlockTags.MINEABLE_WITH_PICKAXE)));
	public static final RegistryObject<BasePickaxe> SKELETAL_PICKAXE = registerTool("skeletal_pickaxe", SkeletalPickaxe::new);
	public static final RegistryObject<BasePickaxe> SOULSTONE_PICKAXE = registerTool("soulstone_pickaxe", SoulstonePickaxe::new);

	public static final RegistryObject<BaseShovel> AMETHYST_SHOVEL = registerTool("amethyst_shovel", () -> new BaseShovel(ItemUtil.customItemTier(1200, 8.0f, 4.5f, 3, 14, AoAItems.AMETHYST, BlockTags.MINEABLE_WITH_SHOVEL)));
	public static final RegistryObject<BaseShovel> EMBERSTONE_SHOVEL = registerTool("emberstone_shovel", EmberstoneShovel::new);
	public static final RegistryObject<BaseShovel> ENERGISTIC_SHOVEL = registerTool("energistic_shovel", EnergisticShovel::new);
	public static final RegistryObject<BaseShovel> GOOFY_SHOVEL = registerTool("goofy_shovel", GoofyShovel::new);
	public static final RegistryObject<BaseShovel> JADE_SHOVEL = registerTool("jade_shovel", () -> new BaseShovel(ItemUtil.customItemTier(650, 7.5f, 4.0f, 3, 11, AoAItems.JADE, BlockTags.MINEABLE_WITH_SHOVEL)));
	public static final RegistryObject<BaseShovel> LIMONITE_SHOVEL = registerTool("limonite_shovel", () -> new BaseShovel(ItemUtil.customItemTier(350, 5.0f, 2.0f, 2, 3, AoAItems.LIMONITE_INGOT, BlockTags.MINEABLE_WITH_SHOVEL)));
	public static final RegistryObject<BaseShovel> OCCULT_SHOVEL = registerTool("occult_shovel", OccultShovel::new);
	public static final RegistryObject<BaseShovel> ORNAMYTE_SHOVEL = registerTool("ornamyte_shovel", OrnamyteShovel::new);
	public static final RegistryObject<BaseShovel> ROSITE_SHOVEL = registerTool("rosite_shovel", () -> new BaseShovel(ItemUtil.customItemTier(600, 6.5f, 3.5f, 3, 6, AoAItems.ROSITE_INGOT, BlockTags.MINEABLE_WITH_SHOVEL)));
	public static final RegistryObject<BaseShovel> SAPPHIRE_SHOVEL = registerTool("sapphire_shovel", () -> new BaseShovel(ItemUtil.customItemTier(2500, 9.0f, 5.0f, 4, 19, AoAItems.SAPPHIRE, BlockTags.MINEABLE_WITH_SHOVEL)));
	public static final RegistryObject<BaseShovel> SKELETAL_SHOVEL = registerTool("skeletal_shovel", SkeletalShovel::new);
	public static final RegistryObject<BaseShovel> SOULSTONE_SHOVEL = registerTool("soulstone_shovel", SoulstoneShovel::new);

	public static final RegistryObject<BaseAxe> AMETHYST_AXE = registerTool("amethyst_axe", () -> new BaseAxe(ItemUtil.customItemTier(1200, 8.0f, 7f, 3, 14, AoAItems.AMETHYST, BlockTags.MINEABLE_WITH_AXE)));
	public static final RegistryObject<BaseAxe> EMBERSTONE_AXE = registerTool("emberstone_axe", EmberstoneAxe::new);
	public static final RegistryObject<BaseAxe> ENERGISTIC_AXE = registerTool("energistic_axe", EnergisticAxe::new);
	public static final RegistryObject<BaseAxe> GOOFY_AXE = registerTool("goofy_axe", GoofyAxe::new);
	public static final RegistryObject<BaseAxe> JADE_AXE = registerTool("jade_axe", () -> new BaseAxe(ItemUtil.customItemTier(650, 7.5f, 6.5f, 3, 11, AoAItems.JADE, BlockTags.MINEABLE_WITH_AXE)));
	public static final RegistryObject<BaseAxe> LIMONITE_AXE = registerTool("limonite_axe", () -> new BaseAxe(ItemUtil.customItemTier(350, 5.0f, 4.5f, 2, 3, AoAItems.LIMONITE_INGOT, BlockTags.MINEABLE_WITH_AXE)));
	public static final RegistryObject<BaseAxe> OCCULT_AXE = registerTool("occult_axe", OccultAxe::new);
	public static final RegistryObject<BaseAxe> ORNAMYTE_AXE = registerTool("ornamyte_axe", OrnamyteAxe::new);
	public static final RegistryObject<BaseAxe> ROSITE_AXE = registerTool("rosite_axe", () -> new BaseAxe(ItemUtil.customItemTier(600, 6.5f, 6f, 3, 6, AoAItems.ROSITE_INGOT, BlockTags.MINEABLE_WITH_AXE)));
	public static final RegistryObject<BaseAxe> SAPPHIRE_AXE = registerTool("sapphire_axe", () -> new BaseAxe(ItemUtil.customItemTier(2500, 9.0f, 10f, 4, 19, AoAItems.SAPPHIRE, BlockTags.MINEABLE_WITH_AXE)));
	public static final RegistryObject<BaseAxe> SKELETAL_AXE = registerTool("skeletal_axe", SkeletalAxe::new);
	public static final RegistryObject<BaseAxe> SOULSTONE_AXE = registerTool("soulstone_axe", SoulstoneAxe::new);
	public static final RegistryObject<Chainsaw> CHAINSAW = registerTool("chainsaw", Chainsaw::new);

	public static final RegistryObject<DryadsBlessing> DRYADS_BLESSING = registerTool("dryads_blessing", DryadsBlessing::new);

	public static final RegistryObject<Item> HAULING_ROD = registerTool("hauling_rod", () -> new HaulingRod(new Item.Properties().tab(AoAItemGroups.TOOLS).durability(400)));
	public static final RegistryObject<Item> THERMALLY_INSULATED_ROD = registerTool("thermally_insulated_rod", () -> new ThermallyInsulatedRod(new Item.Properties().tab(AoAItemGroups.TOOLS).durability(400)));
	public static final RegistryObject<Item> LIGHT_ROD = registerTool("light_rod", () -> new LightRod(new Item.Properties().tab(AoAItemGroups.TOOLS).durability(160)));
	public static final RegistryObject<Item> GOLDEN_ROD = registerTool("golden_rod", () -> new GoldenRod(new Item.Properties().tab(AoAItemGroups.TOOLS).durability(280).rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> FISHING_CAGE = registerTool("fishing_cage", () -> new FishingCage(new Item.Properties().tab(AoAItemGroups.TOOLS).durability(10)));

	public static final RegistryObject<Item> STONE_BOWL = registerTool("stone_bowl", () -> new InfusionBowl(100, 1, 0));
	public static final RegistryObject<Item> DIAMOND_BOWL = registerTool("diamond_bowl", () -> new InfusionBowl(750, 5, 10));
	public static final RegistryObject<Item> EXP_FLASK = registerTool("exp_flask", ExpFlask::new);

	private static <T extends Item> RegistryObject<T> registerTool(String registryName, Supplier<T> item) {
		return AoARegistries.ITEMS.register(registryName, item);
	}
}