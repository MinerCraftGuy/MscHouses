package mrkirby153.MscHouses.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
/**
 * 
 * Msc Houses
 *
 * ItemCopper
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemCopper extends Item{
	public ItemCopper(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		// TODO Auto-generated method stub
		itemIcon = iconRegister.registerIcon("MscHouses:ingotCopper");
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

}
