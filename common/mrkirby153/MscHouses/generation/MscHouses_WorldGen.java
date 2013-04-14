package mrkirby153.MscHouses.generation;

import java.util.Random;

import mrkirby153.MscHouses.block.ModBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MscHouses_WorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
			case -1: generateNeter(world, random,  chunkX*16, chunkZ*16);
			case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generateSurface(World world, Random random, int i, int j) {

		for(int k = 1; k < 15; k++){
		int xCoord1 = i+random.nextInt(16);
		int zCoord1 = j+random.nextInt(16);
		int yCoord1 = 30;
		(new WorldGenMinable(ModBlocks.OreCopper.blockID, 16)).generate(world, random, xCoord1, yCoord1, zCoord1);
	//	System.out.println("Copper has been generated @" +xCoord1 +" " + yCoord1 + " "+ zCoord1);
		}
	}

	private void generateNeter(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
