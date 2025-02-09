package royale.RoyaleProtectionBlocks.Plugin.API.Objects.Permissions;

import org.bukkit.inventory.ItemStack;

public abstract class AbstractPermission {

	// Identifier of the setting. Must be unique.
	private String id;

	public AbstractPermission(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public abstract boolean isEditable();

	public abstract String getPermission();

	public abstract Double getCost();

	public abstract String getDisplayName();

	public abstract ItemStack getDisplayItem();

	public abstract Boolean getNonMembersValue();

	public abstract Boolean getMembersValue();

	public abstract Boolean getOwnersValue();

}
