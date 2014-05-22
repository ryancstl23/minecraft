package com.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NickelOre extends Block {
	
	public NickelOre(Material material) {
		
		super(material);
		setHardness(3.0F);
		setCreativeTab(metalsmod.tabMetals);
		setHarvestLevel("pickaxe", 1);
		setBlockName("nickelOre");
		setBlockTextureName("metalsMod:nickelOreBlock");
	}

}
