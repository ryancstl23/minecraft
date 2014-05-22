package com.metalsmod.blocks;

import com.metalsmod.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AluminumOre extends Block {
	
	public AluminumOre(Material material) {
		
		super(material);
		setHardness(5.0F);
		setCreativeTab(metalsmod.tabMetals);
		setHarvestLevel("pickaxe", 1);
		setBlockName("aluminumOre");
		setBlockTextureName("metalsMod:aluminumOreBlock");
	}

}
