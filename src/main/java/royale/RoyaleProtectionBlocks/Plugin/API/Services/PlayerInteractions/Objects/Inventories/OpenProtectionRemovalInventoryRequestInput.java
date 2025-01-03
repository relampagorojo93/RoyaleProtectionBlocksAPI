package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Inventories;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class OpenProtectionRemovalInventoryRequestInput extends PlayerRequestInput {

	private IProtection protection;

	public OpenProtectionRemovalInventoryRequestInput(Player player, IProtection protection) {
		super(player);
		this.protection = protection;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public static OpenProtectionRemovalInventoryRequestInput inst(Player player, IProtection protection) {
		return new OpenProtectionRemovalInventoryRequestInput(player, protection);
	}

}
