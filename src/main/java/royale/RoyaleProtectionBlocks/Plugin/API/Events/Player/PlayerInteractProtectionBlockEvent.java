package royale.RoyaleProtectionBlocks.Plugin.API.Events.Player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.Action;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;

/**
 * Note: This event is fired multiple times, each one per result status.
 */
public class PlayerInteractProtectionBlockEvent extends Event implements Cancellable {

	private static final HandlerList handlerList = new HandlerList();

	public static HandlerList getHandlerList() {
		return handlerList;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HandlerList getHandlers() {
		return handlerList;
	}

	private Event cause;
	private Player player;
	private IProtection protection;
	private Action action;
	private EventResult result = EventResult.PROCESSING;
	private boolean cancelled = false;

	public PlayerInteractProtectionBlockEvent(Event cause, Player player, IProtection protection, Action action) {
		this.cause = cause;
		this.player = player;
		this.protection = protection;
		this.action = action;
	}

	public PlayerInteractProtectionBlockEvent(Event cause, Player player, IProtection protection, Action action,
			EventResult result) {
		this(cause, player, protection, action);
		this.result = result;
	}

	public Event getCause() {
		return this.cause;
	}

	public Player getPlayer() {
		return this.player;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public Action getAction() {
		return action;
	}

	public EventResult getResult() {
		return this.result;
	}

	@Override
	public boolean isCancelled() {
		return this.cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public static enum EventResult {
		PROCESSING, CANCELLED, IGNORED, INTERACTED
	}

}
