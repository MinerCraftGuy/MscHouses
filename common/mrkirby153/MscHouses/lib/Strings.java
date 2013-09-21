package mrkirby153.MscHouses.lib;
/**
 * 
 * Msc Houses
 *
 * Strings
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Strings {
	/* General keys */
    public static final String TRUE = "true";
    public static final String FALSE = "false";

    /* Localization Prefix */
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
    /* Version check related constants */
    public static final String CHECK_FAILED = "version.mschouses:check_fail";
	public static final String CHECK_INIT = "version.mschouses:check_init";
	public static final String CHANGELOG_MISSING = "version.mschouses:missing_chnglog";
	public static final String REMOTE_READ_FAIL = "version.mschouses:remote_read_fail";
	public static final String OUTDATED = "version.mschouses:outdated";
	public static final String LATEST = "version.mschouses:latest";
	
	/* Fingerprint related constants */
	public static final String NO_FINGERPRINT_MESSAGE = "This version of "+Reference.MOD_NAME+" is in development and may contain features that are unstable";
	public static final String INVALID_FINGERPRINT_MESSAGE = "This version of "+Reference.MOD_NAME+" has been modified from the original!";
	/* Item Names */
	public static final String ITEM_DEBUG_NAME = "debug";
	public static final String ITEM_INGOT_COPPER_NAME = "ingotCopper";
	public static final String ITEM_HOUSE_TOOL_NAME = "houseTool";
	public static final String ITEM_PCB_NAME = "pcb";
	public static final String ITEM_MODUEL_NAME = "moduel";
	public static final String ITEM_MATERIAL_MODIFYER_NAME = "material_modifyer";
	public static final String ITEM_INFINITE_DIM_NAME = "jar_of_dim";
	
	/* Block Names */
	public static final String BLOCK_ORE_COPPER_NAME = "copperOre";
	public static final String BLOCK_HOUSE_GEN_NAME = "houseGen";
	/* Creative Tabs */
	public static final String TAB_MAIN = "tab.mschouses:main";
	public static final String TAB_MODUEL = "tab.mschouses:moduel";
	public static final String TAB_MODIFYER = "tab.mschouses:modifyer";
}
