package com.link.minerslifemod.config;

import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper {

	public static void bakeClient(final ModConfig config) {
		MinersLifeModConfig.clientBoolean = ConfigHolder.CLIENT.clientBoolean.get();
		MinersLifeModConfig.clientStringList = ConfigHolder.CLIENT.clientStringList.get();
		MinersLifeModConfig.clientDyeColorEnum = ConfigHolder.CLIENT.clientDyeColorEnum.get();

		MinersLifeModConfig.modelTranslucency = ConfigHolder.CLIENT.modelTranslucency.get();
		MinersLifeModConfig.modelScale = ConfigHolder.CLIENT.modelScale.get().floatValue();
	}

	public static void bakeServer(final ModConfig config) {
		MinersLifeModConfig.serverBoolean = ConfigHolder.SERVER.serverBoolean.get();
		MinersLifeModConfig.serverStringList = ConfigHolder.SERVER.serverStringList.get();
		MinersLifeModConfig.serverEnumDyeColor = ConfigHolder.SERVER.serverEnumDyeColor.get();

		MinersLifeModConfig.electricFurnaceEnergySmeltCostPerTick = ConfigHolder.SERVER.electricFurnaceEnergySmeltCostPerTick.get();
		MinersLifeModConfig.heatCollectorTransferAmountPerTick = ConfigHolder.SERVER.heatCollectorTransferAmountPerTick.get();
	}

}