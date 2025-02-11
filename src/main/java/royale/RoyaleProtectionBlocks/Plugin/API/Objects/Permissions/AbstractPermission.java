package royale.RoyaleProtectionBlocks.Plugin.API.Objects.Permissions;

import org.bukkit.inventory.ItemStack;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.PermissionGroup;

public abstract class AbstractPermission {

	// Identifier of the setting. Must be unique.
	private String id;

	public AbstractPermission(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public boolean isForSale() {
		return getCost() != null && getCost() > 0D;
	}

	public abstract boolean isEditable();

	public abstract String getPermission();

	public abstract Double getCost();

	public abstract String getDisplayName();

	public abstract ItemStack getDisplayItem();

	public abstract Boolean getNonMembersValue();

	public abstract Boolean getMembersValue();

	public abstract Boolean getOwnersValue();

	public abstract boolean isNonMembersValueEditable();

	public abstract boolean isMembersValueEditable();

	public abstract boolean isOwnersValueEditable();

	public boolean isEditable(PermissionGroup permissionGroup) {
		switch (permissionGroup) {
		case NON_MEMBERS:
			return this.isNonMembersValueEditable();
		case MEMBERS:
			return this.isMembersValueEditable();
		case OWNERS:
			return this.isOwnersValueEditable();
		}
		return false;
	}

}
