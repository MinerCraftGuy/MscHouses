package mrkirby153.MscHouses.block.tileEntity;

import mrkirby153.MscHouses.items.ItemId;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityBlockBase extends TileEntity{
	private int moduelid;
	private int moduel = ItemId.ITEM_MODUEL;

	public void onRightClicked(EntityPlayer player, World world){
		if(player.getHeldItem() != null){
			if(player.isSneaking()){
				
			}
		}
	}
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("modID", moduelid);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		moduelid = nbt.getInteger("modID");
	}
	public int getModID(){
		return moduelid;
	}
	
}
