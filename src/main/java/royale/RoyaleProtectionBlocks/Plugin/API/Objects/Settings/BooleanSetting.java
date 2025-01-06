package royale.RoyaleProtectionBlocks.Plugin.API.Objects.Settings;

import org.bukkit.inventory.ItemStack;

public class BooleanSetting extends AbstractSetting<Boolean> {

	public BooleanSetting(String id, String defaultName, ItemStack defaultDisplayItem) {
		super(id, defaultName, defaultDisplayItem);
	}

	@Override
	public Boolean parseStringToValue(String value) {
		return Boolean.valueOf(value);
	}

}
