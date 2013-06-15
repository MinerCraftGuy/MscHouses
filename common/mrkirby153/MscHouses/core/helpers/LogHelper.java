package mrkirby153.MscHouses.core.helpers;

import java.util.logging.Level;
import java.util.logging.Logger;

import mrkirby153.MscHouses.lib.Reference;
import cpw.mods.fml.common.FMLLog;
/**
 * 
 * Msc Houses
 *
 * LogHelper
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class LogHelper {
	
	private static Logger mhLogger = Logger.getLogger(Reference.MOD_ID);
	
	public static void init(){
		mhLogger.setParent(FMLLog.getLogger());
	}
	
	public static void log(Level logLevel, String message){
		mhLogger.log(logLevel, message);
	}

}
