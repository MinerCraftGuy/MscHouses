package mrkirby153.MscHouses;

import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.FMLClientHandler;
/**
 * MscHouses
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderInformation(){
		//preload textures
		MinecraftForgeClient.preloadTexture("/mrkirby153/MscHouses/items.png");
		MinecraftForgeClient.preloadTexture("/mrkirby153/MscHouses/blocks.png");
	}
	@Override
	public World getClientWorld(){
		return FMLClientHandler.instance().getClient().theWorld;
	}
	@Override
	public void registerTileEntitySpecalRenderer(/*Placehodler*/){

	}

}
