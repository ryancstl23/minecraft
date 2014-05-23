package com.metalsmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class MetalsModFuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		Item var1 = metalsmod.lignite;
		
		if(var1 == metalsmod.lignite){
		return 660;
		}
		else {
			return 0;
		}
	}

	
	
}
