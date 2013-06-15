package mrkirby153.MscHouses.api;

import net.minecraft.entity.item.EntityItem;
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
	 * @param world
	 * @param id
	 * @param meta
	 * @param xCoord
	 * @param yCoord
	 * @param zCoord
	 */
	@SuppressWarnings("unused")
	public void  dropItemInWorld(World world, int id, int meta, int xCoord, int yCoord, int zCoord){
		EntityItem i = new EntityItem(world, (double)((float)xCoord + 0.01), (double)((float)yCoord + 1), (double)((float)zCoord + 0.01), new ItemStack(id, 1, meta));
		world.spawnEntityInWorld(i);
	}
}
