package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Members;

import java.util.UUID;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionMemberAddRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private UUID member;

	public ProtectionMemberAddRequestInput(Player player, IProtection protection, UUID member) {
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

	public static ProtectionMemberAddRequestInput inst(Player player, IProtection protection, UUID member) {
		return new ProtectionMemberAddRequestInput(player, protection, member);
	}

}
