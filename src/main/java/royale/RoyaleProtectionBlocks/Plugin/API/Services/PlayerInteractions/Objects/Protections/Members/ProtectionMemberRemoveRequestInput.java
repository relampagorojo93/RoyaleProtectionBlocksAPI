package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Members;

import java.util.UUID;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionMemberRemoveRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private UUID member;

	public ProtectionMemberRemoveRequestInput(Player player, IProtection protection, UUID member) {
		super(player);
		this.protection = protection;
		this.member = member;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public UUID getMember() {
		return this.member;
	}

	public static ProtectionMemberRemoveRequestInput inst(Player player, IProtection protection, UUID member) {
		return new ProtectionMemberRemoveRequestInput(player, protection, member);
	}

}
