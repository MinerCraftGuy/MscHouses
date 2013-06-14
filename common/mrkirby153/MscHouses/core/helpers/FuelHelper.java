package mrkirby153.MscHouses.core.helpers;

import java.util.ArrayList;
import java.util.logging.Level;

import mrkirby153.MscHouses.core.handlers.FuelHandler;
import net.minecraft.item.Item;

public class FuelHelper {

	public static void registerFuels(){
		//Adds fuels
		//Default fuels
		FuelHandler.addFuel(Item.coal);
		FuelHandler.addFuel(Item.bucketLava);
		FuelHandler.addFuel(Item.netherStar);
		//Gets and prints the arraylist as an ArrayList
		ArrayList<Item> fuels_arrayList = FuelHandler.getValidFuelsAsArrayList();
		LogHelper.log(Level.SEVERE, fuels_arrayList.toString());
		//gets and prints the arraylist as a Array;
		Item[] fuels_List = FuelHandler.getValidFulesAsList();
		for(int i = 1; i < fuels_List.length; i++){
			LogHelper.log(Level.SEVERE, fuels_List[i].toString());
		}
	}
	
}
