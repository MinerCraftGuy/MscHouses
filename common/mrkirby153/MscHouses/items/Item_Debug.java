package mrkirby153.MscHouses.items;

import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * 
 * Msc Houses
 *
 * Item_Debug
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Item_Debug extends Item {

	public Item_Debug(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		MovingObjectPosition p = this.getMovingObjectPositionFromPlayer(
				par2World, par3EntityPlayer, true);
		if (p != null) {
			int x = p.blockX;
			int y = p.blockY;
			int z = p.blockZ;

			int id = par2World.getBlockId(x, y, z);
			int meta = par2World.getBlockMetadata(x, y, z);
			if (!par2World.isRemote) {
				par3EntityPlayer.addChatMessage(MscHouses.COLOR_CODE
						+ "6[MscHouses] " + MscHouses.COLOR_CODE
						+ "dBlock ID: " + id + " Block Meta: " + meta);
				par3EntityPlayer.addChatMessage(MscHouses.COLOR_CODE + "6[MscHouses] " + MscHouses.COLOR_CODE +"dBlock Coords: "+MscHouses.COLOR_CODE+"rX: "+p.blockX+" Y: " + p.blockY+ " Z: "+p.blockZ);
			}
		} else {
			par3EntityPlayer.sendChatToPlayer(ChatMessageComponent.func_111066_d("You MUST click on a block."));
		}
		return par1ItemStack;
	}

}
