package com.metalsmod.blocks;

import com.metalsmod.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ZinkOre extends Block {
	
	public ZinkOre(Material material) {
		
		super(material);
		setHardness(3.0F);
		setCreativeTab(metalsmod.tabMetals);
		setHarvestLevel("pickaxe", 1);
		setBlockName("zinkOre");
		setBlockTextureName("metalsMod:zinkOreBlock");
	}

}
