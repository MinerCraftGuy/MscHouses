package mrkirby153.MscHouses.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCopper extends Item{
	public ItemCopper(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister par1IconRegister) {
		iconIndex = par1IconRegister.registerIcon("MscHouses:ingotCopper");
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

}
