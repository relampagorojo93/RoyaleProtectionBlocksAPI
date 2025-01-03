package royale.RoyaleProtectionBlocks.Plugin.API.Events.Protection;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.RemovalCause;
import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;

public class ProtectionRemovalEvent extends Event {

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
	private RemovalCause cause;

	public ProtectionRemovalEvent(CommandSender executor, IProtection protection, RemovalCause cause) {
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

	public RemovalCause getCause() {
		return this.cause;
	}

}
