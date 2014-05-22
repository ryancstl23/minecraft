package com.metalsmod.blocks;

import com.metalsmod.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NickelOre extends Block {
	
	public NickelOre() {
		
		super(Material.rock);
		setHardness(3.0F);
		setCreativeTab(metalsmod.tabMetals);
		setHarvestLevel("pickaxe", 1);
		setBlockName("nickelOre");
		setBlockTextureName("metalsMod:nickelOreBlock");
	}

}
