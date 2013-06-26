package mrkirby153.MscHouses.block;

import mrkirby153.MscHouses.core.MscHouses;
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
	public static Block multiFurnaceCore;
	public static Block multiFurnaceDummy;
	public static MscHouses h = new MscHouses();
	
	public static void init(){

		multiFurnaceCore = new BlockMultiFurnaceCore(750);
		multiFurnaceDummy = new BlockMultiFurnaceDummy(751);
	}

}
