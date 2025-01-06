package royale.RoyaleProtectionBlocks.Plugin.API.Objects.Settings;

import org.bukkit.inventory.ItemStack;

public class StringSetting extends AbstractSetting<String> {

	public StringSetting(String id, String defaultName, ItemStack defaultDisplayItem) {
		super(id, defaultName, defaultDisplayItem);
	}

	@Override
	public String parseStringToValue(String value) {
		return value;
	}

}
