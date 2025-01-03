package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Owners;

import java.util.UUID;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionOwnerAddRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private UUID owner;

	public ProtectionOwnerAddRequestInput(Player player, IProtection protection, UUID owner) {
		super(player);
		this.protection = protection;
		this.owner = owner;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public UUID getOwner() {
		return this.owner;
	}

	public static ProtectionOwnerAddRequestInput inst(Player player, IProtection protection, UUID owner) {
		return new ProtectionOwnerAddRequestInput(player, protection, owner);
	}

}
