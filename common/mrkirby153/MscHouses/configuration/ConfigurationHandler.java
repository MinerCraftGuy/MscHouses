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
		BlockId.ORE_COPPER = config.get(Configuration.CATEGORY_BLOCK, "Copper Ore", BlockId.ORE_COPPER_DEFAULT).getInt();
		BlockId.HOUSE_BASE = config.get(CATEGORY_HOUSE, "House Base", BlockId.HOUSE_BASE_DEFAULT).getInt();
		
		ConfigurationSettings.House_Tool_damage = config.get(CATEGORY_TOOLS, "House Tool Damage", ConfigurationSettings.House_Tool_damage_Default).getInt();
		ConfigurationSettings.DISPLAY_VERSION_RESULT = true;
        ConfigurationSettings.LAST_DISCOVERED_VERSION = config.get(Configuration.CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_DEFAULT).getString();
        ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE = config.get(Configuration.CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_DEFAULT).getString();
        ConfigurationSettings.generateCoper = config.get(Configuration.CATEGORY_GENERAL, "Generate Copper", ConfigurationSettings.generteCopper_Default).getBoolean(ConfigurationSettings.generteCopper_Default);

		//Items
		ItemId.DEBUG = config.get(CATEGORY_TOOLS, "Debug tool", ItemId.DEBUG_DEFAULT).getInt();
		ItemId.INGOT_COPPER = config.get(Configuration.CATEGORY_ITEM, "Copper Ingot", ItemId.INGOT_COPPER_DEFAULT).getInt();
		ItemId.ITEM_HOUSETOOL = config.get(CATEGORY_TOOLS, "House Tool", ItemId.ITEM_HOUSETOOL_DEFAULT).getInt();
		ItemId.ITEM_INVINCBLE = config.get(Configuration.CATEGORY_ITEM, "Invincible", ItemId.ITEM_INVINCIBLE_DEFAULT).getInt();
		ItemId.ITEM_PCB = config.get(CATEGORY_TOOLS, "PCB", ItemId.ITEM_INVINCIBLE_DEFAULT).getInt();
		ItemId.ITEM_MODUEL = config.get(CATEGORY_TOOLS, "Moduel Item", ItemId.ITEM_MODUEL_DEFAULT).getInt();
		ItemId.ITEM_MODIFYER = config.get(CATEGORY_TOOLS, "Modifyer", ItemId.ITEM_MODIFYER_DEFAULT).getInt();
		ItemId.ITEM_MODIFYER_EXTRA = config.get(CATEGORY_TOOLS, "Mod added Material modifyer", ItemId.ITEM_MODIFYER_EXTRA_DEFAULT).getInt();
		ItemId.ITEM_INFINITE_DIM = config.get(Configuration.CATEGORY_ITEM, "Vial of infinite dimensions", ItemId.ITEM_INFINITE_DIM_DEFAULT).getInt();

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
