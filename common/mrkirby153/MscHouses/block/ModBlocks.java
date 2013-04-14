package mrkirby153.MscHouses.block;

import net.minecraft.block.Block;

public class ModBlocks {
	public static Block OreCopper;
	public static Block House_9x9;
	public static Block House9x9_Deluxe;
	public static Block House_Hut;
	public static Block Statue_Zombie;
	
	public static void init(){
		OreCopper = new BlockCopperOre(BlockId.ORE_COPPER).setUnlocalizedName("oreCopper");
		House_9x9 = new BlockHouse_9x9(BlockId.HOUSE_9X9).setUnlocalizedName("house9x9");
		House9x9_Deluxe = new BlockHouse_Delux9x9(BlockId.HOUSE_9X9_DELUXE).setUnlocalizedName("delux9x9");
		House_Hut = new BlockHouse_Hut(BlockId.HOUSE_HUT).setUnlocalizedName("houseHut");
		// StatueZombie = new BlockStatue_Zombie(BlockId.HOUSE)
	}

}
