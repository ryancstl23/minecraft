package com.mcexpansion.itemsblocks;

import com.mcexpansion.lib.*;
import com.mcexpansion.itemsblocks.*;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {

	public static void itemsRegistry() {
		initItems();
		registerItems();
		registerRecipes();
	}
	
	public static Item aluminumIngot, aluminumNugget, Lignite, nickelIngot, nickelNugget, platinumIngot, platinumNugget, titaniumIngot, titaniumNugget, zinkIngot, 
	zinkNugget;
	public static Block aluminumOre, aluminumBlock, ligniteOre, nickelOre, nickelBlock, platinumOre, platinumBlock, titaniumOre, 
	titaniumBlock, zinkOre, zinkBlock;
	public static CreativeTabs mcExpansionTab = new CreativeTabs("MC Expansion") {
		public Item getTabIconItem() {
			return platinumIngot;
		}
	};
	
	
	public static void initItems() {
		
	aluminumIngot = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("aluminumIngot").setTextureName("metalsMod:aluminumIngot");
	aluminumNugget = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("aluminumNugget").setTextureName("metalsMod:aluminumNugget");
	Lignite = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("Lignite").setTextureName("metalsMod:lignite");
	nickelIngot = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("nickelIngot").setTextureName("metalsMod:nickelIngot");
	nickelNugget = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("nickelNugget").setTextureName("metalsMod:nickelNugget");
	platinumIngot = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("platinumIngot").setTextureName("metalsMod:platinumIngot");
	platinumNugget = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("platinumNugget").setTextureName("metalsMod:platinumNugget");
	titaniumIngot = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("titaniumIngot").setTextureName("metalsMod:titaniumIngot");
	titaniumNugget = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("titaniumNugget").setTextureName("metalsMod:titaniumNugget");
	zinkIngot = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("zinkIngot").setTextureName("metalsMod:zinkIngot");
	zinkNugget = new Item().setCreativeTab(mcExpansionTab).setUnlocalizedName("zinkNugget").setTextureName("metalsMod:zinkNugget");
	
	aluminumBlock = new BlockmetalSolidBlocks().setBlockName("aluminumBlock").setBlockTextureName("metalsMod:aluminumBlock");
	aluminumOre = new AluminumOre();
	ligniteOre = new LigniteOre();
	nickelBlock = new BlockmetalSolidBlocks().setBlockName("nickelBlock").setBlockTextureName("metalsMod:nickelBlock");
	nickelOre = new NickelOre();	
	platinumBlock = new BlockmetalSolidBlocks().setBlockName("platinumBlock").setBlockTextureName("metalsMod:platinumBlock");
	platinumOre = new PlatinumOre();
	titaniumBlock = new BlockmetalSolidBlocks().setBlockName("titaniumBlock").setBlockTextureName("metalsMod:titaniumBlock");
	titaniumOre = new TitaniumOre();
	zinkBlock = new BlockmetalSolidBlocks().setBlockName("zinkBlock").setBlockTextureName("metalsMod:zinkBlock");
	zinkOre = new ZinkOre();
	
	}

	
	public static void registerItems() {
		
		GameRegistry.registerItem(aluminumIngot, "aluminumIngot");
		GameRegistry.registerItem(aluminumNugget, "aluminumNugget");
		GameRegistry.registerItem(Lignite, "Lignite");
		GameRegistry.registerItem(nickelIngot, "nickelIngot");
		GameRegistry.registerItem(nickelNugget, "nickelNugget");
		GameRegistry.registerItem(platinumIngot, "platinumIngot");
		GameRegistry.registerItem(platinumNugget, "platinumNugget");
		GameRegistry.registerItem(titaniumIngot, "titaniumIngot");
		GameRegistry.registerItem(titaniumNugget, "titaniumNugget");
		GameRegistry.registerItem(zinkIngot, "zinkIngot");
		GameRegistry.registerItem(zinkNugget, "zinkNugget");
		
		GameRegistry.registerBlock(aluminumBlock, "aluminumBlock");
		GameRegistry.registerBlock(aluminumOre, "Aluminum Ore");
		GameRegistry.registerBlock(ligniteOre, "Lignite Ore");
		GameRegistry.registerBlock(nickelBlock, "nickelBlock");
		GameRegistry.registerBlock(nickelOre, "Nickel Ore");
		GameRegistry.registerBlock(platinumBlock, "platinumBlock");
		GameRegistry.registerBlock(platinumOre, "Platinum Ore");
		GameRegistry.registerBlock(titaniumBlock, "titaniumBlock");
		GameRegistry.registerBlock(titaniumOre, "Titanium Ore");
		GameRegistry.registerBlock(zinkBlock, "zinkBlock");	
		GameRegistry.registerBlock(zinkOre, "Zink Ore");
		
	}
	
	
	private static void registerRecipes() {
		
		//Create Recipes
		
		//Recipes for getting Nuggets
		GameRegistry.addShapelessRecipe(new ItemStack(aluminumNugget, 9), new Object[] {
			new ItemStack(aluminumIngot) });
		GameRegistry.addShapelessRecipe(new ItemStack(nickelNugget, 9), new Object[] {
			new ItemStack(nickelIngot) });
		GameRegistry.addShapelessRecipe(new ItemStack(platinumNugget, 9), new Object[] {
			new ItemStack(platinumIngot) });
		GameRegistry.addShapelessRecipe(new ItemStack(titaniumNugget, 9), new Object[] {
			new ItemStack(titaniumIngot) });
		GameRegistry.addShapelessRecipe(new ItemStack(zinkNugget, 9), new Object[] {
			new ItemStack(zinkIngot) });
		
		//Reverse Recipes of Nuggets		
		GameRegistry.addRecipe(new ItemStack(aluminumIngot), new Object[]{
			"CCC", "CCC", "CCC", 'C', aluminumNugget});
		GameRegistry.addRecipe(new ItemStack(nickelIngot), new Object[]{
			"CCC", "CCC", "CCC", 'C', nickelNugget});		
		GameRegistry.addRecipe(new ItemStack(platinumIngot), new Object[]{
			"CCC", "CCC", "CCC", 'C', platinumNugget});
		GameRegistry.addRecipe(new ItemStack(titaniumIngot), new Object[]{
			"CCC", "CCC", "CCC", 'C', titaniumNugget});
		GameRegistry.addRecipe(new ItemStack(zinkIngot), new Object[]{
			"CCC", "CCC", "CCC", 'C', zinkNugget});
		
		//Recipes for blocks of metals
		GameRegistry.addRecipe(new ItemStack(aluminumBlock), new Object[]{
			"CCC", "CCC", "CCC", 'C', aluminumIngot});
		GameRegistry.addRecipe(new ItemStack(nickelBlock), new Object[]{
			"CCC", "CCC", "CCC", 'C', nickelIngot});		
		GameRegistry.addRecipe(new ItemStack(platinumBlock), new Object[]{
			"CCC", "CCC", "CCC", 'C', platinumIngot});
		GameRegistry.addRecipe(new ItemStack(titaniumBlock), new Object[]{
			"CCC", "CCC", "CCC", 'C', titaniumIngot});
		GameRegistry.addRecipe(new ItemStack(zinkBlock), new Object[]{
			"CCC", "CCC", "CCC", 'C', zinkIngot});		
		
		//Reverse Recipes of Blocks
		GameRegistry.addShapelessRecipe(new ItemStack(aluminumIngot, 9), new Object[] {
			new ItemStack(aluminumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(nickelIngot, 9), new Object[] {
			new ItemStack(nickelBlock)});		
		GameRegistry.addShapelessRecipe(new ItemStack(platinumIngot, 9), new Object[] {
			new ItemStack(platinumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(titaniumIngot, 9), new Object[] {
			new ItemStack(titaniumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(zinkIngot, 9), new Object[] {
			new ItemStack(zinkBlock)});	
		
		//Smelting Recipes
		GameRegistry.addSmelting(aluminumOre, new ItemStack(aluminumIngot), 0.8F);
		GameRegistry.addSmelting(nickelOre, new ItemStack(nickelIngot), 0.8F);
		GameRegistry.addSmelting(platinumOre, new ItemStack(platinumIngot), 0.8F);
		GameRegistry.addSmelting(titaniumOre, new ItemStack(titaniumIngot), 0.8F);
		GameRegistry.addSmelting(zinkOre, new ItemStack(zinkIngot), 0.8F);
		
	}
	
	
	
	
	

	
}
