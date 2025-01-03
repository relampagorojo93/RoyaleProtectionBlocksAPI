package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionPurchaseRequestInput extends PlayerRequestInput {

	private IProtection protection;

	public ProtectionPurchaseRequestInput(Player player, IProtection protection) {
		super(player);
		this.protection = protection;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public static ProtectionPurchaseRequestInput inst(Player player, IProtection protection) {
		return new ProtectionPurchaseRequestInput(player, protection);
	}

}
