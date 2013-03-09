package mrkirby153.MscHouses;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHouse_9x9 extends Block{

	public BlockHouse_9x9(int par1, int par2) {
		super(par1, par2, Material.ground);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setHardness(1F);
		this.setResistance(0F);
		GameRegistry.registerBlock(this, "Block9x9");
	}
	
}
