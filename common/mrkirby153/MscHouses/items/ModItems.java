package mrkirby153.MscHouses.items;

import java.util.logging.Level;

import mrkirby153.MscHouses.configuration.ConfigurationSettings;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import mrkirby153.MscHouses.lib.ItemId;
import net.minecraft.item.Item;

public class ModItems {
	public static Item Debug;
	public static Item ingotCopper;
	public static Item HouseTool;
	public static Item Invincible;
	public static Item PCB;
	public static Item moduel;
	public static Item modifyer;

	public static void init(){
		Debug = new Item_Debug(ItemId.DEBUG).setUnlocalizedName("debug");
		ingotCopper = new ItemCopper(ItemId.INGOT_COPPER).setUnlocalizedName("ingotCopper");
		HouseTool = new ItemHouseTool(ItemId.ITEM_HOUSETOOL).setUnlocalizedName("ingotCopper");
		if(ConfigurationSettings.Invincible){
			Invincible = new ItemInvincible(ItemId.ITEM_INVINCBLE).setUnlocalizedName("invincible");
			LogHelper.log(Level.WARNING, "Invincible Item Enabled!");
		}
		PCB = new ItemPCB(ItemId.ITEM_PCB).setUnlocalizedName("pcb");
		moduel = new ItemModuel(ItemId.ITEM_MODUEL).setUnlocalizedName("Moduel");
		modifyer = new ItemMaterialModifyer(ItemId.ITEM_MODIFYER).setUnlocalizedName("Modifyer");
	}
}
