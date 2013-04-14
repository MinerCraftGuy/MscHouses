package mrkirby153.MscHouses.items;

import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.configuration.ConfigurationSettings;
import mrkirby153.MscHouses.core.MscHouses;
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
 * Item House Tool
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemHouseTool extends Item {
	// static MscHouses m = new MscHouses();
	public static int[] damageBlocks = {ModBlocks.House_Hut.blockID,
			ModBlocks.House_9x9.blockID};

	public ItemHouseTool(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxDamage(ConfigurationSettings.House_Tool_damage);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		MovingObjectPosition p = this.getMovingObjectPositionFromPlayer(
				par2World, par3EntityPlayer, true);
		if (p != null) {
			int block = par2World.getBlockId(p.blockX, p.blockY, p.blockZ);

			if (block == ModBlocks.House_Hut.blockID) {
				MscHouses.h.hut(p.blockX, p.blockY, p.blockZ, par2World);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
			if (block == ModBlocks.House_9x9.blockID) {
				MscHouses.h.ninebynine(par2World, p.blockX, p.blockY, p.blockZ);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
			if (block == ModBlocks.House9x9_Deluxe.blockID) {
				MscHouses.h.ninbynineDelux(par2World, p.blockX, p.blockY,
						p.blockZ);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
		}
		return par1ItemStack;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		// TODO Auto-generated method stub
		itemIcon = iconRegister.registerIcon("MscHouses:HouseTool");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		return true;
	}

}
