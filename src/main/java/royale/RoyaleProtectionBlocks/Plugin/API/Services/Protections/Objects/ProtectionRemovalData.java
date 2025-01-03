package royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects;

import org.bukkit.command.CommandSender;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.RemovalCause;

public class ProtectionRemovalData {

	private CommandSender executor;
	private String protectionId;
	private RemovalCause removalCause;

	private boolean hideBlock = true;
	private boolean removeProtectedRegion = true;

	public ProtectionRemovalData(CommandSender executor, String protectionId) {
		this(executor, protectionId, RemovalCause.PLUGIN);
	}

	public ProtectionRemovalData(CommandSender executor, String protectionId, RemovalCause removalCause) {
		this.executor = executor;
		this.protectionId = protectionId;
		this.removalCause = removalCause;
	}

	public CommandSender getExecutor() {
		return this.executor;
	}

	public String getProtectionId() {
		return this.protectionId;
	}

	public RemovalCause getRemovalCause() {
		return this.removalCause;
	}

	public boolean isHideBlock() {
		return this.hideBlock;
	}

	public ProtectionRemovalData setHideBlock(boolean hideBlock) {
		this.hideBlock = hideBlock;
		return this;
	}

	public boolean isRemoveProtectedRegion() {
		return this.removeProtectedRegion;
	}

	public ProtectionRemovalData setRemoveProtectedRegion(boolean removeProtectedRegion) {
		this.removeProtectedRegion = removeProtectedRegion;
		return this;
	}

	public static ProtectionRemovalData inst(CommandSender executor, String protectionId) {
		return new ProtectionRemovalData(executor, protectionId);
	}

	public static ProtectionRemovalData inst(CommandSender executor, String protectionId, RemovalCause removalCause) {
		return new ProtectionRemovalData(executor, protectionId, removalCause);
	}

}
