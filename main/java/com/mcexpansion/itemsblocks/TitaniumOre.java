package com.mcexpansion.itemsblocks;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TitaniumOre extends Block {
	
	public TitaniumOre() {
		
		super(Material.rock);
		setHardness(4.5F);
		setCreativeTab(Items.mcExpansionTab);
		setHarvestLevel("pickaxe", 1);
		setBlockName("titaniumOre");
		setBlockTextureName("metalsMod:titaniumOreBlock");
	}

}
