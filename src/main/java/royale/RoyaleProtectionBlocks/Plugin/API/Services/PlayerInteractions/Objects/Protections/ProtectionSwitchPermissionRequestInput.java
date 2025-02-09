package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.PermissionGroup;
import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Objects.Permissions.AbstractPermission;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionSwitchPermissionRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private AbstractPermission permission;
	private PermissionGroup group;
	private Boolean value;

	public ProtectionSwitchPermissionRequestInput(Player player, IProtection protection, AbstractPermission permission,
			PermissionGroup group, Boolean value) {
		super(player);
		this.protection = protection;
		this.permission = permission;
		this.group = group;
		this.value = value;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public AbstractPermission getPermission() {
		return this.permission;
	}

	public PermissionGroup getGroup() {
		return this.group;
	}

	public Boolean getValue() {
		return this.value;
	}

	public static ProtectionSwitchPermissionRequestInput inst(Player player, IProtection protection,
			AbstractPermission permission, PermissionGroup group, Boolean value) {
		return new ProtectionSwitchPermissionRequestInput(player, protection, permission, group, value);
	}

}
