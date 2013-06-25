package mrkirby153.MscHouses.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemInfiniteDimensons extends Item{

	public ItemInfiniteDimensons(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		// TODO Auto-generated method stub
		itemIcon = iconRegister.registerIcon("MscHouses:infiniteDimensions");
	}

}
