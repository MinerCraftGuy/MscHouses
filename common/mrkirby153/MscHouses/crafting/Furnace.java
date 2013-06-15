package mrkirby153.MscHouses.crafting;

import java.util.logging.Level;

import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.configuration.ConfigurationSettings;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import mrkirby153.MscHouses.items.ModItems;
import net.minecraft.block.Block;
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
		if(ConfigurationSettings.Invincible){
		GameRegistry.addSmelting(Block.blockDiamond.blockID, new ItemStack(
				ModItems.Invincible, 1, 300), 10F);
		}
		GameRegistry.addSmelting(ModBlocks.OreCopper.blockID, new ItemStack(ModItems.ingotCopper), 1F);
		LogHelper.log(Level.INFO, "Successfully Initialized Smelting Recipies!");
	}
}
