package mrkirby153.MscHouses.crafting;

import java.util.logging.Level;

import mrkirby153.MscHouses.api.MaterialRegistry;
import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
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
		GameRegistry.addRecipe(new ItemStack(MscHouses.moduel, 1, 0), new Object[]{"###", "@X$", "###", '#', Item.redstone, '@', MscHouses.PCB, '$', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(MscHouses.moduel, 1, 1), new Object[]{"XXX", "XOX", "XXX", 'X', Block.wood, 'O', MscHouses.PCB});
		GameRegistry.addRecipe(new ItemStack(MscHouses.moduel, 1, 2), new Object[]{"###", " X ", "###", 'X', MscHouses.moduel, '#', Block.stone});
		GameRegistry.addRecipe(new ItemStack(MscHouses.moduel, 1, 3), new Object[]{"###", " X ", "###", 'X', MscHouses.moduel, '#', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(MscHouses.moduel, 1, 4), new Object[]{"BFB", " M ", "BOB", 'M', MscHouses.moduel, 'B', Block.brick, 'O', Block.obsidian});
		GameRegistry.addRecipe(new ItemStack(MscHouses.moduel, 1, 5), new Object[]{"BDB", "BXB", "BOB", 'X', MscHouses.moduel, 'B', Block.bookShelf, 'O', Block.obsidian, 'D', Item.diamond});
		Block[] customBlock = MaterialRegistry.getValidBlocksAsArray();
		for(int i = 0; i < customBlock.length; i++){
			GameRegistry.addRecipe(new ItemStack(MscHouses.modifyer, 1, i), new Object[]{"XXX","XYX","XZX", 'X', customBlock[i], 'Y', Item.enderPearl, 'Z', MscHouses.PCB});
		}
		GameRegistry.addRecipe(new ShapedOreRecipe(MscHouses.PCB, true, new Object[]{ "X#X","XXX","X#X",'X', "ingotCopper", '#', Item.redstone}));
		LogHelper.log(Level.INFO, "Successfully Initalized Crafting Recipies!");
	}


}