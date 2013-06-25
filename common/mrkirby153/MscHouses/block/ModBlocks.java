package mrkirby153.MscHouses.block;

import mrkirby153.MscHouses.lib.BlockId;
import net.minecraft.block.Block;
/**
 * 
 * Msc Houses
 *
 * ModBlocks
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ModBlocks {
	public static Block OreCopper;
	public static Block BlockBaseBuild;
	
	public static void init(){
		OreCopper = new BlockCopperOre(BlockId.ORE_COPPER).setUnlocalizedName("oreCopper");
		// StatueZombie = new BlockStatue_Zombie(BlockId.HOUSE)
		BlockBaseBuild = new BlockHouse_Base(BlockId.HOUSE_BASE).setUnlocalizedName("houseBase");
	}

}
