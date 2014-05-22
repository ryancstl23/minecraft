package com.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumOre extends Block {
	
	public PlatinumOre(Material material) {
		
		super(material);
		setHardness(8.0F);
		setCreativeTab(metalsmod.tabMetals);
		setHarvestLevel("pickaxe", 1);
		setBlockName("platinumOre");
		setBlockTextureName("metalsMod:platinumOreBlock");
	}

}
