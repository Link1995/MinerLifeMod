package com.link.minerslifemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.link.minerslifemod.config.ConfigHelper;
import com.link.minerslifemod.config.ConfigHolder;

import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = MinersLifeMod.MODID, bus = EventBusSubscriber.Bus.MOD)

public class ModEventSubscriber
{

	private static final Logger LOGGER = LogManager.getLogger(MinersLifeMod.MODID + " Mod Event Subscriber");


	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		ModBlocks.BLOCKS.getEntries().stream()
				.map(RegistryObject::get)
				// You can do extra filtering here if you don't want some blocks to have an BlockItem automatically registered for them
				// .filter(block -> needsItemBlock(block))
				// Register the BlockItem for the block
				.forEach(block -> {
					final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP);
					final BlockItem blockItem = new BlockItem(block, properties);
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});
		LOGGER.debug("Registered BlockItems");
	}

	@SubscribeEvent
	public static void onModConfigEvent(final ModConfig.ModConfigEvent event) {
		final ModConfig config = event.getConfig();
		if (config.getSpec() == ConfigHolder.CLIENT_SPEC) {
			ConfigHelper.bakeClient(config);
			LOGGER.debug("Baked client config");
		} else if (config.getSpec() == ConfigHolder.SERVER_SPEC) {
			ConfigHelper.bakeServer(config);
			LOGGER.debug("Baked server config");
		}
	}

	/**
	 * Exists to work around a limitation with Spawn Eggs:
	 * Spawn Eggs require an EntityType, but EntityTypes are created AFTER Items.
	 * Therefore it is "impossible" for modded spawn eggs to exist.
	 * To get around this we have our own custom SpawnEggItem, but it needs
	 * some extra setup after Item and EntityType registration completes.
	 */
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void onPostRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		//ModdedSpawnEggItem.initUnaddedEggs();
	}
	
}
