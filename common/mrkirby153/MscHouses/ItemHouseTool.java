package mrkirby153.MscHouses;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * MscHouses
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemHouseTool extends Item {
	// static MscHouses m = new MscHouses();
	public static int[] damageBlocks = {MscHouses.House_Hut.blockID,
			MscHouses.House_9x9.blockID};

	public ItemHouseTool(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxDamage(MscHouses.HouseToolDamage);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		MovingObjectPosition p = this.getMovingObjectPositionFromPlayer(
				par2World, par3EntityPlayer, true);
		if (p != null) {
			int block = par2World.getBlockId(p.blockX, p.blockY, p.blockZ);

			if (block == MscHouses.House_Hut.blockID) {
				MscHouses.h.hut(p.blockX, p.blockY, p.blockZ, par2World);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
			if (block == MscHouses.ninebynineID) {
				MscHouses.h.ninebynine(par2World, p.blockX, p.blockY, p.blockZ);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
			if (block == MscHouses.Delux9x9ID) {
				MscHouses.h.ninbynineDelux(par2World, p.blockX, p.blockY,
						p.blockZ);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
		}
		return par1ItemStack;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) {
		// TODO Auto-generated method stub
		iconIndex = iconRegister.registerIcon("MscHouses:HouseTool");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		return true;
	}

}
