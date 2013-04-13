package mrkirby153.MscHouses.core.proxy;

import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;

/**
 * MscHouses
 * 
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderInformation() {
		// preload textures
	}

	@Override
	public World getClientWorld() {
		return FMLClientHandler.instance().getClient().theWorld;
	}

	@Override
	public void registerTileEntitySpecalRenderer(/* Placehodler */) {

	}

}
