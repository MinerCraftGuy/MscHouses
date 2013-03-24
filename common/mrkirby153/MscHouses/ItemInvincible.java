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

public class ItemInvincible extends Item{
	private Icon icon;
	private int damage = 2400;
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
	public void func_94581_a(IconRegister iconRegister){
		icon = iconRegister.func_94245_a("MscHouses:invincible");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		// TODO Auto-generated method stub
		return icon;
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
		if(!player.capabilities.isCreativeMode || item.getItemDamage() == 0){
		item.damageItem(2400, player);
	//	player.addPotionEffect(new PotionEffect(2, 1200, 0, true));
		player.addPotionEffect(new PotionEffect(13, 2400, 0, true));
		player.addPotionEffect(new PotionEffect(11, 2400, 5, true));
		player.addPotionEffect(new PotionEffect(12, 2400, 5, true));
		player.addPotionEffect(new PotionEffect(9, 120, 5, true));
		}
		return item;
	}
}