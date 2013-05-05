package mrkirby153.MscHouses.core.localization;

import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.configuration.ConfigurationSettings;
import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.items.ModItems;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TEMP_ITEMNAMES {
	public static void init(){
		itemNames();
		itemMetaNames();
		blockNames();
		generalNames();
	}
	private static void itemNames(){
		LanguageRegistry.addName(ModItems.Debug, "Debug Tool");
		LanguageRegistry.addName(ModItems.ingotCopper, "Copper ingot (Texture is a WIP)");
		LanguageRegistry.addName(ModItems.HouseTool, "House Tool");
		if(ConfigurationSettings.Invincible){
			LanguageRegistry.addName(ModItems.Invincible, "Invincible Item");
		}
		LanguageRegistry.addName(ModItems.PCB, "Printed Circut Board (PCB)");
		LanguageRegistry.addName(ModItems.moduel, "Moduel");
	}
	private static void blockNames(){
		LanguageRegistry.addName(ModBlocks.OreCopper, "Copper Ore");
		LanguageRegistry.addName(ModBlocks.House_9x9, "Nine by Nine");
		LanguageRegistry.addName(ModBlocks.House9x9_Deluxe, "Nine by Nine deluxe");
		LanguageRegistry.addName(ModBlocks.House_Hut, "Hut Building Block");

		//		LanguageRegistry.addName(ModBlocks.Statue_Zombie, "Zombie Statue Maker");
	}
	private static void generalNames(){
		LanguageRegistry.instance().addStringLocalization("itemGroup.MscHouses", MscHouses.COLOR_CODE +"dMsc. Houses");
	}

	private static void itemMetaNames(){
		/* Moduel Names */
		String[] itemNames = {"Base", "Hut", "9x9", "Deluxe 9x9" };
		for(int i = 0; i < itemNames.length; i++){
			LanguageRegistry.addName(new ItemStack(ModItems.moduel,1,i), itemNames[i] + " Moduel");
		}
	}
}
