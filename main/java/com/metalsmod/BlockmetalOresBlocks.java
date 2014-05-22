package com.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockmetalOresBlocks extends Block {
	
	public BlockmetalOresBlocks() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 1);
	}
	
}
