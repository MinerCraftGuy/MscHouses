package mrkirby153.MscHouses.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	public static Item houseTool;
	public static Item Debug;
	public static Item PCB;
	public static Item Invincible;
	public static Item ingotCopper;
	public static void init() {
		houseTool = new ItemHouseTool(ItemID.HOUSE_TOOL).setUnlocalizedName("HouseTool");
		Debug = new Debug(ItemID.DEBUG).setUnlocalizedName("Debug");
		PCB = new ItemPCB(ItemID.PCB).setUnlocalizedName("PCB");
		Invincible = new ItemInvincible(ItemID.INVINCIBLE).setUnlocalizedName("Invincible");
		ingotCopper = new ItemCopper(ItemID.INGOT_COPPER).setUnlocalizedName("ingotCopper");
		
		OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
		
	}
}
