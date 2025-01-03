package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Banneds;

import java.util.UUID;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionBannedAddRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private UUID banned;

	public ProtectionBannedAddRequestInput(Player player, IProtection protection, UUID banned) {
		super(player);
		this.protection = protection;
		this.banned = banned;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public UUID getBanned() {
		return this.banned;
	}

	public static ProtectionBannedAddRequestInput inst(Player player, IProtection protection, UUID banned) {
		return new ProtectionBannedAddRequestInput(player, protection, banned);
	}

}
