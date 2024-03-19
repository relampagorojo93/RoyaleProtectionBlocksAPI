package royale.RoyaleCustomTags.Plugin.InternalAPI;

import org.bukkit.entity.Player;

import royale.RoyaleCustomTags.Plugin.InternalAPI.Interfaces.IPlaceholder;
import royale.RoyaleCustomTags.Plugin.InternalAPI.Interfaces.ITag;

/**
 * Bukkit event thrown when a placeholder is being processed on a chat event.
 * 
 * @author DarkPanda73
 * @since RoyaleCustomTags 0.0.14 Alpha
 */
public class ChatPlaceholderProcessingEvent extends PlaceholderProcessingEvent {

	private String message;

	public ChatPlaceholderProcessingEvent(Player player, IPlaceholder placeholder, ITag tag, String result,
			String message) {
		super(player, placeholder, tag, result);
		this.message = message;
	}

	/**
	 * @return The message sent by the player.
	 */
	public String getMessage() {
		return this.message;
	}

}
