package mrkirby153.MscHouses.creativeTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabModuel extends CreativeTabs{
	public CreativeTabModuel(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		// TODO Auto-generated method stub
		return ModItems.HouseTool.itemID;
	}
}
