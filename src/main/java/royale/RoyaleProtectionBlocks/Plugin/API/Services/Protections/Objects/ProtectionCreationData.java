package royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.CreationCause;
import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.ProtectionBlocks.IProtectionBlock;

public class ProtectionCreationData {

	private CommandSender executor;
	private UUID ownerUuid;
	private IProtectionBlock protectionBlock;
	private Location location;
	private CreationCause creationCause;

	private boolean checkWorldGuardOverlap = true;
	private boolean checkOverlap = true;
	private boolean executeOnAsync = true;

	public ProtectionCreationData(CommandSender executor, UUID ownerUuid, IProtectionBlock protectionBlock,
			Location location) {
		this(executor, ownerUuid, protectionBlock, location, CreationCause.PLUGIN);
	}

	public ProtectionCreationData(CommandSender executor, UUID ownerUuid, IProtectionBlock protectionBlock,
			Location location, CreationCause creationCause) {
		this.executor = executor;
		this.ownerUuid = ownerUuid;
		this.protectionBlock = protectionBlock;
		this.location = location;
		this.creationCause = creationCause;
	}

	public CommandSender getExecutor() {
		return this.executor;
	}

	public UUID getOwnerUuid() {
		return this.ownerUuid;
	}

	public IProtectionBlock getProtectionBlock() {
		return this.protectionBlock;
	}

	public Location getLocation() {
		return this.location;
	}

	public CreationCause getCreationCause() {
		return this.creationCause;
	}

	public boolean isCheckWorldGuardOverlap() {
		return this.checkWorldGuardOverlap;
	}

	public ProtectionCreationData setCheckWorldGuardOverlap(boolean checkWorldGuardOverlap) {
		this.checkWorldGuardOverlap = checkWorldGuardOverlap;
		return this;
	}

	public boolean isCheckOverlap() {
		return this.checkOverlap;
	}

	public ProtectionCreationData setCheckOverlap(boolean checkOverlap) {
		this.checkOverlap = checkOverlap;
		return this;
	}

	public boolean isExecuteOnAsync() {
		return this.executeOnAsync;
	}

	public ProtectionCreationData setExecuteOnAsync(boolean checkOverlap) {
		this.checkOverlap = checkOverlap;
		return this;
	}

	public static ProtectionCreationData inst(CommandSender executor, UUID ownerUuid, IProtectionBlock protectionBlock,
			Location location) {
		return new ProtectionCreationData(executor, ownerUuid, protectionBlock, location);
	}

	public static ProtectionCreationData inst(CommandSender executor, UUID ownerUuid, IProtectionBlock protectionBlock,
			Location location, CreationCause creationCause) {
		return new ProtectionCreationData(executor, ownerUuid, protectionBlock, location, creationCause);
	}

}
