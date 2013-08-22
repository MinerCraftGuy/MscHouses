package mrkirby153.MscHouses.api;

import java.util.ArrayList;
import java.util.Iterator;

import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.block.Block;

/**
 * 
 * Msc Houses
 *
 * MaterialRegistry
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class MaterialRegistry {
	/**A list of all blocks registered. */
	private static ArrayList<Block> blocks = new ArrayList<Block>();
	private static ArrayList<Integer> blacklist = MscHouses.blacklisted_ids;
	/**
	 * Registers a material for walls.
	 */
	public static void registerBlock(Block block){
		if(block instanceof Block && !(block.getUnlocalizedName().equalsIgnoreCase("tile.forgefiller"))){
			blocks.add(block);
		}
	}
	/**
	 * Adds a material to the wall blacklist
	 * @param Block
	 */
	public static void addBlacklistMaterial(Block block){
		int var1 = block.blockID;
		blacklist.add(var1);
	}
	/**
	 * Checks if the block provided is registered and returns.
	 * @param Block b
	 * @return boolean 
	 */
	public static boolean isBlockValid(Block b){
		return blocks.contains(b);
	}
	/**
	 * Returns the Block id  of a Material modifyer from its damage value.
	 * @param int id
	 * @return int BlockId
	 */

	public static int materialLookup(int id){
		Block[] block = new Block[blocks.size()];
		block = blocks.toArray(block);
		int[] block_id = new int[block.length];
		for(int i = 0; i < block.length; i++){
			Block var1 = block[i];
			block_id[i] = var1.blockID;
		}
		return block_id[id];
	}
	/**
	 * Returns a list of all the registered blocks as a table.
	 * @return Block[]
	 */
	public static Block[] getValidBlocksAsArray(){
		Block[] block = new Block[blocks.size()];
		block = blocks.toArray(block);
		return block;
	}
	/**
	 * Returns a list of ALL the blacklisted blocks as a table.
	 * @return int[]
	 */
	public static int[] getBlacklistedAsArray(){
		int[] ret = new int[blacklist.size()];
		Iterator<Integer> iterator = blacklist.iterator();
		for(int i = 0; i < ret.length; i++){
			ret[i] = iterator.next().intValue();
		}
		return ret;
	}
	/**
	 *  Returns an ArrayList of all the blacklisted blocks
	 * @return ArrayList<Integer>
	 */
	public static ArrayList<Integer> getBlacklisted(){
		return blacklist;
	}
	/**
	 * Returns a list of all the valid blocks you can use to make houses.
	 * @return ArrayList<Block>
	 */
	public static ArrayList<Block> getValidBlocks(){
		return blocks;
	}
}

