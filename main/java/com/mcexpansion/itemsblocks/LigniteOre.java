package com.mcexpansion.itemsblocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class LigniteOre extends Block {
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return ItemsBlocks.Lignite;
	}
	
	public LigniteOre() {
		
		super(Material.rock);
		setHardness(2.25F);
		setCreativeTab(ItemsBlocks.mcExpansionTab);
		setHarvestLevel("pickaxe", 1);
		setBlockName("ligniteOre");
		setBlockTextureName("metalsMod:ligniteOreBlock");
		
	}
	
}
