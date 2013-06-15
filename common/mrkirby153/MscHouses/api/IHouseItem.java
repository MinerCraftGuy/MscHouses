package mrkirby153.MscHouses.api;

import net.minecraft.world.World;
/**
 * Msc-Houses
 * 
 * IHouseItem
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
public interface IHouseItem{
	/**
	 * Put your generation code here.
	 */
	public void geneateInit(World world, int xPos, int yPos, int zPos);

}
