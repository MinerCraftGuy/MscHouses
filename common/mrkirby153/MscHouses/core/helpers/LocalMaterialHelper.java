package mrkirby153.MscHouses.core.helpers;

import java.util.ArrayList;
import java.util.logging.Level;

import mrkirby153.MscHouses.api.MaterialRegistry;
import net.minecraft.block.Block;


public class LocalMaterialHelper {
	private static Block[] blocks = Block.blocksList;
	private static ArrayList<Integer> bl= MaterialRegistry.getBlacklisted();
	public static void init(){
		LogHelper.log(Level.INFO, "Loading "+blocks.length+" material recipies!");
		for(int i=1; i < blocks.length; i++){
			if(blocks[i] != null){
				Block b = blocks[i];
					if(!bl.contains(b.blockID))
						MaterialRegistry.registerBlock(blocks[i]);
			}

		}
		LogHelper.log(Level.INFO, "Loaded "+blocks.length+" material recipies successfully!");
	}

}
