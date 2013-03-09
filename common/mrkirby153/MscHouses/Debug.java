package mrkirby153.MscHouses;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class Debug extends Item{

	public Debug(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		MovingObjectPosition p = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, true);
		if(p != null){
			int x = p.blockX;
			int y =p.blockY;
			int z = p.blockZ;

			int id = par2World.getBlockId(x, y, z);
			int meta = par2World.getBlockMetadata(x, y, z);
			if(!par2World.isRemote){
				par3EntityPlayer.addChatMessage(MscHouses.COLOR_CODE + "6[MscHouses] " + MscHouses.COLOR_CODE + "dBlock ID: " + id +" Block Meta: " + meta);
			}
		}else{
			par3EntityPlayer.sendChatToPlayer("You MUST click on a block.");
		}
		return par1ItemStack;
	}

}
