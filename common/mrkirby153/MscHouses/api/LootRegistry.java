package mrkirby153.MscHouses.api;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.item.Item;

/**
 * 
 * Msc Houses
 *
 * LootRegistry.java
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class LootRegistry {
	
	/** A list of all the items that can be found in the house generation chests*/
	private static ArrayList<Item> loot = new ArrayList<Item>();
	/**
	 * Allows an item to be found in a house generated chest.
	 * @param Item registerItem
	 */
	public static void addLoot(Item item){
		if(item != null){
			loot.add(item);
		}
	}
	/**
	 * Returns a list of all the loot
	 * @return ArrayList<Item>
	 */
	public static ArrayList<Item> getLoot(){
		return loot;
	}
	/**
	 * Returns a pseudorandom item from the list of avalable loots
	 * @return Item
	 */
	public static Item getRandomItem(){
		Random random = new Random();
		int random_number = random.nextInt(loot.size());
		while(random_number == 0){
			random_number = random.nextInt(loot.size());
		}
		Item[] itemlist = new Item[loot.size()];
		itemlist = loot.toArray(itemlist);
	//	return itemlist[random_number];
		return null;
	}

}
