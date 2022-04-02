package net.tslat.aoa3.common.registration;

import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.sensing.SensorType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.common.registration.custom.AoAAbilities;
import net.tslat.aoa3.common.registration.custom.AoAResources;
import net.tslat.aoa3.common.registration.custom.AoASkills;
import net.tslat.aoa3.common.registration.entity.*;
import net.tslat.aoa3.common.registration.item.AoAArmour;
import net.tslat.aoa3.common.registration.item.AoAItems;
import net.tslat.aoa3.common.registration.item.AoATools;
import net.tslat.aoa3.common.registration.item.AoAWeapons;
import net.tslat.aoa3.player.ability.AoAAbility;
import net.tslat.aoa3.player.resource.AoAResource;
import net.tslat.aoa3.player.skill.AoASkill;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public final class AoARegistries {
	public static final ActionableDeferredRegister<Block> BLOCKS = new ActionableDeferredRegister<>(() -> ForgeRegistries.BLOCKS, AoABlocks::init);
	public static final ActionableDeferredRegister<Item> ITEMS = new ActionableDeferredRegister<>(() -> ForgeRegistries.ITEMS, AoAItems::init, AoAWeapons::init, AoATools::init, AoAArmour::init);
	public static final ActionableDeferredRegister<Fluid> FLUIDS = new ActionableDeferredRegister<>(() -> ForgeRegistries.FLUIDS);
	public static final ActionableDeferredRegister<EntityType<?>> ENTITIES = new ActionableDeferredRegister<>(() -> ForgeRegistries.ENTITIES, AoAMobs::init, AoAAnimals::init, AoANpcs::init, AoAMiscEntities::init, AoAProjectiles::init);
	public static final ActionableDeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = new ActionableDeferredRegister<>(() -> ForgeRegistries.BLOCK_ENTITIES, AoABlockEntities::init);
	public static final ActionableDeferredRegister<SoundEvent> SOUNDS = new ActionableDeferredRegister<>(() -> ForgeRegistries.SOUND_EVENTS, AoASounds::init);
	public static final ActionableDeferredRegister<Enchantment> ENCHANTMENTS = new ActionableDeferredRegister<>(() -> ForgeRegistries.ENCHANTMENTS, AoAEnchantments::init);
	public static final ActionableDeferredRegister<ParticleType<?>> PARTICLES = new ActionableDeferredRegister<>(() -> ForgeRegistries.PARTICLE_TYPES, AoAParticleTypes::init);
	public static final ActionableDeferredRegister<MenuType<?>> MENUS = new ActionableDeferredRegister<>(() -> ForgeRegistries.CONTAINERS, AoAContainers::init);
	public static final ActionableDeferredRegister<RecipeSerializer<?>> RECIPES = new ActionableDeferredRegister<>(() -> ForgeRegistries.RECIPE_SERIALIZERS/*, AoARecipes::init*/);
	public static final ActionableDeferredRegister<GlobalLootModifierSerializer<?>> LOOT_MODIFIERS = new ActionableDeferredRegister<>(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, AoALootModifiers::init);
	public static final ActionableDeferredRegister<Attribute> ENTITY_ATTRIBUTES = new ActionableDeferredRegister<>(() -> ForgeRegistries.ATTRIBUTES, AoAAttributes::init);
	public static final ActionableDeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = new ActionableDeferredRegister<>(() -> ForgeRegistries.PROFESSIONS, AoAProfessions::init);
	public static final ActionableDeferredRegister<SensorType<?>> BRAIN_SENSORS = new ActionableDeferredRegister<>(() -> ForgeRegistries.SENSOR_TYPES, AoABrainSensors::init);
	public static final ActionableDeferredRegister<MemoryModuleType<?>> BRAIN_MEMORIES = new ActionableDeferredRegister<>(() -> ForgeRegistries.MEMORY_MODULE_TYPES, AoABrainMemories::init);

	public static final ActionableDeferredRegister<AoASkill> AOA_SKILLS = new ActionableDeferredRegister<AoASkill>(ResourceKey.createRegistryKey(AdventOfAscension.id("aoaskills")), AoASkills::init);
	public static final ActionableDeferredRegister<AoAResource> AOA_RESOURCES = new ActionableDeferredRegister<AoAResource>(ResourceKey.createRegistryKey(AdventOfAscension.id("aoaresources")), AoAResources::init);
	public static final ActionableDeferredRegister<AoAAbility> AOA_ABILITIES = new ActionableDeferredRegister<AoAAbility>(ResourceKey.createRegistryKey(AdventOfAscension.id("aoaabilities")), AoAAbilities::init);

	public static void init(IEventBus modEventBus) {
		BLOCKS.setup(modEventBus);//.registry.register(modEventBus);
		ITEMS.setup(modEventBus);//.registry.register(modEventBus);
		FLUIDS.setup(modEventBus);//.registry.register(modEventBus);
		ENTITIES.setup(modEventBus);//.registry.register(modEventBus);
		BLOCK_ENTITIES.setup(modEventBus);//.registry.register(modEventBus);
		SOUNDS.setup(modEventBus);//.registry.register(modEventBus);
		ENCHANTMENTS.setup(modEventBus);//.registry.register(modEventBus);
		PARTICLES.setup(modEventBus);//.registry.register(modEventBus);
		MENUS.setup(modEventBus);//.registry.register(modEventBus);
		RECIPES.setup(modEventBus);//.registry.register(modEventBus);
		LOOT_MODIFIERS.setup(modEventBus);//.registry.register(modEventBus);
		ENTITY_ATTRIBUTES.setup(modEventBus);//.registry.register(modEventBus);
		VILLAGER_PROFESSIONS.setup(modEventBus);//.registry.register(modEventBus);
		BRAIN_SENSORS.setup(modEventBus);//.registry.register(modEventBus);
		BRAIN_MEMORIES.setup(modEventBus);//.registry.register(modEventBus);
		AOA_SKILLS.setup(modEventBus);//.registry.register(modEventBus);
		AOA_RESOURCES.setup(modEventBus);//.registry.register(modEventBus);
		AOA_ABILITIES.setup(modEventBus);//.registry.register(modEventBus);

		modEventBus.addGenericListener(Block.class, EventPriority.HIGHEST, true, RegistryEvent.Register.class, AoARegistries::doVanillaRegistryLinkedRegistrations);
	}

	private static void doVanillaRegistryLinkedRegistrations(final RegistryEvent.Register<Block> registry) {
		//BLOCKS.registerContents.run();
		//ITEMS.registerContents.run();
		//FLUIDS.registerContents.run();
		//ENTITIES.registerContents.run();
		//BLOCK_ENTITIES.registerContents.run();
		//SOUNDS.registerContents.run();
		//ENCHANTMENTS.registerContents.run();
		//PARTICLES.registerContents.run();
		//MENUS.registerContents.run();
		//RECIPES.registerContents.run();
		//LOOT_MODIFIERS.registerContents.run();
		//ENTITY_ATTRIBUTES.registerContents.run();
		//VILLAGER_PROFESSIONS.registerContents.run();
		//BRAIN_SENSORS.registerContents.run();
		//BRAIN_MEMORIES.registerContents.run();
		//AOA_SKILLS.registerContents.run();
		//AOA_RESOURCES.registerContents.run();
		//AOA_ABILITIES.registerContents.run();

		AoALootOperations.init();
		AoARecipes.init();
	}

	public record ActionableDeferredRegister<T extends IForgeRegistryEntry<T>>(Supplier<IForgeRegistry<T>> forgeRegistry, Lazy<DeferredRegister<T>> registry, Runnable registerContents) {
		private ActionableDeferredRegister(ResourceKey<Registry<T>> registryId, Runnable... registerContents) {
			this(Lazy.of(() -> RegistryManager.ACTIVE.getRegistry(registryId)), Lazy.of(() -> DeferredRegister.<T>create(registryId, AdventOfAscension.MOD_ID)), () -> Arrays.asList(registerContents).forEach(Runnable::run));
		}

		private ActionableDeferredRegister(Supplier<IForgeRegistry<T>> baseRegistry, Runnable... registerContents) {
			this(Lazy.of(baseRegistry), Lazy.of(() -> DeferredRegister.create(baseRegistry.get(), AdventOfAscension.MOD_ID)), () -> Arrays.asList(registerContents).forEach(Runnable::run));
		}

		public <I extends T> RegistryObject<I> register(String registryName, Supplier<? extends I> object) {
			return registry().get().register(registryName, object);
		}

		public Set<ResourceLocation> getAllIds() {
			return forgeRegistry().get().getKeys();
		}

		public Collection<T> getAllRegisteredObjects() {
			return forgeRegistry().get().getValues();
		}

		public List<RegistryObject<T>> getAllAoARegisteredObjects() {
			return registry().get().getEntries().stream().filter(entry -> entry.getId().getNamespace().equals(AdventOfAscension.MOD_ID)).toList();
		}

		@Nullable
		public T getObject(ResourceLocation id) {
			return forgeRegistry().get().getValue(id);
		}

		private void setup(IEventBus modEventBus) {
			registry.get().register(modEventBus);
			registerContents.run();
		}
	}
}