package com.mcexpansion.main;

import com.mcexpansion.lib.*;
import com.mcexpansion.itemsblocks.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class MCExpansion {

	@Instance(Strings.MODID)
	public static MCExpansion modInstance;
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
		
		ItemsBlocks.itemsRegistry();
		
	}
	
	@EventHandler
	public void Init (FMLInitializationEvent event) {
		
		//Start World Generation HERE----
		GameRegistry.registerWorldGenerator(new MCExpansionWorldGen(), 1);
		
		//Fuel Registration
		GameRegistry.registerFuelHandler(new MCExpansionFuelHandler());
		
	}
	
	@EventHandler
	public void PostInit (FMLPostInitializationEvent event) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
