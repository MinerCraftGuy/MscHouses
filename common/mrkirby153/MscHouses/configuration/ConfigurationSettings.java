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
	public static int House_Tool_damage;
	public static boolean generateCoper;
	public static int[] blacklist_ids;
	
	public static int[] blacklist_ids_default_null = {8, 9, 10, 11, 12, 13, 14, 15, 16, 21, 22, 26, 27, 28, 29, 31, 32, 33, 34, 36,
		37, 38, 39, 40, 41, 42, 51, 52, 56, 57, 59, 60, 63, 66, 68, 69, 70, 71, 72, 73, 75, 77, 84, 90, 92, 93, 95, 104, 105,
		106, 111, 116, 117, 119, 120, 122, 127, 129, 131, 132, 133, 138, 140, 141, 143, 144, 147, 148, 149, 151, 153, 155, 159};
	public static String blacklist_ids_default = "8, 9, 10, 11, 12, 13, 14, 15, 16, 21, 22, 26, 27, 28, 29, 31, 32, 33, 34, 36, 37, 38, 39, 40, 41, 42, 51, 52, 56, 57, 59, 60, 63, 66, 68, 69, 70, 71, 72, 73, 75, 77, 84, 90, 92, 93, 95, 104, 105, 106, 111, 116, 117, 119, 120, 122, 127, 129, 131, 132, 133, 138, 140, 141, 143, 144, 147, 148, 149, 151, 153, 155, 159";
	public static int House_Tool_damage_Default = 10;
	public static boolean generteCopper_Default = false;

}
