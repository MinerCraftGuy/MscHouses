package mrkirby153.MscHouses.config;

import java.io.File;

import mrkirby153.MscHouses.block.BlockID;
import mrkirby153.MscHouses.item.ItemID;
import net.minecraftforge.common.Configuration;
public class ConfigurationHandler {
	public static Configuration config;

	public static final String CATAGORY_STRUCTURE = "structures";
	public static final String CATAGORY_HOUSES = "houses";
	public static final String CATAGORY_TOOLS = "tools";
	public static void init(File configFile){
		config = new Configuration(configFile);
		try{
			config.load();
			//General
			ConfigurationSettings.ITEM_INVINCIBLE_ENABLED = config.get(CATAGORY_TOOLS, "Invincible Item Enabled", false).getBoolean(false);
			ConfigurationSettings.ITEM_INVINCIBLE_RECHARGE = config.get(CATAGORY_TOOLS, "Recharge time for invnicible item", 6000).getInt();
			ConfigurationSettings.ITEM_HOUSETOOL_DAMAGE = config.get(CATAGORY_TOOLS, "Number of uses for house tool", 10).getInt();

			//Houses
			BlockID.HOUSE_HUT = config.get(CATAGORY_HOUSES, "Hut", BlockID.HUT_ID_DEFAULT).getInt();
			BlockID.HOUSE_9X9 = config.get(CATAGORY_HOUSES, "Nine by Nine", BlockID.NINEBYNINE_ID_DEFAULT).getInt();
			BlockID.HOUSE_9X9_DELUXE = config.get(CATAGORY_HOUSES, "9x9 deluxe", BlockID.NINEBYNINE_DEUXE_ID_DEFAULT).getInt();

			//Structures
			BlockID.STRUCTURE_STATUE_ZOMBIE = config.get(CATAGORY_STRUCTURE, "Zombie Statue", BlockID.STATUE_ZOMBIE_ID_DEFAULT).getInt();
			BlockID.STRUCTURE_VILALGE = config.get(CATAGORY_STRUCTURE, "Village", BlockID.VILLAGE_ID_DEFAULT).getInt();

			//Items
			ItemID.DEBUG = config.get(CATAGORY_TOOLS, "Debug Item", ItemID.DEBUG_DEFAULT).getInt();
			ItemID.HOUSE_TOOL = config.get(CATAGORY_TOOLS, "House Tool", ItemID.HOUSE_TOOL_DEFAULT).getInt();
			ItemID.INVINCIBLE = config.get(CATAGORY_TOOLS, "Invincible Item", ItemID.INVINCIBLE_DFAULT).getInt();
			ItemID.INGOT_COPPER = config.get(config.CATEGORY_ITEM, "Copper Ingot", ItemID.INGOT_COPPER_DEFAULT).getInt();
			ItemID.PCB = config.get(config.CATEGORY_GENERAL, "PCB", ItemID.PCB_DEFAULT).getInt();
		}finally{
			config.save();
		}

	}
}
