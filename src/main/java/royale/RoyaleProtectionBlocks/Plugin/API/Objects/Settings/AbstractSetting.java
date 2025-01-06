package royale.RoyaleProtectionBlocks.Plugin.API.Objects.Settings;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.SettingGroup;

public abstract class AbstractSetting<T extends Serializable> {

	// Identifier of the setting. Must be unique.
	private String id;

	// Data offered by the setting
	protected String defaultName;
	protected ItemStack defaultDisplayItem;
	protected T nonMembersDefaultValue;
	protected T membersDefaultValue;
	protected T ownersDefaultValue;

	// Data retrieved from the configuration
	private boolean editable = true;
	private String permission = null;
	private double cost = 0D;
	private String name;
	private ItemStack displayItem;
	private T nonMembersValue;
	private T membersValue;
	private T ownersValue;

	public AbstractSetting(String id, String defaultName, ItemStack defaultDisplayItem) {
		this.id = id;
		this.defaultName = defaultName;
		this.defaultDisplayItem = defaultDisplayItem;
	}

	public String getId() {
		return this.id;
	}

	public boolean isEditable() {
		return this.editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDefaultName() {
		return this.defaultName;
	}

	public String getName() {
		return this.name != null ? this.name : this.defaultName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemStack getDefaultDisplayItem() {
		return this.defaultDisplayItem;
	}

	public ItemStack getDisplayItem() {
		return this.displayItem != null ? this.displayItem : this.defaultDisplayItem;
	}

	public void setDisplayItem(ItemStack displayItem) {
		this.displayItem = displayItem;
	}

	public T getNonMembersDefaultValue() {
		return this.nonMembersDefaultValue;
	}

	public T getNonMembersValue() {
		return this.nonMembersValue != null ? this.nonMembersValue : this.nonMembersDefaultValue;
	}

	public void setNonMembersValue(T nonMembersValue) {
		this.nonMembersValue = nonMembersValue;
	}

	public T getMembersDefaultValue() {
		return this.membersDefaultValue;
	}

	public T getMembersValue() {
		return this.membersValue != null ? this.membersValue : this.membersDefaultValue;
	}

	public void setMembersValue(T membersValue) {
		this.membersValue = membersValue;
	}

	public T getOwnersDefaultValue() {
		return this.ownersDefaultValue;
	}

	public T getOwnersValue() {
		return this.ownersValue != null ? this.ownersValue : this.ownersDefaultValue;
	}

	public void setOwnersValue(T ownersValue) {
		this.ownersValue = ownersValue;
	}

	public List<SettingGroup> getManagedGroups() {
		return Arrays.asList(SettingGroup.values());
	}

	public abstract T parseStringToValue(String value);

}
