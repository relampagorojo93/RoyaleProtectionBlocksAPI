package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionKickRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private Player kicked;

	public ProtectionKickRequestInput(Player player, IProtection protection, Player kicked) {
		super(player);
		this.protection = protection;
		this.kicked = kicked;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public Player getKicked() {
		return this.kicked;
	}

	public static ProtectionKickRequestInput inst(Player player, IProtection protection, Player kicked) {
		return new ProtectionKickRequestInput(player, protection, kicked);
	}

}
