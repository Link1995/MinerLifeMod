package com.link.minerslifemod;

import net.minecraft.util.Direction;
import net.minecraftforge.energy.EnergyStorage;

public class ModUtil
{
	
	/**
	 * Cache all the directions instead of calling Direction.values()
	 */
	public static final Direction[] DIRECTIONS = Direction.values();

	public static int calcRedstoneFromEnergyStorage(final EnergyStorage energy) {
		if (energy == null)
			return 0;
		return Math.round(energy.getEnergyStored() / ((float) energy.getMaxEnergyStored()) * 15F);
	}

}