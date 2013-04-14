package mrkirby153.MscHouses.core.lang;

import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.configuration.ConfigurationSettings;
import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.items.ModItems;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class lang {

	public static void en_us(){
		LanguageRegistry.addName(ModBlocks.House_Hut, "Hut Building House Block. "
				+ MscHouses.COLOR_CODE + "bMade by: mrkirby153");
		LanguageRegistry.addName(ModItems.HouseTool, MscHouses.COLOR_CODE
				+ "dHouse Tool");
		LanguageRegistry.addName(ModBlocks.House_9x9, "9x9 House Building Block. "
				+ MscHouses.COLOR_CODE + "bOrigilally made by: Direwolf20");
		//	LanguageRegistry.addName(ModBlocks.Statue_Zombie, "Zombie Statue Maker");
		LanguageRegistry.addName(ModItems.PCB, "PCB Board");
		if(ConfigurationSettings.Invincible){
			LanguageRegistry.addName(ModItems.Invincible, "Invincible Item");
		}
		LanguageRegistry.addName(ModBlocks.House9x9_Deluxe, "Deluxe 9x9. "
				+ MscHouses.COLOR_CODE + "bAdapted from: Direwolf20's 9x9");
		LanguageRegistry.addName(ModItems.Debug, "Debug Item");
		LanguageRegistry.addName(ModBlocks.OreCopper, "CopperOre");
		LanguageRegistry.addName(ModItems.ingotCopper, "Copper Ingot");
		//Name Creative tab.
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.MscHouses", "Msc. Houses");


	}
}
