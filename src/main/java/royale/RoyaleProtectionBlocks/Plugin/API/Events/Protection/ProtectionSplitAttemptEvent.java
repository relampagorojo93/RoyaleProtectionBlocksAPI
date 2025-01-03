package royale.RoyaleProtectionBlocks.Plugin.API.Events.Protection;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;

public class ProtectionSplitAttemptEvent extends Event implements Cancellable {

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
	private boolean cancelled = false;

	public ProtectionSplitAttemptEvent(Player player, IProtection protection) {
		super(!Bukkit.isPrimaryThread());
		this.player = player;
		this.protection = protection;
	}

	public Player getPlayer() {
		return this.player;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	@Override
	public boolean isCancelled() {
		return this.cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

}
