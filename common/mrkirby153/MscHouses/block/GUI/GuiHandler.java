package mrkirby153.MscHouses.block.GUI;

import mrkirby153.MscHouses.block.Container.ContainerHouseGenerator;
import mrkirby153.MscHouses.block.tileEntity.TileEntityHouseGen;
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
            if(tileEntity instanceof TileEntityHouseGen){
                    return new ContainerHouseGenerator(player.inventory, (TileEntityHouseGen) tileEntity);
            }
            return null;
    }

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if(tileEntity instanceof TileEntityHouseGen)
                    return new GuiHouseGenerator(player.inventory, (TileEntityHouseGen) tileEntity);
            
            return null;

    }

}
