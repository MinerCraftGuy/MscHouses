package mrkirby153.MscHouses;

import net.minecraft.item.*;
import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HouseGen {

	public void hut(int x, int y, int z, World world){
		//Removes House building Block
		world.setBlock(x, y, z, 0);
		//Clear area
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				for(int k = 0; k < 5; k++){
					world.setBlock(x+i, y+j, z+k, 0);
				}
			}
		}

		//Floor
		for(int x1 = 0; x1 < 5; x1++){
			for(int z1 =0; z1 < 5; z1++){
				world.setBlock(x+x1, y-1, z+z1, Block.planks.blockID);
			}
		}
		//Celing
		for(int x1 = 0; x1 < 5; x1++){
			for(int z1 =0; z1 < 5; z1++){
				world.setBlock(x+x1, y+5, z+z1, Block.planks.blockID);
			}
		}
		//North wall
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				world.setBlock(x+i, y+j, z, Block.planks.blockID);
			}
		}
		//West wall
		for(int i = 0; i < 5; i++){
			for (int j = 0; j < 5; j++){
				world.setBlock(x, y+j, z+i, Block.planks.blockID);
			}
		}
		//East Wall
		for(int i = 5; i > 0; --i){
			for(int j = 0; j < 5; j++){
				world.setBlock(x+4, y+j, z+i-1, Block.planks.blockID);
			}
		}
		//South Wall
		for(int i = 5; i > 0; --i){
			for(int j =0; j < 5; j++){
				world.setBlock(x+i-1, y+j, z+4, Block.planks.blockID);
			}
		}
		//Door
		world.setBlock(x, y, z+2, 0);
		world.setBlock(x, y+1, z+2, 0);
		//Light
		world.setBlock(x+2, y+4, z+2, Block.glowStone.blockID);
		//Chest
		world.setBlock(x+3, y, z+1, Block.chest.blockID);
		//Fill Chest.
		IInventory inventory = (IInventory) world.getBlockTileEntity(x+3, y, z+1);
		inventory.setInventorySlotContents(0, new ItemStack(Item.bed));
		inventory.setInventorySlotContents(1, new ItemStack(Item.doorWood));
	}

	public void ninebynine(World world, int x, int y, int z) {
		//Removes House building Block
		world.setBlock(x, y, z, 0);
		//Clear area
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				for(int k = 0; k < 9; k++){
					world.setBlock(x+i, y+j, z+k, 0);
				}
			}
		}

		//Floor
		for(int x1 = 0; x1 < 9; x1++){
			for(int z1 =0; z1 < 9; z1++){
				world.setBlock(x+x1, y-1, z+z1, Block.stone.blockID);
			}
		}
		//Celing
		for(int x1 = 0; x1 < 9; x1++){
			for(int z1 =0; z1 < 9; z1++){
				world.setBlock(x+x1, y+5, z+z1, Block.stone.blockID);
			}
		}
		//North wall
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 5; j++){
				world.setBlock(x+i, y+j, z, Block.stone.blockID);
			}
		}
		//West wall
		for(int i = 0; i < 9; i++){
			for (int j = 0; j < 5; j++){
				world.setBlock(x, y+j, z+i, Block.stone.blockID);
			}
		}
		//East Wall
		for(int i = 9; i > 0; --i){
			for(int j = 0; j < 5; j++){
				world.setBlock(x+8, y+j, z+i-1, Block.stone.blockID);
			}
		}
		//South Wall
		for(int i = 9; i > 0; --i){
			for(int j =0; j < 5; j++){
				world.setBlock(x+i-1, y+j, z+8, Block.stone.blockID);
			}
		}
		//Door
		world.setBlockAndMetadata(x, y, z+4, 64, 0);
		world.setBlockAndMetadata(x, y+1, z+4, 64, 8);
		world.setBlock(x+1, y, z+4, Block.pressurePlatePlanks.blockID);
		//Light
	//	world.setBlock(x+2, y+4, z+2, Block.glowStone.blockID);
		//Chest
		world.setBlock(x+7, y, z+1, Block.chest.blockID);
		//Fill Chest.
		IInventory inventory = (IInventory) world.getBlockTileEntity(x+7, y, z+1);
		inventory.setInventorySlotContents(0, new ItemStack(Item.bed));
		inventory.setInventorySlotContents(1, new ItemStack(Item.doorWood));
		inventory.setInventorySlotContents(2, new ItemStack(Block.pressurePlateStone));
		inventory.setInventorySlotContents(3, new ItemStack(Block.woodenButton));
		//Add windows and torches.
		world.setBlock(x+2, y+5, z+2, Block.glass.blockID);
		world.setBlock(x+2, y+5, z+3, Block.glass.blockID);
		world.setBlock(x+3, y+5, z+2, Block.glass.blockID);
		world.setBlock(x+3, y+5, z+3, Block.glass.blockID);

		world.setBlock(x+2, y+5, z+5, Block.glass.blockID);
		world.setBlock(x+2, y+5, z+6, Block.glass.blockID);
		world.setBlock(x+3, y+5, z+5, Block.glass.blockID);
		world.setBlock(x+3, y+5, z+6, Block.glass.blockID);

		world.setBlock(x+5, y+5, z+2, Block.glass.blockID);
		world.setBlock(x+5, y+5, z+3, Block.glass.blockID);
		world.setBlock(x+6, y+5, z+2, Block.glass.blockID);
		world.setBlock(x+6, y+5, z+3, Block.glass.blockID);

		world.setBlock(x+5, y+5, z+5, Block.glass.blockID);
		world.setBlock(x+5, y+5, z+6, Block.glass.blockID);
		world.setBlock(x+6, y+5, z+5, Block.glass.blockID);
		world.setBlock(x+6, y+5, z+6, Block.glass.blockID);
		
		world.setBlock(x+1, y+4, z+4, Block.torchWood.blockID);
		world.setBlock(x+7, y+4, z+4, Block.torchWood.blockID);
		world.setBlock(x+4, y+4, z+7, Block.torchWood.blockID);
		world.setBlock(x+4, y+4, z+1, Block.torchWood.blockID);
		
		//Add furnace and extra chest
		world.setBlock(x+7, y, z+2, Block.chest.blockID);
		world.setBlock(x+7, y, z+3, Block.stoneOvenIdle.blockID);
		world.setBlock(x+7, y, z+4, Block.workbench.blockID);
		
		//Add Bed and door
		world.setBlockAndMetadata(x+6, y, z+7, 26, 3);
		world.setBlockAndMetadata(x+7, y, z+7, 24, 11);
		
	}
	

}
