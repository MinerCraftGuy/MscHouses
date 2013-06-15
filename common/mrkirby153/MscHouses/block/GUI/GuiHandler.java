package mrkirby153.MscHouses.block.GUI;

import mrkirby153.MscHouses.block.Container.ContainerBlockBase;
import mrkirby153.MscHouses.block.TileEntity.TileEntityBlockBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
/**
 * 
 * Msc Houses
 *
 * GuiHandler
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class GuiHandler implements IGuiHandler{
	//returns an instance of the Container you made earlier
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if(tileEntity instanceof TileEntityBlockBase){
                    return new ContainerBlockBase(player.inventory, (TileEntityBlockBase) tileEntity);
            }
            return null;
    }

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if(tileEntity instanceof TileEntityBlockBase){
                    return new GuiBlockBase(player.inventory, (TileEntityBlockBase) tileEntity);
            }
            return null;

    }

}
