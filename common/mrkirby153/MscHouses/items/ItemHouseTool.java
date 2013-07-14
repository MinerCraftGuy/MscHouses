package mrkirby153.MscHouses.items;

import java.util.ArrayList;

import mrkirby153.MscHouses.api.FuelRegistry;
import mrkirby153.MscHouses.api.IHouseItem;
import mrkirby153.MscHouses.api.MaterialRegistry;
import mrkirby153.MscHouses.configuration.ConfigurationSettings;
import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * Msc Houses
 *
 * ItemHouseTool
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemHouseTool extends Item {
	// static MscHouses m = new MscHouses();

	public ItemHouseTool(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxDamage(ConfigurationSettings.House_Tool_damage);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		MovingObjectPosition p = this.getMovingObjectPositionFromPlayer(world, player, true);
		IInventory inventory = (IInventory) world.getBlockTileEntity(p.blockX, p.blockY, p.blockZ);
		if(inventory != null){
			boolean fuel = false;
			int moduelId = 0;
			int modifyerMaterial = 0;
		//	boolean isSpecal = false;
			if(inventory.getStackInSlot(0) != null){
				if(inventory.getStackInSlot(0).getItem() instanceof IHouseItem){
					((IHouseItem) inventory.getStackInSlot(0).getItem()).geneateInit(world, p.blockX, p.blockY, p.blockZ);
				}else{
					moduelId = inventory.getStackInSlot(0).getItemDamage();
				}
			}
			if(inventory.getStackInSlot(2) != null){
				modifyerMaterial = MaterialRegistry.materialLookup(inventory.getStackInSlot(2).getItemDamage());
			//	isSpecal = true;
			}

			if(inventory.getStackInSlot(1) != null){
				//	if(inventory.getStackInSlot(1).getItem() == Item.coal || inventory.getStackInSlot(1) == new ItemStack(Item.coal, 1, 1)){
				//		fuel = true;
				ArrayList<Item> valid = FuelRegistry.getValidFuelsAsArrayList();
				if(valid.contains(inventory.getStackInSlot(1).getItem())){
					fuel = true;
				}else{
					if(!world.isRemote){
						player.sendChatToPlayer(ChatMessageComponent.func_111066_d("No valid fuel detected in inventory"));
					}
				}
			}
			if(fuel){
				inventory.setInventorySlotContents(0, null);
				inventory.setInventorySlotContents(1, null);
				inventory.setInventorySlotContents(2, null);
				//	buildHouse(moduelId, modifyerMaterial, p.blockX, p.blockY, p.blockZ, world);
					buildHouse_specal(moduelId, modifyerMaterial, p.blockX, p.blockY, p.blockZ, world);
			}

		}
		return item;
	}

/*	private void buildHouse(int moduelId, int modifyerMaterial, int x, int y, int z, World world) {
		int[] materialId= {0, 1, 3, 17, 24, 86, 48, 87, 88, 89, 49, 112, 121, 57};
		System.out.println(moduelId+" "+modifyerMaterial);
		switch(moduelId){
			case 1: MscHouses.h.hut(x, y, z, world, materialId[modifyerMaterial+1]); break;
			case 2: MscHouses.h.ninebynine(world, x, y, z, materialId[modifyerMaterial+1]); break;
			case 3: MscHouses.h.ninbynineDelux(world, x, y, z, materialId[modifyerMaterial+1]); break;
		}
	}
	*/

	private void buildHouse_specal(int moduelId, int materialId, int x, int y, int z, World world){
		switch(moduelId){
			case 1: MscHouses.h.hut(x, y, z, world, materialId); break;
			case 2: MscHouses.h.ninebynine(world, x, y, z, materialId); break;
			case 3: MscHouses.h.ninbynineDelux(world, x, y, z, materialId); break;
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
