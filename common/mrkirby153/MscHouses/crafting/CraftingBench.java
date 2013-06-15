package mrkirby153.MscHouses.crafting;

import java.util.logging.Level;

import mrkirby153.MscHouses.api.MaterialRegistry;
import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.configuration.ConfigurationSettings;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import mrkirby153.MscHouses.items.ModItems;
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
		GameRegistry.addRecipe(new ItemStack(ModItems.PCB, 1), new Object[]{
			"X#X", "XXX", "X#X", 'X', Item.ingotIron, '#', Item.redstone});
	/*	GameRegistry.addRecipe(new ItemStack(ModItems.HouseTool, 1),
				new Object[]{"  X", " # ", "#  ", 'X', ModItems.PCB, '#',Item.stick});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.House_Hut, 1),
				new Object[]{"XXX", "XYX", "XXX", 'X', Block.planks, 'Y',Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.House_9x9, 1),
				new Object[]{"X#X", "X@X", "X X", 'X', Block.stone, '#', ModBlocks.House_Hut, '@', ModItems.PCB});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.House9x9_Deluxe, 1),
				new Object[]{"XZX", "XYX", "@@@", 'X', Item.ingotIron, 'Y',
			ModItems.PCB, 'Z', Item.diamond, '@',
			ModBlocks.House_9x9});
			*/
		if (ConfigurationSettings.Invincible) {
			GameRegistry.addRecipe(
					new ItemStack(ModItems.Invincible, 1, 6000), new Object[]{
						"XXX", "X X", "XXX", 'X', Item.emerald});
		}
		Block[] itemList = {Block.stone, Block.dirt, Block.wood, Block.sandStone, Block.pumpkin, Block.cobblestoneMossy, Block.netherrack, Block.slowSand, Block.glowStone,
				Block.obsidian, Block.netherBrick, Block.whiteStone, Block.blockDiamond};
		Block[] customBlock = MaterialRegistry.getValidBlocksAsArray();
		for(int i = 1; i < itemList.length; i++){
			GameRegistry.addRecipe(new ItemStack(ModItems.modifyer, 1, i), new Object[]{"XXX", "XYX", "XZX", 'X', itemList[i] , 'Y', Item.enderPearl, 'Z', ModItems.PCB});
		}
		GameRegistry.addRecipe(new ItemStack(ModItems.modifyer, 1), new Object[]{"XXX", "XYX", "XXX", 'X', Block.stone, 'Y', Item.enderPearl});
		for(int i = 0; i < customBlock.length; i++){
			GameRegistry.addRecipe(new ItemStack(ModItems.modifyer_extra, 1, i), new Object[]{"XXX","XYX","XZX", 'X', customBlock[i], 'Y', Item.enderPearl, 'Z', ModItems.PCB});
		}
		LogHelper.log(Level.INFO, "Successfully Initalized Crafting Recipies!");
	}

}
