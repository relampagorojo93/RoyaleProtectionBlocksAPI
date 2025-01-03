package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Inventories;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class OpenProtectionManagementInventoryRequestInput extends PlayerRequestInput {

	private IProtection protection;

	public OpenProtectionManagementInventoryRequestInput(Player player, IProtection protection) {
		super(player);
		this.protection = protection;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public static OpenProtectionManagementInventoryRequestInput inst(Player player, IProtection protection) {
		return new OpenProtectionManagementInventoryRequestInput(player, protection);
	}

}
