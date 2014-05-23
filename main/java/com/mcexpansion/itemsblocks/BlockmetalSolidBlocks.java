package com.mcexpansion.itemsblocks;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockmetalSolidBlocks extends Block {
	
	public BlockmetalSolidBlocks() {
		super(Material.rock);
		setHardness(2.0F);
		setCreativeTab(Items.mcExpansionTab);
		setHarvestLevel("pickaxe", 1);
	}
	
}
