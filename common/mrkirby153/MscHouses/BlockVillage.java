package mrkirby153.MscHouses;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
/**
 * MscHouses
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
public class BlockVillage extends Block{
	
	private VillageGenerator g = new VillageGenerator();

	public BlockVillage(int par1) {
		super(par1, Material.ground);
		this.setHardness(1F);
		this.setResistance(0F);
		this.setCreativeTab(MscHouses.tabHouse);
		GameRegistry.registerBlock(this, "Village");
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		Random random = new Random();
		this.
		g .generate(random, par2, par3, par1World, /*<Need to provide IChunkProvider chunkGenerator>*/null, par1World.getChunkProvider());
		return true;
	}

}
