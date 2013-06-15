package mrkirby153.MscHouses.core.helpers;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

/**
 * 
 * Msc Houses
 *
 * NBTHelper
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class NBTHelper {
	private static void initNBT(ItemStack itemStack) {
		if (itemStack.stackTagCompound == null) {
			itemStack.setTagCompound(new NBTTagCompound());
		}
	}

	public static void resetNBT(ItemStack itemStack) {
		itemStack.setTagCompound(new NBTTagCompound());
	}

	// SPEACIAL

	public static boolean hasTag(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.hasKey(tagName);
	}

	public static void setTag(ItemStack itemStack, String tagName,
			NBTBase tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setTag(tagName, tagValue);
	}

	public static void removeTag(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		itemStack.stackTagCompound.removeTag(tagName);
	}

	// GETTERS

	public static byte getByte(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.getByte(tagName);
	}

	public static short getShort(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.getShort(tagName);
	}

	public static int getInteger(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.getInteger(tagName);
	}

	public static long getLong(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.getLong(tagName);
	}

	public static float getFloat(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.getFloat(tagName);
	}

	public static double getDouble(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.getDouble(tagName);
	}

	public static String getString(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.getString(tagName);
	}

	public static boolean getBoolean(ItemStack itemStack, String tagName) {
		initNBT(itemStack);
		return itemStack.stackTagCompound.getBoolean(tagName);
	}

	// SETTERS

	public static void setByte(ItemStack itemStack, String tagName,
			byte tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setByte(tagName, tagValue);
	}

	public static void setShort(ItemStack itemStack, String tagName,
			short tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setShort(tagName, tagValue);
	}

	public static void setInteger(ItemStack itemStack, String tagName,
			int tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setInteger(tagName, tagValue);
	}

	public static void setLong(ItemStack itemStack, String tagName,
			long tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setLong(tagName, tagValue);
	}

	public static void setFloat(ItemStack itemStack, String tagName,
			float tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setFloat(tagName, tagValue);
	}

	public static void setDouble(ItemStack itemStack, String tagName,
			double tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setDouble(tagName, tagValue);
	}

	public static void setString(ItemStack itemStack, String tagName,
			String tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setString(tagName, tagValue);
	}

	public static void setBoolean(ItemStack itemStack, String tagName,
			boolean tagValue) {
		initNBT(itemStack);
		itemStack.stackTagCompound.setBoolean(tagName, tagValue);
	}
}
