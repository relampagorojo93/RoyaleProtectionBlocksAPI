package royale.RoyaleCustomTags.Plugin.InternalAPI;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleCustomTags.Plugin.InternalAPI.Interfaces.IPlaceholder;
import royale.RoyaleCustomTags.Plugin.InternalAPI.Interfaces.ITag;

/**
 * Bukkit event thrown when a placeholder is being processed.
 * 
 * @author DarkPanda73
 * @since RoyaleCustomTags 0.0.14 Alpha
 */
public class PlaceholderProcessingEvent extends Event {

	private static final HandlerList handlerList = new HandlerList();

	public static HandlerList getHandlerList() {
		return handlerList;
	}

	private Player player;
	private IPlaceholder placeholder;
	private ITag tag;
	private String result;
	private boolean keepRaw = false;

	public PlaceholderProcessingEvent(Player player, IPlaceholder placeholder, ITag tag, String result) {
		this.player = player;
		this.placeholder = placeholder;
		this.tag = tag;
		this.result = result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HandlerList getHandlers() {
		return handlerList;
	}

	/**
	 * @return Player related to the event.
	 */
	public Player getPlayer() {
		return this.player;
	}

	/**
	 * @return Placeholder related to the event.
	 */
	public IPlaceholder getPlaceholder() {
		return this.placeholder;
	}

	/**
	 * @return Current tag selected on the related placeholder based on the player
	 *         configuration. May be null if the player has not selected a tag from
	 *         the related placeholder, in that case, the plugin will be using the
	 *         default tag.
	 */
	public ITag getTag() {
		return this.tag;
	}

	/**
	 * @return The text that will be processed once the event has been sent.
	 */
	public String getResult() {
		return this.result;
	}

	/**
	 * Set the text that will be processed once the event has been sent. Remember to
	 * use '{message}' in order to allow RoyaleCustomTags to include the current
	 * player message on the text.
	 * 
	 * @param result
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @return If the result should be preserved raw or not.
	 * 
	 * @see #setKeepRaw(boolean) for more information.
	 */
	public boolean isKeepRaw() {
		return this.keepRaw;
	}

	/**
	 * Set if the result should be preserved raw or not.<br>
	 * <br>
	 * 
	 * If false, RoyaleCustomTags will apply the PlaceholderAPI parsing and the
	 * internal library coloring methods.<br>
	 * <br>
	 * 
	 * Otherwise, RoyaleCustomTags will return the content retrieved from
	 * {@link #getResult()} directly.
	 * 
	 * @param keepRaw
	 */
	public void setKeepRaw(boolean keepRaw) {
		this.keepRaw = keepRaw;
	}

}
