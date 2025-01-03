package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionTeleportHomeRequestInput extends PlayerRequestInput {

	private IProtection protection;

	private boolean ignoreCost = false;
	private boolean ignoreUnsafeWarning = false;

	public ProtectionTeleportHomeRequestInput(Player player, IProtection protection) {
		super(player);
		this.protection = protection;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public boolean isIgnoreCost() {
		return this.ignoreCost;
	}

	public ProtectionTeleportHomeRequestInput setIgnoreCost(boolean ignoreCost) {
		this.ignoreCost = ignoreCost;
		return this;
	}

	public boolean isIgnoreUnsafeWarning() {
		return this.ignoreUnsafeWarning;
	}

	public ProtectionTeleportHomeRequestInput setIgnoreUnsafeWarning(boolean ignoreUnsafeWarning) {
		this.ignoreUnsafeWarning = ignoreUnsafeWarning;
		return this;
	}

	public static ProtectionTeleportHomeRequestInput inst(Player player, IProtection protection) {
		return new ProtectionTeleportHomeRequestInput(player, protection);
	}

}
