package royale.RoyaleProtectionBlocks.Plugin.API.Events.Player;

import java.util.List;
import java.util.stream.Collectors;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;

public class PlayerEnterExitProtectionEvent extends Event implements Cancellable {

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
	private List<? extends IProtection> previousProtections;
	private List<? extends IProtection> currentProtections;
	private List<? extends IProtection> enteredProtections;
	private List<? extends IProtection> exitedProtections;
	private boolean cancelled = false;
	private boolean cancellable = true;

	public PlayerEnterExitProtectionEvent(Event cause, Player player, List<? extends IProtection> previousProtections,
			List<? extends IProtection> currentProtections) {
		this.cause = cause;
		this.player = player;
		this.previousProtections = previousProtections;
		this.currentProtections = currentProtections;
		this.enteredProtections = this.currentProtections.stream()
				.filter(prot -> !this.previousProtections.contains(prot)).collect(Collectors.toList());
		this.exitedProtections = this.previousProtections.stream()
				.filter(prot -> !this.currentProtections.contains(prot)).collect(Collectors.toList());
	}

	public PlayerEnterExitProtectionEvent(Event cause, Player player, List<? extends IProtection> previousProtections,
			List<? extends IProtection> currentProtections, boolean cancellable) {
		this.cause = cause;
		this.player = player;
		this.previousProtections = previousProtections;
		this.currentProtections = currentProtections;
		this.enteredProtections = this.currentProtections.stream()
				.filter(prot -> !this.previousProtections.contains(prot)).collect(Collectors.toList());
		this.exitedProtections = this.previousProtections.stream()
				.filter(prot -> !this.currentProtections.contains(prot)).collect(Collectors.toList());
		this.cancellable = cancellable;
	}

	public Event getCause() {
		return this.cause;
	}

	public Player getPlayer() {
		return this.player;
	}

	public List<? extends IProtection> getPreviousProtections() {
		return this.previousProtections;
	}

	public List<? extends IProtection> getCurrentProtections() {
		return this.currentProtections;
	}

	public List<? extends IProtection> getEnteredProtections() {
		return this.enteredProtections;
	}

	public List<? extends IProtection> getExitedProtections() {
		return this.exitedProtections;
	}

	public boolean isCancellable() {
		return this.cancellable;
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
