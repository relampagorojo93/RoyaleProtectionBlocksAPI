package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import java.io.Serializable;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.SettingGroup;
import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Objects.Settings.AbstractSetting;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionSwitchSettingRequestInput<T extends Serializable> extends PlayerRequestInput {

	private IProtection protection;
	private AbstractSetting<T> setting;
	private SettingGroup group;
	private T value;

	public ProtectionSwitchSettingRequestInput(Player player, IProtection protection, AbstractSetting<T> setting,
			SettingGroup group, T value) {
		super(player);
		this.protection = protection;
		this.setting = setting;
		this.group = group;
		this.value = value;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public AbstractSetting<T> getSetting() {
		return this.setting;
	}

	public SettingGroup getGroup() {
		return this.group;
	}

	public T getValue() {
		return this.value;
	}

	public static <T extends Serializable> ProtectionSwitchSettingRequestInput<T> inst(Player player,
			IProtection protection, AbstractSetting<T> setting, SettingGroup group, T value) {
		return new ProtectionSwitchSettingRequestInput<>(player, protection, setting, group, value);
	}

}
