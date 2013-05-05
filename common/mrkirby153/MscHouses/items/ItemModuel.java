package mrkirby153.MscHouses.items;

import java.util.List;

import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemModuel extends Item{
	private static final String[] moduelFileName = { "moduel_base", "moduel_hut", "moduel_9x9", "moduel_Deluxe9x9" };
	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	public ItemModuel(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		int j = MathHelper.clamp_int(par1, 0, 15);
		return this.field_94594_d[j];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.field_94594_d = new Icon[moduelFileName.length];

		for(int i =0; i < moduelFileName.length; i++){
			this.field_94594_d[i] = par1IconRegister.registerIcon("MscHouses:" + moduelFileName[i]);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int itemID, CreativeTabs tab,
			List itemList) {
		for(int i = 0; i < moduelFileName.length; i++){
			itemList.add(new ItemStack(itemID,1,i));
		}
	}
	@Override
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + "." + this.moduelFileName[item.getItemDamage()];
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(par3EntityPlayer.isSneaking()){
			par1ItemStack.setItemDamage(0);
		}
		return par1ItemStack;
	}

}
