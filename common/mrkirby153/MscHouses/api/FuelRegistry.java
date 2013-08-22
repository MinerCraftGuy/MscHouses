package mrkirby153.MscHouses.api;

import java.util.ArrayList;

import net.minecraft.item.Item;

/**
 * Msc Houses
 * 
 * FuelRegistry
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class FuelRegistry {
	/**A list of all the valid fuels that can be used in the House Generator block */
	public static ArrayList<Item> validFuels = new ArrayList<Item>();
	/**
	 * Adds an item to be used as a fuel in the House Generator block.
	 * @param Item fuel
	 */
	public static void addFuel(Item fuel){
		FuelRegistry.validFuels.add(fuel);
	}
	/**
	 * Returns an ArrayList of all the valid fuels for the House Generator.
	 * @return ArrayList<Item>
	 */
	public static ArrayList<Item> getValidFuelsAsArrayList(){
		return validFuels;
	}
	/**
	 * Returns a table of all the vaid fuesl for the House Generator.
	 * @return Item[] 
	 */
	public static Item[] getValidFulesAsList(){
		Item[] fuels = new Item[validFuels.size()];
		fuels = validFuels.toArray(fuels);
		return fuels;
	}
}
