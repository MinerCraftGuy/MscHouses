package mrkirby153.MscHouses;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHouse_9x9 extends Block{

	protected BlockHouse_9x9(int par1)
    {
        super(par1, Material.ground);
        this.setCreativeTab(MscHouses.tabHouse);
        GameRegistry.registerBlock(this, "9x9");
    }
	@Override
	public String getTextureFile() {
		// TODO Auto-generated method stub
		return "/MscHouses/resources/block9x9.png";
	}
}
