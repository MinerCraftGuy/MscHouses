package mrkirby153.MscHouses.configuration;

import java.io.File;

import mrkirby153.MscHouses.core.Version;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class MscHousesConfiguration extends Configuration{
	
	public MscHousesConfiguration(File file)
	{
		super(file);
	}
	@Override
	public void save(){
		Property versionProp = get(CATEGORY_GENERAL, "version", Version.VERSION);
		versionProp.set(Version.VERSION);
		super.save();
	}
}
