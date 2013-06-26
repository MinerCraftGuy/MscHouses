package mrkirby153.MscHouses.crafting;

import java.util.logging.Level;

import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
/**
 * 
 * Msc Houses
 *
 * Furnace
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Furnace {

	public static void init(){
		GameRegistry.addSmelting(MscHouses.OreCopper.blockID, new ItemStack(MscHouses.ingotCopper), 1F);
		LogHelper.log(Level.INFO, "Successfully Initialized Smelting Recipies!");
	}
}
