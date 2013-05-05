package mrkirby153.MscHouses.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockHouse_Base extends Block{

	public BlockHouse_Base(int par1) {
		super(par1, Material.cloth);
		GameRegistry.registerBlock(this, "BlockBase");
	}
	
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		
		return false;
	}

}
