package mrkirby153.MscHouses;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

/**
 * MscHouses
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CommonProxy implements IGuiHandler {
    public void registerRenderInformation() {

    }

    public void registerTileEntitySpecalRenderer(/* PlaceHolder */) {
        // TODO Add Specal render types here
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
        // TODO Auto-generated method stub
        return null;
    }

    public World getClientWorld() {
        return null;
    }
}
