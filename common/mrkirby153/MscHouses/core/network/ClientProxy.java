package mrkirby153.MscHouses.core.network;

import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;

/**
 * 
 * Msc Houses
 *
 * ClientProxy
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
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
