package mrkirby153.MscHouses;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockMarker extends Block{
	public BlockMarker(int par1, int par2) {
		super(par1, par2, Material.ground);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setHardness(1F);
		this.setResistance(0F);
		this.setBlockUnbreakable();
		GameRegistry.registerBlock(this, "BlockMarker");
	}
}
