package mrkirby153.MscHouses;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopperOre extends Block{

	protected BlockCopperOre(int par1) {
		super(par1, Material.ground);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		GameRegistry.registerBlock(this, "copperOre");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("MscHouses:CopperOre");
	}

}
