package mrkirby153.MscHouses;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabHouse extends CreativeTabs {

	public CreativeTabHouse(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}
@Override
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex() {
	// TODO Auto-generated method stub
	return MscHouses.House_Hut.blockID;
}

}