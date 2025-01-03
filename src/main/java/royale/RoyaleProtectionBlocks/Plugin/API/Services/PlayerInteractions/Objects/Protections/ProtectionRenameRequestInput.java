package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionRenameRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private String newName;

	public ProtectionRenameRequestInput(Player player, IProtection protection, String newName) {
		super(player);
		this.protection = protection;
		this.newName = newName;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public String getNewName() {
		return this.newName;
	}

	public static ProtectionRenameRequestInput inst(Player player, IProtection protection, String newName) {
		return new ProtectionRenameRequestInput(player, protection, newName);
	}

}
