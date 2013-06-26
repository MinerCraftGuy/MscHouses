package mrkirby153.MscHouses.crafting;

import java.util.logging.Level;

import mrkirby153.MscHouses.api.MaterialRegistry;
import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
/**
 * 
 * Msc Houses
 *
 * CraftingBench
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CraftingBench {

	public static void init(){
		GameRegistry.addRecipe(new ItemStack(MscHouses.PCB, 1), new Object[]{
			"X#X", "XXX", "X#X", 'X', Item.ingotIron, '#', Item.redstone});
			Block[] customBlock = MaterialRegistry.getValidBlocksAsArray();
			for(int i = 0; i < customBlock.length; i++){
				GameRegistry.addRecipe(new ItemStack(MscHouses.modifyer, 1, i), new Object[]{"XXX","XYX","XZX", 'X', customBlock[i], 'Y', Item.enderPearl, 'Z', MscHouses.PCB});
			}
			LogHelper.log(Level.INFO, "Successfully Initalized Crafting Recipies!");
		}


	}