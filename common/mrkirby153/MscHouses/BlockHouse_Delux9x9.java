package mrkirby153.MscHouses;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * MscHouses
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockHouse_Delux9x9 extends Block {
    protected BlockHouse_Delux9x9(int par1) {
        super(par1, Material.ground);
        this.setCreativeTab(MscHouses.tabHouse);
        GameRegistry.registerBlock(this, "delux9x9");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon("MscHouses:Block9x9_Delux");
    }
}
