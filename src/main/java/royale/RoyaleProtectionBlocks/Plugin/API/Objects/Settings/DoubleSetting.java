package royale.RoyaleProtectionBlocks.Plugin.API.Objects.Settings;

import org.bukkit.inventory.ItemStack;

public class DoubleSetting extends AbstractSetting<Double> {

	public DoubleSetting(String id, String defaultName, ItemStack defaultDisplayItem) {
		super(id, defaultName, defaultDisplayItem);
	}

	@Override
	public Double parseStringToValue(String value) {
		return Double.parseDouble(value);
	}

}
