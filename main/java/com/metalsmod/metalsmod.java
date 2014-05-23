package com.metalsmod;


import com.metalsmod.blocks.AluminumOre;
import com.metalsmod.blocks.BlockmetalSolidBlocks;
import com.metalsmod.blocks.LigniteOre;
import com.metalsmod.blocks.NickelOre;
import com.metalsmod.blocks.PlatinumOre;
import com.metalsmod.blocks.TitaniumOre;
import com.metalsmod.blocks.ZinkOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


//Define Mod info and mod's code
@Mod(modid = metalsmod.MODID, version = metalsmod.VERSION)
public class metalsmod {
	public static final String MODID = "Metals Mod";
	public static final String VERSION = "0.0.7 PreAlpha - MC 1.7.2";
	
	
	//Set Up the first creative tab - Metals *Main Tab*
	public static CreativeTabs tabMetals = new CreativeTabs("tabMetals") {
		public Item getTabIconItem() {
			return Items.bed;
		}
	};
	
	//Set Up the second Creative Tab - Currency
	public static CreativeTabs tabMoney = new CreativeTabs("tabMoney") {
		public Item getTabIconItem() {
			return Items.gold_nugget;
		}
	};
	
	//Declare Items
	public static Item aluminumIngot, aluminumNugget, lignite, nickelIngot, nickelNugget, platinumIngot,
	platinumNugget, titaniumIngot, titaniumNugget, zinkIngot, zinkNugget;
	
	//Declare Blocks
	public static Block aluminumOre, aluminumBlock, ligniteOre, nickelOre, nickelBlock, platinumOre, platinumBlock, titaniumOre, 
	titaniumBlock, zinkOre, zinkBlock;

	
	
	//Pre-Init Events
	@EventHandler
	public void preInit (FMLPreInitializationEvent event) {
		
		//Basic Items
		
		//Aluminum & Sub-Types		
		aluminumIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("aluminumIngot").setTextureName("metalsMod:aluminumIngot");
		GameRegistry.registerItem(aluminumIngot, "aluminumIngot");
		
		aluminumNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("aluminumNugget").setTextureName("metalsMod:aluminumNugget");
		GameRegistry.registerItem(aluminumNugget, "aluminumNugget");
		
		aluminumBlock = new BlockmetalSolidBlocks().setBlockName("aluminumBlock").setBlockTextureName("metalsMod:aluminumBlock");
		GameRegistry.registerBlock(aluminumBlock, "aluminumBlock");
		
		//Lignite
		lignite = new Item().setCreativeTab(tabMetals).setUnlocalizedName("Lignite").setTextureName("metalsMod:lignite");
		GameRegistry.registerItem(lignite, "lignite");
		
		
		//Nickel & Subtypes		
		nickelIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("nickelIngot").setTextureName("metalsMod:nickelIngot");
		GameRegistry.registerItem(nickelIngot, "nickelIngot");
		
		nickelNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("nickelNugget").setTextureName("metalsMod:nickelNugget");
		GameRegistry.registerItem(nickelNugget, "nickelNugget");

		nickelBlock = new BlockmetalSolidBlocks().setBlockName("nickelBlock").setBlockTextureName("metalsMod:nickelBlock");
		GameRegistry.registerBlock(nickelBlock, "nickelBlock");
		
		
		//Platinum & Sub-Types		
		platinumIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("platinumIngot").setTextureName("metalsMod:platinumIngot");
		GameRegistry.registerItem(platinumIngot, "platinumIngot");
		
		platinumNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("platinumNugget").setTextureName("metalsMod:platinumNugget");
		GameRegistry.registerItem(platinumNugget, "platinumNugget");

		platinumBlock = new BlockmetalSolidBlocks().setBlockName("platinumBlock").setBlockTextureName("metalsMod:platinumBlock");
		GameRegistry.registerBlock(platinumBlock, "platinumBlock");		
		
		
		//Titanium & Sub-Types		
		titaniumIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("titaniumIngot").setTextureName("metalsMod:titaniumIngot");
		GameRegistry.registerItem(titaniumIngot, "titaniumIngot");
		
		titaniumNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("titaniumNugget").setTextureName("metalsMod:titaniumNugget");
		GameRegistry.registerItem(titaniumNugget, "titaniumNugget");
		
		titaniumBlock = new BlockmetalSolidBlocks().setBlockName("titaniumBlock").setBlockTextureName("metalsMod:titaniumBlock");
		GameRegistry.registerBlock(titaniumBlock, "titaniumBlock");
		
		
		//Zink & Sub-Types		
		zinkIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("zinkIngot").setTextureName("metalsMod:zinkIngot");
		GameRegistry.registerItem(zinkIngot, "zinkIngot");
		
		zinkNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("zinkNugget").setTextureName("metalsMod:zinkNugget");
		GameRegistry.registerItem(zinkNugget, "zinkNugget");
		
		zinkBlock = new BlockmetalSolidBlocks().setBlockName("zinkBlock").setBlockTextureName("metalsMod:zinkBlock");
		GameRegistry.registerBlock(zinkBlock, "zinkBlock");		
		
		
		//Basic Ores
		aluminumOre = new AluminumOre();
		GameRegistry.registerBlock(aluminumOre, "Aluminum Ore");
		
		ligniteOre = new LigniteOre();
		GameRegistry.registerBlock(ligniteOre, "Lignite Ore");
		
		nickelOre = new NickelOre();	
		GameRegistry.registerBlock(nickelOre, "Nickel Ore");
		
		platinumOre = new PlatinumOre();
		GameRegistry.registerBlock(platinumOre, "Platinum Ore");
	
		titaniumOre = new TitaniumOre();
		GameRegistry.registerBlock(titaniumOre, "Titanium Ore");
	
		zinkOre = new ZinkOre();
		GameRegistry.registerBlock(zinkOre, "Zink Ore");
	}

