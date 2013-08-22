package mrkirby153.MscHouses.api;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
/**
 * 
 * Msc Houses
 *
 * WorldHelper
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class WorldUtils {
	/**
	 * Drops an item in the world
	 * @param World
	 * @param Item Id
	 * @param Item Metadata
	 * @param X-Coordinate
	 * @param Y-Coordinate
	 * @param Z-Coordinate
	 */
	public void  dropItemInWorld(World world, int id, int meta, int xCoord, int yCoord, int zCoord){
		EntityItem i = new EntityItem(world, (double)((float)xCoord + 0.01), (double)((float)yCoord + 1), (double)((float)zCoord + 0.01), new ItemStack(id, 1, meta));
		world.spawnEntityInWorld(i);
	}

	public static void addBlockToInventory(EntityPlayer player, int count, Block item){

		for(int i=0; i < player.inventory.getSizeInventory(); i++){
			if(player.inventory.getStackInSlot(i) == null){
				player.inventory.setInventorySlotContents(i, new ItemStack(item, count));
				break;
			}
		}

	}
	public static void addItemToInventory(EntityPlayer player, int count, Item item){
		for(int i=0; i < player.inventory.getSizeInventory(); i++){
			if(player.inventory.getStackInSlot(i) == null){
				player.inventory.setInventorySlotContents(i, new ItemStack(item, count));
				break;
			}
		}
	}
}
