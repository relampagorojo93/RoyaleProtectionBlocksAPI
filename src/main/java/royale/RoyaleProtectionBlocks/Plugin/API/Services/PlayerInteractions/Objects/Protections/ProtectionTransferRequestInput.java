package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionTransferRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private Player newOwner;

	public ProtectionTransferRequestInput(Player player, IProtection protection, Player newOwner) {
		super(player);
		this.protection = protection;
		this.newOwner = newOwner;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public Player getNewOwner() {
		return this.newOwner;
	}

	public static ProtectionTransferRequestInput inst(Player player, IProtection protection, Player newOwner) {
		return new ProtectionTransferRequestInput(player, protection, newOwner);
	}

}
