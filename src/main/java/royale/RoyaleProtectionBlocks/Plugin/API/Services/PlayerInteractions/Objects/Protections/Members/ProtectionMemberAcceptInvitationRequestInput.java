package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Members;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionMemberAcceptInvitationRequestInput extends PlayerRequestInput {

	private IProtection protection;

	public ProtectionMemberAcceptInvitationRequestInput(Player player, IProtection protection) {
		super(player);
		this.protection = protection;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public static ProtectionMemberAcceptInvitationRequestInput inst(Player player, IProtection protection) {
		return new ProtectionMemberAcceptInvitationRequestInput(player, protection);
	}

}
