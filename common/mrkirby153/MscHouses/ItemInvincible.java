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
	private boolean enabled;
	private int timeLeft;
	public ItemInvincible(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxStackSize(1);
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
	public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean par5) {
		boolean enabled = NBTHelper.getBoolean(item, "enabled");
		int timeLeft = NBTHelper.getInteger(item, "timeLeft");
		
		if(entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) entity;
			if(enabled && timeLeft != 0){
			//	player.addPotionEffect(new PotionEffect(2, 20, 0, true));
			//	player.addPotionEffect(new PotionEffect(13, 20, 0, true));
				player.extinguish();
				if(player.getHealth() < 10){
					player.heal(1);
				}
				timeLeft--;
			}
			if(timeLeft == 0){
				checkForFuel(player);
			}
		}
		NBTHelper.setBoolean(item, "enabled", enabled);
		NBTHelper.setInteger(item, "timeLeft", timeLeft);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item,
			EntityPlayer player, List list, boolean par4) {
		boolean enabled = NBTHelper.getBoolean(item, "enabled");
		list.add("Keeps you 'INVINCIBLE'! Runs on ender Pearls");
		list.add("Time left on current charge: " + Math.floor(timeLeft/20) );
		list.add("Activated? " +enabled);
	}

	private void checkForFuel(EntityPlayer player){
		for(int slot = 0; slot < player.inventory.getSizeInventory(); slot++){
			ItemStack fuel = player.inventory.getStackInSlot(slot);
			if(fuel != null){
				if(fuel.itemID == Item.enderPearl.itemID){
					fuel.stackSize--;
					timeLeft = 1200;
					break;
				}
			}
		}
	}
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world,
			EntityPlayer par3EntityPlayer) {
		boolean enabled = !NBTHelper.getBoolean(item, "enabled");
		par3EntityPlayer.sendChatToPlayer("Value of Enabled: " + enabled);
		return item;
	}
}