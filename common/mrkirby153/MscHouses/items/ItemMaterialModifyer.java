package mrkirby153.MscHouses.items;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import mrkirby153.MscHouses.api.MaterialRegistry;
import mrkirby153.MscHouses.api.WorldUtils;
import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.core.helpers.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
/**
 * 
 * Msc Houses
 *
 * ItemModifyer_Extra
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemMaterialModifyer extends Item {
	public int[] modifyer_id;
	public static ArrayList<Block> material;
	@SideOnly(Side.CLIENT)
	private Icon[] field_94594_d;
	public ItemMaterialModifyer(int par1) {
		super(par1);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		material = MaterialRegistry.getValidBlocks();
		this.makeSubItems();
		this.modifyer_id = new int[material.size()];
		this.setCreativeTab(MscHouses.tabHouse_modifyers);
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
		this.field_94594_d = new Icon[material.size()];

		for(int i =0; i < material.size(); i++){
			this.field_94594_d[i] = par1IconRegister.registerIcon("mschouses:modifyer");
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int itemID, CreativeTabs tab,
			List itemList) {
		for(int i = 0; i < material.size(); i++){
			itemList.add(new ItemStack(itemID,1,i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName(); //+ "." + modifyer_id[item.getItemDamage()];
	}

	public void makeSubItems(){
		Block var2;
		Block[] var3 = new Block[material.size()];
		this.modifyer_id = new int[material.size()];
		var3 = material.toArray(var3);
		for(int i = 1; i < var3.length; i++){
			var2 = var3[i];
			this.modifyer_id[i] = var2.blockID;
		}
		LogHelper.log(Level.INFO, "Created " + modifyer_id.length + " sub-items");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if(player.isSneaking()){
			WorldUtils.addBlockToInventory(player, 6, MaterialRegistry.materialLookupAsBlock(itemStack.getItemDamage()));
			WorldUtils.addItemToInventory(player, 1, Item.enderPearl);
			WorldUtils.addItemToInventory(player, 1, MscHouses.PCB);
			itemStack.stackSize--;
			world.playSoundAtEntity(player, "random.orb", 1, 1);
			player.addPotionEffect(new PotionEffect(15, 200, 0, true));
			player.addPotionEffect(new PotionEffect(9, 200, 0, true));
		}
		return itemStack;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		Block[] var1 = new Block[material.size()];
		var1 = material.toArray(var1);
		par3List.add(this.capitalize(var1[par1ItemStack.getItemDamage()].getLocalizedName()));
	}


	private String capitalize(String line)
	{
	  return Character.toUpperCase(line.charAt(0)) + line.substring(1);
	}
	

}
