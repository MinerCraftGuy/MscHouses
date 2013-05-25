package mrkirby153.MscHouses.creativeTab;

import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * MscHouses
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CreativeTabHouse extends CreativeTabs {

	public CreativeTabHouse(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		// TODO Auto-generated method stub
		return ModItems.modifyer.itemID;
	}

}