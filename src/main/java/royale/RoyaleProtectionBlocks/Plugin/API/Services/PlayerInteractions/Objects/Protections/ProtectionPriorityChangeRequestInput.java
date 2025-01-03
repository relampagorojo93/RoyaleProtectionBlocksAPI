package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionPriorityChangeRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private int newPriority;
	private boolean recursive = true;

	public ProtectionPriorityChangeRequestInput(Player player, IProtection protection, int newPriority) {
		super(player);
		this.protection = protection;
		this.newPriority = newPriority;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public int getNewPriority() {
		return this.newPriority;
	}

	public boolean isRecursive() {
		return this.recursive;
	}

	public ProtectionPriorityChangeRequestInput setRecursive(boolean recursive) {
		this.recursive = recursive;
		return this;
	}

	public static ProtectionPriorityChangeRequestInput inst(Player player, IProtection protection, int newPriority) {
		return new ProtectionPriorityChangeRequestInput(player, protection, newPriority);
	}

}
