package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionHideBlockRequestInput extends PlayerRequestInput {

	private IProtection protection;

	public ProtectionHideBlockRequestInput(Player player, IProtection protection) {
		super(player);
		this.protection = protection;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public static ProtectionHideBlockRequestInput inst(Player player, IProtection protection) {
		return new ProtectionHideBlockRequestInput(player, protection);
	}

}
