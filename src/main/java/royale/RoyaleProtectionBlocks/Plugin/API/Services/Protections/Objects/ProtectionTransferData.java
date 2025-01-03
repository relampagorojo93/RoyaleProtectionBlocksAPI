package royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects;

import java.util.UUID;

public class ProtectionTransferData {

	private String protectionId;
	private UUID newOwner;

	public ProtectionTransferData(String protectionId, UUID newOwner) {
		this.protectionId = protectionId;
		this.newOwner = newOwner;
	}

	public String getProtectionId() {
		return this.protectionId;
	}

	public UUID getNewOwner() {
		return this.newOwner;
	}

	public static ProtectionTransferData inst(String protectionId, UUID newOwner) {
		return new ProtectionTransferData(protectionId, newOwner);
	}

}
