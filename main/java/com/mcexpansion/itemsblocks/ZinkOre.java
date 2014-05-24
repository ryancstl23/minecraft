package com.mcexpansion.itemsblocks;

import com.mcexpansion.main.*;
import com.mcexpansion.itemsblocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ZinkOre extends Block {
	
	public ZinkOre() {
		
		super(Material.rock);
		setHardness(3.0F);
		setCreativeTab(ItemsBlocks.mcExpansionTab);
		setHarvestLevel("pickaxe", 1);
		setBlockName("zinkOre");
		setBlockTextureName("metalsMod:zinkOreBlock");
	}

}
