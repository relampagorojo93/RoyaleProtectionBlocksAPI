package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionTogglePublicAccessRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private boolean publicAccess;

	public ProtectionTogglePublicAccessRequestInput(Player player, IProtection protection, boolean publicAccess) {
		super(player);
		this.protection = protection;
		this.publicAccess = publicAccess;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public boolean isPublicAccess() {
		return this.publicAccess;
	}

	public static ProtectionTogglePublicAccessRequestInput inst(Player player, IProtection protection,
			boolean publicAccess) {
		return new ProtectionTogglePublicAccessRequestInput(player, protection, publicAccess);
	}

}
