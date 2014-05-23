package com.metalsmod;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenMetalsMod implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
	switch(world.provider.dimensionId){
	case -1:
		generateNether(world, random, chunkX * 16, chunkZ * 16);
		
	case 0:
		generateInOverworld(world, random, chunkX * 16, chunkZ * 16);
		
	case 1:
		generateInEnd(world, random, chunkX * 16, chunkZ * 16);
		
	
	}
	
	
}



	private void generateInOverworld(World world, Random random, int chunkX, int chunkZ) {
		for (int i = 0; i < 12; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(50);
			int randPosZ = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(metalsmod.aluminumOre, 5)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 14; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(20);
			int randPosZ = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(metalsmod.ligniteOre, 8)).generate(world, random, randPosX, (randPosY + 50), randPosZ);
		}
		for (int i = 0; i < 10; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(64);
			int randPosZ = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(metalsmod.nickelOre, 7)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 2; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(7);
			int randPosZ = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(metalsmod.platinumOre, 1)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 10; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(36);
			int randPosZ = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(metalsmod.titaniumOre, 4)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 12; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(64);
			int randPosZ = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(metalsmod.zinkOre, 4)).generate(world, random, randPosX, randPosY, randPosZ);
		}
	}
	
	private void generateNether(World world, Random rand, int i, int j) {
		// TODO Auto-generated method stub
	}

	private void generateInEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
