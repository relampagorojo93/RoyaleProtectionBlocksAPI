package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionMergeRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private IProtection parentProtection;

	public ProtectionMergeRequestInput(Player player, IProtection protection, IProtection parentProtection) {
		super(player);
		this.protection = protection;
		this.parentProtection = parentProtection;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public IProtection getParentProtection() {
		return this.parentProtection;
	}

	public static ProtectionMergeRequestInput inst(Player player, IProtection protection,
			IProtection parentProtection) {
		return new ProtectionMergeRequestInput(player, protection, parentProtection);
	}

}
