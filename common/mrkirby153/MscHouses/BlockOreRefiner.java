package mrkirby153.MscHouses;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockOreRefiner extends Block{
	protected BlockOreRefiner(int par1) {
		super(par1, Material.ground);
		this.setHardness(1F);
		this.setCreativeTab(MscHouses.tabHouse);
		GameRegistry.registerBlock(this, "oreRefiner");
	}
	
}