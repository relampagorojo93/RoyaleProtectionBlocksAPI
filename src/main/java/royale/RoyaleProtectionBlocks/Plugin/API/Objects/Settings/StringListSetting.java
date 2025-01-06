package royale.RoyaleProtectionBlocks.Plugin.API.Objects.Settings;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.inventory.ItemStack;

public class StringListSetting extends AbstractSetting<ArrayList<String>> {

	public StringListSetting(String id, String defaultName, ItemStack defaultDisplayItem) {
		super(id, defaultName, defaultDisplayItem);
	}

	@Override
	public ArrayList<String> parseStringToValue(String value) {
		return new ArrayList<>(Arrays.asList(value.split(System.lineSeparator())));
	}

}
