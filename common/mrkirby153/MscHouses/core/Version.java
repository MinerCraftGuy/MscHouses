package mrkirby153.MscHouses.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;

import mrkirby153.MscHouses.core.helpers.LogHelper;
import mrkirby153.MscHouses.lib.Reference;
import net.minecraftforge.common.Property;
/**
 * 
 * Msc Houses
 *
 * VersionHelper
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Version implements Runnable{
	private static Version instance = new Version();


	public enum EnumUpdateState {
		CURRENT, OUTDATED, CONNECTION_ERROR
	}

	private static final String REMOTE_VERSION_FILE = "https://dl.dropboxusercontent.com/u/121954827/modding/MscHouses/version.txt";
	private static final String REMOTE_CHANGELOG_ROOT = "https://dl.dropboxusercontent.com/u/121954827/modding/MscHouses/changelog/";

	public static EnumUpdateState currentVersion = EnumUpdateState.CURRENT;

	public static final int FORGE_VERSION_MAJOR = 4;
	public static final int FORGE_VERSION_MINOR = 0;
	public static final int FORGE_VERSION_PATHC = 0;

	private static String reccomendedVersion;
	private static String[] cachedChangelog;
	public static String VERSION = Reference.VERSION_NUMBER;
	public static String BUILD_NUMBER = Reference.BUILD_NUMBER;

	public static String getVersion(){
		return VERSION + " (:"+BUILD_NUMBER+":)";
	}

	public static boolean isOutdated(){
		return currentVersion == EnumUpdateState.OUTDATED;
	}
	public static boolean needsUpdateNoticeAndMarkAsSeen(){
		if(!isOutdated())
			return false;
		Property property = MscHouses.config.get("vars", "version.seen", VERSION);
		property.comment = "indicates the last verison the user has been informed about and will surpress furhter notices about it.";
		String seenVersion = property.getString();

		if(reccomendedVersion == null || reccomendedVersion.equals(seenVersion))
			return false;

		property.set(reccomendedVersion);
		MscHouses.config.save();
		return true;
	}

	public static String getReccomendedVersion(){
		return reccomendedVersion;
	}

	public static void versionCheck(){
		try{
			if("0.0.0".equals(VERSION)) return;

			String location = REMOTE_VERSION_FILE;
			HttpURLConnection conn = null;
			while(location != null && !location.isEmpty()){
				URL url= new URL(location);
				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestProperty("User-Agent",
						"Mozilla/5.0 (Windows; U; Windows NT 6.0; ru; rv:1.9.0.11) Gecko/2009060215 Firefox/3.0.11 (.NET CLR 3.5.30729)");
				conn.connect();
				location = conn.getHeaderField("Location");
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = null;
			String mcVersion = MscHouses.getMCVersion();

			while((line =reader.readLine()) != null){
				if(line.startsWith(mcVersion)){
					if(line.contains(Reference.MOD_NAME)){
						String[] tokens = line.split(":");
						reccomendedVersion = tokens[2];

						if(line.endsWith(VERSION)){
							LogHelper.log(Level.FINER, "Using latest version (" + getVersion()+")");
							currentVersion = EnumUpdateState.CURRENT;
							return;
						}
					}
				}
			}

			LogHelper.log(Level.WARNING, "Using outdated version [" + VERSION + "(build:"+BUILD_NUMBER+")] for Minecraft " +mcVersion
					+". Consider updating");
			currentVersion = EnumUpdateState.OUTDATED;

		}catch(Exception e){
			LogHelper.log(Level.SEVERE, "Unable to read from remote version athouruity!");
			LogHelper.log(Level.SEVERE, e.toString());
			currentVersion = EnumUpdateState.CONNECTION_ERROR;
		}
	}

	public static String[] getChangelog(){
		if(cachedChangelog == null){
			cachedChangelog = grabChangelog(reccomendedVersion);
		}
		return cachedChangelog;
	}

	public static String[] grabChangelog(String version) {

		try {

			String location = REMOTE_CHANGELOG_ROOT + version + ".txt";
			HttpURLConnection conn = null;
			while (location != null && !location.isEmpty()) {
				URL url = new URL(location);
				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestProperty("User-Agent",
						"Mozilla/5.0 (Windows; U; Windows NT 6.0; ru; rv:1.9.0.11) Gecko/2009060215 Firefox/3.0.11 (.NET CLR 3.5.30729)");
				conn.connect();
				location = conn.getHeaderField("Location");
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line = null;
			ArrayList<String> changelog = new ArrayList<String>();
			while ((line = reader.readLine()) != null) {
				if (line.startsWith("#")) {
					continue;
				}
				if (line.isEmpty()) {
					continue;
				}

				changelog.add(line);
			}

			return changelog.toArray(new String[0]);

		} catch (Exception ex) {
			ex.printStackTrace();
			LogHelper.log(Level.WARNING, "Unable to read changelog from remote site.");
		}

		return new String[] { String.format("Unable to retrieve changelog for %s %s", Reference.MOD_NAME, version) };
	}


	@Override
    public void run() {

        int count = 0;
        currentVersion = null;

       LogHelper.log(Level.INFO, "Beginning version check");

        try {
            while ((count < 3) && ((currentVersion == null) || (currentVersion == EnumUpdateState.CONNECTION_ERROR))) {
                versionCheck();
                count++;

                if (currentVersion == EnumUpdateState.CONNECTION_ERROR) {
                    LogHelper.log(Level.WARNING,"Version check attempt " + count + " failed, trying again in 10 seconds");
                    Thread.sleep(10000);
                }
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (currentVersion == EnumUpdateState.CONNECTION_ERROR) {
           LogHelper.log(Level.WARNING,"Version check failed");
        }

    }

    public static void check() {

        new Thread(instance).start();
    }

}