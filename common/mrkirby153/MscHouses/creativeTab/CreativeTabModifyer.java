package mrkirby153.MscHouses.creativeTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.creativetab.CreativeTabs;
/**
 * 
 * Msc Houses
 *
 * CreativeTabModifyer.java
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class CreativeTabModifyer extends CreativeTabs {
	public CreativeTabModifyer(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return MscHouses.modifyer.itemID;
	}
}
