package mrkirby153.MscHouses.configuration;

import java.io.File;

import mrkirby153.MscHouses.lib.BlockId;
import mrkirby153.MscHouses.lib.ItemId;
import net.minecraftforge.common.Configuration;
/**
 * 
 * Msc Houses
 *
 * ConfigurationHandler
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ConfigurationHandler {
	public static Configuration config;
	public static String CATEGORY_HOUSE = "house";
	public static String CATEGORY_TOOLS = "tools";
	public static void init(File configFile){
		config = new Configuration(configFile);
		//Blocks
		BlockId.HOUSE_HUT = config.get(CATEGORY_HOUSE, "Hut", BlockId.HOUSE_HUT_DEFAULT).getInt();
		BlockId.HOUSE_9X9 = config.get(CATEGORY_HOUSE, "Nine by Nine", BlockId.HOUSE_9X9_DEFAULT).getInt();
		BlockId.ORE_COPPER = config.get(config.CATEGORY_BLOCK, "Copper Ore", BlockId.ORE_COPPER_DEFAULT).getInt();
		BlockId.HOUSE_9X9_DELUXE = config.get(CATEGORY_HOUSE, "Nine by Nine deluxe", BlockId.HOUSE_9X9_DEUXE_DEFAULT).getInt();
		BlockId.HOUSE_BASE = config.get(CATEGORY_HOUSE, "House Base", BlockId.HOUSE_BASE_DEFAULT).getInt();
		//General
		ConfigurationSettings.Invincible = config.get(CATEGORY_TOOLS, "Invincible Item Enabled", ConfigurationSettings.Invibcible_Default).getBoolean(ConfigurationSettings.Invibcible_Default);
		ConfigurationSettings.Invincible_time = config.get(CATEGORY_TOOLS, "Invincible recharge time (Seconds)", ConfigurationSettings.Invincible_time_Default).getInt();
		ConfigurationSettings.House_Tool_damage = config.get(CATEGORY_TOOLS, "House Tool Damage", ConfigurationSettings.House_Tool_damage_Default).getInt();
		ConfigurationSettings.DISPLAY_VERSION_RESULT = true;//config.get(config.CATEGORY_GENERAL, ConfigurationSettings.DISPLAY_VERSION_RESULT_CONFIGNAME, ConfigurationSettings.DISPLAY_VERSION_RESULT_DEFAULT).getBoolean(ConfigurationSettings.DISPLAY_VERSION_RESULT_DEFAULT);
        ConfigurationSettings.LAST_DISCOVERED_VERSION = config.get(config.CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_DEFAULT).getString();
        ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE = config.get(config.CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_DEFAULT).getString();
        ConfigurationSettings.generateCoper = config.get(config.CATEGORY_GENERAL, "Generate Copper", ConfigurationSettings.generteCopper_Default).getBoolean(ConfigurationSettings.generteCopper_Default);

		//Items
		ItemId.DEBUG = config.get(CATEGORY_TOOLS, "Debug tool", ItemId.DEBUG_DEFAULT).getInt();
		ItemId.INGOT_COPPER = config.get(config.CATEGORY_ITEM, "Copper Ingot", ItemId.INGOT_COPPER_DEFAULT).getInt();
		ItemId.ITEM_HOUSETOOL = config.get(CATEGORY_TOOLS, "House Tool", ItemId.ITEM_HOUSETOOL_DEFAULT).getInt();
		ItemId.ITEM_INVINCBLE = config.get(config.CATEGORY_ITEM, "Invincible", ItemId.ITEM_INVINCIBLE_DEFAULT).getInt();
		ItemId.ITEM_PCB = config.get(CATEGORY_TOOLS, "PCB", ItemId.ITEM_INVINCIBLE_DEFAULT).getInt();
		ItemId.ITEM_MODUEL = config.get(CATEGORY_TOOLS, "Moduel Item", ItemId.ITEM_MODUEL_DEFAULT).getInt();
		ItemId.ITEM_MODIFYER = config.get(CATEGORY_TOOLS, "Modifyer", ItemId.ITEM_MODIFYER_DEFAULT).getInt();
		ItemId.ITEM_MODIFYER_EXTRA = config.get(CATEGORY_TOOLS, "Mod added Material modifyer", ItemId.ITEM_MODIFYER_EXTRA_DEFAULT).getInt();
		ItemId.ITEM_INFINITE_DIM = config.get(config.CATEGORY_ITEM, "Vial of infinite dimensions", ItemId.ITEM_INFINITE_DIM_DEFAULT).getInt();

	}
	
	public static void set(String categoryName, String propertyName, String newValue){
		config.load();
		if(config.getCategoryNames().contains(categoryName)){
			if(config.getCategory(categoryName).containsKey(propertyName)){
				config.getCategory(categoryName).get(propertyName).set(newValue);
			}
		}
		config.save();
	}
}
