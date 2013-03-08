package mrkirby153.MscHouses;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockStatue_Zombie extends Block{
	public BlockStatue_Zombie(int par1, int par2) {
		super(par1, par2, Material.ground);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setHardness(1F);
		this.setResistance(0F);
		GameRegistry.registerBlock(this, "BlockStatue_Zombie");
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
