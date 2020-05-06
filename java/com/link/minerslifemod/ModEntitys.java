package com.link.minerslifemod;

import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntitys
{

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MinersLifeMod.MODID);

	//public static final String MODDED_MOB_NAME = "modded_mob";
	//public static final RegistryObject<EntityType<ModdedMobEntity>> Modded_Mob = ENTITY_TYPES.register(Modded_Mob_NAME, () EntityType.Builder.<WildBoarEntity>create(WildBoarEntity::new, EntityClassification.CREATURE).size(EntityType.PIG.getWidth(), EntityType.PIG.getHeight()).build(new ResourceLocation(ExampleMod.MODID, WILD_BOAR_NAME).toString()));

}