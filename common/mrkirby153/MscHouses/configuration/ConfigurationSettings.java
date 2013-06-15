package mrkirby153.MscHouses.configuration;
/**
 * 
 * Msc Houses
 *
 * ConfigurationSettings
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ConfigurationSettings {
	
	/*
	 * Version check related settings
	 */
	public static boolean DISPLAY_VERSION_RESULT;
	public static final String DISPLAY_VERSION_RESULT_CONFIGNAME = "display Results";
	public static final boolean DISPLAY_VERSION_RESULT_DEFAULT = true;
	
	public static String LAST_DISCOVERED_VERSION;
	public static final String LAST_DISCOVERED_VERSION_CONFIGNAME = "Last Discovered Version";
	public static String LAST_DISCOVERED_VERSION_DEFAULT = "";
	
	public static String LAST_DISCOVERED_VERSION_TYPE;
	public static final String LAST_DISCOVERED_VERSION_TYPE_CONFIGNAME = "Last discovered version type";
	public static final String LAST_DISCOVERED_VERSION_TYPE_DEFAULT = "";
	public static boolean Invincible;
	public static int Invincible_time;
	public static int House_Tool_damage;
	public static boolean generateCoper;
	
	public static boolean Invibcible_Default = false;
	public static int Invincible_time_Default = 6000;
	public static int House_Tool_damage_Default = 10;
	public static boolean generteCopper_Default = false;

}
