package mrkirby153.MscHouses.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mrkirby153.MscHouses.core.MscHouses;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockGenerator extends ItemBlock{

	public ItemBlockGenerator(int par1) {
		super(par1);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		list.add("Compatable with: Hut, Nine by Nine");
		list.add("Nine by Nine deluxe");
	}

}