	//Init Events
	@EventHandler
	public void init (FMLInitializationEvent event) {		
		
		//Create Recipes
		
		//Recipes for getting Nuggets
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.aluminumNugget, 9), new Object[] {
			new ItemStack(metalsmod.aluminumIngot) });
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.nickelNugget, 9), new Object[] {
			new ItemStack(metalsmod.nickelIngot) });
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.platinumNugget, 9), new Object[] {
			new ItemStack(metalsmod.platinumIngot) });
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.titaniumNugget, 9), new Object[] {
			new ItemStack(metalsmod.titaniumIngot) });
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.zinkNugget, 9), new Object[] {
			new ItemStack(metalsmod.zinkIngot) });
		
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
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.aluminumIngot, 9), new Object[] {
			new ItemStack(metalsmod.aluminumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.nickelIngot, 9), new Object[] {
			new ItemStack(metalsmod.nickelBlock)});		
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.platinumIngot, 9), new Object[] {
			new ItemStack(metalsmod.platinumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.titaniumIngot, 9), new Object[] {
			new ItemStack(metalsmod.titaniumBlock)});
		GameRegistry.addShapelessRecipe(new ItemStack(metalsmod.zinkIngot, 9), new Object[] {
			new ItemStack(metalsmod.zinkBlock)});		
		
		
		//Create Smelting Recipe
		
		//Smelting Dropped Ores
		GameRegistry.addSmelting(metalsmod.aluminumOre, new ItemStack(metalsmod.aluminumIngot), 0.8F);
		GameRegistry.addSmelting(metalsmod.nickelOre, new ItemStack(metalsmod.nickelIngot), 0.8F);
		GameRegistry.addSmelting(metalsmod.platinumOre, new ItemStack(metalsmod.platinumIngot), 0.8F);
		GameRegistry.addSmelting(metalsmod.titaniumOre, new ItemStack(metalsmod.titaniumIngot), 0.8F);
		GameRegistry.addSmelting(metalsmod.zinkOre, new ItemStack(metalsmod.zinkIngot), 0.8F);
		
	}

	//Post Init Events
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}

}

