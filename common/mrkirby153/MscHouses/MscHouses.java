package mrkirby153.MscHouses;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "MscHouses", name = "MscHouses", version = "CLOSED BETA")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MscHouses {
	public static HouseGen h= new HouseGen();
	public static final CreativeTabs tabHouse = new CreativeTabHouse(CreativeTabs.getNextID(), "MscHouses");
	public static final char COLOR_CODE = '\u00A7';
	public static int HutID;
	public static Block House_Hut;
	
	public static int HouseToolID;
	public static Item HouseTool;
	public static int HouseToolDamage;
	
	public static int ninebynineID;
	public static Block House_9x9;
	
	public static int villageId;
	public static Block village;
	
	public static int Statue_ZombieID;
	public static Block Statue_Zombie;

	public static Item debug;
	
	public static int PCBID;
	public static Item PCB;
	
	public static int InvincibleId;
	public static Item invincible;
	public static boolean Invincible;
	public static Item invinvibleActive;
	CraftingHandler cHandler = (CraftingHandler) new CraftingHandler();
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try{
			cfg.load();
			HouseToolDamage = cfg.get(cfg.CATEGORY_GENERAL, "House Tool damage", 10).getInt();
			Invincible= cfg.get(cfg.CATEGORY_GENERAL, "Invincibility Item", false).getBoolean(false);
			InvincibleId = cfg.getItem("Invincible Item", 4002).getInt();
			HutID = cfg.getBlock("Basic Hut", 700).getInt();
			HouseToolID = cfg.getItem("House Tool", 4000).getInt();
			ninebynineID = cfg.getBlock("9x9 House", 701).getInt();
			villageId = cfg.getBlock("Village Generator", 702).getInt();
			Statue_ZombieID = cfg.getBlock("Zombie Statue Generator", 703).getInt();
			PCBID = cfg.getItem("PCB", 4001).getInt();
		}finally{
			cfg.save();
		}
	}
	
	@Init
	public void init(FMLInitializationEvent event){
		House_Hut= new BlockHouse_Hut(HutID).setUnlocalizedName("hut");
		House_9x9 = new BlockHouse_9x9(ninebynineID).setUnlocalizedName("9x9");
		HouseTool = new ItemHouseTool(HouseToolID).setUnlocalizedName("HouseTool");
		village = new BlockVillage(villageId).setUnlocalizedName("village");
		Statue_Zombie = new BlockStatue_Zombie(Statue_ZombieID).setUnlocalizedName("Statue_Zombie");
		debug = new Debug(698).setUnlocalizedName("debug");
		PCB = new ItemPCB(PCBID).setUnlocalizedName("pcbBoard");
		invincible = new ItemInvincible(InvincibleId).setUnlocalizedName("Invincible");
		addCrafting();
		addNames();
	//	EntityRegistry.registerModEntity(EntityMarker.class, "Marker", 1, this, 80, 3, true);
	}
	
	private void addNames() {
		LanguageRegistry.addName(House_Hut, "Hut Building House Block. " + this.COLOR_CODE + "bMade by: mrkirby153");
		LanguageRegistry.addName(HouseTool, this.COLOR_CODE +  "dHouse Tool");
		LanguageRegistry.addName(House_9x9, "9x9 House Building Block. " + this.COLOR_CODE + "bOrigilally made by: Direwolf20");
		LanguageRegistry.addName(village, "Village Generator");
		LanguageRegistry.addName(Statue_Zombie, "Zombie Statue Maker");
		LanguageRegistry.addName(PCB, "PCB Board");
		LanguageRegistry.addName(invincible, "Invincible Item");
		LanguageRegistry.instance().addStringLocalization("itemGroup.MscHouses", "Msc. Houses");
	//	LanguageRegistry.instance().addStringLocalization("entity.MscHouses.Marker.name", "Marker");
		GameRegistry.registerCraftingHandler(cHandler);
		
	}

	public void addCrafting(){
		GameRegistry.addRecipe(new ItemStack(this.PCB, 5), new Object[]{"X#X", "XXX", "X#X", 'X', Item.ingotIron, '#', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(this.HouseTool, 1), new Object[]{"  X", " # ", "#  ", 'X', this.PCB, '#', Item.stick});
	}

}
