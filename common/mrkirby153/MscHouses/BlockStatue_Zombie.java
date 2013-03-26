package mrkirby153.MscHouses;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
/**
 * MscHouses
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
public class BlockStatue_Zombie extends Block{
	protected BlockStatue_Zombie(int par1)
    {
        super(par1, Material.ground);
        this.setCreativeTab(MscHouses.tabHouse);
        GameRegistry.registerBlock(this, "StatueZombie");
    }
	
	@Override
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		int x, y, z;
		x = par2;
		y = par3;
		z = par4;
		StatueGen s = new StatueGen();
//		s.zombie(x, y, z, world);
		if(!world.isRemote){
			par5EntityPlayer.sendChatToPlayer("Zombie Generated!");
		}
		return true;
	}
}
