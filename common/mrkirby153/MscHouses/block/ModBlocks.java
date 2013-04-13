package mrkirby153.MscHouses.block;

import net.minecraft.block.Block;

public class ModBlocks {

	public static Block House_Hut;
	public static Block House_9x9;
	public static Block House_Deluxe9x9;
	public static Block village;
	public static Block Statue_Zombie;
	public static Block CopperOre;
	
	public static void init(){
		House_Hut =   new BlockHouse_Hut(BlockID.HOUSE_HUT).setUnlocalizedName("hut");
		House_9x9 = new BlockHouse_9x9(BlockID.HOUSE_9X9).setUnlocalizedName("9x9");
		House_Deluxe9x9 = new BlockHouse_Delux9x9(BlockID.HOUSE_9X9_DELUXE).setUnlocalizedName("9x9+");
		village = new BlockVillage(BlockID.STRUCTURE_VILALGE).setUnlocalizedName("village");
		CopperOre = new BlockCopperOre(BlockID.ORE_COPPER).setUnlocalizedName("ore_copper");
		Statue_Zombie = new BlockStatue_Zombie(BlockID.STRUCTURE_STATUE_ZOMBIE).setUnlocalizedName("Statue_Zombie");
	}
	
}
