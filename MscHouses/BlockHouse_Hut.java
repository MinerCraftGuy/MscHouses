package mrkirby153.MscHouses;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHouse_Hut extends Block{

	protected BlockHouse_Hut(int par1, int par2) {
		super(par1, par2, Material.ground);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setHardness(1F);
		this.setResistance(0F);
		GameRegistry.registerBlock(this, "BlockHut");
	}

	
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		MscHouses.h.hut(par2, par3, par4, par1World);
		return true;
	}
}
