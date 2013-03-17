package mrkirby153.MscHouses;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ItemPCB extends Item{
	private Icon icon;
	public ItemPCB(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxDamage(0);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister iconRegister){
		icon = iconRegister.func_94245_a("MscHouses:pcb");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		// TODO Auto-generated method stub
		return icon;
	}
}
