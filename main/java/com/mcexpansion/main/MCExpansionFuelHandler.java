package com.mcexpansion.main;

import com.mcexpansion.main.*;
import com.mcexpansion.itemsblocks.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class MCExpansionFuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		Item var1 = ItemsBlocks.Lignite;
		
		if(var1 == ItemsBlocks.Lignite){
		return 660;
		}
		else {
			return 0;
		}
	}

		
}
