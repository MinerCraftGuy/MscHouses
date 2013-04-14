package mrkirby153.MscHouses.core;

import java.io.File;

import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.configuration.ConfigurationHandler;
import mrkirby153.MscHouses.core.handlers.LocalizationHandler;
import mrkirby153.MscHouses.core.handlers.VersionCheckTickHandler;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import mrkirby153.MscHouses.core.helpers.VersionHelper;
import mrkirby153.MscHouses.core.lang.lang;
import mrkirby153.MscHouses.crafting.CraftingBench;
import mrkirby153.MscHouses.crafting.Furnace;
import mrkirby153.MscHouses.creativeTab.CreativeTabHouse;
import mrkirby153.MscHouses.generation.HouseGen;
import mrkirby153.MscHouses.generation.MscHouses_WorldGen;
import mrkirby153.MscHouses.items.ModItems;
import mrkirby153.MscHouses.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

/**
 * MscHouses
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MscHouses {
	public static HouseGen h = new HouseGen();
	public static final CreativeTabs tabHouse = new CreativeTabHouse(
			CreativeTabs.getNextID(), "MscHouses");
	@Instance("MscHouses")
	public static MscHouses instance;
	public static final char COLOR_CODE = '\u00A7';

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		//Inintialize the Log Helper
		LogHelper.init();

		LocalizationHandler.loadLanguages();


		//register Version check tick handler.

		//Check version
		VersionHelper.execute();

		//Initialize config
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
		//Initialize blocks
		ModBlocks.init();
		//Initalize Items
		ModItems.init();
		//Name Items/blocks
		lang.en_us();
		//Inialize crafting/smelting recipies
		CraftingBench.init();
		Furnace.init();
		TickRegistry.registerTickHandler(new VersionCheckTickHandler(), Side.CLIENT);
	//	System.out.println("Testing");
	}

	@Init
	public void init(FMLInitializationEvent event) {


		GameRegistry.registerWorldGenerator(new MscHouses_WorldGen());
	}

}
