package com.mcexpansion.itemsblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TinOre extends Block {
	
	public TinOre() {
		
		super(Material.rock);
		setHardness(3.0F);
		setCreativeTab(ItemsBlocks.mcExpansionTab);
		setHarvestLevel("pickaxe", 1);
		setBlockName("nickelOre");
		setBlockTextureName("metalsMod:nickelOreBlock");
	}

}
