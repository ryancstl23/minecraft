package com.metalsmod.blocks;

import com.metalsmod.metalsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockmetalSolidBlocks extends Block {
	
	public BlockmetalSolidBlocks() {
		super(Material.rock);
		setHardness(2.0F);
		setCreativeTab(metalsmod.tabMetals);
		setHarvestLevel("pickaxe", 1);
	}
	
}
