package mrkirby153.MscHouses.generation;

import mrkirby153.MscHouses.core.HouseTickTimer;
import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * 
 * Msc Houses
 *
 * HouseGen
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class HouseGen {

	public void hut(int x, int y, int z, World world, int blockID) {
		// Removes House building Block

		world.setBlock(x, y, z, 0, 0, 0);

		// Clear area
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					world.setBlock(x + i, y + j, z + k, 0, 0, 0);
					HouseTickTimer.resetTickCount();
					while(HouseTickTimer.tickCount != 1){
						//"Sleeps" the thread
					}
				}
			}
		}

		// Floor
		for (int x1 = 0; x1 < 5; x1++) {
			for (int z1 = 0; z1 < 5; z1++) {
				world.setBlock(x + x1, y - 1, z + z1, blockID, 0, 0);
			}
		}
		// Celing
		for (int x1 = 0; x1 < 5; x1++) {
			for (int z1 = 0; z1 < 5; z1++) {
				world.setBlock(x + x1, y + 5, z + z1, blockID, 0,
						0);
			}
		}
		// North wall
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + i, y + j, z, blockID, 0, 0);
			}
		}
		// West wall
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x, y + j, z + i, blockID, 0, 0);
			}
		}
		// East Wall
		for (int i = 5; i > 0; --i) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + 4, y + j, z + i - 1, blockID,
						0, 0);
			}
		}
		// South Wall
		for (int i = 5; i > 0; --i) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + i - 1, y + j, z + 4, blockID);
			}
		}
		// Door
		world.setBlock(x, y, z + 2, 0);
		world.setBlock(x, y + 1, z + 2, 0);
		// Light
		world.setBlock(x + 2, y + 4, z + 2, Block.glowStone.blockID);
		// Chest
		world.setBlock(x + 3, y, z + 1, Block.chest.blockID);
		// Fill Chest.
		IInventory inventory = (IInventory) world.getBlockTileEntity(x + 3, y,
				z + 1);
		inventory.setInventorySlotContents(0, new ItemStack(Item.bed));
		inventory.setInventorySlotContents(1, new ItemStack(Item.doorWood));
	}

	public void ninebynine(World world, int x, int y, int z, int blockID) {
		// Removes House building Block
		world.setBlock(x, y, z, 0);
		// Clear area
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 9; k++) {
					world.setBlock(x + i, y + j, z + k, 0);
				}
			}
		}

		// Floor
		for (int x1 = 0; x1 < 9; x1++) {
			for (int z1 = 0; z1 < 9; z1++) {
				world.setBlock(x + x1, y - 1, z + z1, blockID);
			}
		}
		// Celing
		for (int x1 = 0; x1 < 9; x1++) {
			for (int z1 = 0; z1 < 9; z1++) {
				world.setBlock(x + x1, y + 5, z + z1, blockID);
			}
		}
		// North wall
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + i, y + j, z, blockID);
			}
		}
		// West wall
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x, y + j, z + i, blockID);
			}
		}
		// East Wall
		for (int i = 9; i > 0; --i) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + 8, y + j, z + i - 1, blockID);
			}
		}
		// South Wall
		for (int i = 9; i > 0; --i) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + i - 1, y + j, z + 8, blockID);
			}
		}
		// Door
		world.setBlock(x, y, z + 4, 64);
		world.setBlock(x, y + 1, z + 4, 64, 8, 0);
		world.setBlock(x + 1, y, z + 4, Block.pressurePlatePlanks.blockID);
		// Chest
		world.setBlock(x + 7, y, z + 1, Block.chest.blockID);
		// Fill Chest.
		IInventory inventory = (IInventory) world.getBlockTileEntity(x + 7, y,
				z + 1);
		inventory.setInventorySlotContents(0, new ItemStack(Item.bed));
		inventory.setInventorySlotContents(1, new ItemStack(Item.doorWood));
		inventory.setInventorySlotContents(2, new ItemStack(Block.pressurePlateStone));
		inventory.setInventorySlotContents(3, new ItemStack(Block.woodenButton));
		// Add windows and torches.
		world.setBlock(x + 2, y + 5, z + 2, Block.glass.blockID);
		world.setBlock(x + 2, y + 5, z + 3, Block.glass.blockID);
		world.setBlock(x + 3, y + 5, z + 2, Block.glass.blockID);
		world.setBlock(x + 3, y + 5, z + 3, Block.glass.blockID);

		world.setBlock(x + 2, y + 5, z + 5, Block.glass.blockID);
		world.setBlock(x + 2, y + 5, z + 6, Block.glass.blockID);
		world.setBlock(x + 3, y + 5, z + 5, Block.glass.blockID);
		world.setBlock(x + 3, y + 5, z + 6, Block.glass.blockID);

		world.setBlock(x + 5, y + 5, z + 2, Block.glass.blockID);
		world.setBlock(x + 5, y + 5, z + 3, Block.glass.blockID);
		world.setBlock(x + 6, y + 5, z + 2, Block.glass.blockID);
		world.setBlock(x + 6, y + 5, z + 3, Block.glass.blockID);

		world.setBlock(x + 5, y + 5, z + 5, Block.glass.blockID);
		world.setBlock(x + 5, y + 5, z + 6, Block.glass.blockID);
		world.setBlock(x + 6, y + 5, z + 5, Block.glass.blockID);
		world.setBlock(x + 6, y + 5, z + 6, Block.glass.blockID);

		world.setBlock(x + 1, y + 4, z + 4, Block.torchWood.blockID);
		world.setBlock(x + 7, y + 4, z + 4, Block.torchWood.blockID);
		world.setBlock(x + 4, y + 4, z + 7, Block.torchWood.blockID);
		world.setBlock(x + 4, y + 4, z + 1, Block.torchWood.blockID);

		// Add furnace and extra chest
		world.setBlock(x + 7, y, z + 2, Block.chest.blockID);
		world.setBlock(x + 7, y, z + 3, Block.furnaceIdle.blockID);
		world.setBlock(x + 7, y, z + 4, Block.workbench.blockID);

		// Add Bed and door
		world.setBlock(x + 6, y, z + 7, 26, 3, 0);
		world.setBlockMetadataWithNotify(x + 6, y, z + 7, 3, 0);
		world.setBlock(x + 7, y, z + 7, 26, 11, 0);
		world.setBlockMetadataWithNotify(x + 7, y, z + 7, 11, 0);

	}

	public void ninbynineDelux(World world, int x, int y, int z, int blockID) {
		// Removes House building Block
		world.setBlock(x, y, z, 0);
		// Clear area
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 9; k++) {
					world.setBlock(x + i, y + j, z + k, 0);
				}
			}
		}

		// Floor
		for (int x1 = 0; x1 < 9; x1++) {
			for (int z1 = 0; z1 < 9; z1++) {
				world.setBlock(x + x1, y - 1, z + z1, blockID);
			}
		}
		// Celing
		for (int x1 = 0; x1 < 9; x1++) {
			for (int z1 = 0; z1 < 9; z1++) {
				world.setBlock(x + x1, y + 5, z + z1, blockID);
			}
		}
		// North wall
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + i, y + j, z, blockID);
			}
		}
		// West wall
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x, y + j, z + i, blockID);
			}
		}
		// East Wall
		for (int i = 9; i > 0; --i) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + 8, y + j, z + i - 1, blockID);
			}
		}
		// South Wall
		for (int i = 9; i > 0; --i) {
			for (int j = 0; j < 5; j++) {
				world.setBlock(x + i - 1, y + j, z + 8, blockID);
			}
		}
		// Door
		world.setBlock(x, y, z + 4, 64);
		world.setBlock(x, y + 1, z + 4, 64, 8, 0);
		world.setBlock(x + 1, y, z + 4, Block.pressurePlatePlanks.blockID);
		// Chest
		world.setBlock(x + 7, y, z + 1, Block.chest.blockID);
		// Fill Chest.
		IInventory inventory = (IInventory) world.getBlockTileEntity(x + 7, y,
				z + 1);
		if (inventory != null) {
			inventory.setInventorySlotContents(0, new ItemStack(Item.bed));
			inventory.setInventorySlotContents(1, new ItemStack(Item.doorWood));
			inventory.setInventorySlotContents(2, new ItemStack(
					Block.pressurePlateStone));
			inventory.setInventorySlotContents(3, new ItemStack(
					Block.stoneButton));
			inventory.setInventorySlotContents(9, new ItemStack(Item.axeIron));
			inventory.setInventorySlotContents(10, new ItemStack(
					Item.pickaxeIron));
			inventory.setInventorySlotContents(11, new ItemStack(
					Item.shovelIron));
			inventory.setInventorySlotContents(12, new ItemStack(
					Item.swordIron));
			inventory
					.setInventorySlotContents(13, new ItemStack(Item.coal, 64));
		}
		// Put coal in the furnace
		IInventory inventoryFurnace = (IInventory) world.getBlockTileEntity(
				x + 7, y, z + 3);
		if (inventoryFurnace != null) {
			inventory.setInventorySlotContents(0, new ItemStack(Item.coal, 64));

		}
		// Add windows and torches.
		world.setBlock(x + 2, y + 5, z + 2, Block.glass.blockID);
		world.setBlock(x + 2, y + 5, z + 3, Block.glass.blockID);
		world.setBlock(x + 3, y + 5, z + 2, Block.glass.blockID);
		world.setBlock(x + 3, y + 5, z + 3, Block.glass.blockID);

		world.setBlock(x + 2, y + 5, z + 5, Block.glass.blockID);
		world.setBlock(x + 2, y + 5, z + 6, Block.glass.blockID);
		world.setBlock(x + 3, y + 5, z + 5, Block.glass.blockID);
		world.setBlock(x + 3, y + 5, z + 6, Block.glass.blockID);

		world.setBlock(x + 5, y + 5, z + 2, Block.glass.blockID);
		world.setBlock(x + 5, y + 5, z + 3, Block.glass.blockID);
		world.setBlock(x + 6, y + 5, z + 2, Block.glass.blockID);
		world.setBlock(x + 6, y + 5, z + 3, Block.glass.blockID);

		world.setBlock(x + 5, y + 5, z + 5, Block.glass.blockID);
		world.setBlock(x + 5, y + 5, z + 6, Block.glass.blockID);
		world.setBlock(x + 6, y + 5, z + 5, Block.glass.blockID);
		world.setBlock(x + 6, y + 5, z + 6, Block.glass.blockID);

		world.setBlock(x + 1, y + 4, z + 4, Block.torchWood.blockID);
		world.setBlock(x + 7, y + 4, z + 4, Block.torchWood.blockID);
		world.setBlock(x + 4, y + 4, z + 7, Block.torchWood.blockID);
		world.setBlock(x + 4, y + 4, z + 1, Block.torchWood.blockID);

		// Add furnace and extra chest
		world.setBlock(x + 7, y, z + 2, Block.chest.blockID);
		world.setBlock(x + 7, y, z + 3, Block.furnaceIdle.blockID);
		world.setBlock(x + 7, y, z + 4, Block.workbench.blockID);

		// Add Bed and door
		world.setBlock(x + 6, y, z + 7, 26, 3, 0);
		world.setBlockMetadataWithNotify(x + 6, y, z + 7, 3, 0);
		world.setBlock(x + 7, y, z + 7, 26, 11, 0);
		world.setBlockMetadataWithNotify(x + 7, y, z + 7, 11, 0);

		// Add 1/2 slabs (Trim)
		// South Wall
		for (int i = 9; i > 0; --i) {
			world.setBlock(x + i - 1, y + 5, z + 8, 126);

		}
		// North wall
		for (int i = 0; i < 9; i++) {
			world.setBlock(x + i, y + 5, z, 126);
		}
		// West wall
		for (int i = 0; i < 9; i++) {
			world.setBlock(x, y + 5, z + i, 126);
		}
		// East Wall
		for (int i = 9; i > 0; --i) {
			world.setBlock(x + 8, y + 5, z + i - 1, 126);
		}
		// Add layer Below
		// South Wall
		for (int i = 9; i > 0; --i) {
			world.setBlock(x + i - 1, y + 4, z + 9, 126);
			world.setBlockMetadataWithNotify(x + i - 1, y + 4, z + 9, 8, 0);

		}
		// North wall
		for (int i = 0; i < 9; i++) {
			world.setBlock(x + i, y + 4, z - 1, 126);
			world.setBlockMetadataWithNotify(x + i, y + 4, z - 1, 8, 0);
		}
		// West wall
		for (int i = 0; i < 9; i++) {
			world.setBlock(x - 1, y + 4, z + i, 126);
			world.setBlockMetadataWithNotify(x - 1, y + 4, z + i, 8, 0);
		}
		// East Wall
		for (int i = 9; i > 0; --i) {
			world.setBlock(x + 9, y + 4, z + i - 1, 126);
			world.setBlockMetadataWithNotify(x + 9, y + 4, z + i - 1, 8, 0);
		}
		world.setBlock(x + 9, y + 4, z - 1, 126);
		world.setBlockMetadataWithNotify(x + 9, y + 4, z - 1, 8, 0);

		world.setBlock(x + 9, y + 4, z + 9, 126);
		world.setBlockMetadataWithNotify(x + 9, y + 4, z + 9, 8, 0);

		world.setBlock(x - 1, y + 4, z - 1, 126);
		world.setBlockMetadataWithNotify(x - 1, y + 4, z - 1, 8, 0);

		world.setBlock(x - 1, y + 4, z + 9, 126);
		world.setBlockMetadataWithNotify(x - 1, y + 4, z + 9, 8, 0);

		// Add anvil
		world.setBlock(x + 7, y, z + 5, Block.anvil.blockID);
	}

	public void netherAlter(World world, int x, int y, int z) {
		//Clear Space
		for(int xCoord = 0; xCoord <= 6;xCoord++){
			for(int yCoord = -1; yCoord <= 6; yCoord++){
				for(int zCoord = 0; zCoord <= 6; zCoord++){
					world.setBlock(x+xCoord, y+yCoord, z+zCoord, 0);
				}
			}
		}
		for(int i = 0; i<=6;i++){
			for(int j=0; j<=6;j++){
				world.setBlock(x+i, y-1, z+j, Block.netherrack.blockID);
			}
		}
		for(int i=0; i<6;i++){
			world.setBlock(x, y+i, z, Block.netherBrick.blockID);
		}
		for(int i=0; i<6;i++){
			world.setBlock(x+6, y+i, z, Block.netherBrick.blockID);
		}
		for(int i=0; i<6;i++){
			world.setBlock(x, y+i, z+6, Block.netherBrick.blockID);
		}
		for(int i=0; i<6;i++){
			world.setBlock(x+6, y+i, z+6, Block.netherBrick.blockID);
		}
		
		world.setBlock(x, y+3, z, Block.glowStone.blockID);
		world.setBlock(x+6, y+3, z, Block.glowStone.blockID);
		world.setBlock(x, y+3, z+6, Block.glowStone.blockID);
		world.setBlock(x+6, y+3, z+6, Block.glowStone.blockID);
		
		for(int i = 0; i<=6;i++){
			for(int j=0; j<=6;j++){
				world.setBlock(x+i, y+4, z+j, Block.netherBrick.blockID);
			}
		}
		for(int i = 0; i<=4;i++){
			for(int j=0; j<=4;j++){
				world.setBlock(x+i+1, y+5, z+j+1, Block.netherBrick.blockID);
			}
		}
		world.setBlock(x, y+5, z, Block.stairsNetherBrick.blockID);
		world.setBlockMetadataWithNotify(x, y+5, z, 2, 0);
		for(int i=0; i<=5;i++){
			world.setBlock(x, y+5, z+1+i, Block.stairsNetherBrick.blockID);
		}
		
		for(int i=0; i<=5;i++){
			world.setBlock(x+1+i, y+5, z, Block.stairsNetherBrick.blockID);
			world.setBlockMetadataWithNotify(x+1+i, y+5, z, 2, 0);
		}
		for(int i=0; i<=5;i++){
			world.setBlock(x+6, y+5, z+1+i, Block.stairsNetherBrick.blockID);
			world.setBlockMetadataWithNotify(x+6, y+5, z+1+i, 1, 0);
		}
		for(int i=0; i<=5;i++){
			world.setBlock(x+1+i, y+5, z+6, Block.stairsNetherBrick.blockID);
			world.setBlockMetadataWithNotify(x+1+i, y+5, z+6, 3, 0);
		}
		
		world.setBlock(x+3, y+0, z+2, Block.obsidian.blockID);
		world.setBlock(x+3, y+0, z+2+3, Block.obsidian.blockID);
		world.setBlock(x+3, y+1, z+2, Block.obsidian.blockID);
		world.setBlock(x+3, y+1, z+2+3, Block.obsidian.blockID);
		world.setBlock(x+3, y+2, z+2, Block.obsidian.blockID);
		world.setBlock(x+3, y+2, z+2+3, Block.obsidian.blockID);
		world.setBlock(x+3, y+3, z+2, Block.obsidian.blockID);
		world.setBlock(x+3, y+3, z+3, Block.obsidian.blockID);
		world.setBlock(x+3, y+3, z+4, Block.obsidian.blockID);
		world.setBlock(x+3, y+3, z+5, Block.obsidian.blockID);
		world.setBlock(x+3, y-1, z+3, Block.obsidian.blockID);
		world.setBlock(x+3, y-1, z+4, Block.obsidian.blockID);
		
		
		
	}

	public void enchanter(World world, int x, int y, int z) {
		for(int xCoord = 0; xCoord <= 4;xCoord++){
			for(int yCoord = -1; yCoord <= 1; yCoord++){
				for(int zCoord = 0; zCoord <= 4; zCoord++){
					world.setBlock(x+xCoord, y+yCoord, z+zCoord, 0);
				}
			}
		}
		for(int i = 0; i<=4;i++){
			for(int j=0; j<=4;j++){
				world.setBlock(x+i, y-1, z+j, Block.planks.blockID);
			}
		}
		for(int i=0; i <=1; i++){
			for(int j=0;j<=4;j++){
				world.setBlock(x+j, y+i, z, Block.bookShelf.blockID);
			}
		}
		for(int i=0; i <=1; i++){
			for(int j=0;j<=4;j++){
				world.setBlock(x+j, y+i, z+4, Block.bookShelf.blockID);
			}
		}
		for(int i=0; i <=1; i++){
			for(int j=0;j<=4;j++){
				world.setBlock(x+4, y+i, z+j, Block.bookShelf.blockID);
			}
		}
		
		world.setBlock(x, y, z+1, Block.bookShelf.blockID);
		world.setBlock(x, y+1, z+1, Block.bookShelf.blockID);
		
		world.setBlock(x, y, z+3, Block.bookShelf.blockID);
		world.setBlock(x, y+1, z+3, Block.bookShelf.blockID);
		world.setBlock(x+2, y, z+2, Block.enchantmentTable.blockID);
	}

}
