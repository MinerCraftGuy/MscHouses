package mrkirby153.MscHouses.core.helpers;

import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreHelper {
	public static void registerOres(){
		OreDictionary.registerOre("ingotCopper", new ItemStack(MscHouses.ingotCopper));
	}
}
