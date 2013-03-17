package mrkirby153.MscHouses;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler{
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		// System.out.println("Item ID: " + item.itemID);
		if(item.itemID == MscHouses.invincible.itemID){
			
			NBTTagCompound nbt = item.getTagCompound();
            nbt.setBoolean("enabled", false);
            nbt.setInteger("timeLeft", 0);
            item.setTagCompound(nbt);
		}
		
	}


	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub
		
	}

}
