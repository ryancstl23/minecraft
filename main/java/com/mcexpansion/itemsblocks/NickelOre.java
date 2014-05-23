package com.mcexpansion.itemsblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NickelOre extends Block {
	
	public NickelOre() {
		
		super(Material.rock);
		setHardness(3.0F);
		setCreativeTab(Items.mcExpansionTab);
		setHarvestLevel("pickaxe", 1);
		setBlockName("nickelOre");
		setBlockTextureName("metalsMod:nickelOreBlock");
	}

}
