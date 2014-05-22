package com.metalsmod.blocks;

import com.metalsmod.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumOre extends Block {
	
	public PlatinumOre() {
		
		super(Material.rock);
		setHardness(8.0F);
		setCreativeTab(metalsmod.tabMetals);
		setHarvestLevel("pickaxe", 1);
		setBlockName("platinumOre");
		setBlockTextureName("metalsMod:platinumOreBlock");
	}

}
