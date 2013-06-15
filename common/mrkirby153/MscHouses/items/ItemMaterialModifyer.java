package mrkirby153.MscHouses.items;
import java.util.List;
import java.util.logging.Level;

import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * Msc Houses
 *
 * ItemMaterialModifyer
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemMaterialModifyer extends Item{
	public static final String[] modifyer_file = {"modifyer_stone", "modifyer_dirt", "modifyer_wood", "modifyer_sandstone", "modifyer_pumpkin", "modifyer_mossStone", "modifyer_netherrack", "modifyer_soulSand", "modifyer_glowStone", "modifyer_obsidian", "modifyer_netherBrick"
		,"modifyer_endStone", "modifyer_diamondBlock"};
	private static final String[] modifyer_itemNames = {"stone", "dirt", "wood", "sandstone", "pumpkin", "mossStone", "netherrack", "soulsand", "glowstone", "obsidian", "netherbrick", "endStone", "diamondBlock"};

	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	public ItemMaterialModifyer(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse_moduel);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		int j = MathHelper.clamp_int(par1, 0, 15);
		return this.field_94594_d[j];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.field_94594_d = new Icon[modifyer_file.length];

		for(int i =0; i < modifyer_file.length; i++){
			this.field_94594_d[i] = par1IconRegister.registerIcon("MscHouses:" + modifyer_file[i]);
		}
		LogHelper.log(Level.INFO, "Succesfully loaded " + modifyer_file.length + " textures");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int itemID, CreativeTabs tab,
			List itemList) {
		for(int i = 0; i < modifyer_file.length; i++){
			itemList.add(new ItemStack(itemID,1,i));
		}
	}
	@Override
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + "." + modifyer_file[item.getItemDamage()];
	}
	@SuppressWarnings("unchecked")
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		switch(itemStack.getItemDamage()){
			case 0: list.add("Stone"); break;
			case 1: list.add("Dirt"); break;
			case 2: list.add("Wood"); break;
			case 3: list.add("Sandstone"); break;
			case 4: list.add("Pumpkin"); break;
			case 5: list.add("Mossy Cobblestone"); break;
			case 6: list.add("Netherrack"); break;
			case 7: list.add("Soulsand"); break;
			case 8: list.add("Glowstone"); break;
			case 9: list.add("Obsidian"); break;
			case 10: list.add("Nether Brick"); break;
			case 11: list.add("End Stone"); break;
			case 12: list.add("Diamond Block"); break;
		//	case 12: list.add(""); break;
			default: list.add("UNKNOW ITEM!!! PLEASE REPORT THIS BUG TO THE MOD AUTHOR"); break;
		}
	}


}
