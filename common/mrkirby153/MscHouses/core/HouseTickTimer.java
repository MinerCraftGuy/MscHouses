package mrkirby153.MscHouses.core;

import java.util.EnumSet;

import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;

public class HouseTickTimer implements IScheduledTickHandler {
	public static int tickCount = 0;
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		// TODO Auto-generated method stub

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
//		tickCount++;
	//	System.out.println("Tick: "+tickCount);

	}

	@Override
	public EnumSet<TickType> ticks() {
		// TODO Auto-generated method stub
		return EnumSet.of(TickType.SERVER);
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "MscHouses-HouseTickTimer";
	}

	@Override
	public int nextTickSpacing() {
		return 10;
	}
	
	public static void resetTickCount(){
		tickCount = 0;
	}

}
