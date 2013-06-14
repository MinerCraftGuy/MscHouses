package mrkirby153.MscHouses.core.handlers;

import java.util.ArrayList;
import java.util.logging.Level;

import mrkirby153.MscHouses.core.helpers.LogHelper;
import net.minecraft.item.Item;

public class FuelHandler {

	public static ArrayList<Item> validFuels = new ArrayList<Item>();
	
	public static void addFuel(Item fuel){
		FuelHandler.validFuels.add(fuel);
		LogHelper.log(Level.ALL, "Successfully registered fuel: " + fuel);
	}
	
	public static ArrayList<Item> getValidFuelsAsArrayList(){
		return validFuels;
	}
	
	public static Item[] getValidFulesAsList(){
		Item[] fuels = new Item[validFuels.size()];
		fuels = validFuels.toArray(fuels);
		return fuels;
	}
}
