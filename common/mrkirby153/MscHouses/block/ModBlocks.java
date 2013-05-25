package mrkirby153.MscHouses.block;

import mrkirby153.MscHouses.lib.BlockId;
import net.minecraft.block.Block;

public class ModBlocks {
	public static Block OreCopper;
	public static Block House_9x9;
	public static Block House9x9_Deluxe;
	public static Block House_Hut;
	public static Block Statue_Zombie;
	public static Block BlockBaseBuild;
	
	public static void init(){
		OreCopper = new BlockCopperOre(BlockId.ORE_COPPER).setUnlocalizedName("oreCopper");
		// StatueZombie = new BlockStatue_Zombie(BlockId.HOUSE)
		BlockBaseBuild = new BlockHouse_Base(BlockId.HOUSE_BASE).setUnlocalizedName("houseBase");
	}

}
