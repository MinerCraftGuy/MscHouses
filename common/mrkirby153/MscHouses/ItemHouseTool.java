package mrkirby153.MscHouses;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemHouseTool extends Item{
	public int defaultDamage = 10;
	//	static MscHouses m = new MscHouses();
	public static int[] damageBlocks = {MscHouses.House_Hut.blockID, MscHouses.House_9x9.blockID};
	public ItemHouseTool(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxDamage(this.defaultDamage);
	}
	/*	public void damageItem(int damageAmount, EntityPlayer player){
		ItemStack itemInHand = player.getItemInUse();
		int currentDamgage = itemInHand.getItemDamage();
		itemInHand.setItemDamage(currentDamgage+1);
	}
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		MovingObjectPosition p = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, true);
		if(p != null){
			int block = par2World.getBlockId(p.blockX, p.blockY, p.blockZ);
			for(int i = 0; i <= damageBlocks.length; i++){
				if(par2World.getBlockId(p.blockX, p.blockY, p.blockZ) == damageBlocks[i]){
					par1ItemStack.damageItem(1, par3EntityPlayer);
					break;
				}
			}
			if(block == MscHouses.House_Hut.blockID)
				MscHouses.h.hut(p.blockX, p.blockY, p.blockZ, par2World);
			if(block== MscHouses.ninebynineID)
				MscHouses.h.ninebynine(par2World, p.blockX, p.blockY, p.blockZ);
		}
		return par1ItemStack;
	}

}
