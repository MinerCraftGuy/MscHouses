package mrkirby153.MscHouses;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MscHouses_WorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
//		System.out.println("Generating Terrain...");
		switch(world.provider.dimensionId){
			case -1: generateNeter(world, random,  chunkX*16, chunkZ*16);
			case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		generateHouse(world, random, chunkX*16,chunkZ*16);
		
	}

	private void generateHouse(World world, Random random, int x, int z) {
	//	int chances = random.nextInt(300);
		int chances = random.nextInt(40);
	//	if(chances <= 30){
			MscHouses.h.ninbynineDelux(world, x+random.nextInt(16), 50, z+random.nextInt());
	//	}
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		for(int i = 1; i < 30; i++){
			int xCoord, yCoord, zCoord;
			xCoord = x+random.nextInt(16);
			yCoord = 36-random.nextInt(3);
			zCoord = z+random.nextInt(16);
			(new WorldGenMinable(MscHouses.CopperOre.blockID, 3000)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
	}

	private void generateNeter(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
