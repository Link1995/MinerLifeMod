package com.link.minerslifemod;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModTileEntitys {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, MinersLifeMod.MODID);

	//public static final RegistryObject<TileEntityType<NewModdedTileEntity>> NEW_MODDED = TILE_ENTITY_TYPES.register("new_modded", ()TileEntityType.Builder.create(NewModelTileEntity::new, ModBlocks.NEW_MODDED.get()).build(null));

}