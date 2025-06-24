package royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects;

import java.util.UUID;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;

public class ProtectionInvitation {

	private IProtection protection;
	private UUID playerUuid;
	private long createdDate;

	public ProtectionInvitation(IProtection protection, UUID playerUuid) {
		this(protection, playerUuid, System.currentTimeMillis());
	}

	public ProtectionInvitation(IProtection protection, UUID playerUuid, long createdDate) {
		this.protection = protection;
		this.playerUuid = playerUuid;
		this.createdDate = createdDate;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public UUID getPlayerUuid() {
		return this.playerUuid;
	}

	public long getCreatedDate() {
		return this.createdDate;
	}

}
