package mrkirby153.MscHouses;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.structure.MapGenVillage;

public class VillageGenerator implements IWorldGenerator{
	MapGenVillage mgv = new MapGenVillage();

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
		case 0: generateWorld(world, random, chunkX, chunkZ);
		}
	}
		private void generateWorld(World world, Random random, int blockX, int blockZ){
			mgv.generate(world.getChunkProvider(), world, blockX, blockZ, new byte[32768]);
		}
	}
