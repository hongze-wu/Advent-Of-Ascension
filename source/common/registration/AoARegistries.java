package net.tslat.aoa3.common.registration;

import com.mojang.serialization.Codec;
import net.minecraft.commands.synchronization.ArgumentTypeInfo;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.sensing.SensorType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.placement.StructurePlacementType;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.*;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.common.registration.block.AoABlockEntities;
import net.tslat.aoa3.common.registration.block.AoABlocks;
import net.tslat.aoa3.common.registration.custom.AoAAbilities;
import net.tslat.aoa3.common.registration.custom.AoAResources;
import net.tslat.aoa3.common.registration.custom.AoASkills;
import net.tslat.aoa3.common.registration.entity.*;
import net.tslat.aoa3.common.registration.item.AoAArmour;
import net.tslat.aoa3.common.registration.item.AoAItems;
import net.tslat.aoa3.common.registration.item.AoATools;
import net.tslat.aoa3.common.registration.item.AoAWeapons;
import net.tslat.aoa3.common.registration.worldgen.AoABiomeModifiers;
import net.tslat.aoa3.common.registration.worldgen.AoAPlacementModifiers;
import net.tslat.aoa3.common.registration.worldgen.AoAStructurePlacements;
import net.tslat.aoa3.common.registration.worldgen.AoAStructureTypes;
import net.tslat.aoa3.player.ability.AoAAbility;
import net.tslat.aoa3.player.resource.AoAResource;
import net.tslat.aoa3.player.skill.AoASkill;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public final class AoARegistries {
	public static final ResourceKey<Registry<AoASkill>> REGISTRY_KEY_SKILLS = ResourceKey.createRegistryKey(AdventOfAscension.id("skills"));
	public static final ResourceKey<Registry<AoAResource>> REGISTRY_KEY_RESOURCES = ResourceKey.createRegistryKey(AdventOfAscension.id("resources"));
	public static final ResourceKey<Registry<AoAAbility>> REGISTRY_KEY_ABILITIES = ResourceKey.createRegistryKey(AdventOfAscension.id("abilities"));

	public static final ForgeRegistryHelper<Block> BLOCKS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.BLOCKS, AoABlocks::init);
	public static final ForgeRegistryHelper<Item> ITEMS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.ITEMS, AoAItems::init, AoAWeapons::init, AoATools::init, AoAArmour::init);
	public static final ForgeRegistryHelper<Fluid> FLUIDS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.FLUIDS);
	public static final ForgeRegistryHelper<EntityType<?>> ENTITIES = new ForgeRegistryHelper<>(ForgeRegistries.Keys.ENTITY_TYPES, AoAMobs::init, AoAAnimals::init, AoANpcs::init, AoAMiscEntities::init, AoAProjectiles::init);
	public static final ForgeRegistryHelper<BlockEntityType<?>> BLOCK_ENTITIES = new ForgeRegistryHelper<>(ForgeRegistries.Keys.BLOCK_ENTITY_TYPES, AoABlockEntities::init);
	public static final ForgeRegistryHelper<SoundEvent> SOUNDS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.SOUND_EVENTS, AoASounds::init);
	public static final ForgeRegistryHelper<Enchantment> ENCHANTMENTS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.ENCHANTMENTS, AoAEnchantments::init);
	public static final ForgeRegistryHelper<ParticleType<?>> PARTICLES = new ForgeRegistryHelper<>(ForgeRegistries.Keys.PARTICLE_TYPES, AoAParticleTypes::init);
	public static final ForgeRegistryHelper<MenuType<?>> MENUS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.CONTAINER_TYPES, AoAContainers::init);
	public static final ForgeRegistryHelper<RecipeSerializer<?>> RECIPE_SERIALIZERS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.RECIPE_SERIALIZERS, AoARecipes::init);
	public static final ForgeRegistryHelper<GlobalLootModifierSerializer<?>> LOOT_MODIFIERS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, AoALootModifiers::init);
	public static final ForgeRegistryHelper<Attribute> ENTITY_ATTRIBUTES = new ForgeRegistryHelper<>(ForgeRegistries.Keys.ATTRIBUTES, AoAAttributes::init);
	public static final ForgeRegistryHelper<VillagerProfession> VILLAGER_PROFESSIONS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.VILLAGER_PROFESSIONS, AoAProfessions::init);
	public static final ForgeRegistryHelper<SensorType<?>> BRAIN_SENSORS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.SENSOR_TYPES, AoABrainSensors::init);
	public static final ForgeRegistryHelper<MemoryModuleType<?>> BRAIN_MEMORIES = new ForgeRegistryHelper<>(ForgeRegistries.Keys.MEMORY_MODULE_TYPES, AoABrainMemories::init);
	public static final ForgeRegistryHelper<BannerPattern> BANNER_PATTERNS = new ForgeRegistryHelper<>(Registry.BANNER_PATTERN_REGISTRY, AoABannerPatterns::init);
	public static final ForgeRegistryHelper<FluidType> FLUID_TYPES = new ForgeRegistryHelper<>(ForgeRegistries.Keys.FLUID_TYPES, AoAFluidTypes::init);
	public static final ForgeRegistryHelper<MobEffect> ENTITY_EFFECTS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.MOB_EFFECTS, AoAEntityEffects::init);

	public static final VanillaRegistryHelper<LootItemFunctionType> LOOT_FUNCTIONS = new VanillaRegistryHelper<>(Registry.LOOT_FUNCTION_REGISTRY, AoALootOperations.LootFunctions::init);
	public static final VanillaRegistryHelper<LootItemConditionType> LOOT_CONDITIONS = new VanillaRegistryHelper<>(Registry.LOOT_ITEM_REGISTRY, AoALootOperations.LootConditions::init);
	public static final VanillaRegistryHelper<RecipeType<?>> RECIPE_TYPES = new VanillaRegistryHelper<>(Registry.RECIPE_TYPE_REGISTRY, AoARecipes::init);
	public static final VanillaRegistryHelper<ArgumentTypeInfo<?, ?>> ARGUMENT_TYPES = new VanillaRegistryHelper<>(Registry.COMMAND_ARGUMENT_TYPE_REGISTRY, AoAArgumentTypes::init);

	public static final ForgeRegistryHelper<Feature<?>> FEATURES = new ForgeRegistryHelper<>(ForgeRegistries.Keys.FEATURES, () -> {});
	public static final VanillaRegistryHelper<StructureType<?>> STRUCTURE_TYPES = new VanillaRegistryHelper<>(Registry.STRUCTURE_TYPE_REGISTRY, AoAStructureTypes::init);
	public static final VanillaRegistryHelper<PlacementModifierType<?>> PLACEMENT_MODIFIERS = new VanillaRegistryHelper<>(Registry.PLACEMENT_MODIFIER_REGISTRY, AoAPlacementModifiers::init);
	public static final ForgeRegistryHelper<Codec<? extends BiomeModifier>> BIOME_MODIFIERS = new ForgeRegistryHelper<>(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, AoABiomeModifiers::init);
	public static final VanillaRegistryHelper<StructurePlacementType<?>> STRUCTURE_PLACEMENTS = new VanillaRegistryHelper<>(Registry.STRUCTURE_PLACEMENT_TYPE_REGISTRY, AoAStructurePlacements::init);
	public static final VanillaRegistryHelper<Codec<? extends ChunkGenerator>> CHUNK_GENERATORS = new VanillaRegistryHelper<>(Registry.CHUNK_GENERATOR_REGISTRY, AoAChunkGenerators::init);

	public static final ForgeRegistryHelper<AoASkill> AOA_SKILLS = new ForgeRegistryHelper<AoASkill>(REGISTRY_KEY_SKILLS, AoASkills::init);
	public static final ForgeRegistryHelper<AoAResource> AOA_RESOURCES = new ForgeRegistryHelper<AoAResource>(REGISTRY_KEY_RESOURCES, AoAResources::init);
	public static final ForgeRegistryHelper<AoAAbility> AOA_ABILITIES = new ForgeRegistryHelper<AoAAbility>(REGISTRY_KEY_ABILITIES, AoAAbilities::init);

	public static void init() {
		BLOCKS.doRegistrations();
		ITEMS.doRegistrations();
		FLUIDS.doRegistrations();
		ENTITIES.doRegistrations();
		BLOCK_ENTITIES.doRegistrations();
		SOUNDS.doRegistrations();
		ENCHANTMENTS.doRegistrations();
		PARTICLES.doRegistrations();
		MENUS.doRegistrations();
		RECIPE_SERIALIZERS.doRegistrations();
		LOOT_MODIFIERS.doRegistrations();
		ENTITY_ATTRIBUTES.doRegistrations();
		VILLAGER_PROFESSIONS.doRegistrations();
		BRAIN_SENSORS.doRegistrations();
		BRAIN_MEMORIES.doRegistrations();
		ENTITY_EFFECTS.doRegistrations();

		LOOT_FUNCTIONS.doRegistrations();
		LOOT_CONDITIONS.doRegistrations();
		RECIPE_TYPES.doRegistrations();
		ARGUMENT_TYPES.doRegistrations();

		FEATURES.doRegistrations();
		STRUCTURE_TYPES.doRegistrations();
		PLACEMENT_MODIFIERS.doRegistrations();
		BIOME_MODIFIERS.doRegistrations();
		STRUCTURE_PLACEMENTS.doRegistrations();
		CHUNK_GENERATORS.doRegistrations();

		AOA_SKILLS.doRegistrations();
		AOA_RESOURCES.doRegistrations();
		AOA_ABILITIES.doRegistrations();
	}

	public interface RegistryHelper<T> {
		DeferredRegister<T> deferredRegister();
		<I extends T> RegistryObject<I> register(String id, Supplier<? extends I> object);
		Set<ResourceLocation> getAllIds();
		Collection<T> getAllRegisteredObjects();
		List<RegistryObject<T>> getAllAoARegisteredObjects();
		T getEntry(ResourceLocation id);
		void doRegistrations();
		ResourceLocation getId(T object);
	}

	public record ForgeRegistryHelper<T>(Lazy<ForgeRegistry<T>> forgeRegistry, DeferredRegister<T> deferredRegister, Runnable registrationTasks) implements RegistryHelper<T> {
		private ForgeRegistryHelper(ResourceKey<Registry<T>> registryKey, Runnable... registrations) {
			this(Lazy.of(() -> RegistryManager.ACTIVE.getRegistry(registryKey)), DeferredRegister.<T>create(registryKey, AdventOfAscension.MOD_ID), () -> Arrays.asList(registrations).forEach(Runnable::run));

			deferredRegister().register(AdventOfAscension.modEventBus);
		}

		private ForgeRegistryHelper(ResourceKey<Registry<T>> registryKey, Supplier<List<Class<?>>> staticInitClasses) {
			this(Lazy.of(() -> RegistryManager.ACTIVE.getRegistry(registryKey)), DeferredRegister.<T>create(registryKey, AdventOfAscension.MOD_ID), staticInitClasses::get);

			deferredRegister().register(AdventOfAscension.modEventBus);
		}

		@Override
		public void doRegistrations() {
			registrationTasks().run();
		}

		public <I extends T> RegistryObject<I> register(String id, Supplier<? extends I> object) {
			return deferredRegister().register(id, object);
		}

		@Override
		public Set<ResourceLocation> getAllIds() {
			return forgeRegistry().get().getKeys();
		}

		@Override
		public Collection<T> getAllRegisteredObjects() {
			return forgeRegistry().get().getValues();
		}

		@Override
		public List<RegistryObject<T>> getAllAoARegisteredObjects() {
			return deferredRegister().getEntries().stream().filter(entry -> entry.getId().getNamespace().equals(AdventOfAscension.MOD_ID)).toList();
		}

		@Override
		public T getEntry(ResourceLocation id) {
			return forgeRegistry().get().getValue(id);
		}

		@Override
		public ResourceLocation getId(T object) {
			return forgeRegistry().get().getKey(object);
		}
	}

	public record VanillaRegistryHelper<T>(Lazy<Registry<T>> registry, DeferredRegister<T> deferredRegister, Runnable registrationTasks) implements RegistryHelper<T> {
		private VanillaRegistryHelper(ResourceKey<Registry<T>> registryKey, Runnable... registrations) {
			this(Lazy.of(() -> (Registry<T>)Registry.REGISTRY.get(registryKey.location())), DeferredRegister.<T>create(registryKey, AdventOfAscension.MOD_ID), () -> Arrays.asList(registrations).forEach(Runnable::run));

			deferredRegister().register(AdventOfAscension.modEventBus);
		}

		private VanillaRegistryHelper(ResourceKey<Registry<T>> registryKey, Supplier<List<Class<?>>> staticInitClasses) {
			this(Lazy.of(() -> (Registry<T>)Registry.REGISTRY.get(registryKey.location())), DeferredRegister.<T>create(registryKey, AdventOfAscension.MOD_ID), staticInitClasses::get);

			deferredRegister().register(AdventOfAscension.modEventBus);
		}

		@Override
		public void doRegistrations() {
			registrationTasks().run();
		}

		public <I extends T> RegistryObject<I> register(String id, Supplier<? extends I> object) {
			return deferredRegister().register(id, object);
		}

		@Override
		public Set<ResourceLocation> getAllIds() {
			return registry().get().keySet();
		}

		@Override
		public Collection<T> getAllRegisteredObjects() {
			return registry().get().stream().toList();
		}

		@Override
		public List<RegistryObject<T>> getAllAoARegisteredObjects() {
			return deferredRegister().getEntries().stream().filter(entry -> entry.getId().getNamespace().equals(AdventOfAscension.MOD_ID)).toList();
		}

		@Override
		public T getEntry(ResourceLocation id) {
			return registry().get().get(id);
		}

		@Override
		public ResourceLocation getId(T object) {
			return registry().get().getKey(object);
		}
	}
}
