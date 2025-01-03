package royale.RoyaleProtectionBlocks.Plugin.API.Events.Player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;

public class PlayerTeleportToProtectionAttemptEvent extends Event implements Cancellable {

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

	private Player player;
	private IProtection protection;
	private boolean cancelled;

	public PlayerTeleportToProtectionAttemptEvent(Player player, IProtection protection) {
		super();
		this.player = player;
		this.protection = protection;
	}

	public Player getPlayer() {
		return this.player;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public boolean isCancelled() {
		return this.cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

}
