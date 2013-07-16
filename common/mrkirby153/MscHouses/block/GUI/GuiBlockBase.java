package mrkirby153.MscHouses.block.GUI;

import javax.annotation.Resource;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mrkirby153.MscHouses.block.Container.ContainerBlockBase;
import mrkirby153.MscHouses.block.TileEntity.TileEntityBlockBase;
import mrkirby153.MscHouses.lib.ResourceFile;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
/**
 * 
 * Msc Houses
 *
 * GuiBlockBase
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@SideOnly(Side.CLIENT)
public class GuiBlockBase extends GuiContainer{
	public GuiBlockBase (InventoryPlayer inventoryPlayer,
			TileEntityBlockBase tileEntity) {
		//the container is instanciated and passed to the superclass for handling
		super(new ContainerBlockBase(inventoryPlayer, tileEntity));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int param1, int param2) {
		//draw text and stuff here
		//the parameters for drawString are: string, x, y, color
		fontRenderer.drawString("Block Base", 8, 6, 4210752);
		//draws "Inventory" or your regional equivalent
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2,
			int par3) {
		//draw your Gui here, only thing you need to change is the path
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		FMLClientHandler.instance().getClient().renderEngine.func_110577_a(ResourceFile.houseGen_Img);
		
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}

}
