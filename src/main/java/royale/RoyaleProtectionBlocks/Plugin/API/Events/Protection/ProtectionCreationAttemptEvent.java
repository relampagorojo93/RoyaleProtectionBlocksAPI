package royale.RoyaleProtectionBlocks.Plugin.API.Events.Protection;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.CreationCause;
import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;

public class ProtectionCreationAttemptEvent extends Event implements Cancellable {

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

	private CommandSender executor;
	private IProtection protection;
	private CreationCause cause;
	private boolean cancelled = false;

	public ProtectionCreationAttemptEvent(CommandSender executor, IProtection protection, CreationCause cause) {
		super(!Bukkit.isPrimaryThread());
		this.executor = executor;
		this.protection = protection;
		this.cause = cause;
	}

	public CommandSender getExecutor() {
		return this.executor;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public CreationCause getCause() {
		return this.cause;
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
