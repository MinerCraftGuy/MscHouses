package mrkirby153.MscHouses;

import net.minecraft.item.Item;

public class ItemHouseTool extends Item{
	public int defaultDamage = 10;

	public ItemHouseTool(int par1) {
		super(par1);
		this.setCreativeTab(MscHouses.tabHouse);
		this.setMaxDamage(this.defaultDamage);
	}
}
