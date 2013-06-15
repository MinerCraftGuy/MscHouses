package mrkirby153.MscHouses.core.helpers;

import mrkirby153.MscHouses.api.FuelRegistry;
import net.minecraft.item.Item;
/**
 * 
 * Msc Houses
 *
 * FuelHelper
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class FuelHelper {

	public static void registerFuels(){
		//Adds fuels
		//Default fuels
		FuelRegistry.addFuel(Item.coal);
		FuelRegistry.addFuel(Item.bucketLava);
		FuelRegistry.addFuel(Item.netherStar);
	}
	
}
