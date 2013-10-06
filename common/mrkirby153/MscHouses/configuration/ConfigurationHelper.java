package mrkirby153.MscHouses.configuration;

import java.util.ArrayList;

import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.block.Block;
import net.minecraft.item.Item;


/**
 * 
 * MscHouses
 *
 * ConfigurationHelper.java
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ConfigurationHelper {
	private static ArrayList<Integer> usedItemId = new ArrayList<Integer>();
	private static ArrayList<Integer> usedBlockId = new ArrayList<Integer>();
	/**
	 * Gets the next avalible block id.
	 * @return blockID
	 */
	public static int getNextBlockID(){
		Block[] blockList = Block.blocksList;
		for(int i=300; i< blockList.length; i++){
			if(blockList[i] == null && !usedItemId.contains(i)){
				usedItemId.add(i);
				return i;
			}
		}

		return 0;
	}

	public static int getNextItemID(){
		Item[] itemList = Item.itemsList;
		for(int i=1000; i < itemList.length; i++){
			if(itemList[i] == null && !usedBlockId.contains(i)){
				usedBlockId.add(i);
				return i;
			}
		}
		return 0;
	}
	
	public static void checkForNewIds(){
		
	}
}

