package mrkirby153.MscHouses;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
/**
 * MscHouses
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
public class ItemInvincible extends Item{
	private Icon icon;
	private int damage = 6000;
	private boolean enabled = false;
	public ItemInvincible(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxStackSize(1);
		this.setMaxDamage(damage);
		this.setFull3D();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) {
		// TODO Auto-generated method stub
		iconIndex = iconRegister.registerIcon("MscHouses:ItemInvincible");
	}

	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World,
			Entity par3Entity, int par4, boolean par5) {
		// TODO Auto-generated method stub
		if(par1ItemStack.getItemDamage() > 0){
			par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() -1);
		}
	}
	


	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		if(!player.capabilities.isCreativeMode && item.getItemDamage() == 0){
			item.damageItem(6000, player);
			//	player.addPotionEffect(new PotionEffect(2, 1200, 0, true));
			player.addPotionEffect(new PotionEffect(13, 2400, 0, true));
			player.addPotionEffect(new PotionEffect(11, 2400, 5, true));
			player.addPotionEffect(new PotionEffect(12, 2400, 5, true));
			player.addPotionEffect(new PotionEffect(9, 120, 5, true));
		}
		return item;
	}
	
}