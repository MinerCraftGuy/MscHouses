package mrkirby153.MscHouses.items;

import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * Msc Houses
 *
 * ItemPCB
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemPCB extends Item {
	public ItemPCB(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxDamage(0);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		// TODO Auto-generated method stub
		itemIcon = iconRegister.registerIcon("MscHouses:ItemPCB");
	}
}
