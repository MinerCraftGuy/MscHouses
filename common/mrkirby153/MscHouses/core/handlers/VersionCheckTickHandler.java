package mrkirby153.MscHouses.core.handlers;

import java.util.EnumSet;

import mrkirby153.MscHouses.core.MscHouses;
import mrkirby153.MscHouses.core.Version;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatMessageComponent;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
/**
 * 
 * Msc Houses
 *
 * VersionCheckTickHandler
 *
 * @author mrkirby153
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class VersionCheckTickHandler implements ITickHandler {

	private boolean nagged;

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {

		if (nagged)
			return;

		EntityPlayer player = (EntityPlayer) tickData[0];

		// if(!Config.disableVersionCheck) {

		if (Version.needsUpdateNoticeAndMarkAsSeen()) {
			player.sendChatToPlayer(ChatMessageComponent.createFromText(String.format("\u00A7cNew version of MscHouses available: %s for Minecraft %s", Version.getReccomendedVersion(),
					MscHouses.getMCVersion())));
			for (String updateLine : Version.getChangelog()) {
				player.sendChatToPlayer(ChatMessageComponent.createFromText("\u00A79" + updateLine));
			}
			player.sendChatToPlayer(ChatMessageComponent.createFromText("\u00A7cThis message only displays once. Type '/MscHouses version' if you want to see it again."));
		}

		// }

		nagged = true;
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return "MscHouses - Player update tick";
	}

}

