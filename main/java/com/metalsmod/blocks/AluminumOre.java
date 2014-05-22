package com.metalsmod.blocks;

import com.metalsmod.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AluminumOre extends Block {
	
	public AluminumOre() {
		
		super(Material.rock);
		setHardness(5.0F);
		setCreativeTab(metalsmod.tabMetals);
		setHarvestLevel("pickaxe", 1);
		setBlockName("aluminumOre");
		setBlockTextureName("metalsMod:aluminumOreBlock");
	}

}
