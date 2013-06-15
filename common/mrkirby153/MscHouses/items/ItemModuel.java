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
/**
 * 
 * Msc Houses
 *
 * ItemModuel
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemModuel extends Item{
	private static final String[] moduelFileName = { "moduel_base", "moduel_hut", "moduel_9x9", "moduel_Deluxe9x9" };
	/** List of all moduel names */
	public static final String[] moduel_name = { "Base", "Hut", "Nine By Nine", "Nine by Nine Deluxe" };
	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	public ItemModuel(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse_moduel);
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
		if(par3EntityPlayer.isSneaking() && par1ItemStack.getItemDamage() > 0){
			if(!par2World.isRemote){
				par3EntityPlayer.addChatMessage("Successfully Downgraded " + this.moduel_name[par1ItemStack.getItemDamage()] + " to " + this.moduel_name[0]);
			}
			par1ItemStack.setItemDamage(0);
			par2World.playSoundAtEntity(par3EntityPlayer, "random.fizz", 8, 1);

		}
		return par1ItemStack;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		switch(itemStack.getItemDamage()){
			case 0: list.add("Use this to build all moduels"); break;
			case 1: list.add("Component to build a Hut"); break;
			case 2: list.add("Component to build a Nine by Nine"); break;
			case 3: list.add("Component to build a Nine by Nine +"); break;
		}
	}
}
