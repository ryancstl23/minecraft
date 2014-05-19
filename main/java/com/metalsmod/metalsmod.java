package com.metalsmod;


import net.minecraft.block.Block;
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
@Mod(modid = metalsmod.modid, version = metalsmod.version)
public class metalsmod {
	public static final String modid = "Metals Mod";
	public static final String version = "0.0.7 PreAlpha - MC 1.7.2";
	
	
	
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
	public static Item aluminumOre, aluminumIngot, aluminumNugget, nickelOre, nickelIngot, nickelNugget, platinumOre, platinumIngot,
	platinumNugget, titaniumOre, titaniumIngot, titaniumNugget, zinkOre, zinkIngot, zinkNugget;
	
	//Declare Blocks
	public static Block aluminumOreBlock, aluminumBlock, nickelOreBlock, nickelBlock, platinumOreBlock, platinumBlock, titaniumOreBlock, 
	titaniumBlock, zinkOreBlock, zinkBlock;
	
	//Pre-Init Events
	@EventHandler
	public void preInit (FMLPreInitializationEvent event) {
		
		//Basic Items
		
		//Aluminum & Sub-Types		
		aluminumIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("aluminumIngot").setTextureName("metalsMod:aluminumIngot");
		GameRegistry.registerItem(aluminumIngot, "aluminumIngot");
		
		aluminumNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("aluminumNugget");
		GameRegistry.registerItem(aluminumNugget, "aluminumNugget");
		
		aluminumBlock = new BlockmetalSolidBlocks().setBlockName("aluminumBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:aluminumBlock");
		GameRegistry.registerBlock(aluminumBlock, "aluminumBlock");
		
		
		//Nickel & Subtypes		
		nickelIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("nickelIngot").setTextureName("metalsMod:nickelIngot");
		GameRegistry.registerItem(nickelIngot, "nickelIngot");
		
		nickelNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("nickelNugget").setTextureName("gold_nugget");
		GameRegistry.registerItem(nickelNugget, "nickelNugget");

		nickelBlock = new BlockmetalSolidBlocks().setBlockName("nickelBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:nickelBlock");
		GameRegistry.registerBlock(nickelBlock, "nickelBlock");
		
		
		//Platinum & Sub-Types		
		platinumIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("platinumIngot").setTextureName("metalsMod:platinumIngot");
		GameRegistry.registerItem(platinumIngot, "platinumIngot");
		
		platinumNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("platinumNugget");
		GameRegistry.registerItem(platinumNugget, "platinumNugget");

		platinumBlock = new BlockmetalSolidBlocks().setBlockName("platinumBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:platinumBlock");
		GameRegistry.registerBlock(platinumBlock, "platinumBlock");		
		
		
		//Titanium & Sub-Types		
		titaniumIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("titaniumIngot").setTextureName("metalsMod:titaniumIngot");
		GameRegistry.registerItem(titaniumIngot, "titaniumIngot");
		
		titaniumNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("titaniumNugget");
		GameRegistry.registerItem(titaniumNugget, "titaniumNugget");
		
		titaniumBlock = new BlockmetalSolidBlocks().setBlockName("titaniumBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:titaniumBlock");
		GameRegistry.registerBlock(titaniumBlock, "titaniumBlock");
		
		
		//Zink & Sub-Types		
		zinkIngot = new Item().setCreativeTab(tabMetals).setUnlocalizedName("zinkIngot");
		GameRegistry.registerItem(zinkIngot, "zinkIngot");
		
		zinkNugget = new Item().setCreativeTab(tabMetals).setUnlocalizedName("zinkNugget").setTextureName("metalsMod:zinkIngot");
		GameRegistry.registerItem(zinkNugget, "zinkNugget");
		
		zinkBlock = new BlockmetalSolidBlocks().setBlockName("zinkBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:zinkBlock");
		GameRegistry.registerBlock(zinkBlock, "zinkBlock");		
		
		
		//Basic Ores
		aluminumOreBlock = new BlockmetalOresBlocks().setBlockName("aluminumOreBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:aluminumOreBlock");
		GameRegistry.registerBlock(aluminumOreBlock, "Aluminum Ore");
		
		nickelOreBlock = new BlockmetalOresBlocks().setBlockName("nickelOreBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:nickelOreBlock");	
		GameRegistry.registerBlock(nickelOreBlock, "Nickel Ore");
		
		platinumOreBlock = new BlockmetalOresBlocks().setBlockName("platinumOreBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:platinumOreBlock");
		GameRegistry.registerBlock(platinumOreBlock, "Platinum Ore");
	
		titaniumOreBlock = new BlockmetalOresBlocks().setBlockName("titaniumOreBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsmod:titaniumOreBlock");
		GameRegistry.registerBlock(titaniumOreBlock, "Titanium Ore");
	
		zinkOreBlock = new BlockmetalOresBlocks().setBlockName("zinkOreBlock").setCreativeTab(tabMetals).setBlockTextureName("metalsMod:zinkOreBlock");
		GameRegistry.registerBlock(zinkOreBlock, "Zink Ore");
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
		GameRegistry.addRecipe(new ItemStack(aluminumIngot), new Object[]{"CCC", "CCC", "CCC", 'C', aluminumNugget});
		GameRegistry.addRecipe(new ItemStack(nickelIngot), new Object[]{"CCC", "CCC", "CCC", 'C', nickelNugget});		
		GameRegistry.addRecipe(new ItemStack(platinumIngot), new Object[]{"CCC", "CCC", "CCC", 'C', platinumNugget});
		GameRegistry.addRecipe(new ItemStack(titaniumIngot), new Object[]{"CCC", "CCC", "CCC", 'C', titaniumNugget});
		GameRegistry.addRecipe(new ItemStack(zinkIngot), new Object[]{"CCC", "CCC", "CCC", 'C', zinkNugget});
		
		
		
		//Create Smelting Recipe
		
		//Smelting Dropped Ores
		GameRegistry.addSmelting(metalsmod.aluminumOre, new ItemStack(metalsmod.aluminumIngot), 0.8F);
		GameRegistry.addSmelting(metalsmod.nickelOre, new ItemStack(metalsmod.nickelIngot), 0.8F);
		GameRegistry.addSmelting(metalsmod.platinumOre, new ItemStack(metalsmod.platinumIngot), 0.8F);
		GameRegistry.addSmelting(metalsmod.titaniumOre, new ItemStack(metalsmod.titaniumIngot), 0.8F);
		GameRegistry.addSmelting(metalsmod.zinkOre, new ItemStack(metalsmod.zinkIngot), 0.8F);
		
		//Smelting Blocks of Ores
		GameRegistry.addSmelting(metalsmod.aluminumOreBlock, new ItemStack(metalsmod.aluminumIngot, 2), 0.8F);
		GameRegistry.addSmelting(metalsmod.nickelOreBlock, new ItemStack(metalsmod.nickelIngot, 2), 0.8F);
		GameRegistry.addSmelting(metalsmod.platinumOreBlock, new ItemStack(metalsmod.platinumIngot, 2), 0.8F);
		GameRegistry.addSmelting(metalsmod.titaniumOreBlock, new ItemStack(metalsmod.titaniumIngot, 2), 0.8F);
		GameRegistry.addSmelting(metalsmod.zinkOreBlock, new ItemStack(metalsmod.zinkIngot, 2), 0.8F);
	}

	//Post Init Events
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}

}

