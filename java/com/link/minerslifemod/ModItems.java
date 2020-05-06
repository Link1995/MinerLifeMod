package com.link.minerslifemod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MinersLifeMod.MODID);

	//ITEMS
	public static final RegistryObject<Item> OBSIDIAN_BRICK = ITEMS.register("obsidian_brick", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

	//ITEM BLOCKS
	public static final RegistryObject<Item> OBSIDIAN_BRICKS = ITEMS.register("obsidian_bricks", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

}
