package mrkirby153.MscHouses.core;

import java.io.File;

import mrkirby153.MscHouses.CreativeTabHouse;
import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.config.ConfigurationHandler;
import mrkirby153.MscHouses.item.ModItems;
import mrkirby153.MscHouses.lib.Reference;
import mrkirby153.MscHouses.worldGen.HouseGen;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

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
		
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_NAME + ".cfg"));
	}

	@Init
	public void init(FMLInitializationEvent event) {
	//	GameRegistry.registerWorldGenerator(new MscHouses_WorldGen());
		ModBlocks.init();
		ModItems.init();
	}

	private void addNames() {
		/*
		LanguageRegistry.addName(House_Hut, "Hut Building House Block. "
				+ MscHouses.COLOR_CODE + "bMade by: mrkirby153");
		LanguageRegistry.addName(HouseTool, MscHouses.COLOR_CODE
				+ "dHouse Tool");
		LanguageRegistry.addName(House_9x9, "9x9 House Building Block. "
				+ MscHouses.COLOR_CODE + "bOrigilally made by: Direwolf20");
		LanguageRegistry.addName(village, "Village Generator");
		LanguageRegistry.addName(Statue_Zombie, "Zombie Statue Maker");
		LanguageRegistry.addName(PCB, "PCB Board");
		LanguageRegistry.addName(invincible, "Invincible Item");
		LanguageRegistry.addName(House_Delux9x9, "Delux 9x9. "
				+ MscHouses.COLOR_CODE + "bAdapted from: Direwolf20's 9x9");
		LanguageRegistry.addName(debug, "Debug Item");
		LanguageRegistry.addName(CopperOre, "CopperOre");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		//Name Creative tab.
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.MscHouses", "Msc. Houses");


	}

	public void addCrafting() {
		GameRegistry.addRecipe(new ItemStack(PCB, 1), new Object[]{
				"X#X", "XXX", "X#X", 'X', Item.ingotIron, '#', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(HouseTool, 1),
				new Object[]{"  X", " # ", "#  ", 'X', PCB, '#',						Item.stick});
		GameRegistry.addRecipe(new ItemStack(House_Hut, 1),
				new Object[]{"XXX", "XYX", "XXX", 'X', Block.planks, 'Y',
						Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(House_9x9, 1),
				new Object[]{"X#X", "X@X", "X X", 'X', Block.stone, '#',
						House_Hut, '@', PCB});
		GameRegistry.addRecipe(new ItemStack(House_Delux9x9, 1),
				new Object[]{"XZX", "XYX", "@@@", 'X', Item.ingotIron, 'Y',
						PCB, 'Z', Item.diamond, '@',
						House_9x9});
		if (Invincible) {
			GameRegistry.addRecipe(
					new ItemStack(invincible, 1, 6000), new Object[]{
							"XXX", "X X", "XXX", 'X', Item.emerald});
		}


	}

	public void addSmelting(){
		GameRegistry.addSmelting(Block.blockDiamond.blockID, new ItemStack(
				MscHouses.invincible, 1, 300), 10F);
	//	GameRegistry.addSmelting(MscHouses.CopperOre.blockID, new ItemStack(ingotCopper), 1F);
	}

	public void regesterOres(){
		OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
//		System.
	}

	public void dictionaryRecipies(){
		GameRegistry.addRecipe(new ShapedOreRecipe(MscHouses.PCB, true, new Object[]{"X X", " Y ", "X X", Character.valueOf('X'), ingotCopper, Character.valueOf('Y'), Item.redstone}));
	}
		 */
		/*
		 * [][][]
		 * [][][]
		 * [][][]
		 */
	}
}
