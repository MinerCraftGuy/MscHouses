package mrkirby153.MscHouses.items;

import mrkirby153.MscHouses.block.ModBlocks;
import mrkirby153.MscHouses.configuration.ConfigurationSettings;
import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.core.helpers.WorldHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * MscHouses
 * 
 * Item House Tool
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemHouseTool extends Item {
	// static MscHouses m = new MscHouses();
	public static int[] damageBlocks = {ModBlocks.House_Hut.blockID,
		ModBlocks.House_9x9.blockID};

	public ItemHouseTool(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxDamage(ConfigurationSettings.House_Tool_damage);
	}

	/*@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		MovingObjectPosition p = this.getMovingObjectPositionFromPlayer(
				par2World, par3EntityPlayer, true);
		if (p != null) {
			int block = par2World.getBlockId(p.blockX, p.blockY, p.blockZ);

			if (block == ModBlocks.House_Hut.blockID) {
				MscHouses.h.hut(p.blockX, p.blockY, p.blockZ, par2World);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
			if (block == ModBlocks.House_9x9.blockID) {
				MscHouses.h.ninebynine(par2World, p.blockX, p.blockY, p.blockZ);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
			if (block == ModBlocks.House9x9_Deluxe.blockID) {
				MscHouses.h.ninbynineDelux(par2World, p.blockX, p.blockY,
						p.blockZ);
				par1ItemStack.damageItem(1, par3EntityPlayer);
			}
		}
		return par1ItemStack;
	}
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		MovingObjectPosition p = this.getMovingObjectPositionFromPlayer(world, player, true);
		IInventory inventory = (IInventory) world.getBlockTileEntity(p.blockX, p.blockY, p.blockZ);
		if(inventory != null){
			boolean fuel = false;
			int moduelId = 0;
			int modifyerMaterial = 0;
			if(inventory.getStackInSlot(0) != null){
				moduelId = inventory.getStackInSlot(0).getItemDamage();
			}
			if(inventory.getStackInSlot(2) != null){
				modifyerMaterial = inventory.getStackInSlot(2).getItemDamage();
			}

			if(inventory.getStackInSlot(1) != null){
				if(inventory.getStackInSlot(1).getItem() == Item.coal || inventory.getStackInSlot(1) == new ItemStack(Item.coal, 1, 1)){
					fuel = true;
				}
			}else{
				if(!world.isRemote)
					player.sendChatToPlayer("No fuel detected in inventory");
			}
			System.out.println("Fuel detected: " + fuel + ". Moduel inside " + moduelId + ". Modifyer material ID " + modifyerMaterial);
			inventory.setInventorySlotContents(0, null);
			inventory.setInventorySlotContents(1, null);
			inventory.setInventorySlotContents(2, null);
			if(fuel){
				buildHouse(moduelId, modifyerMaterial, p.blockX, p.blockY, p.blockZ, world);
			}

		}
		return item;
	}

	private void buildHouse(int moduelId, int modifyerMaterial, int x, int y, int z, World world) {
		int[] materialId= {0, 1, 3, 17, 24, 86, 48, 87, 88, 89, 49, 112, 121, 57};
		System.out.println(moduelId+" "+modifyerMaterial);
		switch(moduelId){
			case 1: MscHouses.h.hut(x, y, z, world, materialId[modifyerMaterial+1]); break;
			case 2: MscHouses.h.ninebynine(world, x, y, z, materialId[modifyerMaterial+1]); break;
			case 3: MscHouses.h.ninbynineDelux(world, x, y, z, materialId[modifyerMaterial+1]); break;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		// TODO Auto-generated method stub
		itemIcon = iconRegister.registerIcon("MscHouses:HouseTool");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		return true;
	}

}
