package mrkirby153.MscHouses.block;

import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.worldGen.StatueGen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * MscHouses
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockStatue_Zombie extends Block {
	public BlockStatue_Zombie(int par1) {
		super(par1, Material.ground);
		this.setCreativeTab(MscHouses.tabHouse);
		GameRegistry.registerBlock(this, "StatueZombie");
	}

	@Override
	public boolean onBlockActivated(World world, int par2, int par3, int par4,
			EntityPlayer par5EntityPlayer, int par6, float par7, float par8,
			float par9) {
		new StatueGen();
		// s.zombie(x, y, z, world);
		if (!world.isRemote) {
			par5EntityPlayer.sendChatToPlayer("Zombie Generated!");
		}
		return true;
	}
}
